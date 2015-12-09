// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.validator;

import android.content.res.Resources;

// Referenced classes of package com.google.android.apps.wallet.validator:
//            DataValidator, Validators

final class val.second
    implements DataValidator
{

    final DataValidator val$first;
    final DataValidator val$second;

    public final boolean isValid(Object obj, Resources resources)
    {
        return "".equals(validate(obj, resources));
    }

    public final String validate(Object obj, Resources resources)
    {
        String s = val$first.validate(obj, resources);
        if (!"".equals(s))
        {
            return s;
        }
        obj = val$second.validate(obj, resources);
        if (!"".equals(obj))
        {
            return ((String) (obj));
        } else
        {
            return "";
        }
    }

    ()
    {
        val$first = datavalidator;
        val$second = datavalidator1;
        super();
    }
}
