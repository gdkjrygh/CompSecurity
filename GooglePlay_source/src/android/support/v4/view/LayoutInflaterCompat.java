// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterFactory, LayoutInflaterCompatHC

public final class LayoutInflaterCompat
{
    static interface LayoutInflaterCompatImpl
    {

        public abstract void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory);
    }

    static class LayoutInflaterCompatImplBase
        implements LayoutInflaterCompatImpl
    {

        public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
        {
            if (layoutinflaterfactory != null)
            {
                layoutinflaterfactory = new LayoutInflaterCompatBase.FactoryWrapper(layoutinflaterfactory);
            } else
            {
                layoutinflaterfactory = null;
            }
            layoutinflater.setFactory(layoutinflaterfactory);
        }

        LayoutInflaterCompatImplBase()
        {
        }
    }

    static class LayoutInflaterCompatImplV11 extends LayoutInflaterCompatImplBase
    {

        public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
        {
            android.view.LayoutInflater.Factory factory;
            if (layoutinflaterfactory != null)
            {
                layoutinflaterfactory = new LayoutInflaterCompatHC.FactoryWrapperHC(layoutinflaterfactory);
            } else
            {
                layoutinflaterfactory = null;
            }
            layoutinflater.setFactory2(layoutinflaterfactory);
            factory = layoutinflater.getFactory();
            if (factory instanceof android.view.LayoutInflater.Factory2)
            {
                LayoutInflaterCompatHC.forceSetFactory2(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
                return;
            } else
            {
                LayoutInflaterCompatHC.forceSetFactory2(layoutinflater, layoutinflaterfactory);
                return;
            }
        }

        LayoutInflaterCompatImplV11()
        {
        }
    }

    static final class LayoutInflaterCompatImplV21 extends LayoutInflaterCompatImplV11
    {

        public final void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
        {
            if (layoutinflaterfactory != null)
            {
                layoutinflaterfactory = new LayoutInflaterCompatHC.FactoryWrapperHC(layoutinflaterfactory);
            } else
            {
                layoutinflaterfactory = null;
            }
            layoutinflater.setFactory2(layoutinflaterfactory);
        }

        LayoutInflaterCompatImplV21()
        {
        }
    }


    static final LayoutInflaterCompatImpl IMPL;

    public static void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
    {
        IMPL.setFactory(layoutinflater, layoutinflaterfactory);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            IMPL = new LayoutInflaterCompatImplV21();
        } else
        if (i >= 11)
        {
            IMPL = new LayoutInflaterCompatImplV11();
        } else
        {
            IMPL = new LayoutInflaterCompatImplBase();
        }
    }
}
