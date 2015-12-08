// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class l
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a g[];
        private final boolean f;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/ab/l$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        public boolean a()
        {
            return f;
        }

        static 
        {
            a = new a("GIF", 0, true);
            b = new a("JPEG", 1, false);
            c = new a("PNG_A", 2, true);
            d = new a("PNG", 3, false);
            e = new a("UNKNOWN", 4, false);
            g = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i, boolean flag)
        {
            super(s, i);
            f = flag;
        }
    }

    private static class b
    {

        private final ByteBuffer a;

        public int a()
        {
            return a.array().length;
        }

        public int a(int i)
        {
            return a.getInt(i);
        }

        public void a(ByteOrder byteorder)
        {
            a.order(byteorder);
        }

        public short b(int i)
        {
            return a.getShort(i);
        }

        public b(byte abyte0[])
        {
            a = ByteBuffer.wrap(abyte0);
            a.order(ByteOrder.BIG_ENDIAN);
        }
    }

    private static class c
    {

        private final InputStream a;

        public int a()
            throws IOException
        {
            return a.read() << 8 & 0xff00 | a.read() & 0xff;
        }

        public int a(byte abyte0[])
            throws IOException
        {
            int i = abyte0.length;
            do
            {
                if (i <= 0)
                {
                    break;
                }
                int j = a.read(abyte0, abyte0.length - i, i);
                if (j == -1)
                {
                    break;
                }
                i -= j;
            } while (true);
            return abyte0.length - i;
        }

        public long a(long l1)
            throws IOException
        {
            if (l1 < 0L)
            {
                return 0L;
            }
            long l2 = l1;
            do
            {
label0:
                {
                    if (l2 > 0L)
                    {
                        long l3 = a.skip(l2);
                        if (l3 > 0L)
                        {
                            l2 -= l3;
                            continue;
                        }
                        if (a.read() != -1)
                        {
                            break label0;
                        }
                    }
                    return l1 - l2;
                }
                l2--;
            } while (true);
        }

        public short b()
            throws IOException
        {
            return (short)(a.read() & 0xff);
        }

        public int c()
            throws IOException
        {
            return a.read();
        }

        public c(InputStream inputstream)
        {
            a = inputstream;
        }
    }


    private static final byte a[];
    private static final int b[];
    private final c c;

    public l(InputStream inputstream)
    {
        c = new c(inputstream);
    }

    private static int a(int i, int j)
    {
        return i + 2 + j * 12;
    }

    private static int a(b b1)
    {
        int i = "Exif\000\0".length();
        int j = b1.b(i);
        ByteOrder byteorder;
        if (j == 19789)
        {
            byteorder = ByteOrder.BIG_ENDIAN;
        } else
        if (j == 18761)
        {
            byteorder = ByteOrder.LITTLE_ENDIAN;
        } else
        {
            if (Log.isLoggable("ImageHeaderParser", 3))
            {
                Log.d("ImageHeaderParser", (new StringBuilder()).append("Unknown endianness = ").append(j).toString());
            }
            byteorder = ByteOrder.BIG_ENDIAN;
        }
        do
        {
            b1.a(byteorder);
            j = i + b1.a(i + 4);
            short word0 = b1.b(j);
            i = 0;
            while (i < word0) 
            {
                int k = a(j, i);
                short word1 = b1.b(k);
                if (word1 == 274)
                {
                    short word2 = b1.b(k + 2);
                    if (word2 < 1 || word2 > 12)
                    {
                        if (Log.isLoggable("ImageHeaderParser", 3))
                        {
                            Log.d("ImageHeaderParser", (new StringBuilder()).append("Got invalid format code=").append(word2).toString());
                        }
                    } else
                    {
                        int i1 = b1.a(k + 4);
                        if (i1 < 0)
                        {
                            if (Log.isLoggable("ImageHeaderParser", 3))
                            {
                                Log.d("ImageHeaderParser", "Negative tiff component count");
                            }
                        } else
                        {
                            if (Log.isLoggable("ImageHeaderParser", 3))
                            {
                                Log.d("ImageHeaderParser", (new StringBuilder()).append("Got tagIndex=").append(i).append(" tagType=").append(word1).append(" formatCode=").append(word2).append(" componentCount=").append(i1).toString());
                            }
                            i1 += b[word2];
                            if (i1 > 4)
                            {
                                if (Log.isLoggable("ImageHeaderParser", 3))
                                {
                                    Log.d("ImageHeaderParser", (new StringBuilder()).append("Got byte count > 4, not orientation, continuing, formatCode=").append(word2).toString());
                                }
                            } else
                            {
                                k += 8;
                                if (k < 0 || k > b1.a())
                                {
                                    if (Log.isLoggable("ImageHeaderParser", 3))
                                    {
                                        Log.d("ImageHeaderParser", (new StringBuilder()).append("Illegal tagValueOffset=").append(k).append(" tagType=").append(word1).toString());
                                    }
                                } else
                                if (i1 < 0 || k + i1 > b1.a())
                                {
                                    if (Log.isLoggable("ImageHeaderParser", 3))
                                    {
                                        Log.d("ImageHeaderParser", (new StringBuilder()).append("Illegal number of bytes for TI tag data tagType=").append(word1).toString());
                                    }
                                } else
                                {
                                    return b1.b(k);
                                }
                            }
                        }
                    }
                }
                i++;
            }
            return -1;
        } while (true);
    }

    private static boolean a(int i)
    {
        return (i & 0xffd8) == 65496 || i == 19789 || i == 18761;
    }

    private byte[] d()
        throws IOException
    {
_L7:
        short word0 = c.b();
        if (word0 == 255) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("ImageHeaderParser", 3))
        {
            Log.d("ImageHeaderParser", (new StringBuilder()).append("Unknown segmentId=").append(word0).toString());
        }
_L4:
        return null;
_L2:
        word0 = c.b();
        if (word0 == 218)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (word0 != 217)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("ImageHeaderParser", 3))
        {
            Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        int i;
        i = c.a() - 2;
        if (word0 != 225)
        {
            long l1 = c.a(i);
            if (l1 == (long)i)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (Log.isLoggable("ImageHeaderParser", 3))
            {
                Log.d("ImageHeaderParser", (new StringBuilder()).append("Unable to skip enough data, type: ").append(word0).append(", wanted to skip: ").append(i).append(", but actually skipped: ").append(l1).toString());
                return null;
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_183;
        continue; /* Loop/switch isn't completed */
        byte abyte0[];
        abyte0 = new byte[i];
        int j = c.a(abyte0);
        if (j == i)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("ImageHeaderParser", 3))
        {
            Log.d("ImageHeaderParser", (new StringBuilder()).append("Unable to read segment data, type: ").append(word0).append(", length: ").append(i).append(", actually read: ").append(j).toString());
            return null;
        }
        if (true) goto _L4; else goto _L5
_L5:
        return abyte0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean a()
        throws IOException
    {
        return b().a();
    }

    public a b()
        throws IOException
    {
        int i = c.a();
        if (i == 65496)
        {
            return a.b;
        }
        i = i << 16 & 0xffff0000 | c.a() & 0xffff;
        if (i == 0x89504e47)
        {
            c.a(21L);
            if (c.c() >= 3)
            {
                return a.c;
            } else
            {
                return a.d;
            }
        }
        if (i >> 8 == 0x474946)
        {
            return a.a;
        } else
        {
            return a.e;
        }
    }

    public int c()
        throws IOException
    {
        int i;
        boolean flag1 = false;
        if (!a(c.a()))
        {
            return -1;
        }
        byte abyte0[] = d();
        boolean flag;
        if (abyte0 != null && abyte0.length > a.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        i = 0;
_L7:
        if (i >= a.length) goto _L2; else goto _L3
_L3:
        if (abyte0[i] == a[i]) goto _L5; else goto _L4
_L4:
        flag = flag1;
_L2:
        if (flag)
        {
            return a(new b(abyte0));
        } else
        {
            return -1;
        }
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        byte abyte0[];
        b = (new int[] {
            0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
            8, 4, 8
        });
        abyte0 = new byte[0];
        byte abyte1[] = "Exif\000\0".getBytes("UTF-8");
        abyte0 = abyte1;
_L2:
        a = abyte0;
        return;
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
