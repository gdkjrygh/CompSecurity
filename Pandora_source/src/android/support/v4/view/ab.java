// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            ac

public class ab
{
    static class a
        implements e
    {

        public int a(ViewConfiguration viewconfiguration)
        {
            return viewconfiguration.getScaledTouchSlop();
        }

        a()
        {
        }
    }

    static class b extends a
    {

        public int a(ViewConfiguration viewconfiguration)
        {
            return ac.a(viewconfiguration);
        }

        b()
        {
        }
    }

    static class c extends b
    {

        c()
        {
        }
    }

    static class d extends c
    {

        d()
        {
        }
    }

    static interface e
    {

        public abstract int a(ViewConfiguration viewconfiguration);
    }


    static final e a;

    public static int a(ViewConfiguration viewconfiguration)
    {
        return a.a(viewconfiguration);
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
