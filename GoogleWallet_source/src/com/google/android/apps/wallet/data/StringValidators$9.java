// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;

// Referenced classes of package com.google.android.apps.wallet.data:
//            StringValidators

final class nit> extends StringValidators
{

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
        String s1 = StringValidators.access$300(s, 9, com.google.android.apps.walletnfcrel.ator_error_message_bank_routing_number_wrong_length, com.google.android.apps.walletnfcrel.ator_error_message_bank_routing_number_must_be_numeric, resources);
        if (!s1.equals(""))
        {
            return s1;
        }
        s1 = StringValidators.access$400(s, "^[0-4].*", com.google.android.apps.walletnfcrel.ator_error_message_invalid_routing_number, resources);
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
            return resources.getString(com.google.android.apps.walletnfcrel.ator_error_message_invalid_routing_number);
        } else
        {
            return "";
        }
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
