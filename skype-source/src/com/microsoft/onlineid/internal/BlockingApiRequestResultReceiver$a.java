// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.app.PendingIntent;
import com.microsoft.onlineid.internal.sso.client.f;

// Referenced classes of package com.microsoft.onlineid.internal:
//            BlockingApiRequestResultReceiver

public final class <init>
{

    final BlockingApiRequestResultReceiver a;
    private final f b;
    private final Exception c;

    static Exception a(<init> <init>1)
    {
        return <init>1.c;
    }

    public final f a()
    {
        return b;
    }

    private (BlockingApiRequestResultReceiver blockingapirequestresultreceiver, PendingIntent pendingintent)
    {
        a = blockingapirequestresultreceiver;
        super();
        b = (new f()).a(pendingintent);
        c = null;
    }

    c(BlockingApiRequestResultReceiver blockingapirequestresultreceiver, PendingIntent pendingintent, byte byte0)
    {
        this(blockingapirequestresultreceiver, pendingintent);
    }

    private <init>(BlockingApiRequestResultReceiver blockingapirequestresultreceiver, Exception exception)
    {
        a = blockingapirequestresultreceiver;
        super();
        b = null;
        c = exception;
    }

    c(BlockingApiRequestResultReceiver blockingapirequestresultreceiver, Exception exception, byte byte0)
    {
        this(blockingapirequestresultreceiver, exception);
    }

    private <init>(BlockingApiRequestResultReceiver blockingapirequestresultreceiver, Object obj)
    {
        a = blockingapirequestresultreceiver;
        super();
        b = (new f()).a(obj);
        c = null;
    }

    c(BlockingApiRequestResultReceiver blockingapirequestresultreceiver, Object obj, byte byte0)
    {
        this(blockingapirequestresultreceiver, obj);
    }
}
