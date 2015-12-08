// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;


// Referenced classes of package com.microsoft.dl.video.capture.api:
//            Resolution

public final class ImageFormat extends Enum
{

    public static final ImageFormat NV16;
    public static final ImageFormat NV21;
    public static final ImageFormat YUY2;
    public static final ImageFormat YV12;
    private static final ImageFormat d[];
    private final String a;
    private final int b;
    private final int c;

    private ImageFormat(String s, int i, String s1, int j)
    {
        super(s, i);
        a = s1;
        b = a(s1);
        c = j;
    }

    private static int a(String s)
    {
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            j = j << 8 | s.charAt(i);
        }

        return j;
    }

    public static ImageFormat valueOf(String s)
    {
        return (ImageFormat)Enum.valueOf(com/microsoft/dl/video/capture/api/ImageFormat, s);
    }

    public static ImageFormat[] values()
    {
        return (ImageFormat[])d.clone();
    }

    public final int getBitsPerPixel()
    {
        return c;
    }

    public final int getFourCC()
    {
        return b;
    }

    public final int getSampleSize(Resolution resolution)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ImageFormat.values().length];
                try
                {
                    a[ImageFormat.YV12.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1.a[ordinal()])
        {
        default:
            return (resolution.getNumPixels() * c) / 8;

        case 1: // '\001'
            break;
        }
        int i;
        if (resolution.getWidth() % 16 > 0)
        {
            i = (resolution.getWidth() >> 4) + 1 << 4;
        } else
        {
            i = resolution.getWidth();
        }
        return (i * resolution.getHeight() * c) / 8;
    }

    public final String toString()
    {
        return a;
    }

    static 
    {
        YV12 = new ImageFormat("YV12", 0, "YV12", 12);
        NV21 = new ImageFormat("NV21", 1, "NV21", 12);
        NV16 = new ImageFormat("NV16", 2, "NV16", 16);
        YUY2 = new ImageFormat("YUY2", 3, "YUY2", 16);
        d = (new ImageFormat[] {
            YV12, NV21, NV16, YUY2
        });
    }
}
