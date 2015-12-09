// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            ar, cb

final class as extends BroadcastReceiver
{

    final ar a;

    as(ar ar1)
    {
        a = ar1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        try
        {
            com.appboy.f.a.b(ar.b(), String.format("Single location update received from %s: %s", new Object[] {
                intent.getStringExtra("origin"), intent.getAction()
            }));
            context = (Location)intent.getExtras().get("location");
            a.a(new cb(context.getLatitude(), context.getLongitude(), Double.valueOf(context.getAltitude()), Double.valueOf(context.getAccuracy())));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.appboy.f.a.c(ar.b(), "Failed to process location update.", context);
        }
    }
}
