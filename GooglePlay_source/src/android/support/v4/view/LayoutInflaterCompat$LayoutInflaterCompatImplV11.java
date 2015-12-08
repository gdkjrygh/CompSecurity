// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterCompat, LayoutInflaterCompatHC, LayoutInflaterFactory

static class  extends 
{

    public void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
    {
        android.view.patImplV11 patimplv11;
        if (layoutinflaterfactory != null)
        {
            layoutinflaterfactory = new (layoutinflaterfactory);
        } else
        {
            layoutinflaterfactory = null;
        }
        layoutinflater.setFactory2(layoutinflaterfactory);
        patimplv11 = layoutinflater.getFactory();
        if (patimplv11 instanceof android.view.C)
        {
            LayoutInflaterCompatHC.forceSetFactory2(layoutinflater, (android.view._cls2)patimplv11);
            return;
        } else
        {
            LayoutInflaterCompatHC.forceSetFactory2(layoutinflater, layoutinflaterfactory);
            return;
        }
    }

    ()
    {
    }
}
