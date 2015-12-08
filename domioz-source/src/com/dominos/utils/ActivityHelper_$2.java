// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;


// Referenced classes of package com.dominos.utils:
//            ActivityHelper_, AlertType

class rtActionCallback
    implements Runnable
{

    final ActivityHelper_ this$0;
    final AlertType val$alertType;
    final rtActionCallback val$callback;
    final String val$domCommands[];
    final String val$extras;
    final String val$prompt;

    public void run()
    {
        ActivityHelper_.access$101(ActivityHelper_.this, val$alertType, val$extras, val$prompt, val$domCommands, val$callback);
    }

    rtActionCallback()
    {
        this$0 = final_activityhelper_;
        val$alertType = alerttype;
        val$extras = s;
        val$prompt = s1;
        val$domCommands = as;
        val$callback = rtActionCallback.this;
        super();
    }
}
