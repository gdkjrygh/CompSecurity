// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.quantcast.measurement.service:
//            QCOptOutUtility, QCUtility, QuantcastClient, QCLog, 
//            QCMeasurement

public class AboutQuantcastScreen extends Activity
{

    private static final String CLOSE_DIALOG_BUTTON_TEXT = "Proceed";
    private static final int DIALOG_MESSAGE_PADDING = 5;
    private static final String DIALOG_TITLE = "About Quantcast";
    private static final int DIALOG_VIEW_BOTTOM_PADDING = 10;
    private static final int DIALOG_VIEW_LEFT_PADDING = 35;
    private static final int DIALOG_VIEW_RIGHT_PADDING = 35;
    private static final int DIALOG_VIEW_TOP_PADDING = 10;
    private static final String FORMATTED_DIALOG_MESSAGE = "Quantcast helps us measure the usage of our app so we can better understand our audience.  Quantcast collects anonymous (non-personally identifiable) data from users across apps, such as details of app usage, the number of visits and duration, their device information, city, and settings, to provide this measurement and behavioral advertising.  A full description of Quantcast\u2019s data collection and use practices can be found in its <a href=\"https://www.quantcast.com/privacy\">Privacy Policy</a>, and you can opt out below.  Please also review our %s privacy policy.";
    private static final String OPT_OUT_CHECKBOX_TEXT = "Allow data collection for this app";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/AboutQuantcastScreen);
    private boolean m_ogAllowsCollection;
    private CheckBox m_optOutCheckbox;

    public AboutQuantcastScreen()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj;
        Object obj1;
        Object obj2;
        android.graphics.Bitmap.Config config;
        int i;
        int j;
        boolean flag;
        if (!QCOptOutUtility.isOptedOut(getApplicationContext()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m_ogAllowsCollection = flag;
        setTitle("About Quantcast");
        obj = QCUtility.getAppName(this);
        bundle = new LinearLayout(this);
        bundle.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        bundle.setOrientation(1);
        bundle.setPadding(35, 10, 35, 10);
        obj1 = new TextView(this);
        ((TextView) (obj1)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) (obj1)).setText(Html.fromHtml(String.format("Quantcast helps us measure the usage of our app so we can better understand our audience.  Quantcast collects anonymous (non-personally identifiable) data from users across apps, such as details of app usage, the number of visits and duration, their device information, city, and settings, to provide this measurement and behavioral advertising.  A full description of Quantcast\u2019s data collection and use practices can be found in its <a href=\"https://www.quantcast.com/privacy\">Privacy Policy</a>, and you can opt out below.  Please also review our %s privacy policy.", new Object[] {
            obj
        })));
        ((TextView) (obj1)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        ((TextView) (obj1)).setPadding(5, 5, 5, 5);
        ((TextView) (obj1)).setLinksClickable(true);
        ((TextView) (obj1)).setTextSize(15F);
        ((TextView) (obj1)).setTextColor(Color.rgb(190, 190, 190));
        bundle.addView(((View) (obj1)));
        obj = new Button(this);
        ((Button) (obj)).setId(600);
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final AboutQuantcastScreen this$0;
            final Activity val$activity;

            public void onClick(View view)
            {
                activity.finish();
            }

            
            {
                this$0 = AboutQuantcastScreen.this;
                activity = activity1;
                super();
            }
        });
        obj1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        ((android.widget.LinearLayout.LayoutParams) (obj1)).setMargins(0, 15, 0, 15);
        ((Button) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((Button) (obj)).setText("Proceed");
        ((Button) (obj)).setTextSize(25F);
        obj1 = new StateListDrawable();
        i = -0x10100a7;
        obj2 = getResources();
        j = Color.rgb(0, 128, 52);
        config = android.graphics.Bitmap.Config.ARGB_8888;
        obj2 = new BitmapDrawable(((android.content.res.Resources) (obj2)), Bitmap.createBitmap(new int[] {
            j
        }, 1, 1, config));
        ((StateListDrawable) (obj1)).addState(new int[] {
            i
        }, ((android.graphics.drawable.Drawable) (obj2)));
        obj2 = getResources();
        i = Color.rgb(0, 64, 26);
        config = android.graphics.Bitmap.Config.ARGB_8888;
        obj2 = new BitmapDrawable(((android.content.res.Resources) (obj2)), Bitmap.createBitmap(new int[] {
            i
        }, 1, 1, config));
        ((StateListDrawable) (obj1)).addState(new int[] {
            0x10100a7
        }, ((android.graphics.drawable.Drawable) (obj2)));
        ((Button) (obj)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj1)));
        ((Button) (obj)).setTextColor(-1);
        bundle.addView(((View) (obj)));
        m_optOutCheckbox = new CheckBox(this);
        m_optOutCheckbox.setId(500);
        m_optOutCheckbox.setChecked(m_ogAllowsCollection);
        m_optOutCheckbox.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        m_optOutCheckbox.setText("Allow data collection for this app");
        m_optOutCheckbox.setTextSize(15F);
        m_optOutCheckbox.setTextColor(Color.rgb(190, 190, 190));
        bundle.addView(m_optOutCheckbox);
        setContentView(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        QuantcastClient.activityStart(this);
    }

    protected void onStop()
    {
        boolean flag1 = true;
        super.onStop();
        boolean flag2 = m_optOutCheckbox.isChecked();
        if (m_ogAllowsCollection != flag2)
        {
            Object obj = TAG;
            StringBuilder stringbuilder = (new StringBuilder()).append("User opt out status changed to ");
            boolean flag;
            if (!flag2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            QCLog.i(((QCLog.Tag) (obj)), stringbuilder.append(flag).toString());
            obj = QCMeasurement.INSTANCE;
            if (!flag2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            ((QCMeasurement) (obj)).setOptOut(flag);
        }
        QuantcastClient.activityStop();
    }

}
