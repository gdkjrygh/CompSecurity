// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.wear.client:
//            WearMessageClient_

class val.data extends c
{

    final WearMessageClient_ this$0;
    final String val$data;
    final String val$uri;

    public void execute()
    {
        try
        {
            WearMessageClient_.access$101(WearMessageClient_.this, val$uri, val$data);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (String s1, String s2, String s3)
    {
        this$0 = final_wearmessageclient_;
        val$uri = s2;
        val$data = s3;
        super(final_s, I.this, s1);
    }
}
