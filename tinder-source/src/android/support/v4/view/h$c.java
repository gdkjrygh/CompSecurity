// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            h, j, k

static class Factory2 extends Factory2
{

    public void a(LayoutInflater layoutinflater, k k)
    {
        android.view.utInflater.Factory factory;
        if (k != null)
        {
            k = new <init>(k);
        } else
        {
            k = null;
        }
        layoutinflater.setFactory2(k);
        factory = layoutinflater.getFactory();
        if (factory instanceof android.view.utInflater.Factory2)
        {
            j.a(layoutinflater, (android.view.utInflater.Factory2)factory);
            return;
        } else
        {
            j.a(layoutinflater, k);
            return;
        }
    }

    Factory2()
    {
    }
}
