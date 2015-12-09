// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;
import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if (Patterns.EMAIL_ADDRESS.matcher(s).matches())
        {
            return "";
        } else
        {
            return resources.getString(com.google.android.apps.walletnfcrel.ator_error_message_email);
        }
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
