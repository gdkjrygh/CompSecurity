// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;

final class lf extends le
{

    lf()
    {
    }

    public final void a(LayoutInflater layoutinflater, li li)
    {
        if (li != null)
        {
            li = new lh(li);
        } else
        {
            li = null;
        }
        layoutinflater.setFactory2(li);
    }
}
