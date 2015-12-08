// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import com.jcp.model.CardDetails;

// Referenced classes of package com.jcp.fragments:
//            SavedCardFragment

class fv
    implements android.view.View.OnClickListener
{

    final CardDetails a;
    final int b;
    final String c;
    final SavedCardFragment.AbstractCardDetailsAdapter d;

    fv(SavedCardFragment.AbstractCardDetailsAdapter abstractcarddetailsadapter, CardDetails carddetails, int i, String s)
    {
        d = abstractcarddetailsadapter;
        a = carddetails;
        b = i;
        c = s;
        super();
    }

    public void onClick(View view)
    {
        SavedCardFragment.a(d.a, a.isDefault());
        SavedCardFragment.a(d.a, b);
        SavedCardFragment.a(d.a, c);
    }
}
