// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import com.google.common.base.Strings;
import java.util.Arrays;
import java.util.List;

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
        String as[] = resources.getStringArray(com.google.android.apps.walletnfcrel.egions_codes);
        if (!Strings.isNullOrEmpty(s) && Arrays.asList(as).contains(s.toUpperCase()))
        {
            return "";
        } else
        {
            return resources.getString(com.google.android.apps.walletnfcrel.ator_error_message_invalid_state);
        }
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
