// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Map;

public class gnq
    implements dmx
{

    private final de a;
    private final Map b = new HashMap();
    private final Context c;

    public gnq(Context context)
    {
        c = context;
        a = de.a(context);
    }

    public final Intent a(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        String s = intentfilter.getAction(0);
        Intent intent = (Intent)b.get(s);
        if (broadcastreceiver != null)
        {
            a.a(broadcastreceiver, intentfilter);
            if (b.containsKey(s))
            {
                broadcastreceiver.onReceive(c, intent);
            }
        }
        return intent;
    }

    public final void a(BroadcastReceiver broadcastreceiver)
    {
        a.a(broadcastreceiver);
    }

    public final boolean a(Intent intent)
    {
        b.put(intent.getAction(), intent);
        return a.a(intent);
    }
}
