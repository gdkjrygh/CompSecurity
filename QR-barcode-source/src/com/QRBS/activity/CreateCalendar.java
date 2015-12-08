// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.ads.AdView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;
import java.util.Calendar;

// Referenced classes of package com.QRBS.activity:
//            CalendarListSel

public class CreateCalendar extends SherlockActivity
{

    Button date;
    Button date2;
    EditText des;
    Button encode;
    boolean flag[];
    Button pick;
    Button time;
    Button time2;
    private android.app.DatePickerDialog.OnDateSetListener updateData;
    private android.app.DatePickerDialog.OnDateSetListener updateData2;
    private android.app.TimePickerDialog.OnTimeSetListener updateTime;
    private android.app.TimePickerDialog.OnTimeSetListener updateTime2;
    EditText what;
    EditText where;

    public CreateCalendar()
    {
        flag = new boolean[4];
        updateData = new android.app.DatePickerDialog.OnDateSetListener() {

            final CreateCalendar this$0;

            public void onDateSet(DatePicker datepicker, int i, int j, int k)
            {
                String s;
                if (j < 9)
                {
                    datepicker = (new StringBuilder("0")).append(j + 1).toString();
                } else
                {
                    datepicker = (new StringBuilder()).append(j + 1).toString();
                }
                if (k < 10)
                {
                    s = (new StringBuilder("0")).append(k).toString();
                } else
                {
                    s = (new StringBuilder()).append(k).toString();
                }
                datepicker = (new StringBuilder()).append(i).append("/").append(datepicker).append("/").append(s).toString();
                date.setText(datepicker);
                flag[0] = true;
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        };
        updateData2 = new android.app.DatePickerDialog.OnDateSetListener() {

            final CreateCalendar this$0;

            public void onDateSet(DatePicker datepicker, int i, int j, int k)
            {
                String s;
                if (j < 9)
                {
                    datepicker = (new StringBuilder("0")).append(j + 1).toString();
                } else
                {
                    datepicker = (new StringBuilder()).append(j + 1).toString();
                }
                if (k < 10)
                {
                    s = (new StringBuilder("0")).append(k).toString();
                } else
                {
                    s = (new StringBuilder()).append(k).toString();
                }
                datepicker = (new StringBuilder()).append(i).append("/").append(datepicker).append("/").append(s).toString();
                date2.setText(datepicker);
                flag[2] = true;
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        };
        updateTime = new android.app.TimePickerDialog.OnTimeSetListener() {

            final CreateCalendar this$0;

            public void onTimeSet(TimePicker timepicker, int i, int j)
            {
                String s;
                if (i < 10)
                {
                    timepicker = (new StringBuilder("0")).append(i).toString();
                } else
                {
                    timepicker = (new StringBuilder()).append(i).toString();
                }
                if (j < 10)
                {
                    s = (new StringBuilder("0")).append(j).toString();
                } else
                {
                    s = (new StringBuilder()).append(j).toString();
                }
                time.setText((new StringBuilder()).append(timepicker).append(":").append(s).toString());
                flag[1] = true;
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        };
        updateTime2 = new android.app.TimePickerDialog.OnTimeSetListener() {

            final CreateCalendar this$0;

            public void onTimeSet(TimePicker timepicker, int i, int j)
            {
                String s;
                if (i < 10)
                {
                    timepicker = (new StringBuilder("0")).append(i).toString();
                } else
                {
                    timepicker = (new StringBuilder()).append(i).toString();
                }
                if (j < 10)
                {
                    s = (new StringBuilder("0")).append(j).toString();
                } else
                {
                    s = (new StringBuilder()).append(j).toString();
                }
                time2.setText((new StringBuilder()).append(timepicker).append(":").append(s).toString());
                flag[3] = true;
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        };
    }

    private String check(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            return charsequence.toString();
        } else
        {
            return null;
        }
    }

    private boolean controlEdit()
    {
        return what.length() != 0 && where.length() != 0 && des.length() != 0;
    }

    private void showDataDialog()
    {
        Calendar calendar = Calendar.getInstance();
        (new DatePickerDialog(this, updateData, calendar.get(1), calendar.get(2), calendar.get(5))).show();
    }

    private void showDataDialog2()
    {
        Calendar calendar = Calendar.getInstance();
        (new DatePickerDialog(this, updateData2, calendar.get(1), 2, 5)).show();
    }

    private void showTimeDialog()
    {
        Calendar calendar = Calendar.getInstance();
        (new TimePickerDialog(this, updateTime, calendar.get(11), calendar.get(12), true)).show();
    }

    private void showTimeDialog2()
    {
        Calendar calendar = Calendar.getInstance();
        (new TimePickerDialog(this, updateTime2, calendar.get(11), calendar.get(12), true)).show();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030022);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(0x7f0800cb);
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        what = (EditText)findViewById(0x7f0d007e);
        where = (EditText)findViewById(0x7f0d0083);
        des = (EditText)findViewById(0x7f0d0084);
        date = (Button)findViewById(0x7f0d007f);
        date2 = (Button)findViewById(0x7f0d0081);
        time = (Button)findViewById(0x7f0d0080);
        time2 = (Button)findViewById(0x7f0d0082);
        encode = (Button)findViewById(0x7f0d007c);
        pick = (Button)findViewById(0x7f0d007b);
        pick.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateCalendar this$0;

            public void onClick(View view)
            {
                view = new Intent(CreateCalendar.this, com/QRBS/activity/CalendarListSel);
                startActivity(view);
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        });
        date.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateCalendar this$0;

            public void onClick(View view)
            {
                showDataDialog();
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        });
        date2.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateCalendar this$0;

            public void onClick(View view)
            {
                showDataDialog2();
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        });
        time.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateCalendar this$0;

            public void onClick(View view)
            {
                showTimeDialog();
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        });
        time2.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateCalendar this$0;

            public void onClick(View view)
            {
                showTimeDialog2();
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        });
        encode.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateCalendar this$0;

            public void onClick(View view)
            {
                if (flag[0] && flag[1] && flag[2] && flag[3] && controlEdit())
                {
                    (new EncodeUtils(CreateCalendar.this)).start(EncodeUtils.createCalendarString(check(what.getText()), check(where.getText()), check(des.getText()), check(date.getText()), check(time.getText()), check(date2.getText()), check(time2.getText())), (new StringBuilder(String.valueOf(what.getText().toString()))).append("\n").append(date.getText()).append(" ").append(time.getText()).append("\n").append(date2.getText()).append(" ").append(time2.getText()).append("\n").append(where.getText().toString()).append("\n").append(des.getText().toString()).toString());
                    return;
                } else
                {
                    Utils.showToastNotification(CreateCalendar.this, getString(0x7f0800fc));
                    return;
                }
            }

            
            {
                this$0 = CreateCalendar.this;
                super();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        finish();
        return true;
    }






}
