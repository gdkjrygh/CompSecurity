// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            ac

public class ab
{
    static class a extends e
    {

        public void a(ViewGroup viewgroup, boolean flag)
        {
            ac.a(viewgroup, flag);
        }

        a()
        {
        }
    }

    static class b extends a
    {

        b()
        {
        }
    }

    static interface c
    {

        public abstract void a(ViewGroup viewgroup, boolean flag);
    }

    static class d extends b
    {

        d()
        {
        }
    }

    static class e
        implements c
    {

        public void a(ViewGroup viewgroup, boolean flag)
        {
        }

        e()
        {
        }
    }


    static final c a;

    public static void a(ViewGroup viewgroup, boolean flag)
    {
        a.a(viewgroup, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 18)
        {
            a = new d();
        } else
        if (i >= 14)
        {
            a = new b();
        } else
        if (i >= 11)
        {
            a = new a();
        } else
        {
            a = new e();
        }
    }
}
