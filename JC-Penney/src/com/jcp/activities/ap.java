// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;

// Referenced classes of package com.jcp.activities:
//            PrivacyPolicyActivity

class ap
    implements android.view.View.OnClickListener
{

    final PrivacyPolicyActivity a;

    ap(PrivacyPolicyActivity privacypolicyactivity)
    {
        a = privacypolicyactivity;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
