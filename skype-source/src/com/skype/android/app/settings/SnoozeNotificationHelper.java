// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.skype.android.SkypeBroadcastReceiver;
import com.skype.android.SkypeBroadcastReceiverComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.ExperimentTag;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.widget.SymbolView;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.skype.android.app.settings:
//            UserPreferences

public class SnoozeNotificationHelper extends SkypeBroadcastReceiver
{

    private static final long SNOOZE_DURATION_IN_MILLIS_1_HOUR = 0x36ee80L;
    Analytics analytics;
    private Context context;
    EcsConfiguration ecsConfiguration;
    private ExperimentTag hideSignOutExperimentGroup;
    UserPreferences userPreferences;

    public SnoozeNotificationHelper()
    {
    }

    public SnoozeNotificationHelper(Context context1)
    {
        getComponent(context1).inject(this);
        context = context1;
    }

    private void clearSnooze()
    {
        userPreferences.setNotificationStatus(true);
        userPreferences.setNotificationSnoozeDuration(0L);
    }

    private boolean displaySignOutButton(boolean flag, ExperimentTag experimenttag)
    {
        return flag || experimenttag.equals(ExperimentTag.c) || experimenttag.equals(ExperimentTag.a);
    }

    private boolean displaySnoozeNotificationButton(boolean flag, ExperimentTag experimenttag)
    {
        return !flag && (experimenttag.equals(ExperimentTag.g) || experimenttag.equals(ExperimentTag.h));
    }

    private void enableSnooze(long l)
    {
        userPreferences.setNotificationStatus(false);
        scheduleAlarm(l);
        userPreferences.setNotificationSnoozeDuration(l);
    }

    private String getSnoozeDurationBucket(UserPreferences userpreferences)
    {
        double d = Math.round(((double)userpreferences.getNotificationSnoozeDurationInMillis() - (double)System.currentTimeMillis()) / 3600000D);
        if (d <= 1.0D)
        {
            return "0-1hr";
        }
        if (d > 1.0D && d <= 5D)
        {
            return "1-5hr";
        }
        if (d > 5D && d <= 10D)
        {
            return "5-10hr";
        }
        if (d > 10D && d <= 15D)
        {
            return "10-15hr";
        }
        if (d > 15D && d <= 20D)
        {
            return "15-20hr";
        }
        if (d > 20D && d <= 24D)
        {
            return "20-24hr";
        } else
        {
            return "0";
        }
    }

    private String getSnoozeDurationString()
    {
        java.text.DateFormat dateformat = DateFormat.getTimeFormat(context);
        long l = userPreferences.getNotificationSnoozeDurationInMillis();
        Date date = new Date();
        date.setTime(l);
        return dateformat.format(date);
    }

    private android.view.View.OnTouchListener getSnoozeSelectionTouchListener(final TextView majorText, final Switch snoozeSwitch)
    {
        return new android.view.View.OnTouchListener() {

            final SnoozeNotificationHelper this$0;
            final TextView val$majorText;
            final Switch val$snoozeSwitch;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                boolean flag = true;
                switch (motionevent.getAction())
                {
                default:
                    flag = false;
                    // fall through

                case 0: // '\0'
                    return flag;

                case 1: // '\001'
                    showDurationSelectionDialog(snoozeSwitch, majorText);
                    break;
                }
                return true;
            }

            
            {
                this$0 = SnoozeNotificationHelper.this;
                snoozeSwitch = switch1;
                majorText = textview;
                super();
            }
        };
    }

    private android.view.View.OnTouchListener getSnoozeSwitchOnTouchListener(final TextView majorText, final Switch snoozeSwitch)
    {
        return new android.view.View.OnTouchListener() {

            final SnoozeNotificationHelper this$0;
            final TextView val$majorText;
            final Switch val$snoozeSwitch;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                boolean flag = true;
                switch (motionevent.getAction())
                {
                default:
                    flag = false;
                    // fall through

                case 0: // '\0'
                    return flag;

                case 1: // '\001'
                    break;
                }
                if (snoozeSwitch.isChecked())
                {
                    clearSnooze();
                    majorText.setVisibility(8);
                    snoozeSwitch.setChecked(false);
                    view = new SkypeTelemetryEvent(LogEvent.at);
                    analytics.a(view);
                    return true;
                } else
                {
                    showDurationSelectionDialog(snoozeSwitch, majorText);
                    return true;
                }
            }

            
            {
                this$0 = SnoozeNotificationHelper.this;
                snoozeSwitch = switch1;
                majorText = textview;
                super();
            }
        };
    }

    private void scheduleAlarm(long l)
    {
        Intent intent = new Intent(context, com/skype/android/app/settings/SnoozeNotificationHelper);
        ((AlarmManager)context.getSystemService("alarm")).setInexactRepeating(0, l, 0xdbba0L, PendingIntent.getBroadcast(context, 1, intent, 0x8000000));
    }

    private void scheduleAlarmIfNeeded(long l)
    {
        Intent intent = new Intent(context, com/skype/android/app/settings/SnoozeNotificationHelper);
        if (PendingIntent.getBroadcast(context, 1, intent, 0x20000000) == null)
        {
            scheduleAlarm(l);
        }
    }

    private void setSnoozeButton(Switch switch1)
    {
        if (checkSnoozedStatus())
        {
            switch1.setChecked(true);
            return;
        } else
        {
            switch1.setChecked(false);
            return;
        }
    }

    private void setSnoozeTime(int i, int j)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, j);
        long l1 = calendar.getTime().getTime();
        long l = l1;
        if (l1 < System.currentTimeMillis())
        {
            l = l1 + 0x5265c00L;
        }
        enableSnooze(l);
    }

    private void showDurationSelectionDialog(final Switch snoozeSwitch, final TextView majorText)
    {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int j = calendar.get(12);
        boolean flag = DateFormat.is24HourFormat(context);
        majorText = new TimePickerDialog(context, new android.app.TimePickerDialog.OnTimeSetListener() {

            final SnoozeNotificationHelper this$0;
            final TextView val$majorText;
            final Switch val$snoozeSwitch;

            public final void onTimeSet(TimePicker timepicker, int k, int l)
            {
                setSnoozeTime(k, l);
                timepicker = getSnoozeDurationString();
                majorText.setText(timepicker);
                majorText.setVisibility(0);
                snoozeSwitch.setChecked(true);
                timepicker = new SkypeTelemetryEvent(LogEvent.as);
                timepicker.put(LogAttributeName.af, getSnoozeDurationBucket(userPreferences));
                analytics.a(timepicker);
            }

            
            {
                this$0 = SnoozeNotificationHelper.this;
                majorText = textview;
                snoozeSwitch = switch1;
                super();
            }
        }, i + 1, j, flag);
        majorText.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final SnoozeNotificationHelper this$0;
            final Switch val$snoozeSwitch;

            public final void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
                if (!checkSnoozedStatus())
                {
                    snoozeSwitch.setChecked(false);
                }
            }

            
            {
                this$0 = SnoozeNotificationHelper.this;
                snoozeSwitch = switch1;
                super();
            }
        });
        if (hideSignOutExperimentGroup.equals(ExperimentTag.g))
        {
            snoozeSwitch = context.getString(0x7f0801b5);
        } else
        {
            snoozeSwitch = context.getString(0x7f0801b4);
        }
        majorText.setTitle(snoozeSwitch);
        majorText.setButton(-1, context.getString(0x7f0801b3), majorText);
        majorText.show();
    }

    public void cancelAlarm()
    {
        clearSnooze();
        Intent intent = new Intent(context, com/skype/android/app/settings/SnoozeNotificationHelper);
        ((AlarmManager)context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 1, intent, 0x8000000));
    }

    public boolean checkSnoozedStatus()
    {
        if (!userPreferences.areNotificationsEnabled())
        {
            long l = userPreferences.getNotificationSnoozeDurationInMillis();
            if (l == 0L)
            {
                return false;
            }
            if (System.currentTimeMillis() < l)
            {
                scheduleAlarmIfNeeded(l);
                return true;
            }
        }
        clearSnooze();
        return false;
    }

    public void createNotificationBannerView(final TextView bannerView, boolean flag)
    {
        if (!flag)
        {
            handleSnoozeNotificationBanner(bannerView, flag);
            bannerView.setOnTouchListener(new android.view.View.OnTouchListener() {

                final SnoozeNotificationHelper this$0;
                final TextView val$bannerView;

                public final boolean onTouch(View view, MotionEvent motionevent)
                {
                    boolean flag1 = true;
                    switch (motionevent.getAction())
                    {
                    default:
                        flag1 = false;
                        // fall through

                    case 0: // '\0'
                        return flag1;

                    case 1: // '\001'
                        clearSnooze();
                        break;
                    }
                    bannerView.setVisibility(8);
                    view = new SkypeTelemetryEvent(LogEvent.at);
                    analytics.a(view);
                    return true;
                }

            
            {
                this$0 = SnoozeNotificationHelper.this;
                bannerView = textview;
                super();
            }
            });
        }
    }

    public void handleSnoozeButtonLayout(View view, boolean flag)
    {
        Object obj;
label0:
        {
            if (!flag)
            {
                hideSignOutExperimentGroup = ecsConfiguration.getExperimentHideSignoutGroupTag();
                obj = view.findViewById(0x7f100465);
                if (!displaySignOutButton(flag, hideSignOutExperimentGroup))
                {
                    ((View) (obj)).setVisibility(8);
                }
                obj = view.findViewById(0x7f100466);
                if (displaySnoozeNotificationButton(flag, hideSignOutExperimentGroup))
                {
                    break label0;
                }
                ((View) (obj)).setVisibility(8);
            }
            return;
        }
        ((View) (obj)).setVisibility(0);
        Switch switch1 = (Switch)((View) (obj)).findViewById(0x7f100473);
        TextView textview = (TextView)((View) (obj)).findViewById(0x7f10020b);
        TextView textview1 = (TextView)((View) (obj)).findViewById(0x7f10020a);
        obj = (SymbolView)((View) (obj)).findViewById(0x7f10046e);
        setSnoozeButton(switch1);
        if (textview1 != null)
        {
            String s = context.getString(0x7f0801ac);
            if (TextUtils.isEmpty(s))
            {
                textview1.setVisibility(8);
            } else
            {
                textview1.setText(s);
                textview1.setVisibility(0);
            }
        }
        ((SymbolView) (obj)).setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.O);
        if (checkSnoozedStatus())
        {
            obj = getSnoozeDurationString();
        } else
        {
            obj = null;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            textview.setVisibility(8);
        } else
        {
            textview.setText(((CharSequence) (obj)));
            textview1.setVisibility(0);
        }
        switch1.setOnTouchListener(getSnoozeSwitchOnTouchListener(textview, switch1));
        view.findViewById(0x7f100472).setOnTouchListener(getSnoozeSelectionTouchListener(textview, switch1));
    }

    public void handleSnoozeNotificationBanner(TextView textview, boolean flag)
    {
        if (displaySnoozeNotificationButton(flag, ecsConfiguration.getExperimentHideSignoutGroupTag()))
        {
            if (!checkSnoozedStatus())
            {
                textview.setVisibility(8);
            } else
            {
                String s = getSnoozeDurationString();
                if (!TextUtils.isEmpty(s))
                {
                    textview.setText(context.getString(0x7f0801aa, new Object[] {
                        s
                    }));
                    textview.setVisibility(0);
                    return;
                }
            }
        }
    }

    public void onReceive(Context context1, Intent intent)
    {
        getComponent(context1).inject(this);
        context = context1;
        cancelAlarm();
    }





}
