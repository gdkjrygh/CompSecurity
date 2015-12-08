// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import java.util.Calendar;

// Referenced classes of package com.google.android.apps.wallet.data:
//            DateValidators

final class nit> extends DateValidators
{

    private static String validate(Calendar calendar, Resources resources)
    {
        if (calendar == null)
        {
            return resources.getString(com.google.android.apps.walletnfcrel.idator_error_message_enter_date);
        } else
        {
            return "";
        }
    }

    public final volatile boolean isValid(Object obj, Resources resources)
    {
        return super.isValid((Calendar)obj, resources);
    }

    public final volatile String validate(Object obj, Resources resources)
    {
        return validate((Calendar)obj, resources);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
