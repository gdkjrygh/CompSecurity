// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.thetransitapp.droid.widget:
//            LegalAdapter

class this._cls0
    implements android.view.tener
{

    final LegalAdapter this$0;

    public void onClick(View view)
    {
        view = (new android.app.lder(getContext())).create();
        view.setTitle("Google Play Services");
        view.setMessage(GooglePlayServicesUtil.getOpenSourceSoftwareLicenseInfo(getContext()));
        view.setButton(-1, getContext().getText(0x7f0a002f), null);
        view.show();
    }

    esUtil()
    {
        this$0 = LegalAdapter.this;
        super();
    }
}
