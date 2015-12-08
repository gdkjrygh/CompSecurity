// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

class this._cls0
    implements android.view.SettingsFragment._cls10
{

    final SochiApplicationSettingsFragment this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW");
        if ("nbclive".equals("golf"))
        {
            view.setData(Uri.parse("http://www.golfchannel.com/about/terms-of-use/"));
        } else
        if ("nbclive".equals("telemundo"))
        {
            view.setData(Uri.parse("http://msnlatino.telemundo.com/legal_terms/"));
        } else
        {
            view.setData(Uri.parse("http://m.nbcsports.com/content/terms-and-conditions"));
        }
        startActivity(view);
    }

    ()
    {
        this$0 = SochiApplicationSettingsFragment.this;
        super();
    }
}
