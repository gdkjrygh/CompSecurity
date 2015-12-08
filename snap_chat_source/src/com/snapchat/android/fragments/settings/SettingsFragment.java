// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bj;
import Bt;
import CF;
import CG;
import Gc;
import HZ;
import Ix;
import Mf;
import Nq;
import Oi;
import Pi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.api2.LogoutTask;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.util.CashUtils;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.debug.ScApplicationInfo;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import eg;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import lX;
import lm;
import mH;
import mK;
import np;
import nr;
import ns;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

public class SettingsFragment extends SnapchatFragment
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{
    public static final class PrivacyOptions extends Enum
    {

        private static final PrivacyOptions $VALUES[];
        public static final PrivacyOptions CUSTOM;
        public static final PrivacyOptions EVERYONE;
        public static final PrivacyOptions FRIENDS;

        public static PrivacyOptions valueOf(String s1)
        {
            return (PrivacyOptions)Enum.valueOf(com/snapchat/android/fragments/settings/SettingsFragment$PrivacyOptions, s1);
        }

        public static PrivacyOptions[] values()
        {
            return (PrivacyOptions[])$VALUES.clone();
        }

        static 
        {
            EVERYONE = new PrivacyOptions("EVERYONE", 0);
            FRIENDS = new PrivacyOptions("FRIENDS", 1);
            CUSTOM = new PrivacyOptions("CUSTOM", 2);
            $VALUES = (new PrivacyOptions[] {
                EVERYONE, FRIENDS, CUSTOM
            });
        }

        private PrivacyOptions(String s1, int i1)
        {
            super(s1, i1);
        }
    }

