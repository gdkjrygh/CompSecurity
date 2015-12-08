// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;


public final class ImageType extends Enum
{

    private static final ImageType $VALUES[];
    public static final ImageType SHOWCASE;
    public static final ImageType THUMBNAIL;

    private ImageType(String s, int i)
    {
        super(s, i);
    }

    public static String getExtension(ImageType imagetype, int i, int j)
    {
        if (i >= 0)
        {
            if (imagetype == SHOWCASE)
            {
                if (i >= 768)
                {
                    return "_m60.jpg";
                }
                if (i >= 640)
                {
                    return "_m61.jpg";
                }
                if (i >= 480)
                {
                    return "_m63.jpg";
                }
                if (i >= 320)
                {
                    return "_m62.jpg";
                } else
                {
                    return "_m64.jpg";
                }
            }
            if (i >= 280)
            {
                return "_m50.jpg";
            }
            if (i >= 212)
            {
                return "_m52.jpg";
            }
            if (i >= 210)
            {
                return "_m56.jpg";
            }
            if (i >= 180)
            {
                return "_m58.jpg";
            }
            if (i >= 167)
            {
                return "_m54.jpg";
            }
            if (i >= 140)
            {
                return "_m51.jpg";
            }
            if (i >= 135)
            {
                return "_m53.jpg";
            }
            if (i >= 106)
            {
                return "_m59.jpg";
            }
            if (i >= 90)
            {
                return "_m57.jpg";
            } else
            {
                return "_m55.jpg";
            }
        }
        if (imagetype == SHOWCASE)
        {
            if (j >= 370)
            {
                return "_m60.jpg";
            }
            if (j >= 280)
            {
                return "_m61.jpg";
            }
            if (j >= 210)
            {
                return "_m63.jpg";
            }
            if (j >= 140)
            {
                return "_m62.jpg";
            } else
            {
                return "_m64.jpg";
            }
        }
        if (j >= 158)
        {
            return "_m50.jpg";
        }
        if (j >= 120)
        {
            return "_m52.jpg";
        }
        if (j >= 119)
        {
            return "_m56.jpg";
        }
        if (j >= 102)
        {
            return "_m58.jpg";
        }
        if (j >= 95)
        {
            return "_m54.jpg";
        }
        if (j >= 79)
        {
            return "_m51.jpg";
        }
        if (j >= 70)
        {
            return "_m53.jpg";
        }
        if (j >= 60)
        {
            return "_m59.jpg";
        }
        if (j >= 51)
        {
            return "_m57.jpg";
        } else
        {
            return "_m55.jpg";
        }
    }

    public static ImageType valueOf(String s)
    {
        return (ImageType)Enum.valueOf(com/nbcsports/liveextra/library/api/models/ImageType, s);
    }

    public static ImageType[] values()
    {
        return (ImageType[])$VALUES.clone();
    }

    static 
    {
        SHOWCASE = new ImageType("SHOWCASE", 0);
        THUMBNAIL = new ImageType("THUMBNAIL", 1);
        $VALUES = (new ImageType[] {
            SHOWCASE, THUMBNAIL
        });
    }
}
