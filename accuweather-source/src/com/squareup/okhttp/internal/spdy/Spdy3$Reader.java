// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameReader, Spdy3, ErrorCode, Settings

static final class client
    implements FrameReader
{

    private final boolean client;
    private int compressedLimit;
    private final DataInputStream in;
    private final DataInputStream nameValueBlockIn = newNameValueBlockStream();

    private static transient IOException ioException(String s, Object aobj[])
        throws IOException
    {
        throw new IOException(String.format(s, aobj));
    }

    private DataInputStream newNameValueBlockStream()
    {
        return new DataInputStream(new InflaterInputStream(new InputStream() {

            final Spdy3.Reader this$0;

            public void close()
                throws IOException
            {
                in.close();
            }

            public int read()
                throws IOException
            {
                return Util.readSingleByte(this);
            }

            public int read(byte abyte0[], int i, int j)
                throws IOException
            {
                j = Math.min(j, compressedLimit);
                i = in.read(abyte0, i, j);
                abyte0 = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = Spdy3.Reader.this;
                super();
            }
        }, new Inflater() {

            final Spdy3.Reader this$0;

            public int inflate(byte abyte0[], int i, int j)
                throws DataFormatException
            {
                int l = inflate(abyte0, i, j);
                int k = l;
                if (l == 0)
                {
                    k = l;
                    if (needsDictionary())
                    {
                        setDictionary(Spdy3.DICTIONARY);
                        k = inflate(abyte0, i, j);
                    }
                }
                return k;
            }

            
            {
                this$0 = Spdy3.Reader.this;
                super();
            }
        }));
    }

    private void readGoAway(andler andler, int i, int j)
        throws IOException
    {
        if (j != 8)
        {
            throw ioException("TYPE_GOAWAY length: %d != 8", new Object[] {
                Integer.valueOf(j)
            });
        }
        i = in.readInt();
        j = in.readInt();
        ErrorCode errorcode = ErrorCode.fromSpdyGoAway(j);
        if (errorcode == null)
        {
            throw ioException("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            andler.goAway(i & 0x7fffffff, errorcode);
            return;
        }
    }

    private void readHeaders(andler andler, int i, int j)
        throws IOException
    {
        andler.headers(in.readInt() & 0x7fffffff, readNameValueBlock(j - 4));
    }

    private List readNameValueBlock(int i)
        throws IOException
    {
        int j;
        compressedLimit = compressedLimit + i;
        try
        {
            j = nameValueBlockIn.readInt();
        }
        catch (DataFormatException dataformatexception)
        {
            throw new IOException(dataformatexception.getMessage());
        }
        if (j * 2 >= 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Logger.getLogger(getClass().getName()).warning((new StringBuilder()).append("numberOfPairs < 0: ").append(j).toString());
        throw ioException("numberOfPairs < 0", new Object[0]);
        ArrayList arraylist = new ArrayList(j * 2);
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        String s = readString();
        String s1 = readString();
        if (s.length() == 0)
        {
            throw ioException("name.length == 0", new Object[0]);
        }
        arraylist.add(s);
        arraylist.add(s1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (compressedLimit != 0)
        {
            Logger.getLogger(getClass().getName()).warning((new StringBuilder()).append("compressedLimit > 0: ").append(compressedLimit).toString());
        }
        return arraylist;
    }

    private void readPing(andler andler, int i, int j)
        throws IOException
    {
        boolean flag1 = true;
        if (j != 4)
        {
            throw ioException("TYPE_PING length: %d != 4", new Object[] {
                Integer.valueOf(j)
            });
        }
        i = in.readInt();
        boolean flag2 = client;
        boolean flag;
        if (i % 2 == 1)
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

    private void readRstStream(andler andler, int i, int j)
        throws IOException
    {
        if (j != 8)
        {
            throw ioException("TYPE_RST_STREAM length: %d != 8", new Object[] {
                Integer.valueOf(j)
            });
        }
        i = in.readInt();
        j = in.readInt();
        ErrorCode errorcode = ErrorCode.fromSpdy3Rst(j);
        if (errorcode == null)
        {
            throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            andler.rstStream(i & 0x7fffffff, errorcode);
            return;
        }
    }

    private void readSettings(andler andler, int i, int j)
        throws IOException
    {
        boolean flag = true;
        int k = in.readInt();
        if (j != k * 8 + 4)
        {
            throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k)
            });
        }
        Settings settings = new Settings();
        for (j = 0; j < k; j++)
        {
            int l = in.readInt();
            settings.set(l & 0xffffff, (0xff000000 & l) >>> 24, in.readInt());
        }

        if ((i & 1) == 0)
        {
            flag = false;
        }
        andler.settings(flag, settings);
    }

    private String readString()
        throws DataFormatException, IOException
    {
        int i = nameValueBlockIn.readInt();
        byte abyte0[] = new byte[i];
        Util.readFully(nameValueBlockIn, abyte0);
        return new String(abyte0, 0, i, "UTF-8");
    }

    private void readSynReply(andler andler, int i, int j)
        throws IOException
    {
        int k = in.readInt();
        List list = readNameValueBlock(j - 4);
        boolean flag;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        andler.synReply(flag, k & 0x7fffffff, list);
    }

    private void readSynStream(andler andler, int i, int j)
        throws IOException
    {
        int k = in.readInt();
        int l = in.readInt();
        short word0 = in.readShort();
        List list = readNameValueBlock(j - 10);
        boolean flag;
        boolean flag1;
        if ((i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        andler.synStream(flag1, flag, k & 0x7fffffff, l & 0x7fffffff, (0xe000 & word0) >>> 13, word0 & 0xff, list);
    }

    private void readWindowUpdate(andler andler, int i, int j)
        throws IOException
    {
        if (j != 8)
        {
            throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            andler.windowUpdate(in.readInt() & 0x7fffffff, in.readInt() & 0x7fffffff, false);
            return;
        }
    }

    public void close()
        throws IOException
    {
        Util.closeAll(in, nameValueBlockIn);
    }

    public boolean nextFrame(andler andler)
        throws IOException
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        int l;
        try
        {
            j = in.readInt();
        }
        // Misplaced declaration of an exception variable
        catch (andler andler)
        {
            return false;
        }
        k = in.readInt();
        if ((0x80000000 & j) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        l = (0xff000000 & k) >>> 24;
        k &= 0xffffff;
        if (i != 0)
        {
            i = (0x7fff0000 & j) >>> 16;
            if (i != 3)
            {
                throw new ProtocolException((new StringBuilder()).append("version != 3: ").append(i).toString());
            }
            switch (j & 0xffff)
            {
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            default:
                throw new IOException("Unexpected frame");

            case 1: // '\001'
                readSynStream(andler, l, k);
                return true;

            case 2: // '\002'
                readSynReply(andler, l, k);
                return true;

            case 3: // '\003'
                readRstStream(andler, l, k);
                return true;

            case 4: // '\004'
                readSettings(andler, l, k);
                return true;

            case 5: // '\005'
                if (k != 0)
                {
                    throw ioException("TYPE_NOOP length: %d != 0", new Object[] {
                        Integer.valueOf(k)
                    });
                } else
                {
                    andler.noop();
                    return true;
                }

            case 6: // '\006'
                readPing(andler, l, k);
                return true;

            case 7: // '\007'
                readGoAway(andler, l, k);
                return true;

            case 8: // '\b'
                readHeaders(andler, l, k);
                return true;

            case 9: // '\t'
                readWindowUpdate(andler, l, k);
                return true;

            case 16: // '\020'
                Util.skipByReading(in, k);
                throw new UnsupportedOperationException("TODO");
            }
        }
        if ((l & 1) != 0)
        {
            flag = true;
        }
        andler.data(flag, j & 0x7fffffff, in, k);
        return true;
    }



/*
    static int access$020(andler andler, int i)
    {
        i = andler.compressedLimit - i;
        andler.compressedLimit = i;
        return i;
    }

*/


    _cls2.this._cls0(InputStream inputstream, boolean flag)
    {
        in = new DataInputStream(inputstream);
        client = flag;
    }
}
