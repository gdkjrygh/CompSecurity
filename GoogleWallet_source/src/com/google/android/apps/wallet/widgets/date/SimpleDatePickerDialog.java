// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.date;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.wallet.util.date.DateFormatUtil;
import com.google.common.base.Optional;
import java.text.DateFormat;
import java.util.Calendar;

// Referenced classes of package com.google.android.apps.wallet.widgets.date:
//            SimpleDatePicker

public class SimpleDatePickerDialog extends AlertDialog
    implements android.content.DialogInterface.OnClickListener, SimpleDatePicker.OnDateChangedListener
{
    public static interface OnDateSetListener
    {

        public abstract void onDateSet(SimpleDatePicker simpledatepicker, int i, int j, int k);
    }


    private final OnDateSetListener callback;
    private final SimpleDatePicker datePicker;
    private final DateFormat titleDateFormat;

    public SimpleDatePickerDialog(Context context, OnDateSetListener ondatesetlistener, int i, int j)
    {
        this(context, ondatesetlistener, false, Optional.absent(), i, j);
    }

    public SimpleDatePickerDialog(Context context, OnDateSetListener ondatesetlistener, int i, int j, int k)
    {
        this(context, ondatesetlistener, true, Optional.of(Integer.valueOf(i)), j, k);
    }

    private SimpleDatePickerDialog(Context context, OnDateSetListener ondatesetlistener, boolean flag, Optional optional, int i, int j)
    {
        super(context);
        callback = ondatesetlistener;
        setButton(-1, context.getText(com.google.android.apps.walletnfcrel.R.string.button_done), this);
        context = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.google.android.apps.walletnfcrel.R.layout.date_picker_dialog, null);
        setView(context);
        datePicker = (SimpleDatePicker)context.findViewById(com.google.android.apps.walletnfcrel.R.id.datePicker);
        if (flag)
        {
            datePicker.init(((Integer)optional.or(Integer.valueOf(1992))).intValue(), i, j, this);
        } else
        {
            datePicker.init(i, j, this);
        }
        if (flag)
        {
            context = DateFormat.getDateInstance(1);
        } else
        {
            context = DateFormatUtil.getLocalizedDateFormatWithoutYear(getContext());
        }
        titleDateFormat = context;
        updateTitle();
    }

    private void updateTitle()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, datePicker.getYearOrDefault());
        calendar.set(2, datePicker.getMonth());
        calendar.set(5, datePicker.getDayOfMonth());
        setTitle(titleDateFormat.format(calendar.getTime()));
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (callback != null)
        {
            datePicker.clearFocus();
            callback.onDateSet(datePicker, datePicker.getYearOrDefault(), datePicker.getMonth(), datePicker.getDayOfMonth());
        }
    }

    public void onDateChanged(SimpleDatePicker simpledatepicker, int i, int j, int k)
    {
        updateTitle();
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        int i = bundle.getInt("month");
        int j = bundle.getInt("day");
        if (bundle.containsKey("year"))
        {
            int k = bundle.getInt("year");
            datePicker.init(k, i, j, this);
        } else
        {
            datePicker.init(i, j, this);
        }
        updateTitle();
    }

    public Bundle onSaveInstanceState()
    {
        Bundle bundle = super.onSaveInstanceState();
        if (datePicker.getYear().isPresent())
        {
            bundle.putInt("year", ((Integer)datePicker.getYear().get()).intValue());
        }
        bundle.putInt("month", datePicker.getMonth());
        bundle.putInt("day", datePicker.getDayOfMonth());
        return bundle;
    }

    public final void updateDate(int i, int j, int k)
    {
        datePicker.updateDate(i, j, k);
    }
}
