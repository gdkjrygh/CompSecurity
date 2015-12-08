// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.text.TextUtils;

public class jd extends jq.a
{

    private Account CR;

    public jd(Account account)
    {
        CR = account;
    }

    public static jd aT(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = new Account(s, "com.google");
        }
        return new jd(s);
    }

    public Account hk()
    {
        return CR;
    }
}
