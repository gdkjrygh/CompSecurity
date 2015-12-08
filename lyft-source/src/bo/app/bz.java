// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            by, be

final class bz extends BroadcastReceiver
{

    final by a;

    bz(by by1)
    {
        a = by1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = ((Context) (by.a(a)));
        context;
        JVM INSTR monitorenter ;
        by.b(a);
_L1:
        return;
        intent;
        by.c(a).a(intent, java/lang/Throwable);
          goto _L1
        intent;
        AppboyLogger.e(by.f(), "Failed to log throwable.", intent);
          goto _L1
        intent;
        throw intent;
    }
}
