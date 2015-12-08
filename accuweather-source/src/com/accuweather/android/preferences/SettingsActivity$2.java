// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.preference.Preference;
import com.accuweather.android.market.MarketUtils;

// Referenced classes of package com.accuweather.android.preferences:
//            SettingsActivity

class this._cls0
    implements android.preference.enceClickListener
{

    final SettingsActivity this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        MarketUtils.rateThisApp(SettingsActivity.this);
        return false;
    }

    ()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
