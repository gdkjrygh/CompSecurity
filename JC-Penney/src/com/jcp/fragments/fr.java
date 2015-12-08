// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import com.jcp.b.a;

// Referenced classes of package com.jcp.fragments:
//            SavedCardFragment, s, AddCreditCardFragment, t

class fr
    implements android.view.View.OnClickListener
{

    final SavedCardFragment a;

    fr(SavedCardFragment savedcardfragment)
    {
        a = savedcardfragment;
        super();
    }

    public void onClick(View view)
    {
        com.jcp.b.a.b(true);
        view = com.jcp.fragments.s.a(a.i());
        if (view != null)
        {
            view.c(new AddCreditCardFragment(), "AddCreditCardFragment");
        }
    }
}
