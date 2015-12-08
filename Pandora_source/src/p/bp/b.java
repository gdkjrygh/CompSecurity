// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bp;

import com.google.android.gms.ads.AdSize;

public final class b
{

    public static final b a = new b(-1, -2, "mb");
    public static final b b = new b(320, 50, "mb");
    public static final b c = new b(300, 250, "as");
    public static final b d = new b(468, 60, "as");
    public static final b e = new b(728, 90, "as");
    public static final b f = new b(160, 600, "as");
    private final AdSize g;

    private b(int i, int j, String s)
    {
        this(new AdSize(i, j));
    }

    public b(AdSize adsize)
    {
        g = adsize;
    }

    public int a()
    {
        return g.getWidth();
    }

    public int b()
    {
        return g.getHeight();
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof b))
        {
            return false;
        } else
        {
            obj = (b)obj;
            return g.equals(((b) (obj)).g);
        }
    }

    public int hashCode()
    {
        return g.hashCode();
    }

    public String toString()
    {
        return g.toString();
    }

}
