// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import android.widget.Spinner;
import android.widget.TextView;
import com.hmobile.common.Utils;
import java.util.Calendar;

// Referenced classes of package com.hmobile.biblekjv:
//            HolyBibleWidget, HolyBibleWidgetSmall, WidgetUpdateService

public class WidgetSelectorActivity extends Activity
    implements android.view.View.OnClickListener
{

    public static final String PREFS_NAME = "MyPrefsFile";
    boolean FromApp;
    int appWidgetId;
    Button btnCancel;
    Button btnReset;
    Button btnSave;
    CheckBox chkLowLight;
    int duration;
    android.content.SharedPreferences.Editor editor;
    int f_size[] = {
        12, 14, 16, 18
    };
    String fontStyle[];
    int font_size;
    private String hours[];
    boolean isLowLight;
    private RelativeLayout rlwidget;
    SharedPreferences settings;
    Spinner spnFontSize;
    Spinner spnFontStyle;
    Spinner spnWidgetUpdateDuration;
    int style;
    TextView txtBookInfo;
    private TextView txtLowLighthint;
    TextView txtVerse;

    public WidgetSelectorActivity()
    {
        font_size = 16;
        isLowLight = false;
        style = 0;
        duration = 3;
        appWidgetId = 0;
        FromApp = false;
    }

    public void Reset()
    {
        style = 0;
        font_size = 16;
        isLowLight = false;
        editor.putInt("widget_font_style", style);
        editor.putInt("widget_font_size", font_size);
        editor.putBoolean("widget_low_light", isLowLight);
        editor.commit();
    }

    public void getSettings()
    {
        int i;
        int j;
        style = settings.getInt("widget_font_style", style);
        font_size = settings.getInt("widget_font_size", 16);
        j = 0;
        i = 0;
_L5:
        if (i < f_size.length) goto _L2; else goto _L1
_L1:
        i = j;
_L3:
        String as[];
        int k;
        spnFontSize.setSelection(i);
        spnFontStyle.setSelection(style);
        isLowLight = settings.getBoolean("widget_low_light", false);
        if (isLowLight)
        {
            txtLowLighthint.setText(getResources().getString(0x7f07006e));
            rlwidget.setBackgroundResource(0x7f0200ae);
            txtVerse.setTextColor(0xff000000);
            txtBookInfo.setTextColor(0xff000000);
        } else
        {
            txtLowLighthint.setText(getResources().getString(0x7f07006f));
            rlwidget.setBackgroundResource(0x7f0200b0);
            txtVerse.setTextColor(-1);
            txtBookInfo.setTextColor(-1);
        }
        k = settings.getInt("widget_update_duration", 3);
        j = 0;
        as = getResources().getStringArray(0x7f0d0004);
        i = 0;
_L6:
        if (i >= as.length)
        {
            spnWidgetUpdateDuration.setSelection(j);
            chkLowLight.setChecked(isLowLight);
            return;
        }
        break MISSING_BLOCK_LABEL_257;
_L2:
        if (font_size != f_size[i]) goto _L4; else goto _L3
_L4:
        i++;
          goto _L5
        if (as[i].contains(String.valueOf(k)))
        {
            j = i;
        }
        i++;
          goto _L6
    }

    public void onClick(View view)
    {
        if (view.equals(btnSave))
        {
            editor.putInt("widget_font_style", style);
            editor.putInt("widget_font_size", font_size);
            editor.putInt("widget_update_duration", duration);
            editor.putBoolean("widget_low_light", isLowLight);
            editor.commit();
            if (appWidgetId != 0)
            {
                view = AppWidgetManager.getInstance(this);
                HolyBibleWidget.updateWidget(new RemoteViews(getPackageName(), 0x7f030037), this, view);
                HolyBibleWidgetSmall.updateWidget(new RemoteViews(getPackageName(), 0x7f030038), this, view);
                view = new Intent();
                view.putExtra("appWidgetId", appWidgetId);
                setResult(-1, view);
            }
            AlarmManager alarmmanager;
            try
            {
                Thread.sleep(200L);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                view.printStackTrace();
            }
            view = PendingIntent.getService(getApplicationContext(), 0, new Intent(getApplicationContext(), com/hmobile/biblekjv/WidgetUpdateService), 0x8000000);
            getApplicationContext();
            alarmmanager = (AlarmManager)getSystemService("alarm");
            alarmmanager.cancel(view);
            Utils.LogInfo("Starting Service for update widget.");
            alarmmanager.setRepeating(0, Calendar.getInstance().getTimeInMillis() + (long)(duration * 60000), duration * 60000, view);
            finish();
        } else
        {
            if (view.equals(btnCancel))
            {
                finish();
                return;
            }
            if (view.equals(btnReset))
            {
                Reset();
                getSettings();
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030039);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            appWidgetId = bundle.getInt("appWidgetId", 0);
            FromApp = bundle.getBoolean("FromApp");
        }
        if (appWidgetId == 0 && !FromApp)
        {
            finish();
        }
        settings = PreferenceManager.getDefaultSharedPreferences(this);
        editor = settings.edit();
        fontStyle = getResources().getStringArray(0x7f0d0002);
        spnFontSize = (Spinner)findViewById(0x7f0e0141);
        spnFontStyle = (Spinner)findViewById(0x7f0e0143);
        spnWidgetUpdateDuration = (Spinner)findViewById(0x7f0e0146);
        chkLowLight = (CheckBox)findViewById(0x7f0e0116);
        txtLowLighthint = (TextView)findViewById(0x7f0e0115);
        rlwidget = (RelativeLayout)findViewById(0x7f0e0139);
        txtVerse = (TextView)findViewById(0x7f0e00ac);
        txtBookInfo = (TextView)findViewById(0x7f0e013c);
        btnSave = (Button)findViewById(0x7f0e013e);
        btnCancel = (Button)findViewById(0x7f0e0092);
        btnReset = (Button)findViewById(0x7f0e013f);
        btnSave.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        txtVerse.setText(getString(0x7f0700b4));
        getSettings();
        hours = getResources().getStringArray(0x7f0d0004);
        spnFontSize.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final WidgetSelectorActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                font_size = f_size[i];
                txtVerse.setTextSize(font_size);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = WidgetSelectorActivity.this;
                super();
            }
        });
        spnFontStyle.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final WidgetSelectorActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                style = i;
                txtVerse.setTypeface(null, style);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = WidgetSelectorActivity.this;
                super();
            }
        });
        spnWidgetUpdateDuration.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final WidgetSelectorActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                duration = Integer.parseInt(hours[i].split(" ")[0]);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = WidgetSelectorActivity.this;
                super();
            }
        });
        chkLowLight.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final WidgetSelectorActivity this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                isLowLight = flag;
                if (flag)
                {
                    txtLowLighthint.setText(getResources().getString(0x7f07006e));
                    rlwidget.setBackgroundResource(0x7f0200ae);
                    txtVerse.setTextColor(0xff000000);
                    txtBookInfo.setTextColor(0xff000000);
                    return;
                } else
                {
                    txtLowLighthint.setText(getResources().getString(0x7f07006f));
                    rlwidget.setBackgroundResource(0x7f0200b0);
                    txtVerse.setTextColor(-1);
                    txtBookInfo.setTextColor(-1);
                    return;
                }
            }

            
            {
                this$0 = WidgetSelectorActivity.this;
                super();
            }
        });
    }



}
