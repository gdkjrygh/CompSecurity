// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypePreferenceFragment;
import com.skype.android.app.Navigation;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater;
import com.skype.android.sync.ContactsIngestManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.skype.android.app.settings:
//            UserPreferences, a

public class DebugSettingsFragment extends SkypePreferenceFragment
{

    Account account;
    ApplicationConfig appConfig;
    ContactsIngestManager contactsIngestManager;
    SkyLib lib;
    Navigation nav;
    ConfigUpdater updater;
    UserPreferences userPreferences;

    public DebugSettingsFragment()
    {
    }

    private void displayMnvInfo()
    {
        Preference preference = findPreference("mnv_debug_info");
        StringBuilder stringbuilder = new StringBuilder();
        Object obj1 = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
        Object obj2 = new Date(0L);
        Object obj = userPreferences.getMnvSkippedUntil();
        Object obj3 = userPreferences.getMnvLastChecked();
        if (((Date) (obj)).equals(obj2))
        {
            obj = "never";
        } else
        {
            obj = ((DateFormat) (obj1)).format(((Date) (obj)));
        }
        if (((Date) (obj3)).equals(obj2))
        {
            obj1 = "never";
        } else
        {
            obj1 = ((DateFormat) (obj1)).format(((Date) (obj3)));
        }
        obj3 = stringbuilder.append("\nnumber verify completed:\t");
        if (userPreferences.isMnvCompleted())
        {
            obj2 = "true";
        } else
        {
            obj2 = "false";
        }
        ((StringBuilder) (obj3)).append(((String) (obj2))).append("\nskip-until time:\t").append(((String) (obj))).append("\nlast-checked:\t").append(((String) (obj1))).append("\nskip-count:\t").append(userPreferences.getMnvSkipCount());
        preference.setSummary(stringbuilder.toString());
    }

    private void enableMnvFlowTimestamps()
    {
        Date date = new Date();
        userPreferences.setMnvSkippedUntil(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, -1);
        date = calendar.getTime();
        userPreferences.setMnvLastChecked(date);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        bundle = account.getSkypenameProp();
        getPreferenceManager().setSharedPreferencesName(bundle);
        bundle = (ListPreference)findPreference("activities_to_test");
        a aa[] = a.values();
        int j = aa.length;
        CharSequence acharsequence[] = new CharSequence[j];
        for (int i = 0; i < j; i++)
        {
            acharsequence[i] = aa[i].getTitle();
        }

        bundle.setEntries(acharsequence);
        bundle.setEntryValues(acharsequence);
    }

    public void onResume()
    {
        super.onResume();
    }
}
