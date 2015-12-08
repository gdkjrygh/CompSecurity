// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            UserChangePassword

class Callback extends com.dominos.utils.ctionCallback
{

    final UserChangePassword this$0;

    public void onAlertDismissed()
    {
        finish();
    }

    Callback()
    {
        this$0 = UserChangePassword.this;
        super();
    }
}
