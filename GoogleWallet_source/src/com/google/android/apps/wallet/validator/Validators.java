// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.validator;

import android.content.res.Resources;

// Referenced classes of package com.google.android.apps.wallet.validator:
//            DataValidator

public final class Validators
{

    public static DataValidator and(final DataValidator first, final DataValidator second)
    {
        return new DataValidator() {

            final DataValidator val$first;
            final DataValidator val$second;

            public final boolean isValid(Object obj, Resources resources)
            {
                return "".equals(validate(obj, resources));
            }

            public final String validate(Object obj, Resources resources)
            {
                String s = first.validate(obj, resources);
                if (!"".equals(s))
                {
                    return s;
                }
                obj = second.validate(obj, resources);
                if (!"".equals(obj))
                {
                    return ((String) (obj));
                } else
                {
                    return "";
                }
            }

            
            {
                first = datavalidator;
                second = datavalidator1;
                super();
            }
        };
    }

    public static DataValidator isNumeric(final int errorStringResourceId)
    {
        return new DataValidator() {

            final int val$errorStringResourceId;

            private boolean isValid(String s, Resources resources)
            {
                return "".equals(validate(s, resources));
            }

            private String validate(String s, Resources resources)
            {
                try
                {
                    Long.parseLong(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return resources.getString(errorStringResourceId);
                }
                return "";
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
                errorStringResourceId = i;
                super();
            }
        };
    }

    public static DataValidator lengthBetween(final int minLength, final int maxLength, final int wrongLengthMessageId)
    {
        return new DataValidator() {

            final int val$maxLength;
            final int val$minLength;
            final int val$wrongLengthMessageId;

            private boolean isValid(String s, Resources resources)
            {
                return "".equals(validate(s, resources));
            }

            private String validate(String s, Resources resources)
            {
                int i = s.length();
                if (i < minLength || i > maxLength)
                {
                    return String.format(resources.getString(wrongLengthMessageId), new Object[] {
                        Integer.valueOf(minLength), Integer.valueOf(maxLength)
                    });
                } else
                {
                    return "";
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
                minLength = i;
                maxLength = j;
                wrongLengthMessageId = k;
                super();
            }
        };
    }
}
