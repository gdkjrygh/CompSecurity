// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            k, j

public final class h
{
    static interface a
    {

        public abstract void a(LayoutInflater layoutinflater, k k);
    }

    static class b
        implements a
    {

        public void a(LayoutInflater layoutinflater, k k)
        {
            if (k != null)
            {
                k = new i.a(k);
            } else
            {
                k = null;
            }
            layoutinflater.setFactory(k);
        }

        b()
        {
        }
    }

    static class c extends b
    {

        public void a(LayoutInflater layoutinflater, k k)
        {
            android.view.LayoutInflater.Factory factory;
            if (k != null)
            {
                k = new j.a(k);
            } else
            {
                k = null;
            }
            layoutinflater.setFactory2(k);
            factory = layoutinflater.getFactory();
            if (factory instanceof android.view.LayoutInflater.Factory2)
            {
                j.a(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
                return;
            } else
            {
                j.a(layoutinflater, k);
                return;
            }
        }

        c()
        {
        }
    }

    static final class d extends c
    {

        public final void a(LayoutInflater layoutinflater, k k)
        {
            if (k != null)
            {
                k = new j.a(k);
            } else
            {
                k = null;
            }
            layoutinflater.setFactory2(k);
        }

        d()
        {
        }
    }


    static final a a;

    public static void a(LayoutInflater layoutinflater, k k)
    {
        a.a(layoutinflater, k);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new d();
        } else
        if (i >= 11)
        {
            a = new c();
        } else
        {
            a = new b();
        }
    }
}
