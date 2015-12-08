// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;

// Referenced classes of package com.jcp.activities:
//            CaPrivacyPolicyActivity

class c
    implements android.view.View.OnClickListener
{

    final CaPrivacyPolicyActivity a;

    c(CaPrivacyPolicyActivity caprivacypolicyactivity)
    {
        a = caprivacypolicyactivity;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
