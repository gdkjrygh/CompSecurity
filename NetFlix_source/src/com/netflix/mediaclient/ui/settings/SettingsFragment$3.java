// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import android.preference.Preference;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.PlayerTypeFactory;

// Referenced classes of package com.netflix.mediaclient.ui.settings:
//            SettingsFragment

class this._cls0
    implements android.preference.enceChangeListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        if (obj instanceof String)
        {
            preference = (String)obj;
            if ("DEFAULT".equals(preference))
            {
                Log.d("SettingsFragment", "Reset player to default");
                PlayerTypeFactory.resetPlayerTypeByQA(SettingsFragment.access$000(SettingsFragment.this));
            } else
            if ("XAL".equals(preference))
            {
                Log.d("SettingsFragment", "Set Player type to XAL");
                SettingsFragment.access$100(SettingsFragment.this, PlayerTypeFactory.getXalPlayer());
            } else
            if ("XALAMP".equals(preference))
            {
                Log.d("SettingsFragment", "Set Player type to XALMP");
                SettingsFragment.access$100(SettingsFragment.this, PlayerTypeFactory.getXalmpPlayer());
            } else
            if ("JPLAYER".equals(preference))
            {
                Log.d("SettingsFragment", "Set Player type to JPLAYER");
                SettingsFragment.access$100(SettingsFragment.this, PlayerTypeFactory.getJPlayer());
            } else
            if ("JPLAYERBASE".equals(preference))
            {
                Log.d("SettingsFragment", "Set Player type to JPLAYERBASE");
                SettingsFragment.access$100(SettingsFragment.this, PlayerTypeFactory.getJPlayerBase());
            } else
            if ("JPLAYER2".equals(preference))
            {
                Log.d("SettingsFragment", "Set Player type to JPLAYER2");
                SettingsFragment.access$100(SettingsFragment.this, PlayerTypeFactory.getJPlayer2());
            } else
            {
                Log.e("SettingsFragment", (new StringBuilder()).append("Received unexpected value for player type ").append(preference).toString());
            }
        } else
        {
            Log.e("SettingsFragment", (new StringBuilder()).append("Received unexpected NON string value for player type ").append(obj).toString());
        }
        return true;
    }

    eFactory()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
