// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import com.jcp.b.b;
import com.jcp.util.au;

// Referenced classes of package com.jcp.activities:
//            JcpCheckoutSignIn

class aa
    implements android.view.View.OnClickListener
{

    final JcpCheckoutSignIn a;

    aa(JcpCheckoutSignIn jcpcheckoutsignin)
    {
        a = jcpcheckoutsignin;
        super();
    }

    public void onClick(View view)
    {
        au.b(a, b.r());
    }
}
