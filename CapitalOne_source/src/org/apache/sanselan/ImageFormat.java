// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan;


public class ImageFormat
{

    public static final ImageFormat d = new ImageFormat("UNKNOWN");
    public static final ImageFormat e = new ImageFormat("PNG", (byte)0);
    public static final ImageFormat f = new ImageFormat("GIF", (byte)0);
    public static final ImageFormat g = new ImageFormat("ICO", (byte)0);
    public static final ImageFormat h = new ImageFormat("TIFF", (byte)0);
    public static final ImageFormat i = new ImageFormat("JPEG", (byte)0);
    public static final ImageFormat j = new ImageFormat("BMP", (byte)0);
    public static final ImageFormat k = new ImageFormat("PSD", (byte)0);
    public static final ImageFormat l = new ImageFormat("PBM", (byte)0);
    public static final ImageFormat m = new ImageFormat("PGM", (byte)0);
    public static final ImageFormat n = new ImageFormat("PPM", (byte)0);
    public static final ImageFormat o = new ImageFormat("PNM", (byte)0);
    public static final ImageFormat p = new ImageFormat("TGA", (byte)0);
    public static final ImageFormat q = new ImageFormat("JBig2", (byte)0);
    public final String a;
    public final String b;
    public final boolean c;

    private ImageFormat(String s)
    {
        a = s;
        b = s;
        c = false;
    }

    private ImageFormat(String s, byte byte0)
    {
        a = s;
        b = s;
        c = true;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof ImageFormat))
        {
            return false;
        } else
        {
            return ((ImageFormat)obj).a.equals(a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("{")).append(a).append(": ").append(b).append("}").toString();
    }

}
