// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.j;
import c.k;
import java.io.IOException;
import java.net.ProtocolException;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FrameReader, NameValueBlockReader, ErrorCode, HeadersMode, 
//            Settings

final class client
    implements FrameReader
{

    private final boolean client;
    private final NameValueBlockReader headerBlockReader;
    private final j source;

    private static transient IOException ioException(String s, Object aobj[])
    {
        throw new IOException(String.format(s, aobj));
    }

    private void readGoAway(andler andler, int i, int l)
    {
        if (l != 8)
        {
            throw ioException("TYPE_GOAWAY length: %d != 8", new Object[] {
                Integer.valueOf(l)
            });
        }
        i = source.k();
        l = source.k();
        ErrorCode errorcode = ErrorCode.fromSpdyGoAway(l);
        if (errorcode == null)
        {
            throw ioException("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                Integer.valueOf(l)
            });
        } else
        {
            andler.goAway(i & 0x7fffffff, errorcode, k.b);
            return;
        }
    }

    private void readHeaders(andler andler, int i, int l)
    {
        andler.headers(false, false, source.k() & 0x7fffffff, -1, headerBlockReader.readNameValueBlock(l - 4), HeadersMode.SPDY_HEADERS);
    }

    private void readPing(andler andler, int i, int l)
    {
        boolean flag1 = true;
        if (l != 4)
        {
            throw ioException("TYPE_PING length: %d != 4", new Object[] {
                Integer.valueOf(l)
            });
        }
        i = source.k();
        boolean flag2 = client;
        boolean flag;
        if ((i & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag2 == flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        andler.ping(flag, i, 0);
    }

    private void readRstStream(andler andler, int i, int l)
    {
        if (l != 8)
        {
            throw ioException("TYPE_RST_STREAM length: %d != 8", new Object[] {
                Integer.valueOf(l)
            });
        }
        i = source.k();
        l = source.k();
        ErrorCode errorcode = ErrorCode.fromSpdy3Rst(l);
        if (errorcode == null)
        {
            throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(l)
            });
        } else
        {
            andler.rstStream(i & 0x7fffffff, errorcode);
            return;
        }
    }

    private void readSettings(andler andler, int i, int l)
    {
        boolean flag = true;
        int i1 = source.k();
        if (l != i1 * 8 + 4)
        {
            throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                Integer.valueOf(l), Integer.valueOf(i1)
            });
        }
        Settings settings = new Settings();
        for (l = 0; l < i1; l++)
        {
            int j1 = source.k();
            settings.set(j1 & 0xffffff, (0xff000000 & j1) >>> 24, source.k());
        }

        if ((i & 1) == 0)
        {
            flag = false;
        }
        andler.settings(flag, settings);
    }

    private void readSynReply(andler andler, int i, int l)
    {
        int i1 = source.k();
        java.util.List list = headerBlockReader.readNameValueBlock(l - 4);
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        andler.headers(false, flag, i1 & 0x7fffffff, -1, list, HeadersMode.SPDY_REPLY);
    }

    private void readSynStream(andler andler, int i, int l)
    {
        boolean flag1 = true;
        int i1 = source.k();
        int j1 = source.k();
        source.j();
        java.util.List list = headerBlockReader.readNameValueBlock(l - 10);
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 2) == 0)
        {
            flag1 = false;
        }
        andler.headers(flag1, flag, i1 & 0x7fffffff, j1 & 0x7fffffff, list, HeadersMode.SPDY_SYN_STREAM);
    }

    private void readWindowUpdate(andler andler, int i, int l)
    {
        if (l != 8)
        {
            throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                Integer.valueOf(l)
            });
        }
        i = source.k();
        long l1 = source.k() & 0x7fffffff;
        if (l1 == 0L)
        {
            throw ioException("windowSizeIncrement was 0", new Object[] {
                Long.valueOf(l1)
            });
        } else
        {
            andler.windowUpdate(i & 0x7fffffff, l1);
            return;
        }
    }

    public void close()
    {
        headerBlockReader.close();
    }

    public boolean nextFrame(andler andler)
    {
        boolean flag = false;
        int i;
        int l;
        int i1;
        int j1;
        try
        {
            l = source.k();
            i1 = source.k();
        }
        // Misplaced declaration of an exception variable
        catch (andler andler)
        {
            return false;
        }
        if ((0x80000000 & l) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j1 = (0xff000000 & i1) >>> 24;
        i1 &= 0xffffff;
        if (i != 0)
        {
            i = (0x7fff0000 & l) >>> 16;
            if (i != 3)
            {
                throw new ProtocolException((new StringBuilder()).append("version != 3: ").append(i).toString());
            }
            switch (0xffff & l)
            {
            case 5: // '\005'
            default:
                source.g(i1);
                return true;

            case 1: // '\001'
                readSynStream(andler, j1, i1);
                return true;

            case 2: // '\002'
                readSynReply(andler, j1, i1);
                return true;

            case 3: // '\003'
                readRstStream(andler, j1, i1);
                return true;

            case 4: // '\004'
                readSettings(andler, j1, i1);
                return true;

            case 6: // '\006'
                readPing(andler, j1, i1);
                return true;

            case 7: // '\007'
                readGoAway(andler, j1, i1);
                return true;

            case 8: // '\b'
                readHeaders(andler, j1, i1);
                return true;

            case 9: // '\t'
                readWindowUpdate(andler, j1, i1);
                break;
            }
            return true;
        }
        if ((j1 & 1) != 0)
        {
            flag = true;
        }
        andler.data(flag, 0x7fffffff & l, source, i1);
        return true;
    }

    public void readConnectionPreface()
    {
    }

    andler(j j1, boolean flag)
    {
        source = j1;
        headerBlockReader = new NameValueBlockReader(source);
        client = flag;
    }
}
