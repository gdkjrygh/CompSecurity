// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.wallet.inject.ApplicationInjector;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.util.date.DateFormatUtil;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.android.apps.wallet.widgets.date.SimpleDatePicker;
import com.google.android.apps.wallet.widgets.date.SimpleDatePickerDialog;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidationLogic

public class ValidatedDatePicker extends EditText
    implements ValidationGroup.Groupable
{

    AccessibilityUtil accessibilityUtil;
    private SimpleDatePickerDialog datePickerDialog;
    private DataValidator dateValidator;
    private Calendar dateValue;
    private boolean showTitle;
    private boolean showYear;
    private ValidationLogic validationLogic;

    public ValidatedDatePicker(Context context)
    {
        this(context, null);
    }

    public ValidatedDatePicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        showTitle = false;
        showYear = true;
        ApplicationInjector.inject(this, context);
        validationLogic = new ValidationLogic(this, accessibilityUtil);
        validationLogic.initializeStyle(context, attributeset);
        setOnTouchListener(new android.view.View.OnTouchListener() {

            final ValidatedDatePicker this$0;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                showDatePickerDialog();
                return true;
            }

            
            {
                this$0 = ValidatedDatePicker.this;
                super();
            }
        });
        setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final ValidatedDatePicker this$0;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    showDatePickerDialog();
                }
            }

            
            {
                this$0 = ValidatedDatePicker.this;
                super();
            }
        });
    }

    private com.google.android.apps.wallet.widgets.date.SimpleDatePickerDialog.OnDateSetListener getDateSetListener()
    {
        return new com.google.android.apps.wallet.widgets.date.SimpleDatePickerDialog.OnDateSetListener() {

            final ValidatedDatePicker this$0;

            public final void onDateSet(SimpleDatePicker simpledatepicker, int i, int j, int k)
            {
                dateValue = new GregorianCalendar(i, j, k);
                updateDisplayedDate();
                checkForError();
            }

            
            {
                this$0 = ValidatedDatePicker.this;
                super();
            }
        };
    }

    private void updateDisplayedDate()
    {
        if (dateValue == null)
        {
            setText("");
            return;
        }
        DateFormat dateformat;
        if (showYear)
        {
            dateformat = DateFormat.getDateInstance();
        } else
        {
            dateformat = DateFormatUtil.getLocalizedDateFormatWithoutYear(getContext());
        }
        setText(dateformat.format(dateValue.getTime()));
    }

    public final boolean checkForError()
    {
        if (dateValidator == null)
        {
            return false;
        }
        String s = dateValidator.validate(dateValue, getResources());
        if ("".equals(s))
        {
            validationLogic.clearInvalidState();
            return false;
        } else
        {
            validationLogic.setInvalidState(s);
            return true;
        }
    }

    public final Calendar getValue()
    {
        return dateValue;
    }

    public void setInvalidState(String s)
    {
        validationLogic.setInvalidState(s);
    }

    public void setShowYear(boolean flag)
    {
        showYear = flag;
        updateDisplayedDate();
    }

    public void setValidator(DataValidator datavalidator)
    {
        dateValidator = datavalidator;
    }

    public void setValue(Calendar calendar)
    {
        dateValue = calendar;
        updateDisplayedDate();
    }

    final void showDatePickerDialog()
    {
        Calendar calendar1 = dateValue;
        Calendar calendar = calendar1;
        if (calendar1 == null)
        {
            calendar = Calendar.getInstance();
            calendar.set(calendar.get(1) - 30, 0, 1);
        }
        if (datePickerDialog == null)
        {
            if (showYear)
            {
                datePickerDialog = new SimpleDatePickerDialog(getContext(), getDateSetListener(), calendar.get(1), calendar.get(2), calendar.get(5)) {

                    final ValidatedDatePicker this$0;

                    public final void onDateChanged(SimpleDatePicker simpledatepicker, int i, int j, int k)
                    {
                        if (showTitle && getHint().length() > 0)
                        {
                            setTitle(getHint());
                            return;
                        } else
                        {
                            super.onDateChanged(simpledatepicker, i, j, k);
                            return;
                        }
                    }

            
            {
                this$0 = ValidatedDatePicker.this;
                super(context, ondatesetlistener, i, j, k);
            }
                };
            } else
            {
                datePickerDialog = new SimpleDatePickerDialog(getContext(), getDateSetListener(), calendar.get(2), calendar.get(5)) {

                    final ValidatedDatePicker this$0;

                    public final void onDateChanged(SimpleDatePicker simpledatepicker, int i, int j, int k)
                    {
                        if (showTitle && getHint().length() > 0)
                        {
                            setTitle(getHint());
                            return;
                        } else
                        {
                            super.onDateChanged(simpledatepicker, i, j, k);
                            return;
                        }
                    }

            
            {
                this$0 = ValidatedDatePicker.this;
                super(context, ondatesetlistener, i, j);
            }
                };
            }
            if (showTitle && getHint().length() > 0)
            {
                datePickerDialog.setTitle(getHint());
            }
        } else
        {
            datePickerDialog.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        }
        datePickerDialog.show();
    }

    public final void showTitle()
    {
        showTitle = true;
    }


/*
    static Calendar access$002(ValidatedDatePicker validateddatepicker, Calendar calendar)
    {
        validateddatepicker.dateValue = calendar;
        return calendar;
    }

*/


}
