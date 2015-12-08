// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.activities:
//            RegistrationActivity_

class val.enrollInLoyalty extends c
{

    final RegistrationActivity_ this$0;
    final String val$email;
    final boolean val$enrollInLoyalty;
    final String val$password;
    final boolean val$remember;

    public void execute()
    {
        try
        {
            RegistrationActivity_.access$601(RegistrationActivity_.this, val$email, val$password, val$remember, val$enrollInLoyalty);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (String s3, boolean flag, 
            boolean flag1)
    {
        this$0 = final_registrationactivity_;
        val$email = String.this;
        val$password = s3;
        val$remember = flag;
        val$enrollInLoyalty = flag1;
        super(final_s, final_i, final_s1);
    }
}
