// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import com.EnterpriseMobileBanking.Plugins.AndroidLocaleJSI;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class skipShow
    implements Runnable
{

    boolean skipShow;
    final EnterpriseMobileBanking this$0;
    final View unauth;

    public void run()
    {
        if (EnterpriseMobileBanking.access$400(EnterpriseMobileBanking.this).isShowing() || findViewById(0x7f0800a3) != null)
        {
            unauth.postDelayed(this, 100L);
            return;
        }
        if (!unauth.isShown() && !skipShow)
        {
            if (AndroidLocaleJSI.getInstance().skipLanding() || getIntent() != null && getIntent().getData() != null)
            {
                skipShow = true;
            } else
            {
                unauth.setVisibility(0);
                findViewById(0x7f08007e).setVisibility(0);
            }
            unauth.postDelayed(this, 200L);
            return;
        }
        if (AndroidLocaleJSI.getInstance().skipLanding())
        {
            handleLob(findViewById(0x7f08007f).findViewById(0x7f080099));
        } else
        if (getIntent() != null && getIntent().getData() != null)
        {
            EnterpriseMobileBanking.access$700(EnterpriseMobileBanking.this);
            skipShow = false;
        } else
        {
            unauth.sendAccessibilityEvent(8);
        }
        setIntent(new Intent());
    }

    ()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
        unauth = findViewById(0x7f08007a);
        skipShow = false;
    }
}
