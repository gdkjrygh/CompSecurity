// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            ab, ah, ag, ai

class ac extends ab
{

    ac()
    {
    }

    public void a(LayoutInflater layoutinflater, ai ai)
    {
        android.view.LayoutInflater.Factory factory;
        if (ai != null)
        {
            ai = new ah(ai);
        } else
        {
            ai = null;
        }
        layoutinflater.setFactory2(ai);
        factory = layoutinflater.getFactory();
        if (factory instanceof android.view.LayoutInflater.Factory2)
        {
            ag.a(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
            return;
        } else
        {
            ag.a(layoutinflater, ai);
            return;
        }
    }
}
