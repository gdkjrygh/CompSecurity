// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.data;

import android.content.res.Resources;

// Referenced classes of package com.google.android.apps.wallet.data:
//            StringValidators

final class it> extends StringValidators
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
        return StringValidators.access$300(s, 2, com.google.android.apps.walletnfcrel.tor_error_message_ssn_wrong_length, com.google.android.apps.walletnfcrel.tor_error_message_ssn_must_be_numeric, resources);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
