// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public final class dgf
    implements gwk
{

    public static final dgf a = new dgf();
    private float b;
    private int c;
    private int d;
    private String e;

    private dgf()
    {
        this(10, 255);
    }

    public dgf(int i, int j)
    {
        b = 0.25F;
        c = i;
        d = j;
        e = (new StringBuilder("StackBlurTransformation(")).append(b).append(",").append(c).append(",").append(d).append(")").toString();
    }

    public final Bitmap a(Bitmap bitmap)
    {
        if (bitmap == null || bitmap.getConfig() == null)
        {
            return bitmap;
        } else
        {
            return dga.a(bitmap, c, b, d);
        }
    }

    public final String a()
    {
        return e;
    }

}
