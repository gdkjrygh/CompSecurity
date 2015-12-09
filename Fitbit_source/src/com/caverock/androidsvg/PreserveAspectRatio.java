// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.caverock.androidsvg;


public class PreserveAspectRatio
{

    public static final PreserveAspectRatio a = new PreserveAspectRatio(null, null);
    public static final PreserveAspectRatio b;
    public static final PreserveAspectRatio c;
    public static final PreserveAspectRatio d;
    public static final PreserveAspectRatio e;
    public static final PreserveAspectRatio f;
    public static final PreserveAspectRatio g;
    public static final PreserveAspectRatio h;
    public static final PreserveAspectRatio i;
    private Alignment j;
    private Scale k;

    public PreserveAspectRatio(Alignment alignment, Scale scale)
    {
        j = alignment;
        k = scale;
    }

    public Alignment a()
    {
        return j;
    }

    public Scale b()
    {
        return k;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PreserveAspectRatio)obj;
            if (j != ((PreserveAspectRatio) (obj)).j)
            {
                return false;
            }
            if (k != ((PreserveAspectRatio) (obj)).k)
            {
                return false;
            }
        }
        return true;
    }

    static 
    {
    /* block-local class not found */
    class Alignment {}

        b = new PreserveAspectRatio(Alignment.a, null);
    /* block-local class not found */
    class Scale {}

        c = new PreserveAspectRatio(Alignment.f, Scale.a);
        d = new PreserveAspectRatio(Alignment.b, Scale.a);
        e = new PreserveAspectRatio(Alignment.j, Scale.a);
        f = new PreserveAspectRatio(Alignment.c, Scale.a);
        g = new PreserveAspectRatio(Alignment.i, Scale.a);
        h = new PreserveAspectRatio(Alignment.f, Scale.b);
        i = new PreserveAspectRatio(Alignment.b, Scale.b);
    }
}
