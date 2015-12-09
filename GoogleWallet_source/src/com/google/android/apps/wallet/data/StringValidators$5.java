// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import com.google.android.libraries.phonenumbers.NumberParseException;
import com.google.android.libraries.phonenumbers.PhoneNumberUtil;

// Referenced classes of package com.google.android.apps.wallet.data:
//            StringValidators

final class nit> extends StringValidators
{

    private final PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();

    public final volatile boolean isValid(Object obj, Resources resources)
    {
        return super.isValid((String)obj, resources);
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
        return resources.getString(com.google.android.apps.walletnfcrel.ator_error_message_phone_number_invalid);
    }

    ception(String s, int i)
    {
        super(s, i, null);
    }
}
