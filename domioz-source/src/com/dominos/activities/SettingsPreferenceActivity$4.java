// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.DialogInterface;
import android.content.Intent;
import com.dominos.beacon.service.BeaconService_;

// Referenced classes of package com.dominos.activities:
//            SettingsPreferenceActivity

class this._cls0
    implements android.content.er
{

    final SettingsPreferenceActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent(SettingsPreferenceActivity.this, com/dominos/beacon/service/BeaconService_);
        dialoginterface.setAction("beacon.intent.action.BEACON_RESTART");
        startService(dialoginterface);
    }

    _cls9()
    {
        this$0 = SettingsPreferenceActivity.this;
        super();
    }
}
