// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget.rewards;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.jcp.util.au;
import com.jcp.widget.f;

// Referenced classes of package com.jcp.widget.rewards:
//            AgreeToTermsAndConditions

class a extends f
{

    final Context a;
    final AgreeToTermsAndConditions b;

    a(AgreeToTermsAndConditions agreetotermsandconditions, Context context)
    {
        b = agreetotermsandconditions;
        a = context;
        super();
    }

    public void onClick(View view)
    {
        au.b(a, b.getResources().getString(0x7f070458));
    }
}
