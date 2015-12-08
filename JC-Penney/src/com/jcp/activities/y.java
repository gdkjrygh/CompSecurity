// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;

// Referenced classes of package com.jcp.activities:
//            JcpCheckoutSignIn

class y
    implements android.view.View.OnClickListener
{

    final JcpCheckoutSignIn a;

    y(JcpCheckoutSignIn jcpcheckoutsignin)
    {
        a = jcpcheckoutsignin;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
