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

    private static final r a;
    private final Object b;

    public q()
    {
        b = a.a(this);
    }

    public q(Object obj)
    {
        b = obj;
    }

    public static f b()
    {
        return null;
    }

    public static boolean c()
    {
        return false;
    }

    public static List d()
    {
        return null;
    }

    public static f e()
    {
        return null;
    }

    public final Object a()
    {
        return b;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new u();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new s();
        } else
        {
            a = new w();
        }
    }
}
