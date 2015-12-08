// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.view.View;
import com.google.android.apps.wallet.widgets.validation.ValidatedDatePicker;
import com.google.common.base.Throwables;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataPromptDisplay, UserDataWidgetFactory

final class icker extends UserDataPromptDisplay
{

    final UserDataWidgetFactory this$0;
    final DateFormat val$wireDateFormat;

    public final View getInputView()
    {
        return getView();
    }

    public final String getValue()
    {
        Calendar calendar = ((ValidatedDatePicker)getView()).getValue();
        if (calendar == null)
        {
            return "";
        } else
        {
            return val$wireDateFormat.format(calendar.getTime());
        }
    }

    public final void setValue(String s)
    {
        try
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(val$wireDateFormat.parse(s));
            ((ValidatedDatePicker)getView()).setValue(calendar);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw Throwables.propagate(s);
        }
    }

    icker(DateFormat dateformat)
    {
        this$0 = final_userdatawidgetfactory;
        val$wireDateFormat = dateformat;
        super(ValidatedDatePicker.this);
    }
}
