// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.pref;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;

// Referenced classes of package com.google.zxing.client.android.pref:
//            BSPlusPreference

class this._cls0
    implements android.preference.enceClickListener
{

    final BSPlusPreference this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        preference = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.srowen.bs.android"));
        preference.addFlags(0x80000);
        getContext().startActivity(preference);
        return true;
    }

    ()
    {
        this$0 = BSPlusPreference.this;
        super();
    }
}
