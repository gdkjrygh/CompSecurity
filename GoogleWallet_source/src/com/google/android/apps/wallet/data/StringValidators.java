// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import android.util.Patterns;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.android.apps.wallet.validator.Validators;
import com.google.android.libraries.phonenumbers.NumberParseException;
import com.google.android.libraries.phonenumbers.PhoneNumberUtil;
import com.google.common.base.Strings;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StringValidators extends Enum
    implements DataValidator
{

    private static final StringValidators $VALUES[];
    public static final StringValidators BANK_ACCOUNT_HOLDER_NAME;
    public static final StringValidators BANK_ACCOUNT_NUMBER;
    public static final StringValidators BANK_ROUTING_NUMBER;
    public static final StringValidators EMAIL;
    public static final StringValidators EXPIRATION_MONTH;
    public static final StringValidators EXPIRATION_YEAR;
    public static final StringValidators KYC_LEGAL_NAME;
    public static final StringValidators NON_EMPTY;
    public static final StringValidators NO_VALIDATION;
    public static final StringValidators PHONE_NUMBER;
    public static final StringValidators PLASTIC_CARD_LAST_FOUR;
    public static final StringValidators SSN_SEGMENT_1;
    public static final StringValidators SSN_SEGMENT_2;
    public static final StringValidators SSN_SEGMENT_3;
    public static final StringValidators STATE_CODE;
    public static final StringValidators ZIP_CODE;

    private StringValidators(String s, int i)
    {
        super(s, i);
    }


    public static DataValidator emptyOr(final DataValidator validator)
    {
        return new DataValidator() {

            final DataValidator val$validator;

            private boolean isValid(String s, Resources resources)
            {
                return "".equals(validate(s, resources));
            }

            private String validate(String s, Resources resources)
            {
                if (Strings.isNullOrEmpty(s))
                {
                    return "";
                } else
                {
                    return validator.validate(s, resources);
                }
            }

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            
            {
                validator = datavalidator;
                super();
            }
        };
    }

    private static String validateNumberOfBoundedValue(String s, long l, long l1, int i, int j, Resources resources)
    {
        long l2;
        try
        {
            l2 = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return resources.getString(j);
        }
        if (l2 >= l && l2 <= l1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        s = String.format(resources.getString(i), new Object[] {
            Long.valueOf(l), Long.valueOf(l1)
        });
        return s;
        return "";
    }

    private static String validateNumberOfBoundedValueWithDistinctMessages(String s, long l, long l1, int i, int j, int k, 
            Resources resources)
    {
        long l2;
        try
        {
            l2 = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return resources.getString(k);
        }
        if (l2 >= l)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        return resources.getString(i);
        if (l2 <= l1)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        s = resources.getString(j);
        return s;
        return "";
    }

    private static String validateNumberOfLength(String s, int i, int j, int k, Resources resources)
    {
        if (s.length() != i)
        {
            return String.format(resources.getString(j), new Object[] {
                Integer.valueOf(i)
            });
        }
        try
        {
            Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return resources.getString(k);
        }
        return "";
    }

    private static String validateStringMatchesRe(String s, String s1, int i, Resources resources)
    {
        if (!s.matches(s1))
        {
            return resources.getString(i);
        } else
        {
            return "";
        }
    }

    public static StringValidators valueOf(String s)
    {
        return (StringValidators)Enum.valueOf(com/google/android/apps/wallet/data/StringValidators, s);
    }

    public static StringValidators[] values()
    {
        return (StringValidators[])$VALUES.clone();
    }

    public volatile boolean isValid(Object obj, Resources resources)
    {
        return isValid((String)obj, resources);
    }

    public final boolean isValid(String s, Resources resources)
    {
        return "".equals(validate(s, resources));
    }

    public volatile String validate(Object obj, Resources resources)
    {
        return validate((String)obj, resources);
    }

    public abstract String validate(String s, Resources resources);

    static 
    {
        EMAIL = new StringValidators("EMAIL", 0) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                if (Patterns.EMAIL_ADDRESS.matcher(s).matches())
                {
                    return "";
                } else
                {
                    return resources.getString(com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_email);
                }
            }

        };
        EXPIRATION_MONTH = new StringValidators("EXPIRATION_MONTH", 1) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return StringValidators.validateNumberOfBoundedValue(s, 1L, 12L, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_exp_month_bounds, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_exp_month_must_be_numeric, resources);
            }

        };
        EXPIRATION_YEAR = new StringValidators("EXPIRATION_YEAR", 2) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                int i = Calendar.getInstance().get(1) - 2000;
                return StringValidators.validateNumberOfBoundedValueWithDistinctMessages(s, i, i + 20, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_exp_year_is_past, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_exp_year_cannot_be_over, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_exp_year_must_be_numeric, resources);
            }

        };
        ZIP_CODE = new StringValidators("ZIP_CODE", 3) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return StringValidators.validateNumberOfLength(s, 5, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_zip_code_wrong_length, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_zip_code_must_be_numeric, resources);
            }

        };
        PHONE_NUMBER = new StringValidators("PHONE_NUMBER", 4) {

            private final PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
label0:
                {
                    if (phoneNumberUtil.isValidNumber(phoneNumberUtil.parse(s, "US")))
                    {
                        return "";
                    }
                    break label0;
                }
                s;
                return resources.getString(com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_phone_number_invalid);
            }

        };
        STATE_CODE = new StringValidators("STATE_CODE", 5) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                String as[] = resources.getStringArray(com.google.android.apps.walletnfcrel.R.array.states_or_regions_codes);
                if (!Strings.isNullOrEmpty(s) && Arrays.asList(as).contains(s.toUpperCase()))
                {
                    return "";
                } else
                {
                    return resources.getString(com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_invalid_state);
                }
            }

        };
        NON_EMPTY = new StringValidators("NON_EMPTY", 6) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return StringValidators.validateStringMatchesRe(Strings.nullToEmpty(s).replace('\n', ' ').trim(), ".+", com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_generic_non_empty, resources);
            }

        };
        PLASTIC_CARD_LAST_FOUR = new StringValidators("PLASTIC_CARD_LAST_FOUR", 7) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return StringValidators.validateNumberOfLength(s.replaceAll(" ", ""), 4, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_plastic_card_last_four_wrong_length, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_card_number_must_be_numeric, resources);
            }

        };
        BANK_ROUTING_NUMBER = new StringValidators("BANK_ROUTING_NUMBER", 8) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                String s1 = StringValidators.validateNumberOfLength(s, 9, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_bank_routing_number_wrong_length, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_bank_routing_number_must_be_numeric, resources);
                if (!s1.equals(""))
                {
                    return s1;
                }
                s1 = StringValidators.validateStringMatchesRe(s, "^[0-4].*", com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_invalid_routing_number, resources);
                if (!s1.equals(""))
                {
                    return s1;
                }
                int j = 0;
                for (int i = 0; i + 2 < s.length(); i += 3)
                {
                    j = j + Character.digit(s.charAt(i), 10) * 3 + Character.digit(s.charAt(i + 1), 10) * 7 + Character.digit(s.charAt(i + 2), 10);
                }

                if (j == 0 || j % 10 != 0)
                {
                    return resources.getString(com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_invalid_routing_number);
                } else
                {
                    return "";
                }
            }

        };
        BANK_ACCOUNT_NUMBER = new StringValidators("BANK_ACCOUNT_NUMBER", 9) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return Validators.and(Validators.lengthBetween(3, 17, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_bank_account_number_wrong_length), Validators.isNumeric(com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_bank_account_number_must_be_numeric)).validate(s, resources);
            }

        };
        BANK_ACCOUNT_HOLDER_NAME = new StringValidators("BANK_ACCOUNT_HOLDER_NAME", 10) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return StringValidators.validateStringMatchesRe(s, "[-'&.()=/A-Za-z0-9][-'&.()=/A-Za-z0-9\\s,]+", com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_bank_account_holder_invalid, resources);
            }

        };
        KYC_LEGAL_NAME = new StringValidators("KYC_LEGAL_NAME", 11) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return StringValidators.validateStringMatchesRe(s, "[a-zA-Z ,.'-]{2,}", com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_legal_name_invalid, resources);
            }

        };
        SSN_SEGMENT_1 = new StringValidators("SSN_SEGMENT_1", 12) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return StringValidators.validateNumberOfLength(s, 3, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_ssn_wrong_length, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_ssn_must_be_numeric, resources);
            }

        };
        SSN_SEGMENT_2 = new StringValidators("SSN_SEGMENT_2", 13) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return StringValidators.validateNumberOfLength(s, 2, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_ssn_wrong_length, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_ssn_must_be_numeric, resources);
            }

        };
        SSN_SEGMENT_3 = new StringValidators("SSN_SEGMENT_3", 14) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return StringValidators.validateNumberOfLength(s, 4, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_ssn_wrong_length, com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_ssn_must_be_numeric, resources);
            }

        };
        NO_VALIDATION = new StringValidators("NO_VALIDATION", 15) {

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((String)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((String)obj, resources);
            }

            public final String validate(String s, Resources resources)
            {
                return "";
            }

        };
        $VALUES = (new StringValidators[] {
            EMAIL, EXPIRATION_MONTH, EXPIRATION_YEAR, ZIP_CODE, PHONE_NUMBER, STATE_CODE, NON_EMPTY, PLASTIC_CARD_LAST_FOUR, BANK_ROUTING_NUMBER, BANK_ACCOUNT_NUMBER, 
            BANK_ACCOUNT_HOLDER_NAME, KYC_LEGAL_NAME, SSN_SEGMENT_1, SSN_SEGMENT_2, SSN_SEGMENT_3, NO_VALIDATION
        });
    }




}
