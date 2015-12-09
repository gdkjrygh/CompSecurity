// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.util;

import com.ford.syncV4.e.i;
import java.util.concurrent.atomic.AtomicInteger;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.fordsync.util:
//            ProxyImageHandler_

class val.imageReference extends c
{

    final ProxyImageHandler_ this$0;
    final AtomicInteger val$correlationId;
    final String val$imageReference;
    final i val$proxy;

    public void execute()
    {
        try
        {
            ProxyImageHandler_.access$001(ProxyImageHandler_.this, val$proxy, val$correlationId, val$imageReference);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (i j, AtomicInteger atomicinteger, String s2)
    {
        this$0 = final_proxyimagehandler_;
        val$proxy = j;
        val$correlationId = atomicinteger;
        val$imageReference = s2;
        super(final_s, final_i, String.this);
    }
}
