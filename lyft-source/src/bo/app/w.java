// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            u, ac, be

final class w extends BroadcastReceiver
{

    final be a;
    final u b;

    w(u u1, be be)
    {
        b = u1;
        a = be;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        try
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            u.b(b).a(intent, context);
            b.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AppboyLogger.e(u.d(), "Failed to process connectivity event.", context);
        }
        intent = b;
        u.a(a, context);
    }
}
