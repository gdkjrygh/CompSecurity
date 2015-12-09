// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.apps.wallet.data.DateValidators;
import com.google.android.apps.wallet.data.StringValidators;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.money.PositiveMaxAmountMoneyValidator;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.android.apps.wallet.validator.Validators;
import com.google.android.apps.wallet.widgets.money.MoneyValueInputFilter;
import com.google.android.apps.wallet.widgets.validation.ValidatedCurrencyEditText;
import com.google.android.apps.wallet.widgets.validation.ValidatedDatePicker;
import com.google.android.apps.wallet.widgets.validation.ValidatedEditText;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinner;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinnerAdapterWrapper;
import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataPrompt, UserDataPromptDisplay

public class UserDataWidgetFactory
{
    static final class SharedDataSpinnerAdapter extends ValidatedSpinnerAdapterWrapper
    {

        private final String mHintText;
        private final String mValueArray[];

        public static SharedDataSpinnerAdapter createFromResource(Context context1, int i, String as[], String s, int j, int k, int l)
        {
            ArrayAdapter arrayadapter = ArrayAdapter.createFromResource(context1, i, j);
            arrayadapter.setDropDownViewResource(k);
            return new SharedDataSpinnerAdapter(context1, arrayadapter, as, s, l);
        }

        private String getItemValue(int i)
        {
            return mValueArray[i];
        }

        protected final String getHintText()
        {
            return mHintText;
        }

        protected final volatile Object getItemValue(int i)
        {
            return getItemValue(i);
        }

        private SharedDataSpinnerAdapter(Context context1, ArrayAdapter arrayadapter, String as[], String s, int i)
        {
            super(context1, arrayadapter, i);
            mValueArray = as;
            mHintText = s;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/wobs/add/UserDataWidgetFactory.getSimpleName();
    private final Context context;
    private final LayoutInflater inflater;

    public UserDataWidgetFactory(Context context1, LayoutInflater layoutinflater)
    {
        context = context1;
        inflater = layoutinflater;
    }

    public static int calculateViewId(String s, int i)
    {
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString().hashCode() & 0xffffff;
    }

    private UserDataPromptDisplay createInputBasedOnType(UserDataPrompt userdataprompt, ViewGroup viewgroup, Integer integer)
    {
        static final class _cls5
        {

            static final int $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType = new int[UserDataPrompt.InputType.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.PHONE_NUMBER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.STATE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.ZIPCODE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.EMAIL_ADDRESS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.GENDER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.FIRST_NAME.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.LAST_NAME.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.DATE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.BIRTHDATE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.BIRTH_MONTH_AND_DAY.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.NUMERIC.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.TEXT.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.MULTI_LINE_TEXT.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$wobs$add$UserDataPrompt$InputType[UserDataPrompt.InputType.MONEY.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5..SwitchMap.com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType[userdataprompt.getInputType().ordinal()])
        {
        default:
            return createValidatedEditText(userdataprompt, viewgroup, 1, StringValidators.NON_EMPTY, false, true, integer);

        case 1: // '\001'
            return createValidatedEditText(userdataprompt, viewgroup, 3, StringValidators.PHONE_NUMBER, true, true, integer);

        case 2: // '\002'
            return createValidatedSpinner(userdataprompt, viewgroup, com.google.android.apps.walletnfcrel.R.array.states_or_regions_codes, com.google.android.apps.walletnfcrel.R.array.states_or_regions_codes);

        case 3: // '\003'
            return createValidatedEditText(userdataprompt, viewgroup, 2, StringValidators.ZIP_CODE, true, true, integer);

        case 4: // '\004'
            return createValidatedEditText(userdataprompt, viewgroup, 209, StringValidators.EMAIL, false, true, integer);

        case 5: // '\005'
            return createValidatedSpinner(userdataprompt, viewgroup, com.google.android.apps.walletnfcrel.R.array.genders, com.google.android.apps.walletnfcrel.R.array.gender_values);

        case 6: // '\006'
        case 7: // '\007'
            return createValidatedEditText(userdataprompt, viewgroup, 97, StringValidators.NON_EMPTY, false, true, integer);

        case 8: // '\b'
            return createValidatedDatePicker(userdataprompt, viewgroup, DateValidators.NON_NULL, integer, true);

        case 9: // '\t'
            return createValidatedDatePicker(userdataprompt, viewgroup, DateValidators.BIRTHDATE, integer, true);

        case 10: // '\n'
            return createValidatedDatePicker(userdataprompt, viewgroup, DateValidators.BIRTHDATE, integer, false);

        case 11: // '\013'
            return createValidatedEditText(userdataprompt, viewgroup, 2, StringValidators.NON_EMPTY, false, true, integer);

        case 12: // '\f'
            return createValidatedEditText(userdataprompt, viewgroup, 1, StringValidators.NON_EMPTY, false, true, integer);

        case 13: // '\r'
            return createValidatedEditText(userdataprompt, viewgroup, 1, StringValidators.NON_EMPTY, false, false, integer);

        case 14: // '\016'
            return createValidatedMoneyInput(userdataprompt, viewgroup, 8194, new PositiveMaxAmountMoneyValidator(0x7fffffffffffffffL, "", true), false, integer);
        }
    }

    private UserDataPromptDisplay createUserDataPromptDisplay(ValidatedCurrencyEditText validatedcurrencyedittext)
    {
        return new UserDataPromptDisplay(validatedcurrencyedittext) {

            final UserDataWidgetFactory this$0;

            public final View getInputView()
            {
                return ((ValidatedCurrencyEditText)getView()).getInputView();
            }

            public final String getValue()
            {
                return Strings.nullToEmpty(((ValidatedCurrencyEditText)getView()).getValue());
            }

            public final void setValue(String s)
            {
                ((ValidatedCurrencyEditText)getView()).setValue(s);
            }

            
            {
                this$0 = UserDataWidgetFactory.this;
                super(validatedcurrencyedittext);
            }
        };
    }

    private UserDataPromptDisplay createUserDataPromptDisplay(final ValidatedDatePicker final_validateddatepicker, DateFormat dateformat)
    {
        return new UserDataPromptDisplay(dateformat) {

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
                    return wireDateFormat.format(calendar.getTime());
                }
            }

            public final void setValue(String s)
            {
                try
                {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(wireDateFormat.parse(s));
                    ((ValidatedDatePicker)getView()).setValue(calendar);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw Throwables.propagate(s);
                }
            }

            
            {
                this$0 = UserDataWidgetFactory.this;
                wireDateFormat = dateformat;
                super(final_validateddatepicker);
            }
        };
    }

    private UserDataPromptDisplay createUserDataPromptDisplay(ValidatedEditText validatededittext)
    {
        return new UserDataPromptDisplay(validatededittext) {

            final UserDataWidgetFactory this$0;

            public final View getInputView()
            {
                return getView();
            }

            public final String getValue()
            {
                return Strings.nullToEmpty(((ValidatedEditText)getView()).getValue());
            }

            public final void setValue(String s)
            {
                ((ValidatedEditText)getView()).setValue(s);
            }

            
            {
                this$0 = UserDataWidgetFactory.this;
                super(validatededittext);
            }
        };
    }

    private UserDataPromptDisplay createUserDataPromptDisplay(ValidatedSpinner validatedspinner)
    {
        return new UserDataPromptDisplay(validatedspinner) {

            final UserDataWidgetFactory this$0;

            public final View getInputView()
            {
                return ((ValidatedSpinner)getView()).getInputView();
            }

            public final String getValue()
            {
                return Strings.nullToEmpty((String)((ValidatedSpinner)getView()).getValue());
            }

            public final void setValue(String s)
            {
                ((ValidatedSpinner)getView()).setValue(s);
            }

            
            {
                this$0 = UserDataWidgetFactory.this;
                super(validatedspinner);
            }
        };
    }

    private UserDataPromptDisplay createValidatedDatePicker(UserDataPrompt userdataprompt, ViewGroup viewgroup, DataValidator datavalidator, Integer integer, boolean flag)
    {
        GregorianCalendar gregoriancalendar;
        if (integer != null)
        {
            integer = (ValidatedDatePicker)inflater.inflate(integer.intValue(), viewgroup, false);
        } else
        {
            integer = (ValidatedDatePicker)inflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wobs_prompt_date_entry, viewgroup, false);
        }
        integer.setId(userdataprompt.calculateViewId());
        integer.setHint(userdataprompt.getLabel());
        integer.showTitle();
        if (!userdataprompt.isRequired())
        {
            datavalidator = DateValidators.emptyOr(datavalidator);
        }
        integer.setValidator(datavalidator);
        integer.setShowYear(flag);
        datavalidator = userdataprompt.getPrefilledValue();
        if (Strings.isNullOrEmpty(datavalidator)) goto _L2; else goto _L1
_L1:
        gregoriancalendar = new GregorianCalendar();
        viewgroup = datavalidator;
        if (flag) goto _L4; else goto _L3
_L3:
        viewgroup = String.valueOf(Integer.toString(1992));
        datavalidator = String.valueOf(datavalidator);
        if (datavalidator.length() == 0) goto _L6; else goto _L5
_L5:
        viewgroup = viewgroup.concat(datavalidator);
_L4:
        gregoriancalendar.setTime(getDataDateFormat().parse(viewgroup));
        integer.setValue(gregoriancalendar);
_L2:
        if (flag)
        {
            userdataprompt = getDataDateFormat();
        } else
        {
            userdataprompt = new SimpleDateFormat("MMdd");
        }
        return createUserDataPromptDisplay(integer, userdataprompt);
_L6:
        viewgroup = new String(viewgroup);
          goto _L4
        viewgroup;
        WLog.dfmt(TAG, "Unable to parse %s", new Object[] {
            userdataprompt.getPrefilledValue()
        });
          goto _L2
    }

    private UserDataPromptDisplay createValidatedEditText(UserDataPrompt userdataprompt, ViewGroup viewgroup, int i, DataValidator datavalidator, boolean flag, boolean flag1, Integer integer)
    {
        if (integer != null)
        {
            viewgroup = (ValidatedEditText)inflater.inflate(integer.intValue(), viewgroup, false);
        } else
        {
            viewgroup = (ValidatedEditText)inflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wobs_prompt_entry, viewgroup, false);
        }
        viewgroup.setId(userdataprompt.calculateViewId());
        if (!Strings.isNullOrEmpty(userdataprompt.getPrefilledValue()) && datavalidator.isValid(userdataprompt.getPrefilledValue(), context.getResources()))
        {
            viewgroup.setValue(userdataprompt.getPrefilledValue());
        }
        viewgroup.setHint(userdataprompt.getLabel());
        viewgroup.setInputType(i);
        if (!userdataprompt.isRequired())
        {
            datavalidator = StringValidators.emptyOr(datavalidator);
        }
        viewgroup.setValidator(datavalidator);
        viewgroup.setAutoAdvanceEnabled(flag);
        viewgroup.setSingleLine(flag1);
        return createUserDataPromptDisplay(viewgroup);
    }

    private UserDataPromptDisplay createValidatedMoneyInput(UserDataPrompt userdataprompt, ViewGroup viewgroup, int i, DataValidator datavalidator, boolean flag, Integer integer)
    {
        DataValidator datavalidator1;
        if (integer != null)
        {
            integer = (ValidatedCurrencyEditText)inflater.inflate(integer.intValue(), viewgroup, false);
        } else
        {
            integer = (ValidatedCurrencyEditText)inflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wobs_currency_prompt_entry, viewgroup, false);
        }
        integer.setId(userdataprompt.calculateViewId());
        datavalidator1 = userdataprompt.getValidator();
        viewgroup = datavalidator;
        if (datavalidator1 != null)
        {
            viewgroup = Validators.and(datavalidator, datavalidator1);
        }
        if (!Strings.isNullOrEmpty(userdataprompt.getPrefilledValue()) && viewgroup.isValid(userdataprompt.getPrefilledValue(), context.getResources()))
        {
            integer.setValue(userdataprompt.getPrefilledValue());
        }
        integer.setHint(userdataprompt.getLabel());
        integer.setInputType(i);
        if (!userdataprompt.isRequired())
        {
            viewgroup = StringValidators.emptyOr(viewgroup);
        }
        integer.setValidator(viewgroup);
        integer.setAutoAdvanceEnabled(flag);
        integer.setFilters(new InputFilter[] {
            new MoneyValueInputFilter()
        });
        if (userdataprompt.getMaxLength() != null)
        {
            integer.setMaxLength(userdataprompt.getMaxLength().intValue());
        }
        return createUserDataPromptDisplay(integer);
    }

    private UserDataPromptDisplay createValidatedSpinner(UserDataPrompt userdataprompt, ViewGroup viewgroup, int i, int j)
    {
        viewgroup = (ValidatedSpinner)inflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wobs_prompt_spinner_entry, viewgroup, false);
        viewgroup.setId(userdataprompt.calculateViewId());
        String as[] = context.getResources().getStringArray(j);
        viewgroup.setAdapter(SharedDataSpinnerAdapter.createFromResource(context, i, as, userdataprompt.getLabel(), 0x1090008, 0x1090009, 0x1090008));
        if (!Strings.isNullOrEmpty(userdataprompt.getPrefilledValue()))
        {
            viewgroup.setValue(userdataprompt.getPrefilledValue());
        }
        if (userdataprompt.isRequired())
        {
            userdataprompt = StringValidators.NON_EMPTY;
        } else
        {
            userdataprompt = StringValidators.NO_VALIDATION;
        }
        viewgroup.setValidator(userdataprompt);
        return createUserDataPromptDisplay(viewgroup);
    }

    private static DateFormat getDataDateFormat()
    {
        return new SimpleDateFormat("yyyyMMdd");
    }

    public final UserDataPromptDisplay createInput(UserDataPrompt userdataprompt, ViewGroup viewgroup)
    {
        return createInput(userdataprompt, viewgroup, null);
    }

    public final UserDataPromptDisplay createInput(UserDataPrompt userdataprompt, ViewGroup viewgroup, Integer integer)
    {
        viewgroup = createInputBasedOnType(userdataprompt, viewgroup, integer);
        viewgroup.getView().setEnabled(userdataprompt.isModifiable());
        if (!TextUtils.isEmpty(userdataprompt.getValue()))
        {
            viewgroup.setValue(userdataprompt.getValue());
        }
        userdataprompt.setValueHolder(viewgroup);
        viewgroup.setPrompt(userdataprompt);
        return viewgroup;
    }

}
