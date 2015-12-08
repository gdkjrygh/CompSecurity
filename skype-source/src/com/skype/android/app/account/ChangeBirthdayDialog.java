// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.widget.DatePicker;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.util.TimeUtil;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ChangeBirthdayDialog extends SkypeDialogFragment
{

    private static final int MINIMUM_SKYPE_AGE = 13;
    Account account;
    private DatePickerDialog datePickerDialog;
    private android.app.DatePickerDialog.OnDateSetListener dateSetListener;
    private android.content.DialogInterface.OnClickListener onClickListener;
    TimeUtil timeUtil;

    public ChangeBirthdayDialog()
    {
        dateSetListener = new android.app.DatePickerDialog.OnDateSetListener() {

            final ChangeBirthdayDialog this$0;

            public final void onDateSet(DatePicker datepicker, int i, int j, int k)
            {
            }

            
            {
                this$0 = ChangeBirthdayDialog.this;
                super();
            }
        };
        onClickListener = new android.content.DialogInterface.OnClickListener() {

            final ChangeBirthdayDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                case -2: 
                default:
                    return;

                case -3: 
                    saveBirthdayProp(0);
                    return;

                case -1: 
                    dialoginterface = datePickerDialog.getDatePicker();
                    break;
                }
                setBirthdate(dialoginterface.getYear(), dialoginterface.getMonth(), dialoginterface.getDayOfMonth());
            }

            
            {
                this$0 = ChangeBirthdayDialog.this;
                super();
            }
        };
    }

    private boolean isUnderAge(Calendar calendar)
    {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1, Calendar.getInstance().get(1) - 13);
        if (calendar.equals(calendar1))
        {
            return false;
        } else
        {
            return calendar.after(calendar1);
        }
    }

    private void saveBirthdayProp(int i)
    {
        account.setIntProperty(PROPKEY.CONTACT_BIRTHDAY, i);
        account.setServersideIntProperty(PROPKEY.CONTACT_BIRTHDAY, i);
    }

    private void setBirthdate(int i, int j, int k)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, j, k);
        if (isUnderAge(calendar))
        {
            showUnderAgeDialog();
            return;
        } else
        {
            saveBirthdayProp(Integer.parseInt(TimeUtil.a(calendar)));
            return;
        }
    }

    private void showUnderAgeDialog()
    {
        AlertDialog alertdialog = getMaterialDialogBuilder(getActivity()).c();
        alertdialog.setTitle(0x7f080236);
        alertdialog.a(getString(0x7f08038c));
        alertdialog.a(getString(0x104000a), new android.content.DialogInterface.OnClickListener() {

            final ChangeBirthdayDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = ChangeBirthdayDialog.this;
                super();
            }
        });
        alertdialog.setCanceledOnTouchOutside(true);
        alertdialog.show();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        int i = account.getBirthdayProp();
        bundle = null;
        if (i != 0)
        {
            bundle = TimeUtil.b(i);
        }
        int j;
        int k;
        if (bundle != null)
        {
            k = bundle.get(5);
            i = bundle.get(1);
            j = bundle.get(2);
        } else
        {
            bundle = Calendar.getInstance();
            k = bundle.get(5);
            i = bundle.get(1);
            j = bundle.get(2);
        }
        datePickerDialog = new DatePickerDialog(getActivity(), dateSetListener, i, j, k);
        datePickerDialog.setTitle(0x7f080230);
        datePickerDialog.setButton(-2, getString(0x7f080120), onClickListener);
        datePickerDialog.setButton(-3, getString(0x7f0802a2), onClickListener);
        datePickerDialog.setButton(-1, getString(0x7f080314), onClickListener);
        datePickerDialog.setCanceledOnTouchOutside(true);
        return datePickerDialog;
    }



}
