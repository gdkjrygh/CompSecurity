// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            bv, df

final class bw extends BroadcastReceiver
{

    final bv a;

    bw(bv bv1)
    {
        a = bv1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        try
        {
            AppboyLogger.i(bv.b(), String.format("Single location update received from %s: %s", new Object[] {
                intent.getStringExtra("origin"), intent.getAction()
            }));
            context = (Location)intent.getExtras().get("location");
            a.a(new df(context.getLatitude(), context.getLongitude(), Double.valueOf(context.getAltitude()), Double.valueOf(context.getAccuracy())));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AppboyLogger.e(bv.b(), "Failed to process location update.", context);
        }
    }
}
