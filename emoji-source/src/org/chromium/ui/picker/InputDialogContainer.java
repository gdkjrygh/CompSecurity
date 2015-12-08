// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TimePicker;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

// Referenced classes of package org.chromium.ui.picker:
//            WeekPicker, MonthPicker, ChromeDatePickerDialog, DateDialogNormalizer, 
//            MultiFieldTimePickerDialog, DateTimePickerDialog, MonthPickerDialog, WeekPickerDialog, 
//            DateTimeSuggestionListAdapter, DateTimeSuggestion

public class InputDialogContainer
{
    private class DateListener
        implements android.app.DatePickerDialog.OnDateSetListener
    {

        private final int mDialogType;
        final InputDialogContainer this$0;

        public void onDateSet(DatePicker datepicker, int i, int j, int k)
        {
            setFieldDateTimeValue(mDialogType, i, j, k, 0, 0, 0, 0, 0);
        }

        DateListener(int i)
        {
            this$0 = InputDialogContainer.this;
            super();
            mDialogType = i;
        }
    }

    private class DateTimeListener
        implements DateTimePickerDialog.OnDateTimeSetListener
    {

        private final int mDialogType;
        private final boolean mLocal;
        final InputDialogContainer this$0;

        public void onDateTimeSet(DatePicker datepicker, TimePicker timepicker, int i, int j, int k, int l, int i1)
        {
            setFieldDateTimeValue(mDialogType, i, j, k, l, i1, 0, 0, 0);
        }

        public DateTimeListener(int i)
        {
            this$0 = InputDialogContainer.this;
            super();
            boolean flag;
            if (i == InputDialogContainer.sTextInputTypeDateTimeLocal)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mLocal = flag;
            mDialogType = i;
        }
    }

    private class FullTimeListener
        implements MultiFieldTimePickerDialog.OnMultiFieldTimeSetListener
    {

        private final int mDialogType;
        final InputDialogContainer this$0;

        public void onTimeSet(int i, int j, int k, int l)
        {
            setFieldDateTimeValue(mDialogType, 0, 0, 0, i, j, k, l, 0);
        }

        FullTimeListener(int i)
        {
            this$0 = InputDialogContainer.this;
            super();
            mDialogType = i;
        }
    }

    public static interface InputActionDelegate
    {

        public abstract void cancelDateTimeDialog();

        public abstract void replaceDateTime(double d);
    }

    private class MonthOrWeekListener
        implements TwoFieldDatePickerDialog.OnValueSetListener
    {

        private final int mDialogType;
        final InputDialogContainer this$0;

        public void onValueSet(int i, int j)
        {
            if (mDialogType == InputDialogContainer.sTextInputTypeMonth)
            {
                setFieldDateTimeValue(mDialogType, i, j, 0, 0, 0, 0, 0, 0);
                return;
            } else
            {
                setFieldDateTimeValue(mDialogType, i, 0, 0, 0, 0, 0, 0, j);
                return;
            }
        }

        MonthOrWeekListener(int i)
        {
            this$0 = InputDialogContainer.this;
            super();
            mDialogType = i;
        }
    }


    private static int sTextInputTypeDate;
    private static int sTextInputTypeDateTime;
    private static int sTextInputTypeDateTimeLocal;
    private static int sTextInputTypeMonth;
    private static int sTextInputTypeTime;
    private static int sTextInputTypeWeek;
    private final Context mContext;
    private AlertDialog mDialog;
    private boolean mDialogAlreadyDismissed;
    private final InputActionDelegate mInputActionDelegate;

    public InputDialogContainer(Context context, InputActionDelegate inputactiondelegate)
    {
        mContext = context;
        mInputActionDelegate = inputactiondelegate;
    }

    public static void initializeInputTypes(int i, int j, int k, int l, int i1, int j1)
    {
        sTextInputTypeDate = i;
        sTextInputTypeDateTime = j;
        sTextInputTypeDateTimeLocal = k;
        sTextInputTypeMonth = l;
        sTextInputTypeTime = i1;
        sTextInputTypeWeek = j1;
    }

    public static boolean isDialogInputType(int i)
    {
        return i == sTextInputTypeDate || i == sTextInputTypeTime || i == sTextInputTypeDateTime || i == sTextInputTypeDateTimeLocal || i == sTextInputTypeMonth || i == sTextInputTypeWeek;
    }

    void dismissDialog()
    {
        if (isDialogShowing())
        {
            mDialog.dismiss();
        }
    }

    boolean isDialogShowing()
    {
        return mDialog != null && mDialog.isShowing();
    }

    protected void setFieldDateTimeValue(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2)
    {
        if (mDialogAlreadyDismissed)
        {
            return;
        }
        mDialogAlreadyDismissed = true;
        if (i == sTextInputTypeMonth)
        {
            mInputActionDelegate.replaceDateTime((j - 1970) * 12 + k);
            return;
        }
        if (i == sTextInputTypeWeek)
        {
            mInputActionDelegate.replaceDateTime(WeekPicker.createDateFromWeek(j, i2).getTimeInMillis());
            return;
        }
        if (i == sTextInputTypeTime)
        {
            mInputActionDelegate.replaceDateTime(TimeUnit.HOURS.toMillis(i1) + TimeUnit.MINUTES.toMillis(j1) + TimeUnit.SECONDS.toMillis(k1) + (long)l1);
            return;
        } else
        {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.clear();
            calendar.set(1, j);
            calendar.set(2, k);
            calendar.set(5, l);
            calendar.set(11, i1);
            calendar.set(12, j1);
            calendar.set(13, k1);
            calendar.set(14, l1);
            mInputActionDelegate.replaceDateTime(calendar.getTimeInMillis());
            return;
        }
    }

    public void showDialog(int i, double d, double d1, double d2, 
            double d3, DateTimeSuggestion adatetimesuggestion[])
    {
        dismissDialog();
        if (adatetimesuggestion == null)
        {
            showPickerDialog(i, d, d1, d2, d3);
            return;
        } else
        {
            showSuggestionDialog(i, d, d1, d2, d3, adatetimesuggestion);
            return;
        }
    }

    public void showPickerDialog(int i, double d, double d1, double d2, 
            double d3)
    {
        Object obj;
        if (Double.isNaN(d))
        {
            obj = Calendar.getInstance();
            ((Calendar) (obj)).set(14, 0);
        } else
        if (i == sTextInputTypeMonth)
        {
            obj = MonthPicker.createDateFromValue(d);
        } else
        if (i == sTextInputTypeWeek)
        {
            obj = WeekPicker.createDateFromValue(d);
        } else
        {
            obj = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
            ((GregorianCalendar) (obj)).setGregorianChange(new Date(0x8000000000000000L));
            ((GregorianCalendar) (obj)).setTimeInMillis((long)d);
        }
_L6:
        if (i != sTextInputTypeDate) goto _L2; else goto _L1
_L1:
        showPickerDialog(i, ((Calendar) (obj)).get(1), ((Calendar) (obj)).get(2), ((Calendar) (obj)).get(5), 0, 0, 0, 0, 0, d1, d2, d3);
_L4:
        return;
_L2:
        if (i == sTextInputTypeTime)
        {
            showPickerDialog(i, 0, 0, 0, ((Calendar) (obj)).get(11), ((Calendar) (obj)).get(12), 0, 0, 0, d1, d2, d3);
            return;
        }
        if (i == sTextInputTypeDateTime || i == sTextInputTypeDateTimeLocal)
        {
            showPickerDialog(i, ((Calendar) (obj)).get(1), ((Calendar) (obj)).get(2), ((Calendar) (obj)).get(5), ((Calendar) (obj)).get(11), ((Calendar) (obj)).get(12), ((Calendar) (obj)).get(13), ((Calendar) (obj)).get(14), 0, d1, d2, d3);
            return;
        }
        if (i == sTextInputTypeMonth)
        {
            showPickerDialog(i, ((Calendar) (obj)).get(1), ((Calendar) (obj)).get(2), 0, 0, 0, 0, 0, 0, d1, d2, d3);
            return;
        }
        if (i != sTextInputTypeWeek) goto _L4; else goto _L3
_L3:
        showPickerDialog(i, WeekPicker.getISOWeekYearForDate(((Calendar) (obj))), 0, 0, 0, 0, 0, 0, WeekPicker.getWeekForDate(((Calendar) (obj))), d1, d2, d3);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void showPickerDialog(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, double d, double d1, double d2)
    {
        int j2;
        if (isDialogShowing())
        {
            mDialog.dismiss();
        }
        j2 = (int)d2;
        if (i != sTextInputTypeDate) goto _L2; else goto _L1
_L1:
        ChromeDatePickerDialog chromedatepickerdialog = new ChromeDatePickerDialog(mContext, new DateListener(i), j, k, l);
        DateDialogNormalizer.normalize(chromedatepickerdialog.getDatePicker(), chromedatepickerdialog, j, k, l, 0, 0, (long)d, (long)d1);
        chromedatepickerdialog.setTitle(mContext.getText(org.chromium.ui.R.string.date_picker_dialog_title));
        mDialog = chromedatepickerdialog;
_L4:
        mDialog.setButton(-1, mContext.getText(org.chromium.ui.R.string.date_picker_dialog_set), (android.content.DialogInterface.OnClickListener)mDialog);
        mDialog.setButton(-2, mContext.getText(0x1040000), (android.content.DialogInterface.OnClickListener)null);
        mDialog.setButton(-3, mContext.getText(org.chromium.ui.R.string.date_picker_dialog_clear), new android.content.DialogInterface.OnClickListener() {

            final InputDialogContainer this$0;

            public void onClick(DialogInterface dialoginterface, int k2)
            {
                mDialogAlreadyDismissed = true;
                mInputActionDelegate.replaceDateTime((0.0D / 0.0D));
            }

            
            {
                this$0 = InputDialogContainer.this;
                super();
            }
        });
        mDialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final InputDialogContainer this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (!mDialogAlreadyDismissed)
                {
                    mDialogAlreadyDismissed = true;
                    mInputActionDelegate.cancelDateTimeDialog();
                }
            }

            
            {
                this$0 = InputDialogContainer.this;
                super();
            }
        });
        mDialogAlreadyDismissed = false;
        mDialog.show();
        return;
_L2:
        if (i == sTextInputTypeTime)
        {
            mDialog = new MultiFieldTimePickerDialog(mContext, 0, i1, j1, k1, l1, (int)d, (int)d1, j2, DateFormat.is24HourFormat(mContext), new FullTimeListener(i));
        } else
        if (i == sTextInputTypeDateTime || i == sTextInputTypeDateTimeLocal)
        {
            mDialog = new DateTimePickerDialog(mContext, new DateTimeListener(i), j, k, l, i1, j1, DateFormat.is24HourFormat(mContext), d, d1);
        } else
        if (i == sTextInputTypeMonth)
        {
            mDialog = new MonthPickerDialog(mContext, new MonthOrWeekListener(i), j, k, d, d1);
        } else
        if (i == sTextInputTypeWeek)
        {
            mDialog = new WeekPickerDialog(mContext, new MonthOrWeekListener(i), j, i2, d, d1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void showSuggestionDialog(final int dialogType, final double dialogValue, final double min, final double max, 
            final double step, final DateTimeSuggestion adapter[])
    {
        ListView listview;
        int i;
        listview = new ListView(mContext);
        adapter = new DateTimeSuggestionListAdapter(mContext, Arrays.asList(adapter));
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final InputDialogContainer this$0;
            final DateTimeSuggestionListAdapter val$adapter;
            final int val$dialogType;
            final double val$dialogValue;
            final double val$max;
            final double val$min;
            final double val$step;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                if (j == adapter.getCount() - 1)
                {
                    dismissDialog();
                    showPickerDialog(dialogType, dialogValue, min, max, step);
                    return;
                } else
                {
                    double d = ((DateTimeSuggestion)adapter.getItem(j)).value();
                    mInputActionDelegate.replaceDateTime(d);
                    dismissDialog();
                    mDialogAlreadyDismissed = true;
                    return;
                }
            }

            
            {
                this$0 = InputDialogContainer.this;
                adapter = datetimesuggestionlistadapter;
                dialogType = i;
                dialogValue = d;
                min = d1;
                max = d2;
                step = d3;
                super();
            }
        });
        i = org.chromium.ui.R.string.date_picker_dialog_title;
        if (dialogType != sTextInputTypeTime) goto _L2; else goto _L1
_L1:
        i = org.chromium.ui.R.string.time_picker_dialog_title;
_L4:
        mDialog = (new android.app.AlertDialog.Builder(mContext)).setTitle(i).setView(listview).setNegativeButton(mContext.getText(0x1040000), new android.content.DialogInterface.OnClickListener() {

            final InputDialogContainer this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dismissDialog();
            }

            
            {
                this$0 = InputDialogContainer.this;
                super();
            }
        }).create();
        mDialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final InputDialogContainer this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (mDialog == dialoginterface && !mDialogAlreadyDismissed)
                {
                    mDialogAlreadyDismissed = true;
                    mInputActionDelegate.cancelDateTimeDialog();
                }
            }

            
            {
                this$0 = InputDialogContainer.this;
                super();
            }
        });
        mDialogAlreadyDismissed = false;
        mDialog.show();
        return;
_L2:
        if (dialogType == sTextInputTypeDateTime || dialogType == sTextInputTypeDateTimeLocal)
        {
            i = org.chromium.ui.R.string.date_time_picker_dialog_title;
        } else
        if (dialogType == sTextInputTypeMonth)
        {
            i = org.chromium.ui.R.string.month_picker_dialog_title;
        } else
        if (dialogType == sTextInputTypeWeek)
        {
            i = org.chromium.ui.R.string.week_picker_dialog_title;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }




/*
    static boolean access$102(InputDialogContainer inputdialogcontainer, boolean flag)
    {
        inputdialogcontainer.mDialogAlreadyDismissed = flag;
        return flag;
    }

*/



}
