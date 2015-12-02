// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            aa

public class z
{
    static class a
        implements c
    {

        public int a(ViewConfiguration viewconfiguration)
        {
            return viewconfiguration.getScaledTouchSlop();
        }

        a()
        {
        }
    }

    static class b
        implements c
    {

        public int a(ViewConfiguration viewconfiguration)
        {
            return aa.a(viewconfiguration);
        }

        b()
        {
        }
    }

    static interface c
    {

        public abstract int a(ViewConfiguration viewconfiguration);
    }


    static final c a;

    public static int a(ViewConfiguration viewconfiguration)
    {
        return a.a(viewconfiguration);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new b();
        } else
        {
            a = new a();
        }
    }
}
