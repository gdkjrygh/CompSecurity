// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.remote.contoller;

import com.dominos.remote.client.RemoteOrderClient;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.remote.contoller:
//            RemoteOrderManager_

class val.client extends c
{

    final RemoteOrderManager_ this$0;
    final RemoteOrderClient val$client;

    public void execute()
    {
        try
        {
            RemoteOrderManager_.access$001(RemoteOrderManager_.this, val$client);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int i, String s1, RemoteOrderClient remoteorderclient)
    {
        this$0 = final_remoteordermanager_;
        val$client = remoteorderclient;
        super(String.this, i, s1);
    }
}
