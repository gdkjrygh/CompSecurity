// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.Session;

// Referenced classes of package com.facebook.internal:
//            SessionTracker

private class <init> extends BroadcastReceiver
{

    final SessionTracker this$0;

    public void onReceive(Context context, Intent intent)
    {
        if ("com.facebook.sdk.ACTIVE_SESSION_SET".equals(intent.getAction()))
        {
            context = Session.getActiveSession();
            if (context != null)
            {
                context.addCallback(SessionTracker.access$0(SessionTracker.this));
            }
        }
    }

    private I()
    {
        this$0 = SessionTracker.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
