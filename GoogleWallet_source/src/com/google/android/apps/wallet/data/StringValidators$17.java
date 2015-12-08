// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.common.base.Strings;

// Referenced classes of package com.google.android.apps.wallet.data:
//            StringValidators

final class val.validator
    implements DataValidator
{

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
            return val$validator.validate(s, resources);
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

    ()
    {
        val$validator = datavalidator;
        super();
    }
}
