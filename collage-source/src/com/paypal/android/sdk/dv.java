// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.text.TextUtils;

// Referenced classes of package com.paypal.android.sdk:
//            dw, ef, du, dx

public abstract class dv extends dw
{

    public dv(du du, dx dx, ef ef1, String s)
    {
        this(du, dx, ef1, s, null);
    }

    public dv(du du, dx dx, ef ef1, String s, String s1)
    {
        super(du, dx, ef1, s1);
        if (!TextUtils.isEmpty(s))
        {
            a("Authorization", s);
        }
        a("User-Agent", f().b());
    }

    static 
    {
        com/paypal/android/sdk/dv.getSimpleName();
    }
}
