// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

public final class ab
{
    static class a
        implements e
    {

        public int a(ViewConfiguration viewconfiguration)
        {
            return viewconfiguration.getScaledTouchSlop();
        }

        public boolean b(ViewConfiguration viewconfiguration)
        {
            return true;
        }

        a()
        {
        }
    }

    static class b extends a
    {

        public final int a(ViewConfiguration viewconfiguration)
        {
            return viewconfiguration.getScaledPagingTouchSlop();
        }

        b()
        {
        }
    }

    static class c extends b
    {

        public boolean b(ViewConfiguration viewconfiguration)
        {
            return false;
        }

        c()
        {
        }
    }

    static final class d extends c
    {

        public final boolean b(ViewConfiguration viewconfiguration)
        {
            return viewconfiguration.hasPermanentMenuKey();
        }

        d()
        {
        }
    }

    static interface e
    {

        public abstract int a(ViewConfiguration viewconfiguration);

        public abstract boolean b(ViewConfiguration viewconfiguration);
    }


    static final e a;

    public static int a(ViewConfiguration viewconfiguration)
    {
        return a.a(viewconfiguration);
    }

    public static boolean b(ViewConfiguration viewconfiguration)
    {
        return a.b(viewconfiguration);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new d();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new b();
        } else
        {
            a = new a();
        }
    }
}
