// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.accuweather.android.appattach.AppAttachUtility;
import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.now.card.NowCardScheduler;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.TermsAndConditionsUtilities;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.TutorialProgressStrip;
import java.util.ArrayList;

// Referenced classes of package com.accuweather.android:
//            SetupActivity, WhatsNewActivity1

public class TermsAndConditionsActivity extends SetupActivity
{

    private String mLocCodeFromBundle;
    private MainContentPage mMainContentPageToLaunch;

    public TermsAndConditionsActivity()
    {
        mLocCodeFromBundle = "";
        mMainContentPageToLaunch = MainContentPage.Now;
    }

    private void addAcceptTermsClickHandler()
    {
        findViewById(R.id.agree_btn).setOnClickListener(new android.view.View.OnClickListener() {

            final TermsAndConditionsActivity this$0;

            public void onClick(View view)
            {
                accept();
            }

            
            {
                this$0 = TermsAndConditionsActivity.this;
                super();
            }
        });
    }

    private void addDeclineTermsClickHandler()
    {
        findViewById(R.id.no_thanks_btn).setOnClickListener(new android.view.View.OnClickListener() {

            final TermsAndConditionsActivity this$0;

            public void onClick(View view)
            {
                decline();
            }

            
            {
                this$0 = TermsAndConditionsActivity.this;
                super();
            }
        });
    }

    private Intent buildTermsAcceptedIntent()
    {
        Intent intent = new Intent(this, com/accuweather/android/WhatsNewActivity1);
        if (!TextUtils.isEmpty(mLocCodeFromBundle))
        {
            intent.putExtra("location_code", mLocCodeFromBundle).putExtra("page_index_from_widget", mMainContentPageToLaunch).addFlags(0x10000000);
        }
        return intent;
    }

    private boolean getBooleanFromSharedPreferences(String s, boolean flag)
    {
        return PreferenceUtils.get(this, s, flag);
    }

    private int getLinkTextColor()
    {
        return !Utilities.shouldNotShowBlueLinks(this) ? 0xff0000ff : -1;
    }

    private void handleLocationsAlreadyExist()
    {
        storeBooleanInSharedPreferences("terms_and_conditions_accepted", true);
        boolean flag = getBooleanFromSharedPreferences("is_from_android_lite", false);
        Logger.i(getClass().getName(), "wasAndroidLiteInstalled %s ", new Object[] {
            Boolean.toString(flag)
        });
        if (!flag)
        {
            storeBooleanInSharedPreferences("quick_setup_completed", true);
        }
    }

    private void init()
    {
        setContentView(R.layout.terms_and_conditions);
        Object obj = (TutorialProgressStrip)findViewById(R.id.tutorialProgressIndicator);
        if (obj != null)
        {
            ((TutorialProgressStrip) (obj)).showNumberOfProgressStripCells(5);
            ((TutorialProgressStrip) (obj)).setTutorialPageIndex(0);
        }
        addAcceptTermsClickHandler();
        addDeclineTermsClickHandler();
        obj = (TextView)findViewById(R.id.message);
        ((TextView) (obj)).setText(TermsAndConditionsUtilities.buildAgreementText(this));
        ((TextView) (obj)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) (obj)).setLinkTextColor(getLinkTextColor());
        setTypeFaces();
        hideActionBar();
    }

    private boolean isAccepted()
    {
        return getBooleanFromSharedPreferences("terms_and_conditions_accepted", false);
    }

    private boolean shouldSimulateV2()
    {
        return getBooleanFromSharedPreferences("simulate_v2", false);
    }

    private void simulateV2()
    {
        storeBooleanInSharedPreferences("simulate_v2", false);
        getData().clearAll();
        getData().simulateV2();
    }

    private void storeBooleanInSharedPreferences(String s, boolean flag)
    {
        PreferenceUtils.save(this, s, flag);
    }

    public void accept()
    {
        if (PartnerCoding.isPartnerCodedAppAttach(this))
        {
            (new AppAttachUtility()).initAppattach(this);
        }
        storeBooleanInSharedPreferences("terms_and_conditions_accepted", true);
        startActivity(buildTermsAcceptedIntent());
        finish();
    }

    public void decline()
    {
        finish();
    }

    public void onNegativeClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        genericalertdialogfragment.dismiss();
    }

    public void onPositiveClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        genericalertdialogfragment.dismiss();
    }

    protected void onStart()
    {
        super.onStart();
        Object obj = getIntent().getExtras();
        if (obj != null)
        {
            if (((Bundle) (obj)).containsKey("page_index_from_widget"))
            {
                mMainContentPageToLaunch = (MainContentPage)((Bundle) (obj)).getSerializable("page_index_from_widget");
            }
            mLocCodeFromBundle = ((Bundle) (obj)).getString("location_code");
        }
        if (shouldSimulateV2())
        {
            simulateV2();
        }
        obj = Data.getInstance(this).getLocations();
        if (PartnerCoding.isDefaultLocationPreload(this))
        {
            if (((ArrayList) (obj)).size() > 1)
            {
                handleLocationsAlreadyExist();
            }
        } else
        if (((ArrayList) (obj)).size() > 0)
        {
            handleLocationsAlreadyExist();
        }
        (new NowCardScheduler()).scheduleGoogleNowAlarm(this);
        if (!isAccepted())
        {
            storeBooleanInSharedPreferences("have_dmas_been_updated", true);
            init();
            return;
        } else
        {
            accept();
            return;
        }
    }

    public void setTypeFaces()
    {
        Utilities.setTypeFace(this, Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.terms_label), Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.agree_tv), Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.agree_btn), Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.no_thanks_btn), Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.message), Data.getRobotoCondensed());
    }
}
