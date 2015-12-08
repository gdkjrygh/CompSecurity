// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.konylabs.capitalone.EnterpriseMobileBanking;

import android.content.Intent;

// Referenced classes of package com.konylabs.capitalone.EnterpriseMobileBanking:
//            LaunchActivity

class val.action
    implements Runnable
{

    final LaunchActivity this$0;
    final Intent val$action;

    public void run()
    {
        if (!LaunchActivity.access$000().isFinishing())
        {
            startActivity(val$action);
            finish();
        }
    }

    ()
    {
        this$0 = final_launchactivity;
        val$action = Intent.this;
        super();
    }
}
