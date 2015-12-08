// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.receiver;

import Ck;
import Cl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.snapchat.android.Timber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConnectivityReceiver extends BroadcastReceiver
{

    private static IntentFilter a = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private final Cl b;

    public ConnectivityReceiver()
    {
        this(Cl.a());
    }

    private ConnectivityReceiver(Cl cl)
    {
        b = cl;
    }

    public final void a(Context context)
    {
        context.registerReceiver(this, a);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        intent = b;
        android.net.NetworkInfo networkinfo = ((Cl) (intent)).c;
        intent.c = context;
        Timber.c("NetworkStatusManager", "Network status changed from %s to %s", new Object[] {
            Cl.a(networkinfo), Cl.a(context)
        });
        System.currentTimeMillis();
        ArrayList arraylist = new ArrayList();
        synchronized (((Cl) (intent)).b)
        {
            arraylist.addAll(((Cl) (intent)).b);
        }
        for (intent = arraylist.iterator(); intent.hasNext(); ((Ck)intent.next()).a(context)) { }
        break MISSING_BLOCK_LABEL_127;
        context;
        list;
        JVM INSTR monitorexit ;
        throw context;
    }

}
