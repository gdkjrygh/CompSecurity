// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import com.hmobile.common.MyDailyQuoteReceiver;
import com.hmobile.tab.TabHostProvider;
import com.hmobile.tab.TabView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, WidgetSelectorActivity, TermsOfUseActivity, PrivacyPolicyActivity, 
//            TabProvider, HolyBibleApplication

public class SettingsActivity extends BaseActivity
    implements android.view.View.OnClickListener, android.app.TimePickerDialog.OnTimeSetListener
{

    boolean about;
    float audio_speed[] = {
        0.5F, 0.7F, 1.0F, 1.5F, 2.0F
    };
    CheckBox chkLowLight;
    CheckBox chkNavigationFade;
    CheckBox chkOnOffNotification;
    android.content.SharedPreferences.Editor editor;
    int f_size[] = {
        12, 14, 18, 22
    };
    String fontStyle[];
    LinearLayout llInner;
    LinearLayout llSetting;
    LinearLayout llWidget;
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    private RelativeLayout rlAboutBar;
    private RelativeLayout rlAlertTime;
    private RelativeLayout rlEmailUpdates;
    private RelativeLayout rlFeedback;
    private RelativeLayout rlFontStyle;
    private RelativeLayout rlMoreApps;
    private RelativeLayout rlPrivacy;
    private RelativeLayout rlRate;
    private RelativeLayout rlSettingBar;
    private RelativeLayout rlTerms;
    private RelativeLayout rlWebsite;
    private RelativeLayout rlWidgetBar;
    private SeekBar seekAudioPitch;
    boolean setting;
    SharedPreferences settings;
    int speechPitch;
    private float speechSpeed;
    Spinner spnAudioSpeed;
    Spinner spnFontSize;
    Spinner spnFontStyle;
    private TabView tabView;
    android.app.TimePickerDialog.OnTimeSetListener time1;
    private TextView txtAlertTimeLabel;
    private TextView txtAlertTimeValue;
    private TextView txtLowLighthint;
    private TextView txtNavigationLabel;
    boolean widget;

    public SettingsActivity()
    {
        speechSpeed = 1.0F;
        speechPitch = 10;
        about = false;
        setting = false;
        widget = false;
        time1 = new android.app.TimePickerDialog.OnTimeSetListener() {

            final SettingsActivity this$0;

            public void onTimeSet(TimePicker timepicker, int i, int j)
            {
                editor.putInt("notification_hour", i);
                editor.putInt("notification_min", j);
                editor.putBoolean("is_notification", true);
                editor.commit();
                setTime(i, j);
                editor.putLong("notification_millis", 0L);
                editor.commit();
                Object obj = Calendar.getInstance();
                ((Calendar) (obj)).set(11, i);
                ((Calendar) (obj)).set(12, j);
                timepicker = Calendar.getInstance();
                long l = ((Calendar) (obj)).getTimeInMillis();
                long l1 = timepicker.getTimeInMillis();
                obj = new Intent(SettingsActivity.this, com/hmobile/common/MyDailyQuoteReceiver);
                obj = PendingIntent.getBroadcast(SettingsActivity.this, 0, ((Intent) (obj)), 0x10000000);
                AlarmManager alarmmanager = (AlarmManager)getSystemService("alarm");
                alarmmanager.cancel(((PendingIntent) (obj)));
                alarmmanager.setRepeating(0, timepicker.getTimeInMillis() + Long.valueOf(l - l1).longValue(), 0x5265c00L, ((PendingIntent) (obj)));
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        };
    }

    private void setTime(int i, int j)
    {
        String s;
        if (i < 10)
        {
            s = (new StringBuilder("0")).append(i).toString();
        } else
        {
            s = String.valueOf(i);
        }
        if (j < 10)
        {
            s = (new StringBuilder(String.valueOf(s))).append(":0").append(j).toString();
        } else
        {
            s = (new StringBuilder(String.valueOf(s))).append(":").append(j).toString();
        }
        if (i >= 12)
        {
            ConvertDate24To12Hour(txtAlertTimeValue, s, "PM");
        } else
        if (i < 12)
        {
            ConvertDate24To12Hour(txtAlertTimeValue, s, "AM");
            return;
        }
    }

    public void ConvertDate24To12Hour(TextView textview, String s, String s1)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("HH:mm");
        try
        {
            s = simpledateformat.parse(s);
            textview.setText((new StringBuilder(String.valueOf((new SimpleDateFormat("hh:mm")).format(s)))).append(" ").append(s1).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            textview.printStackTrace();
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1001)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        intent.getIntExtra("RESPONSE_CODE", 0);
        intent = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        intent = (new JSONObject(intent)).getString("productId");
        Toast.makeText(getApplicationContext(), (new StringBuilder(String.valueOf(getString(0x7f0700c8)))).append(intent).toString(), 1).show();
        hideAdView();
        return;
        intent;
        Toast.makeText(getApplicationContext(), getString(0x7f0700c9), 1).show();
        intent.printStackTrace();
        return;
    }

    public void onClick(View view)
    {
        if (view != rlSettingBar) goto _L2; else goto _L1
_L1:
        if (!setting) goto _L4; else goto _L3
_L3:
        llSetting.setVisibility(8);
        setting = false;
_L9:
        return;
_L4:
        llSetting.setVisibility(0);
        setting = true;
        return;
_L2:
        if (view == rlAboutBar)
        {
            if (about)
            {
                llInner.setVisibility(8);
                about = false;
                return;
            } else
            {
                llInner.setVisibility(0);
                about = true;
                return;
            }
        }
        if (view == rlWidgetBar)
        {
            view = new Intent(this, com/hmobile/biblekjv/WidgetSelectorActivity);
            view.putExtra("FromApp", true);
            startActivity(view);
            return;
        }
        if (view == rlRate)
        {
            view = new Intent("android.intent.action.VIEW");
            view.setData(Uri.parse((new StringBuilder("market://details?id=")).append(getPackageName()).toString()));
            startActivity(view);
            return;
        }
        if (view == rlTerms)
        {
            startActivity(new Intent(this, com/hmobile/biblekjv/TermsOfUseActivity));
            return;
        }
        if (view == rlPrivacy)
        {
            startActivity(new Intent(this, com/hmobile/biblekjv/PrivacyPolicyActivity));
            return;
        }
        if (view == rlEmailUpdates)
        {
            view = new Intent("android.intent.action.VIEW");
            view.setData(Uri.parse(getString(0x7f07008c)));
            startActivity(view);
            return;
        }
        if (view == rlWebsite)
        {
            view = new Intent("android.intent.action.VIEW");
            view.setData(Uri.parse(getString(0x7f07008e)));
            startActivity(view);
            return;
        }
        if (view != rlFeedback) goto _L6; else goto _L5
_L5:
        view = null;
        PackageInfo packageinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        view = packageinfo;
_L7:
        view = ((PackageInfo) (view)).versionName;
        String s = android.os.Build.VERSION.RELEASE;
        String s1 = Build.MODEL;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/html");
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            "support@h-mobile.net"
        });
        intent.putExtra("android.intent.extra.SUBJECT", "King James Bible Free v1.4.9.2");
        intent.putExtra("android.intent.extra.TEXT", (new StringBuilder("\n\n\n Phone Model : ")).append(s1).append("\n Android OS : ").append(s).append("\n App Version: ").append(view).toString());
        startActivity(Intent.createChooser(intent, "Send Email"));
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        namenotfoundexception.printStackTrace();
        if (true) goto _L7; else goto _L6
_L6:
        if (view == rlMoreApps)
        {
            view = new Intent("android.intent.action.VIEW");
            view.setData(Uri.parse(getString(0x7f070090)));
            startActivity(view);
            return;
        }
        if (view != chkOnOffNotification)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (chkOnOffNotification.isChecked())
        {
            rlAlertTime.setEnabled(true);
            txtAlertTimeLabel.setTextColor(0xff000000);
            view = Calendar.getInstance();
            txtAlertTimeValue.setVisibility(0);
            (new TimePickerDialog(this, time1, view.get(11), view.get(12), false)).show();
            return;
        }
        rlAlertTime.setEnabled(false);
        txtAlertTimeLabel.setTextColor(0xffcccccc);
        txtAlertTimeValue.setVisibility(8);
        editor.putBoolean("is_notification", false);
        editor.commit();
        boolean flag;
        if (PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(this, com/hmobile/common/MyDailyQuoteReceiver), 0x20000000) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L9; else goto _L8
_L8:
        view = PendingIntent.getBroadcast(this, 0, new Intent(this, com/hmobile/common/MyDailyQuoteReceiver), 0x10000000);
        ((AlarmManager)getSystemService("alarm")).cancel(view);
        return;
        if (view != rlAlertTime) goto _L9; else goto _L10
_L10:
        view = Calendar.getInstance();
        view = new TimePickerDialog(this, time1, view.get(11), view.get(12), false);
        view.setTitle(getString(0x7f0700e3));
        view.show();
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        tabView = (new TabProvider(this)).getTabHost("main");
        tabView.setCurrentView(0x7f03002e);
        setContentView(tabView.render(4));
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        mGaTracker.sendView("/SettingsActivity");
        addQuickActionMenu();
        menuDialogDisplay();
        settings = PreferenceManager.getDefaultSharedPreferences(this);
        editor = settings.edit();
        fontStyle = getResources().getStringArray(0x7f0d0005);
        rlFontStyle = (RelativeLayout)findViewById(0x7f0e00d6);
        rlSettingBar = (RelativeLayout)findViewById(0x7f0e00fc);
        rlWidgetBar = (RelativeLayout)findViewById(0x7f0e011b);
        seekAudioPitch = (SeekBar)findViewById(0x7f0e0110);
        spnFontSize = (Spinner)findViewById(0x7f0e00d5);
        spnFontStyle = (Spinner)findViewById(0x7f0e00d8);
        spnAudioSpeed = (Spinner)findViewById(0x7f0e0025);
        rlAboutBar = (RelativeLayout)findViewById(0x7f0e00db);
        rlRate = (RelativeLayout)findViewById(0x7f0e0093);
        rlTerms = (RelativeLayout)findViewById(0x7f0e00e9);
        rlPrivacy = (RelativeLayout)findViewById(0x7f0e00ed);
        rlMoreApps = (RelativeLayout)findViewById(0x7f0e00e5);
        rlEmailUpdates = (RelativeLayout)findViewById(0x7f0e00f1);
        rlWebsite = (RelativeLayout)findViewById(0x7f0e00a5);
        rlFeedback = (RelativeLayout)findViewById(0x7f0e00f8);
        rlAlertTime = (RelativeLayout)findViewById(0x7f0e0104);
        llInner = (LinearLayout)findViewById(0x7f0e00de);
        llSetting = (LinearLayout)findViewById(0x7f0e00ff);
        llWidget = (LinearLayout)findViewById(0x7f0e011e);
        chkLowLight = (CheckBox)findViewById(0x7f0e0116);
        chkNavigationFade = (CheckBox)findViewById(0x7f0e011a);
        txtNavigationLabel = (TextView)findViewById(0x7f0e0119);
        txtLowLighthint = (TextView)findViewById(0x7f0e0115);
        txtAlertTimeLabel = (TextView)findViewById(0x7f0e0105);
        txtAlertTimeValue = (TextView)findViewById(0x7f0e0106);
        chkOnOffNotification = (CheckBox)findViewById(0x7f0e0102);
        rlFontStyle.setOnClickListener(this);
        rlSettingBar.setOnClickListener(this);
        rlAboutBar.setOnClickListener(this);
        rlRate.setOnClickListener(this);
        rlTerms.setOnClickListener(this);
        rlPrivacy.setOnClickListener(this);
        rlWidgetBar.setOnClickListener(this);
        rlMoreApps.setOnClickListener(this);
        rlEmailUpdates.setOnClickListener(this);
        rlWebsite.setOnClickListener(this);
        rlFeedback.setOnClickListener(this);
        chkOnOffNotification.setOnClickListener(this);
        rlAlertTime.setOnClickListener(this);
        if (settings.getBoolean("is_notification", true))
        {
            chkOnOffNotification.setChecked(true);
            rlAlertTime.setEnabled(true);
            txtAlertTimeLabel.setTextColor(0xff000000);
            setTime(settings.getInt("notification_hour", 8), settings.getInt("notification_min", 0));
        } else
        {
            chkOnOffNotification.setChecked(false);
            rlAlertTime.setEnabled(false);
            txtAlertTimeLabel.setTextColor(0xffcccccc);
        }
        spnFontSize.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final SettingsActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                editor.putInt("font_size", f_size[i]);
                editor.commit();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        spnFontStyle.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final SettingsActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (new StringBuilder(String.valueOf(fontStyle[i].toLowerCase().replace("-", "")))).append(".ttf").toString();
                editor.putString("font_style", adapterview);
                editor.commit();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        spnAudioSpeed.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final SettingsActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                float f = audio_speed[i];
                editor.putFloat("speech_speed", f);
                editor.commit();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        chkLowLight.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                editor.putBoolean("low_light", flag);
                editor.commit();
                if (flag)
                {
                    txtLowLighthint.setText(getResources().getString(0x7f07006e));
                    return;
                } else
                {
                    txtLowLighthint.setText(getResources().getString(0x7f07006f));
                    return;
                }
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        seekAudioPitch.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

            final SettingsActivity this$0;

            public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
            {
                editor.putInt("speech_pitch", i);
                editor.commit();
            }

            public void onStartTrackingTouch(SeekBar seekbar)
            {
            }

            public void onStopTrackingTouch(SeekBar seekbar)
            {
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        chkNavigationFade.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                editor.putBoolean("navigation_fade", flag);
                editor.commit();
                if (flag)
                {
                    txtNavigationLabel.setText(getResources().getString(0x7f070070));
                    return;
                } else
                {
                    txtNavigationLabel.setText(getResources().getString(0x7f070071));
                    return;
                }
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        if (!HolyBibleApplication.isPurchased)
        {
            addAdView();
            return;
        } else
        {
            hideAdView();
            return;
        }
    }

    protected void onResume()
    {
        String s;
        int i;
        boolean flag;
        int j;
        s = settings.getString("font_style", "robotoregular.ttf");
        j = settings.getInt("font_size", 18);
        flag = false;
        i = 0;
_L7:
        if (i < f_size.length) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
_L5:
        spnFontSize.setSelection(i);
        flag = false;
        i = 0;
_L10:
        if (i < fontStyle.length) goto _L4; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
_L8:
        spnFontStyle.setSelection(i);
        boolean flag1 = settings.getBoolean("low_light", true);
        chkLowLight.setChecked(flag1);
        flag1 = settings.getBoolean("navigation_fade", true);
        chkNavigationFade.setChecked(flag1);
        super.onResume();
        speechSpeed = settings.getFloat("speech_speed", 1.0F);
        i = 0;
_L11:
        if (i >= audio_speed.length)
        {
            speechPitch = settings.getInt("speech_pitch", 10);
            seekAudioPitch.setProgress(speechPitch);
            return;
        }
        break MISSING_BLOCK_LABEL_263;
_L2:
        if (j != f_size[i]) goto _L6; else goto _L5
_L6:
        i++;
          goto _L7
_L4:
        if (!s.equalsIgnoreCase((new StringBuilder(String.valueOf(fontStyle[i].toLowerCase().replace("-", "")))).append(".ttf").toString())) goto _L9; else goto _L8
_L9:
        i++;
          goto _L10
        if (audio_speed[i] == speechSpeed)
        {
            spnAudioSpeed.setSelection(i);
        }
        i++;
          goto _L11
    }

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
    }



}
