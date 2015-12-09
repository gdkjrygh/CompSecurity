// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.Session;

final class arm extends BroadcastReceiver
{

    private arl a;

    private arm(arl arl1)
    {
        a = arl1;
        super();
    }

    arm(arl arl1, byte byte0)
    {
        this(arl1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("com.facebook.sdk.ACTIVE_SESSION_SET".equals(intent.getAction()))
        {
            context = Session.g();
            if (context != null)
            {
                context.a(a.a);
            }
        }
    }
}
