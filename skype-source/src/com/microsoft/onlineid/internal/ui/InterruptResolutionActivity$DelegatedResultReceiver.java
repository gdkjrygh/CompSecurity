// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.app.PendingIntent;
import android.os.Handler;
import com.microsoft.onlineid.internal.ApiRequestResultReceiver;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            InterruptResolutionActivity

private static abstract class  extends ApiRequestResultReceiver
{

    protected InterruptResolutionActivity a;

    protected final void a()
    {
        if (a != null)
        {
            a.a();
        }
    }

    protected final void a(PendingIntent pendingintent)
    {
        if (a != null)
        {
            a.a(pendingintent);
        }
    }

    public final void a(InterruptResolutionActivity interruptresolutionactivity)
    {
        a = interruptresolutionactivity;
    }

    protected final void a(Exception exception)
    {
        if (a != null)
        {
            a.a(exception);
        }
    }

    public ()
    {
        super(new Handler());
    }
}
