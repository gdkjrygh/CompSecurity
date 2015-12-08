// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class d
    implements ServiceConnection
{

    public boolean a;
    public final BlockingQueue b = new LinkedBlockingQueue();

    public d()
    {
        a = false;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        b.add(ibinder);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }
}
