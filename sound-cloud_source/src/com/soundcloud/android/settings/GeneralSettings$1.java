// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.app.Activity;
import android.content.Intent;
import android.preference.Preference;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.settings:
//            OfflineSettingsActivity, GeneralSettings

class val.parent
    implements android.preference.renceClickListener
{

    final GeneralSettings this$0;
    final Activity val$parent;

    public boolean onPreferenceClick(Preference preference)
    {
        val$parent.startActivity(new Intent(val$parent, com/soundcloud/android/settings/OfflineSettingsActivity));
        if (GeneralSettings.access$000(GeneralSettings.this).upsellMidTier())
        {
            GeneralSettings.access$100(GeneralSettings.this).publish(EventQueue.TRACKING, UpgradeTrackingEvent.forSettingsClick());
        }
        return true;
    }

    ()
    {
        this$0 = final_generalsettings;
        val$parent = Activity.this;
        super();
    }
}
