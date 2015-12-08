// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            q, p

public final class ImageHeaderParser
{

    private static final byte a[];
    private static final int b[];
    private final q c;

    public ImageHeaderParser(InputStream inputstream)
    {
        c = new q(inputstream);
    }

    private static int a(p p1)
    {
        short word0 = p1.b(6);
        ByteOrder byteorder;
        if (word0 != 19789)
        {
            int j;
            short word1;
            if (word0 == 18761)
            {
                byteorder = ByteOrder.LITTLE_ENDIAN;
                break MISSING_BLOCK_LABEL_25;
            }
            Log.isLoggable("ImageHeaderParser", 3);
        }
        byteorder = ByteOrder.BIG_ENDIAN;
        continue;
        do
        {
            p1.a(byteorder);
            j = p1.a(10) + 6;
            word1 = p1.b(j);
            int i = 0;
            while (i < word1) 
            {
                int k = j + 2 + i * 12;
                short word2 = p1.b(k);
                if (word2 == 274)
                {
                    int l = p1.b(k + 2);
                    if (l <= 0 || l > 12)
                    {
                        if (!Log.isLoggable("ImageHeaderParser", 3));
                    } else
                    {
                        int i1 = p1.a(k + 4);
                        if (i1 < 0)
                        {
                            if (!Log.isLoggable("ImageHeaderParser", 3));
                        } else
                        {
                            if (Log.isLoggable("ImageHeaderParser", 3))
                            {
                                (new StringBuilder("Got tagIndex=")).append(i).append(" tagType=").append(word2).append(" formatCode=").append(l).append(" componentCount=").append(i1);
                            }
                            l = b[l] + i1;
                            if (l > 4)
                            {
                                if (!Log.isLoggable("ImageHeaderParser", 3));
                            } else
                            {
                                k += 8;
                                if (k < 0 || k > p1.a())
                                {
                                    if (Log.isLoggable("ImageHeaderParser", 3))
                                    {
                                        (new StringBuilder("Illegal tagValueOffset=")).append(k).append(" tagType=").append(word2);
                                    }
                                } else
                                if (l < 0 || k + l > p1.a())
                                {
                                    if (!Log.isLoggable("ImageHeaderParser", 3));
                                } else
                                {
                                    return p1.b(k);
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

    public final ImageType a()
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

    public final int b()
    {
        int j;
        boolean flag1;
        j = 1;
        flag1 = false;
        int i = c.a();
        boolean flag;
        if ((0xffd8 & i) == 65496 || i == 19789 || i == 18761)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return -1;
        }
_L4:
        byte abyte0[];
        short word0;
        if (c.b() != 255)
        {
            Log.isLoggable("ImageHeaderParser", 3);
            abyte0 = null;
        } else
        {
            word0 = c.b();
            if (word0 == 218)
            {
                abyte0 = null;
            } else
            {
label0:
                {
                    if (word0 != 217)
                    {
                        break label0;
                    }
                    Log.isLoggable("ImageHeaderParser", 3);
                    abyte0 = null;
                }
            }
        }
_L5:
        int k;
        long l1;
        if (abyte0 != null && abyte0.length > a.length)
        {
            word0 = j;
        } else
        {
            word0 = 0;
        }
        if (word0 == 0) goto _L2; else goto _L1
_L1:
        j = 0;
_L6:
        if (j < a.length)
        {
            if (abyte0[j] == a[j])
            {
                break MISSING_BLOCK_LABEL_331;
            }
            word0 = flag1;
        }
_L2:
        if (word0 != 0)
        {
            return a(new p(abyte0));
        } else
        {
            return -1;
        }
        k = c.a() - 2;
        if (word0 == 225)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        l1 = c.a(k);
        if (l1 == (long)k) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("ImageHeaderParser", 3))
        {
            (new StringBuilder("Unable to skip enough data, type: ")).append(word0).append(", wanted to skip: ").append(k).append(", but actually skipped: ").append(l1);
        }
        abyte0 = null;
          goto _L5
        abyte0 = new byte[k];
        int l = c.a(abyte0);
        if (l != k)
        {
            if (Log.isLoggable("ImageHeaderParser", 3))
            {
                (new StringBuilder("Unable to read segment data, type: ")).append(word0).append(", length: ").append(k).append(", actually read: ").append(l);
            }
            abyte0 = null;
        }
          goto _L5
        j++;
          goto _L6
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

    private class ImageType extends Enum
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

}
