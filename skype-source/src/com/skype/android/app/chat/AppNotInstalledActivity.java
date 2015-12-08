// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SymbolView;

public abstract class AppNotInstalledActivity extends SkypeActivity
    implements android.view.View.OnClickListener
{

    protected static final String PLAY_STORE_URI_PREFIX = "market://details?id=";
    Analytics analytics;
    TextView cancelLink;
    TextView description;
    TextView goToStoreLink;
    TextView goToStoreText;
    SymbolView titleSymbol;
    TextView titleText;

    public AppNotInstalledActivity()
    {
    }

    protected abstract int getAppColor();

    protected abstract String getDescription();

    protected abstract String getGoToStoreText();

    protected abstract String getPackageUri();

    protected abstract com.skype.android.widget.SymbolElement.SymbolCode getSymbol();

    protected abstract int getTitleText();

    protected abstract void onCancel();

    public void onClick(View view)
    {
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.f);
        view.getId();
        JVM INSTR tableswitch 2131755555 2131755556: default 36
    //                   2131755555 45
    //                   2131755556 90;
           goto _L1 _L2 _L3
_L1:
        analytics.a(skypetelemetryevent);
        return;
_L2:
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse(getPackageUri()));
        startActivity(view);
        skypetelemetryevent.put(LogAttributeName.d, Boolean.valueOf(true));
        finish();
        continue; /* Loop/switch isn't completed */
_L3:
        onCancel();
        skypetelemetryevent.put(LogAttributeName.d, Boolean.valueOf(false));
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        ViewUtil.a(this, new View[] {
            goToStoreLink, cancelLink
        });
    }

    protected void onResume()
    {
        super.onResume();
        titleSymbol.setSymbolCode(getSymbol());
        titleSymbol.setTextColor(getResources().getColor(getAppColor()));
        titleText.setText(getTitleText());
        titleText.setTextColor(getResources().getColor(getAppColor()));
        description.setText(getDescription());
        description.setTextColor(getResources().getColor(getAppColor()));
        goToStoreText.setText(getGoToStoreText());
    }
}
