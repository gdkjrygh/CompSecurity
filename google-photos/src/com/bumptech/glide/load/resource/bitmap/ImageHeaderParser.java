// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import aqp;
import avt;
import avu;
import avv;
import avw;
import b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class ImageHeaderParser
{

    private static final byte a[] = "Exif\000\0".getBytes(Charset.forName("UTF-8"));
    private static final int b[] = {
        0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
        8, 4, 8
    };
    private final aqp c;
    private final avv d;

    public ImageHeaderParser(InputStream inputstream, aqp aqp1)
    {
        b.a(inputstream, "Argument must not be null");
        c = (aqp)b.a(aqp1, "Argument must not be null");
        d = new avw(inputstream);
    }

    public ImageHeaderParser(ByteBuffer bytebuffer, aqp aqp1)
    {
        b.a(bytebuffer, "Argument must not be null");
        c = (aqp)b.a(aqp1, "Argument must not be null");
        d = new avt(bytebuffer);
    }

    private static int a(avu avu1)
    {
        int i;
        i = avu1.b(6);
        ByteOrder byteorder;
        if (i != 19789)
        {
            int j;
            short word0;
            if (i == 18761)
            {
                byteorder = ByteOrder.LITTLE_ENDIAN;
                break MISSING_BLOCK_LABEL_25;
            }
            if (Log.isLoggable("ImageHeaderParser", 3))
            {
                (new StringBuilder(27)).append("Unknown endianness = ").append(i);
            }
        }
        byteorder = ByteOrder.BIG_ENDIAN;
        continue;
        do
        {
            avu1.a.order(byteorder);
            j = 6 + avu1.a(10);
            word0 = avu1.b(j);
            i = 0;
            while (i < word0) 
            {
                int k = j + 2 + i * 12;
                short word1 = avu1.b(k);
                if (word1 == 274)
                {
                    short word2 = avu1.b(k + 2);
                    if (word2 <= 0 || word2 > 12)
                    {
                        if (Log.isLoggable("ImageHeaderParser", 3))
                        {
                            (new StringBuilder(37)).append("Got invalid format code = ").append(word2);
                        }
                    } else
                    {
                        int l = avu1.a(k + 4);
                        if (l < 0)
                        {
                            if (!Log.isLoggable("ImageHeaderParser", 3));
                        } else
                        {
                            if (Log.isLoggable("ImageHeaderParser", 3))
                            {
                                (new StringBuilder(94)).append("Got tagIndex=").append(i).append(" tagType=").append(word1).append(" formatCode=").append(word2).append(" componentCount=").append(l);
                            }
                            l += b[word2];
                            if (l > 4)
                            {
                                if (Log.isLoggable("ImageHeaderParser", 3))
                                {
                                    (new StringBuilder(71)).append("Got byte count > 4, not orientation, continuing, formatCode=").append(word2);
                                }
                            } else
                            {
                                k += 8;
                                if (k < 0 || k > avu1.a.remaining())
                                {
                                    if (Log.isLoggable("ImageHeaderParser", 3))
                                    {
                                        (new StringBuilder(54)).append("Illegal tagValueOffset=").append(k).append(" tagType=").append(word1);
                                    }
                                } else
                                if (l < 0 || k + l > avu1.a.remaining())
                                {
                                    if (Log.isLoggable("ImageHeaderParser", 3))
                                    {
                                        (new StringBuilder(59)).append("Illegal number of bytes for TI tag data tagType=").append(word1);
                                    }
                                } else
                                {
                                    return avu1.b(k);
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

    private static boolean a(byte abyte0[], int i)
    {
        boolean flag;
        if (abyte0 != null && i > a.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            for (i = 0; i < a.length; i++)
            {
                if (abyte0[i] != a[i])
                {
                    return false;
                }
            }

        }
        return flag;
    }

    private int c()
    {
_L6:
        short word0 = d.b();
        if (word0 == 255) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("ImageHeaderParser", 3))
        {
            (new StringBuilder(24)).append("Unknown segmentId=").append(word0);
        }
_L4:
        return -1;
_L2:
        int i;
label0:
        {
            short word1 = d.b();
            if (word1 == 218 || word1 == 217)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = d.a() - 2;
            if (word1 == 225)
            {
                break label0;
            }
            long l = d.a(i);
            if (l == (long)i)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (Log.isLoggable("ImageHeaderParser", 3))
            {
                String s = String.valueOf("Unable to skip enough data, type: ");
                (new StringBuilder(String.valueOf(s).length() + 79)).append(s).append(word1).append(", wanted to skip: ").append(i).append(", but actually skipped: ").append(l);
                return -1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        return i;
    }

    public final ImageType a()
    {
        int i = d.a();
        if (i == 65496)
        {
            return ImageType.JPEG;
        }
        i = i << 16 & 0xffff0000 | d.a() & 0xffff;
        if (i == 0x89504e47)
        {
            d.a(21L);
            if (d.c() >= 3)
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
        }
        if (i != 0x52494646)
        {
            return ImageType.UNKNOWN;
        }
        d.a(4L);
        if ((d.a() << 16 & 0xffff0000 | d.a() & 0xffff) != 0x57454250)
        {
            return ImageType.UNKNOWN;
        }
        i = d.a() << 16 & 0xffff0000 | d.a() & 0xffff;
        if ((i & 0xffffff00) != 0x56503800)
        {
            return ImageType.UNKNOWN;
        }
        if ((i & 0xff) == 88)
        {
            d.a(4L);
            if ((d.c() & 0x10) != 0)
            {
                return ImageType.WEBP_A;
            } else
            {
                return ImageType.WEBP;
            }
        }
        if ((i & 0xff) == 76)
        {
            d.a(4L);
            if ((d.c() & 8) != 0)
            {
                return ImageType.WEBP_A;
            } else
            {
                return ImageType.WEBP;
            }
        } else
        {
            return ImageType.WEBP;
        }
    }

    public final int b()
    {
        byte byte0;
        byte0 = -1;
        int j = d.a();
        boolean flag;
        if ((j & 0xffd8) == 65496 || j == 19789 || j == 18761)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("ImageHeaderParser", 3))
        {
            (new StringBuilder(47)).append("Parser doesn't handle magic number: ").append(j);
        }
_L4:
        return -1;
_L2:
        int k = c();
        if (k == -1) goto _L4; else goto _L3
_L3:
        byte abyte0[] = c.a(k);
        int l = d.a(abyte0, k);
        if (l == k) goto _L6; else goto _L5
_L5:
        int i = byte0;
        if (!Log.isLoggable("ImageHeaderParser", 3))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        String s = String.valueOf("Unable to read exif segment data, length: ");
        (new StringBuilder(String.valueOf(s).length() + 39)).append(s).append(k).append(", actually read: ").append(l);
        i = byte0;
_L8:
        c.a(abyte0);
        return i;
_L6:
        i = byte0;
        if (!a(abyte0, k)) goto _L8; else goto _L7
_L7:
        i = a(new avu(abyte0, k));
          goto _L8
        Exception exception;
        exception;
        c.a(abyte0);
        throw exception;
    }


    private class ImageType extends Enum
    {

        private static final ImageType $VALUES[];
        public static final ImageType GIF;
        public static final ImageType JPEG;
        public static final ImageType PNG;
        public static final ImageType PNG_A;
        public static final ImageType UNKNOWN;
        public static final ImageType WEBP;
        public static final ImageType WEBP_A;
        private final boolean a;

        public static ImageType valueOf(String s)
        {
            return (ImageType)Enum.valueOf(com/bumptech/glide/load/resource/bitmap/ImageHeaderParser$ImageType, s);
        }

        public static ImageType[] values()
        {
            return (ImageType[])$VALUES.clone();
        }

        public final boolean hasAlpha()
        {
            return a;
        }

        static 
        {
            GIF = new ImageType("GIF", 0, true);
            JPEG = new ImageType("JPEG", 1, false);
            PNG_A = new ImageType("PNG_A", 2, true);
            PNG = new ImageType("PNG", 3, false);
            WEBP_A = new ImageType("WEBP_A", 4, true);
            WEBP = new ImageType("WEBP", 5, false);
            UNKNOWN = new ImageType("UNKNOWN", 6, false);
            $VALUES = (new ImageType[] {
                GIF, JPEG, PNG_A, PNG, WEBP_A, WEBP, UNKNOWN
            });
        }

        private ImageType(String s, int i, boolean flag)
        {
            super(s, i);
            a = flag;
        }
    }

}
