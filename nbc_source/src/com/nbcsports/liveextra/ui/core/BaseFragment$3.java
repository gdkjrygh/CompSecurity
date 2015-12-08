// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.phunware.nbc.sochi.system.NBCSystem;

// Referenced classes of package com.nbcsports.liveextra.ui.core:
//            BaseFragment

class val.webUrl
    implements android.view.tener
{

    final BaseFragment this$0;
    final String val$webUrl;

    public void onClick(View view)
    {
        if (val$webUrl != null)
        {
            NBCSystem.debugLog(val$webUrl, val$webUrl);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(val$webUrl)));
        }
    }

    ()
    {
        this$0 = final_basefragment;
        val$webUrl = String.this;
        super();
    }
}
