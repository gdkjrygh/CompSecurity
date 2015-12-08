// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameReader, Http20Draft04, ErrorCode, Settings

static final class in
    implements FrameReader
{

    private final DataInputStream in;

    private static transient IOException ioException(String s, Object aobj[])
        throws IOException
    {
        throw new IOException(String.format(s, aobj));
    }

    private void readData(in in1, int i, int j, int k)
        throws IOException
    {
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        in1.ata(flag, k, in, j);
    }

    private void readGoAway(in in1, int i, int j, int k)
        throws IOException
    {
        if (j < 8)
        {
            throw ioException("TYPE_GOAWAY length < 8: %s", new Object[] {
                Integer.valueOf(j)
            });
        }
        i = in.readInt();
        k = in.readInt();
        j -= 8;
        ErrorCode errorcode = ErrorCode.fromHttp2(k);
        if (errorcode == null)
        {
            throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(k)
            });
        }
        if (Util.skipByReading(in, j) != (long)j)
        {
            throw new IOException("TYPE_GOAWAY opaque data was truncated");
        } else
        {
            in1.oAway(i, errorcode);
            return;
        }
    }

    private void readPing(oAway oaway, int i, int j, int k)
        throws IOException
    {
        boolean flag = true;
        if (j != 8)
        {
            throw ioException("TYPE_PING length != 8: %s", new Object[] {
                Integer.valueOf(j)
            });
        }
        if (k != 0)
        {
            throw ioException("TYPE_PING streamId != 0", new Object[0]);
        }
        j = in.readInt();
        k = in.readInt();
        if ((i & 1) == 0)
        {
            flag = false;
        }
        oaway.ing(flag, j, k);
    }

    private void readPriority(ing ing, int i, int j, int k)
        throws IOException
    {
        if (j != 4)
        {
            throw ioException("TYPE_PRIORITY length: %d != 4", new Object[] {
                Integer.valueOf(j)
            });
        }
        if (k == 0)
        {
            throw ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
        } else
        {
            ing.riority(k, in.readInt() & 0x7fffffff);
            return;
        }
    }

    private void readPushPromise(in in1, int i, int j, int k)
    {
    }

    private void readRstStream(in in1, int i, int j, int k)
        throws IOException
    {
        if (j != 4)
        {
            throw ioException("TYPE_RST_STREAM length: %d != 4", new Object[] {
                Integer.valueOf(j)
            });
        }
        if (k == 0)
        {
            throw ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        i = in.readInt();
        ErrorCode errorcode = ErrorCode.fromHttp2(i);
        if (errorcode == null)
        {
            throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            in1.stStream(k, errorcode);
            return;
        }
    }

    private void readSettings(stStream ststream, int i, int j, int k)
        throws IOException
    {
        if (j % 8 != 0)
        {
            throw ioException("TYPE_SETTINGS length %% 8 != 0: %s", new Object[] {
                Integer.valueOf(j)
            });
        }
        if (k != 0)
        {
            throw ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        Settings settings = new Settings();
        for (i = 0; i < j; i += 8)
        {
            settings.set(in.readInt() & 0xffffff, 0, in.readInt());
        }

        ststream.ettings(false, settings);
    }

    private void readWindowUpdate(ettings ettings, int i, int j, int k)
        throws IOException
    {
        j = in.readInt();
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ettings.indowUpdate(k, j & 0x7fffffff, flag);
    }

    public void close()
        throws IOException
    {
        in.close();
    }

    public boolean nextFrame(in in1)
        throws IOException
    {
        int i;
        int j;
        int k;
        int l;
        try
        {
            i = in.readInt();
        }
        // Misplaced declaration of an exception variable
        catch (in in1)
        {
            return false;
        }
        l = in.readInt();
        j = i & 0xffff;
        k = (0xff000000 & i) >> 24;
        l &= 0x7fffffff;
        switch ((0xff0000 & i) >> 16)
        {
        case 1: // '\001'
        case 8: // '\b'
        default:
            throw new UnsupportedOperationException("TODO");

        case 0: // '\0'
            readData(in1, k, j, l);
            return true;

        case 2: // '\002'
            readPriority(in1, k, j, l);
            return true;

        case 3: // '\003'
            readRstStream(in1, k, j, l);
            return true;

        case 4: // '\004'
            readSettings(in1, k, j, l);
            return true;

        case 5: // '\005'
            readPushPromise(in1, k, j, l);
            return true;

        case 6: // '\006'
            readPing(in1, k, j, l);
            return true;

        case 7: // '\007'
            readGoAway(in1, k, j, l);
            return true;

        case 9: // '\t'
            readWindowUpdate(in1, k, j, l);
            break;
        }
        return true;
    }

    (InputStream inputstream)
    {
        in = new DataInputStream(inputstream);
    }
}
