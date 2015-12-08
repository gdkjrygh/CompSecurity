// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.main:
//            DevDrawerFragment

class val.screen
    implements android.preference.nceClickListener
{

    final DevDrawerFragment this$0;
    final PreferenceScreen val$screen;

    public boolean onPreferenceClick(Preference preference)
    {
        Flag flag;
        String s;
        for (preference = Flag.realFeatures().iterator(); preference.hasNext(); ((CheckBoxPreference)val$screen.findPreference(s)).setChecked(featureFlags.resetAndGet(flag)))
        {
            flag = (Flag)preference.next();
            s = featureFlags.getPreferenceKey(flag);
        }

        return true;
    }

    istener()
    {
        this$0 = final_devdrawerfragment;
        val$screen = PreferenceScreen.this;
        super();
    }
}
