// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import com.google.android.apps.wallet.validator.DataValidator;
import java.util.Calendar;

// Referenced classes of package com.google.android.apps.wallet.data:
//            DateValidators

final class val.validator
    implements DataValidator
{

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
            return val$validator.validate(calendar, resources);
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

    r()
    {
        val$validator = datavalidator;
        super();
    }
}
