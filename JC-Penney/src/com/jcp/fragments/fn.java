// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.view.View;
import com.jcp.model.CardDetails;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            fm, SavedCardFragment

class fn
    implements android.view.View.OnClickListener
{

    final int a;
    final Dialog b;
    final fm c;

    fn(fm fm1, int i, Dialog dialog)
    {
        c = fm1;
        a = i;
        b = dialog;
        super();
    }

    public void onClick(View view)
    {
        view = ((CardDetails)SavedCardFragment.a(c.a).get(a)).getCardId();
        SavedCardFragment.a(c.a, true);
        SavedCardFragment.a(c.a, a);
        b.dismiss();
        SavedCardFragment.a(c.a, view);
    }
}
