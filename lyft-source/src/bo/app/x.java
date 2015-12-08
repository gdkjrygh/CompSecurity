// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            bh, be, u

final class x extends BroadcastReceiver
{

    final be a;
    final u b;

    x(u u1, be be1)
    {
        b = u1;
        a = be1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        try
        {
            a.a(new bh(), bo/app/bh);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AppboyLogger.e(u.d(), "Failed to publish DataSyncEvent.", context);
        }
        intent = b;
        u.a(a, context);
    }
}
