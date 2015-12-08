// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import com.ford.syncV4.e.c.af;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.fordsync.service:
//            ProxyListener_

class val.notification extends c
{

    final ProxyListener_ this$0;
    final af val$notification;

    public void execute()
    {
        try
        {
            ProxyListener_.access$201(ProxyListener_.this, val$notification);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int i, String s1, af af)
    {
        this$0 = final_proxylistener_;
        val$notification = af;
        super(String.this, i, s1);
    }
}
