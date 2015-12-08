// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class kbt
    implements ServiceConnection
{

    private final int a;
    private kbo b;

    public kbt(kbo kbo1, int i)
    {
        b = kbo1;
        super();
        a = i;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        b.f(ibinder, "Expecting a valid IBinder");
        kbo.a(b, kcn.a(ibinder));
        componentname = b;
        int i = a;
        ((kbo) (componentname)).h.sendMessage(((kbo) (componentname)).h.obtainMessage(6, i, -1, new kbw(componentname)));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        b.h.sendMessage(b.h.obtainMessage(4, a, 1));
    }
}
