// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import com.google.android.apps.wallet.validator.DataValidator;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class DateValidators extends Enum
    implements DataValidator
{

    private static final DateValidators $VALUES[];
    public static final DateValidators BIRTHDATE;
    public static final DateValidators NON_NULL;
    public static final DateValidators NO_VALIDATION;

    private DateValidators(String s, int i)
    {
        super(s, i);
    }


    public static DataValidator emptyOr(final DataValidator validator)
    {
        return new DataValidator() {

            final DataValidator val$validator;

            private boolean isValid(Calendar calendar, Resources resources)
            {
                return "".equals(validate(calendar, resources));
            }

            private String validate(Calendar calendar, Resources resources)
            {
                if (calendar == null)
                {
                    return "";
                } else
                {
                    return validator.validate(calendar, resources);
                }
            }

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((Calendar)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((Calendar)obj, resources);
            }

            
            {
                validator = datavalidator;
                super();
            }
        };
    }

    public static DateValidators valueOf(String s)
    {
        return (DateValidators)Enum.valueOf(com/google/android/apps/wallet/data/DateValidators, s);
    }

    public static DateValidators[] values()
    {
        return (DateValidators[])$VALUES.clone();
    }

    public volatile boolean isValid(Object obj, Resources resources)
    {
        return isValid((Calendar)obj, resources);
    }

    public final boolean isValid(Calendar calendar, Resources resources)
    {
        return "".equals(validate(calendar, resources));
    }

    static 
    {
        NON_NULL = new DateValidators("NON_NULL", 0) {

            private static String validate(Calendar calendar, Resources resources)
            {
                if (calendar == null)
                {
                    return resources.getString(com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_enter_date);
                } else
                {
                    return "";
                }
            }

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((Calendar)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((Calendar)obj, resources);
            }

        };
        NO_VALIDATION = new DateValidators("NO_VALIDATION", 1) {

            private static String validate(Calendar calendar, Resources resources)
            {
                return "";
            }

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((Calendar)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((Calendar)obj, resources);
            }

        };
        BIRTHDATE = new DateValidators("BIRTHDATE", 2) {

            private static String validate(Calendar calendar, Resources resources)
            {
                Object obj = NON_NULL.validate(calendar, resources);
                if (!((String) (obj)).equals(""))
                {
                    return ((String) (obj));
                }
                obj = Calendar.getInstance();
                ((Calendar) (obj)).add(5, -1);
                if (((Calendar) (obj)).before(calendar))
                {
                    return resources.getString(com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_enter_valid_birthdate);
                }
                if ((new GregorianCalendar(1899, 0, 1)).after(calendar))
                {
                    return resources.getString(com.google.android.apps.walletnfcrel.R.string.data_validator_error_message_enter_valid_birthdate);
                } else
                {
                    return "";
                }
            }

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((Calendar)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((Calendar)obj, resources);
            }

        };
        $VALUES = (new DateValidators[] {
            NON_NULL, NO_VALIDATION, BIRTHDATE
        });
    }
}
