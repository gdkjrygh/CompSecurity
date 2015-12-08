// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.m4b.maps.j:
//            l, x

public final class a
    implements ServiceConnection
{

    private final int a;
    private l b;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        x.a(ibinder, "Expecting a valid IBinder");
        l.a(b, a(ibinder));
        componentname = b;
        int i = a;
        ((l) (componentname)).b.sendMessage(((l) (componentname)).b.obtainMessage(6, i, -1, new <init>(componentname)));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        b.b.sendMessage(b.b.obtainMessage(4, a, 1));
    }

    public (l l1, int i)
    {
        b = l1;
        super();
        a = i;
    }
}
