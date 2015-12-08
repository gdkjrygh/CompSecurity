// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.TwoStatePreference;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.CurrentDownloadEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.offline.OfflineContentService;
import com.soundcloud.android.offline.OfflineSettingsStorage;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.util.List;

// Referenced classes of package com.soundcloud.android.settings:
//            OfflineStoragePreference, OfflineUsage

public class OfflineSettingsFragment extends PreferenceFragment
    implements android.preference.Preference.OnPreferenceChangeListener, android.preference.Preference.OnPreferenceClickListener
{
    private final class ClearOfflineContentSubscriber extends DefaultSubscriber
    {

        final OfflineSettingsFragment this$0;

        public final volatile void onNext(Object obj)
        {
            onNext((List)obj);
        }

        public final void onNext(List list)
        {
            if (!list.isEmpty())
            {
                refreshStoragePreference();
            }
            OfflineContentService.stop(getActivity());
        }

        private ClearOfflineContentSubscriber()
        {
            this$0 = OfflineSettingsFragment.this;
            super();
        }

        ClearOfflineContentSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class CurrentDownloadSubscriber extends DefaultSubscriber
    {

        final OfflineSettingsFragment this$0;

        public final void onNext(CurrentDownloadEvent currentdownloadevent)
        {
            if (currentdownloadevent.kind == OfflineState.DOWNLOADED)
            {
                refreshStoragePreference();
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((CurrentDownloadEvent)obj);
        }

        private CurrentDownloadSubscriber()
        {
            this$0 = OfflineSettingsFragment.this;
            super();
        }

        CurrentDownloadSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    EventBus eventBus;
    FeatureOperations featureOperations;
    Navigator navigator;
    OfflineContentOperations offlineContentOperations;
    OfflineSettingsStorage offlineSettings;
    OfflineUsage offlineUsage;
    private rx.h.b subscription;

    public OfflineSettingsFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static OfflineSettingsFragment create()
    {
        return new OfflineSettingsFragment();
    }

    private void onUpdateStorageLimit(long l)
    {
        if (l == 0x7fffffffffffffffL)
        {
            offlineSettings.setStorageUnlimited();
        } else
        {
            offlineSettings.setStorageLimit(l);
        }
        OfflineContentService.start(getActivity());
    }

    private void openSubscribeScreen()
    {
        navigator.openUpgrade(getActivity());
    }

    private void refreshStoragePreference()
    {
        OfflineStoragePreference offlinestoragepreference = (OfflineStoragePreference)findPreference("offline.storageLimit");
        if (offlinestoragepreference != null)
        {
            offlinestoragepreference.updateAndRefresh();
        }
    }

    private void setupClearContent()
    {
        findPreference("offline.removeAllOfflineContent").setOnPreferenceClickListener(this);
    }

    private void setupOffline()
    {
        Object obj = (OfflineStoragePreference)findPreference("offline.storageLimit");
        ((OfflineStoragePreference) (obj)).setOnPreferenceChangeListener(this);
        ((OfflineStoragePreference) (obj)).setOfflineUsage(offlineUsage);
        obj = (TwoStatePreference)findPreference("offline.wifiOnlySync");
        ((TwoStatePreference) (obj)).setChecked(offlineSettings.isWifiOnlyEnabled());
        ((TwoStatePreference) (obj)).setOnPreferenceChangeListener(this);
        setupClearContent();
        subscription.a(eventBus.subscribe(EventQueue.CURRENT_DOWNLOAD, new CurrentDownloadSubscriber(null)));
    }

    private void setupUpsell()
    {
        findPreference("buySubscription").setOnPreferenceClickListener(this);
        setupClearContent();
    }

    private void showRemoveAllOfflineContentDialog()
    {
        (new android.support.v7.app.AlertDialog.Builder(getActivity())).setTitle(0x7f0702f8).setMessage(0x7f0702f9).setPositiveButton(0x7f0700a7, new _cls1()).setNegativeButton(0x1040000, null).show();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        subscription = new rx.h.b();
        if (featureOperations.isOfflineContentEnabled())
        {
            addPreferencesFromResource(0x7f050009);
            setupOffline();
            return;
        }
        if (featureOperations.upsellMidTier())
        {
            addPreferencesFromResource(0x7f05000b);
            setupUpsell();
            return;
        } else
        {
            addPreferencesFromResource(0x7f05000a);
            setupClearContent();
            return;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        subscription.unsubscribe();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        byte byte0;
        preference = preference.getKey();
        byte0 = -1;
        preference.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   141390891: 62
    //                   658255047: 76;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_76;
_L4:
        switch (byte0)
        {
        default:
            return false;

        case 0: // '\0'
            onUpdateStorageLimit(((Long)obj).longValue());
            return true;

        case 1: // '\001'
            offlineSettings.setWifiOnlyEnabled(((Boolean)obj).booleanValue());
            break;
        }
        break MISSING_BLOCK_LABEL_117;
_L2:
        if (preference.equals("offline.storageLimit"))
        {
            byte0 = 0;
        }
          goto _L4
        if (preference.equals("offline.wifiOnlySync"))
        {
            byte0 = 1;
        }
          goto _L4
        return true;
    }

    public boolean onPreferenceClick(Preference preference)
    {
        byte byte0;
        preference = preference.getKey();
        byte0 = -1;
        preference.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   224797160: 76
    //                   2053870275: 62;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_76;
_L4:
        switch (byte0)
        {
        default:
            return false;

        case 0: // '\0'
            openSubscribeScreen();
            return true;

        case 1: // '\001'
            showRemoveAllOfflineContentDialog();
            break;
        }
        break MISSING_BLOCK_LABEL_100;
_L3:
        if (preference.equals("buySubscription"))
        {
            byte0 = 0;
        }
          goto _L4
        if (preference.equals("offline.removeAllOfflineContent"))
        {
            byte0 = 1;
        }
          goto _L4
        return true;
    }



    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final OfflineSettingsFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            subscription.a(offlineContentOperations.clearOfflineContent().observeOn(a.a()).subscribe(new ClearOfflineContentSubscriber(null)));
        }

        _cls1()
        {
            this$0 = OfflineSettingsFragment.this;
            super();
        }
    }

}
