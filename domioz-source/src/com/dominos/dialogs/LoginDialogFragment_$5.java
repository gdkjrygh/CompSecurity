// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment_

class val.password extends c
{

    final LoginDialogFragment_ this$0;
    final String val$password;

    public void execute()
    {
        try
        {
            LoginDialogFragment_.access$401(LoginDialogFragment_.this, val$password);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int i, String s1, String s2)
    {
        this$0 = final_logindialogfragment_;
        val$password = s2;
        super(String.this, i, s1);
    }
}
