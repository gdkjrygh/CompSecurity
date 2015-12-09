// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.activities:
//            UserChangePassword_

class val.customerId extends c
{

    final UserChangePassword_ this$0;
    final String val$customerId;

    public void execute()
    {
        try
        {
            UserChangePassword_.access$901(UserChangePassword_.this, val$customerId);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int i, String s1, String s2)
    {
        this$0 = final_userchangepassword_;
        val$customerId = s2;
        super(String.this, i, s1);
    }
}
