// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.localytics.android.LocalyticsAmpSession;

// Referenced classes of package com.aetn.history.android.historyhere.view:
//            SuggestActivity, AboutActivity

public class MoreActivity extends FragmentActivity
{

    private static final String TAG = "MoreActivity";
    private ViewGroup aboutButton;
    private ViewGroup adChoicesButton;
    private HistoryHereApplication app;
    private ViewGroup feedbackButton;
    private LocalyticsAmpSession localyticsSession;
    private Context mContext;
    private ViewGroup privacyPolicyButton;
    private ViewGroup suggestButton;
    private ViewGroup termsOfUseButton;
    private TextView textView;
    private TextView textViewHeader;

    public MoreActivity()
    {
    }

    private void setListeners()
    {
        suggestButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MoreActivity this$0;

            public void onClick(View view)
            {
                view = new Intent(mContext, com/aetn/history/android/historyhere/view/SuggestActivity);
                view.putExtra("called_from", "more");
                mContext.startActivity(view);
            }

            
            {
                this$0 = MoreActivity.this;
                super();
            }
        });
        aboutButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MoreActivity this$0;

            public void onClick(View view)
            {
                view = new Intent(mContext, com/aetn/history/android/historyhere/view/AboutActivity);
                mContext.startActivity(view);
            }

            
            {
                this$0 = MoreActivity.this;
                super();
            }
        });
        privacyPolicyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MoreActivity this$0;

            public void onClick(View view)
            {
                localyticsSession.open();
                localyticsSession.tagScreen("HH:PrivacyPolicy");
                localyticsSession.upload();
                view = new Intent("android.intent.action.VIEW", Uri.parse("http://www.aetn.com/privacy/"));
                mContext.startActivity(view);
            }

            
            {
                this$0 = MoreActivity.this;
                super();
            }
        });
        termsOfUseButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MoreActivity this$0;

            public void onClick(View view)
            {
                localyticsSession.open();
                localyticsSession.tagScreen("HH:TermsOfUse");
                localyticsSession.upload();
                view = new Intent("android.intent.action.VIEW", Uri.parse("http://www.aenetworks.com/terms/"));
                mContext.startActivity(view);
            }

            
            {
                this$0 = MoreActivity.this;
                super();
            }
        });
        feedbackButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MoreActivity this$0;

            public void onClick(View view)
            {
                localyticsSession.open();
                localyticsSession.tagScreen("HH:Feedback");
                localyticsSession.upload();
                localyticsSession.tagEvent("detail:share");
                app.showFeedback();
            }

            
            {
                this$0 = MoreActivity.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mContext = this;
        app = (HistoryHereApplication)getApplication();
        setContentView(0x7f030043);
        privacyPolicyButton = (ViewGroup)findViewById(0x7f0a00c7);
        termsOfUseButton = (ViewGroup)findViewById(0x7f0a00c8);
        suggestButton = (ViewGroup)findViewById(0x7f0a00c4);
        aboutButton = (ViewGroup)findViewById(0x7f0a00c5);
        feedbackButton = (ViewGroup)findViewById(0x7f0a00c6);
        setListeners();
        localyticsSession = new LocalyticsAmpSession(getApplicationContext(), app.getLocalyticsKey());
        localyticsSession.open();
        localyticsSession.tagScreen("HH:More");
        localyticsSession.upload();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 24
    //                   16908332 26;
           goto _L1 _L2
_L1:
        return true;
_L2:
        finish();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        if (localyticsSession != null)
        {
            localyticsSession.detach();
            localyticsSession.close();
            localyticsSession.upload();
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        localyticsSession.open();
        localyticsSession.upload();
        localyticsSession.attach(this);
    }



}
