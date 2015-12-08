// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.CountryCode;
import com.skype.android.util.ViewUtil;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAnalytics, MnvManager, MnvStateData

public class MnvLearnMoreFragment extends SkypeFragment
    implements android.view.View.OnClickListener
{

    TextView addressBook;
    ImageView leftArrow;
    MnvAnalytics mnvAnalytics;
    MnvManager mnvManager;
    NavigationUrl navigationUrl;
    TextView privacyPolicy;
    UserPreferences userPreferences;

    public MnvLearnMoreFragment()
    {
    }

    private void launchPrivacyPolicy()
    {
        navigationUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.t);
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cg);
    }

    private void logAnalyticsScreenLoad()
    {
        mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.ce);
    }

    private void updateUi()
    {
        Object obj = mnvManager.getStateDataChange().getStateData();
        if (((MnvStateData) (obj)).getSource() == MnvStateData.PHONE_SOURCE.MSA)
        {
            if (((MnvStateData) (obj)).getSkipAddNumberFlow())
            {
                obj = (new StringBuilder()).append(((MnvStateData) (obj)).getCountryCode().d()).append(" ").append(((MnvStateData) (obj)).getPhoneNumber()).toString();
                addressBook.setText(getString(0x7f0804ab, new Object[] {
                    obj
                }));
                return;
            } else
            {
                addressBook.setText(getString(0x7f0804aa));
                return;
            }
        } else
        {
            addressBook.setText(getString(0x7f0804a9));
            return;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity.setTitle(0x7f08009f);
    }

    public void onClick(View view)
    {
        if (view == leftArrow)
        {
            getActivity().onBackPressed();
        } else
        if (view == privacyPolicy)
        {
            launchPrivacyPolicy();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300b4, viewgroup, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = new SpannableString(getString(0x7f080353));
        privacyPolicy.setText(view);
        ViewUtil.a(this, new View[] {
            privacyPolicy, leftArrow
        });
        updateUi();
        logAnalyticsScreenLoad();
    }
}
