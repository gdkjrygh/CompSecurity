// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ImageHeaderParser
{
    public static final class ImageType extends Enum
    {

        private static final ImageType $VALUES[];
        public static final ImageType GIF;
        public static final ImageType JPEG;
        public static final ImageType PNG;
        public static final ImageType PNG_A;
        public static final ImageType UNKNOWN;
        private final boolean a;

        public static ImageType valueOf(String s)
        {
            return (ImageType)Enum.valueOf(com/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType, s);
        }

        public static ImageType[] values()
        {
            return (ImageType[])$VALUES.clone();
        }

        public boolean hasAlpha()
        {
            return a;
        }

        static 
        {
            GIF = new ImageType("GIF", 0, true);
            JPEG = new ImageType("JPEG", 1, false);
            PNG_A = new ImageType("PNG_A", 2, true);
            PNG = new ImageType("PNG", 3, false);
            UNKNOWN = new ImageType("UNKNOWN", 4, false);
            $VALUES = (new ImageType[] {
                GIF, JPEG, PNG_A, PNG, UNKNOWN
            });
        }

        private ImageType(String s, int i, boolean flag)
        {
            super(s, i);
            a = flag;
        }
    }

    private static class a
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

        public a(byte abyte0[])
        {
            a = ByteBuffer.wrap(abyte0);
            a.order(ByteOrder.BIG_ENDIAN);
        }
    }

    private static class b
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

        public long a(long l)
            throws IOException
        {
            if (l < 0L)
            {
                return 0L;
            }
            long l1 = l;
            do
            {
label0:
                {
                    if (l1 > 0L)
                    {
                        long l2 = a.skip(l1);
                        if (l2 > 0L)
                        {
                            l1 -= l2;
                            continue;
                        }
                        if (a.read() != -1)
                        {
                            break label0;
                        }
                    }
                    return l - l1;
                }
                l1--;
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

        public b(InputStream inputstream)
        {
            a = inputstream;
        }
    }


    private static final byte a[];
    private static final int b[];
    private final b c;

    public ImageHeaderParser(InputStream inputstream)
    {
        c = new b(inputstream);
    }

    private static int a(int i, int j)
    {
        return i + 2 + j * 12;
    }

    private static int a(a a1)
    {
        int i = "Exif\000\0".length();
        int j = a1.b(i);
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
            a1.a(byteorder);
            j = i + a1.a(i + 4);
            short word0 = a1.b(j);
            i = 0;
            while (i < word0) 
            {
                int k = a(j, i);
                short word1 = a1.b(k);
                if (word1 == 274)
                {
                    short word2 = a1.b(k + 2);
                    if (word2 < 1 || word2 > 12)
                    {
                        if (Log.isLoggable("ImageHeaderParser", 3))
                        {
                            Log.d("ImageHeaderParser", (new StringBuilder()).append("Got invalid format code=").append(word2).toString());
                        }
                    } else
                    {
                        int l = a1.a(k + 4);
                        if (l < 0)
                        {
                            if (Log.isLoggable("ImageHeaderParser", 3))
                            {
                                Log.d("ImageHeaderParser", "Negative tiff component count");
                            }
                        } else
                        {
                            if (Log.isLoggable("ImageHeaderParser", 3))
                            {
                                Log.d("ImageHeaderParser", (new StringBuilder()).append("Got tagIndex=").append(i).append(" tagType=").append(word1).append(" formatCode=").append(word2).append(" componentCount=").append(l).toString());
                            }
                            l += b[word2];
                            if (l > 4)
                            {
                                if (Log.isLoggable("ImageHeaderParser", 3))
                                {
                                    Log.d("ImageHeaderParser", (new StringBuilder()).append("Got byte count > 4, not orientation, continuing, formatCode=").append(word2).toString());
                                }
                            } else
                            {
                                k += 8;
                                if (k < 0 || k > a1.a())
                                {
                                    if (Log.isLoggable("ImageHeaderParser", 3))
                                    {
                                        Log.d("ImageHeaderParser", (new StringBuilder()).append("Illegal tagValueOffset=").append(k).append(" tagType=").append(word1).toString());
                                    }
                                } else
                                if (l < 0 || k + l > a1.a())
                                {
                                    if (Log.isLoggable("ImageHeaderParser", 3))
                                    {
                                        Log.d("ImageHeaderParser", (new StringBuilder()).append("Illegal number of bytes for TI tag data tagType=").append(word1).toString());
                                    }
                                } else
                                {
                                    return a1.b(k);
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
            long l = c.a(i);
            if (l == (long)i)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (Log.isLoggable("ImageHeaderParser", 3))
            {
                Log.d("ImageHeaderParser", (new StringBuilder()).append("Unable to skip enough data, type: ").append(word0).append(", wanted to skip: ").append(i).append(", but actually skipped: ").append(l).toString());
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
        return b().hasAlpha();
    }

    public ImageType b()
        throws IOException
    {
        int i = c.a();
        if (i == 65496)
        {
            return ImageType.JPEG;
        }
        i = i << 16 & 0xffff0000 | c.a() & 0xffff;
        if (i == 0x89504e47)
        {
            c.a(21L);
            if (c.c() >= 3)
            {
                return ImageType.PNG_A;
            } else
            {
                return ImageType.PNG;
            }
        }
        if (i >> 8 == 0x474946)
        {
            return ImageType.GIF;
        } else
        {
            return ImageType.UNKNOWN;
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
            return a(new a(abyte0));
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
