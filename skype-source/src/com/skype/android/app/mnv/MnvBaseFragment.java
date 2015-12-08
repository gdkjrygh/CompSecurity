// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import com.skype.android.app.main.HubSectionMaterial;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.StartupTimeReporter;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAnalytics, MnvManager, MnvCases, MnvStateData

public abstract class MnvBaseFragment extends SkypeFragment
{
    public static final class ERROR extends Enum
    {

        private static final ERROR $VALUES[];
        public static final ERROR ALREADY_VERIFIED;
        public static final ERROR CODE_HAS_EXPIRED;
        public static final ERROR CODE_WAS_INCORRECT;
        public static final ERROR INVALID_PHONE_NUMBER;

        public static ERROR valueOf(String s)
        {
            return (ERROR)Enum.valueOf(com/skype/android/app/mnv/MnvBaseFragment$ERROR, s);
        }

        public static ERROR[] values()
        {
            return (ERROR[])$VALUES.clone();
        }

        static 
        {
            INVALID_PHONE_NUMBER = new ERROR("INVALID_PHONE_NUMBER", 0);
            ALREADY_VERIFIED = new ERROR("ALREADY_VERIFIED", 1);
            CODE_WAS_INCORRECT = new ERROR("CODE_WAS_INCORRECT", 2);
            CODE_HAS_EXPIRED = new ERROR("CODE_HAS_EXPIRED", 3);
            $VALUES = (new ERROR[] {
                INVALID_PHONE_NUMBER, ALREADY_VERIFIED, CODE_WAS_INCORRECT, CODE_HAS_EXPIRED
            });
        }

        private ERROR(String s, int i)
        {
            super(s, i);
        }
    }


    protected boolean isReferrerInsideApp;
    MnvAnalytics mnvAnalytics;
    MnvCases mnvCases;
    MnvManager mnvManager;
    Navigation navigation;
    UserPreferences userPreferences;

    public MnvBaseFragment()
    {
    }

    private int getHomeTab()
    {
        if (userPreferences.isNewUser())
        {
            return HubSectionMaterial.CONTACTS.getIndex();
        } else
        {
            return HubSectionMaterial.RECENTS.getIndex();
        }
    }

    private boolean isReferrerInsideApp()
    {
        MnvCases.REFERRER referrer = getReferrer();
        return referrer != null && (referrer == MnvCases.REFERRER.ADD_PEOPLE || referrer == MnvCases.REFERRER.CONTACT_LIST || referrer == MnvCases.REFERRER.DEBUG_SETTINGS || referrer == MnvCases.REFERRER.MANAGE_ALIASES);
    }

    private void reportFirstTime()
    {
        if (!userPreferences.isEventReported())
        {
            MnvAnalytics mnvanalytics = mnvAnalytics;
            String s;
            if (userPreferences.isNewUser())
            {
                s = "New user";
            } else
            {
                s = "Existing user";
            }
            mnvanalytics.report(s, AnalyticsEvent.ct);
            userPreferences.setEventReported(true);
        }
    }

    protected MnvCases.REFERRER getReferrer()
    {
        Object obj = getArguments();
        if (obj == null)
        {
            return null;
        }
        obj = ((Bundle) (obj)).getSerializable("referrerId");
        if (obj != null)
        {
            return (MnvCases.REFERRER)obj;
        } else
        {
            return null;
        }
    }

    protected MnvStateData getStateData()
    {
        return mnvManager.getStateDataChange().getStateData();
    }

    protected void navigateToHome()
    {
        if (!isReferrerInsideApp)
        {
            int i = getHomeTab();
            navigation.home(i);
        }
        StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.d);
        mnvManager.reset();
        getActivity().finish();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        isReferrerInsideApp = isReferrerInsideApp();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        reportFirstTime();
    }

    protected void reportMnvSkipAndNavigateToHome(String s, String s1)
    {
        if (s == "PreCheck")
        {
            mnvAnalytics.reportPreCheckSkip(mnvAnalytics.getUserType(userPreferences), s, s1, AnalyticsEvent.cE);
        } else
        {
            mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), s, s1, AnalyticsEvent.cl);
        }
        navigateToHome();
    }
}
