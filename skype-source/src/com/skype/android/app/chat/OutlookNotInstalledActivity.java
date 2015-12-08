// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.ExperimentEvent;
import com.skype.android.analytics.ExperimentTelemetryEvent;
import com.skype.android.app.Navigation;
import com.skype.android.config.ecs.EcsConfiguration;

// Referenced classes of package com.skype.android.app.chat:
//            AppNotInstalledActivity

public class OutlookNotInstalledActivity extends AppNotInstalledActivity
{

    private static final String DEFAULT_PACKAGE_URI = "market://details?id=com.microsoft.office.outlook";
    public static final String EXTRA_CONTACT_NAME = "contactName";
    public static final String OUTLOOK_PACKAGE_URI = "com.microsoft.office.outlook";
    Analytics analytics;
    private String contactName;
    EcsConfiguration ecsConfiguration;
    Navigation navigation;

    public OutlookNotInstalledActivity()
    {
    }

    protected int getAppColor()
    {
        return 0x7f0f00b4;
    }

    protected String getDescription()
    {
        return getResources().getString(0x7f0804b7);
    }

    protected String getGoToStoreText()
    {
        Resources resources = getResources();
        return String.format(resources.getString(0x7f080464), new Object[] {
            resources.getString(0x7f0802fa)
        });
    }

    protected String getPackageUri()
    {
        String s1 = ecsConfiguration.getInstallOutlookUri();
        String s = s1;
        if (s1 == null)
        {
            s = "market://details?id=com.microsoft.office.outlook";
        }
        return s;
    }

    protected com.skype.android.widget.SymbolElement.SymbolCode getSymbol()
    {
        return com.skype.android.widget.SymbolElement.SymbolCode.j;
    }

    protected int getTitleText()
    {
        return 0x7f0802fa;
    }

    protected void onCancel()
    {
        ExperimentTelemetryEvent experimenttelemetryevent = new ExperimentTelemetryEvent(ExperimentEvent.d, ecsConfiguration.getExperimentCalendarIntegrationGroupTag());
        analytics.a(experimenttelemetryevent);
        navigation.scheduleCallInAnyCalendar(contactName);
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        contactName = getIntent().getStringExtra("contactName");
    }
}
