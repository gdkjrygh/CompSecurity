// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.view.View;
import com.jcp.b.b;
import com.jcp.c.q;
import com.jcp.model.GetAddressResponseModel;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            PrimaryAddressFragment

class cl
    implements android.view.View.OnClickListener
{

    final int a;
    final Dialog b;
    final PrimaryAddressFragment c;

    cl(PrimaryAddressFragment primaryaddressfragment, int i, Dialog dialog)
    {
        c = primaryaddressfragment;
        a = i;
        b = dialog;
        super();
    }

    public void onClick(View view)
    {
        com.jcp.b.b.b(a);
        view = ((GetAddressResponseModel)PrimaryAddressFragment.c(c).get(a)).getId();
        PrimaryAddressFragment.d(c).a(c);
        PrimaryAddressFragment.d(c).b(view);
        b.dismiss();
    }
}
