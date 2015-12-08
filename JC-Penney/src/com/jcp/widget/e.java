// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.jcp.b.b;

// Referenced classes of package com.jcp.widget:
//            JCPRewardsLink

class e
    implements android.view.View.OnClickListener
{

    final Context a;
    final JCPRewardsLink b;

    e(JCPRewardsLink jcprewardslink, Context context)
    {
        b = jcprewardslink;
        a = context;
        super();
    }

    public void onClick(View view)
    {
        a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.jcp.b.b.w())));
    }
}
