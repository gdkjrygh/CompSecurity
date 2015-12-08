// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;

class le extends ld
{

    le()
    {
    }

    public void a(LayoutInflater layoutinflater, li li)
    {
        android.view.LayoutInflater.Factory factory;
        if (li != null)
        {
            li = new lh(li);
        } else
        {
            li = null;
        }
        layoutinflater.setFactory2(li);
        factory = layoutinflater.getFactory();
        if (factory instanceof android.view.LayoutInflater.Factory2)
        {
            c.a(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
            return;
        } else
        {
            c.a(layoutinflater, li);
            return;
        }
    }
}
