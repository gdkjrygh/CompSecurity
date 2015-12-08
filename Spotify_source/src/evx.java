// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.mobile.android.util.SpotifyError;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class evx extends BroadcastReceiver
{

    private Set a;

    public evx()
    {
        a = Collections.synchronizedSet(new HashSet());
    }

    public static void a(Context context, evx evx1)
    {
        context.registerReceiver(evx1, new IntentFilter("com.spotify.mobile.android.service.broadcast.session.OFFLINE_SYNC_ERROR"));
    }

    public static void b(Context context, evx evx1)
    {
        context.unregisterReceiver(evx1);
    }

    public final void a(evy evy1)
    {
        evy1 = (evy)cvp.a(evy1);
        a.add(evy1);
    }

    public final void b(evy evy1)
    {
        a.remove(evy1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = SpotifyError.a(intent.getIntExtra("error_code", SpotifyError.a.mCode));
        for (intent = a.iterator(); intent.hasNext(); ((evy)intent.next()).a(context)) { }
    }
}
