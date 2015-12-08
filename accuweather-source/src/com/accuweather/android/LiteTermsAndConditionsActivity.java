// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MainContentPage;
import com.accuweather.android.utilities.TermsAndConditionsUtilities;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.widgets.AL_WidgetConfigurationActivityFollowMe;
import java.util.ArrayList;

public class LiteTermsAndConditionsActivity extends Activity
    implements android.view.View.OnClickListener
{

    private String mLocCodeFromBundle;
    private MainContentPage mMainContentPageToLaunch;

    public LiteTermsAndConditionsActivity()
    {
        mLocCodeFromBundle = "";
        mMainContentPageToLaunch = MainContentPage.Now;
    }

    private boolean isAccepted()
    {
        return PreferenceManager.getDefaultSharedPreferences(this).getBoolean("terms_and_conditions_accepted", false);
    }

    public void accept()
    {
        Logger.i(this, "accept");
        Intent intent = new Intent(this, com/accuweather/android/widgets/AL_WidgetConfigurationActivityFollowMe);
        if (!TextUtils.isEmpty(mLocCodeFromBundle))
        {
            intent.putExtra("location_code", mLocCodeFromBundle).putExtra("page_index_from_widget", mMainContentPageToLaunch).addFlags(0x10000000);
        }
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("terms_and_conditions_accepted", true).commit();
        startActivity(intent);
        finish();
    }

    public void decline()
    {
        finish();
    }

    protected void init()
    {
        setContentView(R.layout.terms_and_conditions);
        findViewById(R.id.agree_btn).setOnClickListener(this);
        findViewById(R.id.no_thanks_btn).setOnClickListener(this);
        TextView textview = (TextView)findViewById(R.id.message);
        textview.setText(TermsAndConditionsUtilities.buildAgreementText(this));
        textview.setLinkTextColor(-1);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        setTypeFaces();
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.agree_btn)
        {
            accept();
        } else
        if (view.getId() == R.id.no_thanks_btn)
        {
            decline();
            return;
        }
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
        obj = Data.getInstance(this).getLocations();
        if (((ArrayList) (obj)).size() > 0 && ("".length() == 0 || ((ArrayList) (obj)).size() != 1))
        {
            Logger.i(getClass().getSimpleName(), "is V2 due to lm.size() > 0, but also not a preload and only the one preload location in lm");
            PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("terms_and_conditions_accepted", true).commit();
        }
        if (!isAccepted())
        {
            PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("have_dmas_been_updated", true).commit();
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
