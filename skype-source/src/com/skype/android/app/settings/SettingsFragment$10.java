// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.preference.Preference;
import android.widget.Toast;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment

final class this._cls0
    implements android.preference.nceClickListener
{

    final SettingsFragment this$0;

    public final boolean onPreferenceClick(Preference preference)
    {
        analytics.a(AnalyticsEvent.Q, lib.getUnconsumedConversationsCount());
        lib.consumeAllConversations();
        Toast.makeText(getActivity(), 0x7f0802d4, 1).show();
        return true;
    }

    ener()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
