// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.activities:
//            UserLoginActivity_

class val.password extends c
{

    final UserLoginActivity_ this$0;
    final String val$email;
    final String val$password;

    public void execute()
    {
        try
        {
            UserLoginActivity_.access$801(UserLoginActivity_.this, val$email, val$password);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (String s1, String s2, String s3)
    {
        this$0 = final_userloginactivity_;
        val$email = s2;
        val$password = s3;
        super(final_s, I.this, s1);
    }
}
