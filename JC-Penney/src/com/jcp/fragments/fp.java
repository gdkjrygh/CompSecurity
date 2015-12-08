// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.view.View;
import com.jcp.b.b;
import com.jcp.c.ad;
import com.jcp.model.CardDetails;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            fo, SavedCardFragment

class fp
    implements android.view.View.OnClickListener
{

    final int a;
    final Dialog b;
    final fo c;

    fp(fo fo1, int i, Dialog dialog)
    {
        c = fo1;
        a = i;
        b = dialog;
        super();
    }

    public void onClick(View view)
    {
        view = ((CardDetails)SavedCardFragment.c(c.a).get(a)).getCardId();
        com.jcp.fragments.SavedCardFragment.b(c.a, true);
        b.dismiss();
        SavedCardFragment.a(c.a, ad.a(view), com.jcp.b.b.i(view));
    }
}
