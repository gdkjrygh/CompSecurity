// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;

// Referenced classes of package bo.app:
//            bp, cz

final class bq extends BroadcastReceiver
{

    final bp a;

    bq(bp bp1)
    {
        a = bp1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        try
        {
            bp.b();
            String.format("Single location update received from %s: %s", new Object[] {
                intent.getStringExtra("origin"), intent.getAction()
            });
            context = (Location)intent.getExtras().get("location");
            a.a(new cz(context.getLatitude(), context.getLongitude(), Double.valueOf(context.getAltitude()), Double.valueOf(context.getAccuracy())));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            bp.b();
        }
    }
}
