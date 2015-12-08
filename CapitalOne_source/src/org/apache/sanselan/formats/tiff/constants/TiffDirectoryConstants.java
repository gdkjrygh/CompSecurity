// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.constants;


public interface TiffDirectoryConstants
{

    public static final ExifDirectoryType b_ = image;
    public static final ExifDirectoryType c_ = b_;
    public static final ExifDirectoryType d_ = image;
    public static final ExifDirectoryType e_ = image;
    public static final ExifDirectoryType fQ = image;
    public static final ExifDirectoryType fT = image;
    public static final ExifDirectoryType fV = image;
    public static final ExifDirectoryType fX = image;
    public static final ExifDirectoryType fY = d_;
    public static final ExifDirectoryType fZ = e_;
    public static final ExifDirectoryType f_ = image;
    public static final ExifDirectoryType ga = f_;
    public static final ExifDirectoryType gb = new ExifDirectoryType.Special(-4, "Interop IFD");
    public static final ExifDirectoryType gc = new ExifDirectoryType.Special(-5, "Maker Notes");
    public static final ExifDirectoryType gd = new ExifDirectoryType.Special(-2, "Exif IFD");
    public static final ExifDirectoryType ge = new ExifDirectoryType.Special(-3, "GPS IFD");
    public static final ExifDirectoryType gf = null;
    public static final ExifDirectoryType gg[] = {
        c_, gd, b_, fQ, d_, fT, e_, fV, gb, gc, 
        fY, fZ, ga, ge
    };

    
    {
        class ExifDirectoryType.Image extends ExifDirectoryType
        {
            private class ExifDirectoryType
            {

                public final int a;
                public final String b;

                public abstract boolean a();

                public ExifDirectoryType(int i, String s)
                {
                    a = i;
                    b = s;
                }
            }


            public final boolean a()
            {
                return true;
            }

            public ExifDirectoryType.Image(int i, String s)
            {
                super(i, s);
            }
        }

        ExifDirectoryType.Image image = new ExifDirectoryType.Image(0, "IFD0");
        image = new ExifDirectoryType.Image(1, "IFD1");
        image = new ExifDirectoryType.Image(2, "IFD2");
        image = new ExifDirectoryType.Image(3, "IFD3");
        class ExifDirectoryType.Special extends ExifDirectoryType
        {

            public final boolean a()
            {
                return false;
            }

            public ExifDirectoryType.Special(int i, String s)
            {
                super(i, s);
            }
        }

    }
}
