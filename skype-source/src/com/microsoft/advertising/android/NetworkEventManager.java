// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.microsoft.advertising.android:
//            av

public class NetworkEventManager extends BroadcastReceiver
{
    public static interface a
    {

        public abstract void a();
    }


    private static NetworkEventManager c = null;
    ArrayList a;
    private Context b;

    private NetworkEventManager(Context context)
    {
        a = new ArrayList();
        b = null;
        b = context;
    }

    public static NetworkEventManager a(Context context)
    {
        com/microsoft/advertising/android/NetworkEventManager;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new NetworkEventManager(context.getApplicationContext());
        }
        context = c;
        com/microsoft/advertising/android/NetworkEventManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public final void a(a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        this;
        JVM INSTR monitorenter ;
        if (a.size() == 0)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            b.registerReceiver(this, intentfilter);
        }
        if (!a.contains(a1))
        {
            a.add(a1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void b(a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        this;
        JVM INSTR monitorenter ;
        if (!a.contains(a1)) goto _L2; else goto _L1
_L1:
        int i;
        a.remove(a1);
        i = a.size();
        if (i != 0) goto _L2; else goto _L3
_L3:
        b.unregisterReceiver(this);
_L4:
        c = null;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        av.c("NetworkEventManager", "Trying to remove non-existing network receiver");
          goto _L4
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) goto _L2; else goto _L1
_L1:
        context = a.iterator();
_L5:
        if (context.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((a)context.next()).a();
        if (true) goto _L5; else goto _L4
_L4:
    }

}
