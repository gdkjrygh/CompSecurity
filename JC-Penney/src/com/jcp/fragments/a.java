// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments:
//            AddCreditCardFragment

class a extends DebouncingOnClickListener
{

    final AddCreditCardFragment a;
    final AddCreditCardFragment..ViewInjector b;

    a(AddCreditCardFragment..ViewInjector viewinjector, AddCreditCardFragment addcreditcardfragment)
    {
        b = viewinjector;
        a = addcreditcardfragment;
        super();
    }

    public void doClick(View view)
    {
        a.noClicked();
    }
}
