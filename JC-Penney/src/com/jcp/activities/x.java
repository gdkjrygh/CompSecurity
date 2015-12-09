// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import com.jcp.JCP;
import com.jcp.c.ad;
import com.jcp.h.a;
import com.jcp.util.af;

// Referenced classes of package com.jcp.activities:
//            JcpCheckoutSignIn

class x
    implements android.view.View.OnClickListener
{

    final JcpCheckoutSignIn a;

    x(JcpCheckoutSignIn jcpcheckoutsignin)
    {
        a = jcpcheckoutsignin;
        super();
    }

    public void onClick(View view)
    {
        com.jcp.h.a.w();
        com.jcp.activities.JcpCheckoutSignIn.a(a, 0);
        JCP.s().a(a, (new ad()).b(true).a(), a);
    }
}
