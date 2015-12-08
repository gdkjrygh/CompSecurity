// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.accuweather.android.WebViewActivity;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.TermsAndConditionsUtilities;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.preferences:
//            AbstractPreferenceActivity, OtherLegalNoticesActivity

public class TermsOfUseActivity extends AbstractPreferenceActivity
    implements android.preference.Preference.OnPreferenceClickListener
{

    private Handler mHandler;
    private PackageInfo pInfo;
    private String versionName;

    public TermsOfUseActivity()
    {
        mHandler = new Handler() {

            final TermsOfUseActivity this$0;

            public void handleMessage(Message message)
            {
                message = (TextView)message.obj;
                message.setTextSize(1, ((Float)message.getTag()).floatValue());
            }

            
            {
                this$0 = TermsOfUseActivity.this;
                super();
            }
        };
    }

    private void doTimerTask(int i)
    {
        (new Timer()).schedule(new TimerTask() {

            final TermsOfUseActivity this$0;

            public void run()
            {
                for (int j = 0; j < getListView().getChildCount(); j++)
                {
                    ListView listview = getListView();
                    setTextSize(listview);
                }

            }

            
            {
                this$0 = TermsOfUseActivity.this;
                super();
            }
        }, i);
    }

    private Data getData()
    {
        return Data.getInstance(getApplication());
    }

    private void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setBackgroundDrawable(getResources().getDrawable(com.accuweather.android.R.drawable.action_bar_gradient));
            actionbar.setSubtitle(com.accuweather.android.R.string.TermsOfUse);
            actionbar.setTitle(com.accuweather.android.R.string.Settings_Abbr18);
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(true);
        }
    }

    private boolean populateSecondaryLayout(Preference preference)
    {
        boolean flag = false;
        Object obj = TermsAndConditionsUtilities.buildUrlWithPartnerCode("http://m.accuweather.com/en/legal", this);
        Object obj1 = TermsAndConditionsUtilities.buildUrlWithPartnerCode("http://m.accuweather.com/en/privacy", this);
        if (preference.getKey().equals("pref_show_eula") || preference.getKey().equals("pref_show_privacy_policy"))
        {
            if (!preference.getKey().equals("pref_show_eula"))
            {
                obj = obj1;
            }
            if (preference.getKey().equals("pref_show_eula"))
            {
                preference = String.format(getResources().getString(com.accuweather.android.R.string.EULA), new Object[0]);
            } else
            {
                preference = String.format(getResources().getString(com.accuweather.android.R.string.PrivacyPolicy), new Object[0]);
            }
            obj1 = new Intent(this, com/accuweather/android/WebViewActivity);
            ((Intent) (obj1)).putExtra("title", preference);
            ((Intent) (obj1)).putExtra("url", ((String) (obj)));
            startActivity(((Intent) (obj1)));
            flag = true;
        }
        return flag;
    }

    private void setTextSize(Object obj)
    {
        if (!(obj instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        for (int i = 0; i < ((ViewGroup)obj).getChildCount(); i++)
        {
            setTextSize(((ViewGroup)obj).getChildAt(i));
        }

          goto _L3
_L2:
        if (!(obj instanceof TextView) || (((TextView)obj).getParent() instanceof ListView)) goto _L5; else goto _L4
_L4:
        if (((TextView)obj).getTag() == null)
        {
            int l = ((TextView)obj).getText().length();
            float f;
            int j;
            if (((TextView)obj).getId() == 0x1020016)
            {
                f = 20F;
            } else
            {
                f = 12F;
            }
            for (j = 20; j < l; j++)
            {
                f -= 0.3F;
            }

            Message message = new Message();
            obj = (TextView)obj;
            ((TextView) (obj)).setTag(Float.valueOf(f));
            message.obj = obj;
            mHandler.sendMessage(message);
        }
_L3:
        return;
_L5:
        if (obj instanceof ListView)
        {
            int k = 0;
            while (k < getListView().getChildCount()) 
            {
                setTextSize(getListView());
                k++;
            }
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(com.accuweather.android.R.xml.pref_screen_terms_of_use);
        bundle = findPreference("pref_show_eula");
        Preference preference = findPreference("pref_show_privacy_policy");
        Preference preference1 = findPreference("other_legal_notices");
        Preference preference2 = findPreference("pref_email");
        if (PartnerCoding.isPartnerCodedIcontrol(this))
        {
            getPreferenceScreen().removePreference(preference2);
        }
        doTimerTask(0);
        bundle.setOnPreferenceClickListener(this);
        preference.setOnPreferenceClickListener(this);
        setPreferenceClickListener("other_legal_notices", com/accuweather/android/preferences/OtherLegalNoticesActivity);
        preference2.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

            final TermsOfUseActivity this$0;

            public boolean onPreferenceClick(Preference preference3)
            {
                try
                {
                    pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                    versionName = pInfo.versionName;
                }
                // Misplaced declaration of an exception variable
                catch (Preference preference3)
                {
                    preference3.printStackTrace();
                }
                preference3 = new Intent("android.intent.action.SENDTO");
                preference3.putExtra("android.intent.extra.SUBJECT", (new StringBuilder()).append("AccuWeather Android Application Version ").append(versionName).toString());
                preference3.setData(Uri.parse("mailto:support@accuweather.com"));
                startActivity(Intent.createChooser(preference3, getResources().getString(com.accuweather.android.R.string.ChooseFromList)));
                return true;
            }

            
            {
                this$0 = TermsOfUseActivity.this;
                super();
            }
        });
        if (!PartnerCoding.isPartnerCodedAmazonPhone(this) && GooglePlayServicesUtil.isGooglePlayServicesAvailable(this) != 0)
        {
            getPreferenceScreen().removePreference(preference1);
        }
        if (PartnerCoding.isPartnerCodedAmazonPhone(this))
        {
            getPreferenceScreen().removePreference(preference1);
        }
        try
        {
            bundle = getApplicationContext().getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            preference = findPreference("version");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return;
        }
        if (preference == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        preference.setSummary(bundle);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            getData().clearTaskQueue();
            finish();
        }
        return super.onMenuItemSelected(i, menuitem);
    }

    public void onPause()
    {
        super.onPause();
        overridePendingTransition(com.accuweather.android.R.anim.fade_in, com.accuweather.android.R.anim.fade_out);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        return populateSecondaryLayout(preference);
    }

    public void onStart()
    {
        super.onStart();
        if (!PartnerCoding.isPartnerCodedAmazonPhone(this))
        {
            initActionBar();
        }
    }



/*
    static PackageInfo access$002(TermsOfUseActivity termsofuseactivity, PackageInfo packageinfo)
    {
        termsofuseactivity.pInfo = packageinfo;
        return packageinfo;
    }

*/



/*
    static String access$102(TermsOfUseActivity termsofuseactivity, String s)
    {
        termsofuseactivity.versionName = s;
        return s;
    }

*/

}
