// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class bsh
    implements ServiceConnection
{

    private final int a;
    private bsc b;

    public bsh(bsc bsc1, int i)
    {
        b = bsc1;
        super();
        a = i;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        btl.a(ibinder, "Expecting a valid IBinder");
        bsc.a(b, btb.a(ibinder));
        componentname = b;
        int i = a;
        ((bsc) (componentname)).h.sendMessage(((bsc) (componentname)).h.obtainMessage(6, i, -1, new bsk(componentname)));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        b.h.sendMessage(b.h.obtainMessage(4, a, 1));
    }
}
