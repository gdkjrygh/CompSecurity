// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            u, s, w, r, 
//            f

public final class q
{

    private static final r b;
    public final Object a;

    public q()
    {
        a = b.a(this);
    }

    public q(Object obj)
    {
        a = obj;
    }

    public static f a()
    {
        return null;
    }

    public static boolean b()
    {
        return false;
    }

    public static List c()
    {
        return null;
    }

    public static f d()
    {
        return null;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            b = new u();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b = new s();
        } else
        {
            b = new w();
        }
    }
}
