// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import java.util.Calendar;

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
        int i = Calendar.getInstance().get(1) - 2000;
        return StringValidators.access$200(s, i, i + 20, com.google.android.apps.walletnfcrel.ator_error_message_exp_year_is_past, com.google.android.apps.walletnfcrel.ator_error_message_exp_year_cannot_be_over, com.google.android.apps.walletnfcrel.ator_error_message_exp_year_must_be_numeric, resources);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
