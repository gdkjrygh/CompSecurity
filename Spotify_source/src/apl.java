// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.Session;

final class apl extends BroadcastReceiver
{

    private apk a;

    private apl(apk apk1)
    {
        a = apk1;
        super();
    }

    apl(apk apk1, byte byte0)
    {
        this(apk1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("com.facebook.sdk.ACTIVE_SESSION_SET".equals(intent.getAction()))
        {
            context = Session.g();
            if (context != null && a.a != null)
            {
                context.a(a.a);
            }
        } else
        if ("com.facebook.sdk.ACTIVE_SESSION_UNSET".equals(intent.getAction()))
        {
            context = Session.g();
            if (context != null && a.a != null)
            {
                context.b(a.a);
                return;
            }
        }
    }
}
