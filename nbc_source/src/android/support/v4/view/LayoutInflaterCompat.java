// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterFactory, LayoutInflaterCompatBase, LayoutInflaterCompatHC, LayoutInflaterCompatLollipop

public class LayoutInflaterCompat
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
            LayoutInflaterCompatBase.setFactory(layoutinflater, layoutinflaterfactory);
        }

        LayoutInflaterCompatImplBase()
        {
        }
    }

    static class LayoutInflaterCompatImplV11 extends LayoutInflaterCompatImplBase
    {

        public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
        {
            LayoutInflaterCompatHC.setFactory(layoutinflater, layoutinflaterfactory);
        }

        LayoutInflaterCompatImplV11()
        {
        }
    }

    static class LayoutInflaterCompatImplV21 extends LayoutInflaterCompatImplV11
    {

        public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
        {
            LayoutInflaterCompatLollipop.setFactory(layoutinflater, layoutinflaterfactory);
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
