// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;
import com.jcp.h.a;
import com.jcp.pojo.Profile;
import com.jcp.util.au;
import com.jcp.util.bk;
import com.jcp.util.bq;

// Referenced classes of package com.jcp.activities:
//            JcpCheckoutSignIn

class w
    implements android.view.View.OnClickListener
{

    final JcpCheckoutSignIn a;

    w(JcpCheckoutSignIn jcpcheckoutsignin)
    {
        a = jcpcheckoutsignin;
        super();
    }

    public void onClick(View view)
    {
        com.jcp.activities.JcpCheckoutSignIn.a(a);
        a.b = JcpCheckoutSignIn.b(a).getEditableText().toString();
        if (!TextUtils.isEmpty(a.b))
        {
            a.b = a.b.trim();
        }
        a.a = JcpCheckoutSignIn.c(a).getEditableText().toString();
        if (!TextUtils.isEmpty(a.a))
        {
            a.a = a.a.trim();
        }
        if (!bq.b(a.b) || TextUtils.isEmpty(a.b) || TextUtils.isEmpty(a.a))
        {
            au.a(a, a.getString(0x7f07045c));
            return;
        } else
        {
            com.jcp.h.a.x();
            com.jcp.activities.JcpCheckoutSignIn.a(a, 1);
            com.jcp.activities.JcpCheckoutSignIn.a(a, JcpCheckoutSignIn.d(a).isChecked());
            bk.a(new Profile(a.b, a.a), a);
            JcpCheckoutSignIn.e(a);
            return;
        }
    }
}
