// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterFactory, i

public final class g
{
    static interface a
    {

        public abstract void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory);
    }

    static class b
        implements a
    {

        public void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
        {
            if (layoutinflaterfactory != null)
            {
                layoutinflaterfactory = new h.a(layoutinflaterfactory);
            } else
            {
                layoutinflaterfactory = null;
            }
            layoutinflater.setFactory(layoutinflaterfactory);
        }

        b()
        {
        }
    }

    static class c extends b
    {

        public void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
        {
            android.view.LayoutInflater.Factory factory;
            if (layoutinflaterfactory != null)
            {
                layoutinflaterfactory = new i.a(layoutinflaterfactory);
            } else
            {
                layoutinflaterfactory = null;
            }
            layoutinflater.setFactory2(layoutinflaterfactory);
            factory = layoutinflater.getFactory();
            if (factory instanceof android.view.LayoutInflater.Factory2)
            {
                i.a(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
                return;
            } else
            {
                i.a(layoutinflater, layoutinflaterfactory);
                return;
            }
        }

        c()
        {
        }
    }

    static final class d extends c
    {

        public final void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
        {
            if (layoutinflaterfactory != null)
            {
                layoutinflaterfactory = new i.a(layoutinflaterfactory);
            } else
            {
                layoutinflaterfactory = null;
            }
            layoutinflater.setFactory2(layoutinflaterfactory);
        }

        d()
        {
        }
    }


    static final a a;

    public static void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
    {
        a.a(layoutinflater, layoutinflaterfactory);
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
