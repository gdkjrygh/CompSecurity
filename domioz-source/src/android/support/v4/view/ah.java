// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            ag, am, al, an

class ah extends ag
{

    ah()
    {
    }

    public void a(LayoutInflater layoutinflater, an an)
    {
        android.view.LayoutInflater.Factory factory;
        if (an != null)
        {
            an = new am(an);
        } else
        {
            an = null;
        }
        layoutinflater.setFactory2(an);
        factory = layoutinflater.getFactory();
        if (factory instanceof android.view.LayoutInflater.Factory2)
        {
            al.a(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
            return;
        } else
        {
            al.a(layoutinflater, an);
            return;
        }
    }
}
