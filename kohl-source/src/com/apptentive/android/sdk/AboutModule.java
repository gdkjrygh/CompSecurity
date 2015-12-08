// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.apptentive.android.sdk:
//            ViewActivity

public class AboutModule
{

    private static AboutModule instance = null;

    private AboutModule()
    {
    }

    public static AboutModule getInstance()
    {
        if (instance == null)
        {
            instance = new AboutModule();
        }
        return instance;
    }

    void doShow(final Activity activity)
    {
        activity.setContentView(R.layout.apptentive_about);
        activity.findViewById(R.id.apptentive_branding_view).setClickable(false);
        ((TextView)activity.findViewById(R.id.about_description_link)).setOnClickListener(new android.view.View.OnClickListener() {

            final AboutModule this$0;
            final Activity val$activity;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse("http://www.apptentive.com"));
                activity.startActivity(view);
            }

            
            {
                this$0 = AboutModule.this;
                activity = activity1;
                super();
            }
        });
        ((TextView)activity.findViewById(R.id.privacy_link)).setOnClickListener(new android.view.View.OnClickListener() {

            final AboutModule this$0;
            final Activity val$activity;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse("http://www.apptentive.com/privacy"));
                activity.startActivity(view);
            }

            
            {
                this$0 = AboutModule.this;
                activity = activity1;
                super();
            }
        });
        ((TextView)activity.findViewById(R.id.version)).setText(String.format(activity.getResources().getString(R.string.apptentive_version), new Object[] {
            "1.6.4"
        }));
    }

    boolean onBackPressed(Activity activity)
    {
        return true;
    }

    public void show(Activity activity)
    {
        Intent intent = new Intent();
        intent.setClass(activity, com/apptentive/android/sdk/ViewActivity);
        intent.putExtra("activityContent", com.apptentive.android.sdk.module.ActivityContent.Type.ABOUT.toString());
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_up_in, 0);
    }

}
