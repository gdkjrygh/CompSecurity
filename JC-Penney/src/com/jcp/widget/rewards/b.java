// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget.rewards;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.jcp.activities.PrivacyPolicyActivity;
import com.jcp.widget.f;

// Referenced classes of package com.jcp.widget.rewards:
//            AgreeToTermsAndConditions

class b extends f
{

    final Context a;
    final AgreeToTermsAndConditions b;

    b(AgreeToTermsAndConditions agreetotermsandconditions, Context context)
    {
        b = agreetotermsandconditions;
        a = context;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(a, com/jcp/activities/PrivacyPolicyActivity);
        a.startActivity(view);
    }
}
