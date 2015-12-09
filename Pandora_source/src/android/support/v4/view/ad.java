// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            ae

public class ad
{
    static class a extends e
    {

        a()
        {
        }
    }

    static class b extends f
    {

        public void a(ViewGroup viewgroup, boolean flag)
        {
            ae.a(viewgroup, flag);
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

    static interface d
    {

        public abstract void a(ViewGroup viewgroup, boolean flag);
    }

    static class e extends c
    {

        e()
        {
        }
    }

    static class f
        implements d
    {

        public void a(ViewGroup viewgroup, boolean flag)
        {
        }

        f()
        {
        }
    }


    static final d a;

    public static void a(ViewGroup viewgroup, boolean flag)
    {
        a.a(viewgroup, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new a();
        } else
        if (i >= 18)
        {
            a = new e();
        } else
        if (i >= 14)
        {
            a = new c();
        } else
        if (i >= 11)
        {
            a = new b();
        } else
        {
            a = new f();
        }
    }
}
