// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.view.View;
import com.jcp.b.b;
import com.jcp.c.ad;
import com.jcp.c.q;
import com.jcp.model.CardDetails;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            eu, et

class ew
    implements android.view.View.OnClickListener
{

    final int a;
    final Dialog b;
    final eu c;

    ew(eu eu1, int i, Dialog dialog)
    {
        c = eu1;
        a = i;
        b = dialog;
        super();
    }

    public void onClick(View view)
    {
        view = ((CardDetails)et.a(c.a).get(a)).getCardId();
        et.c(c.a).a(ad.a(view), com.jcp.b.b.i(view));
        b.dismiss();
    }
}
