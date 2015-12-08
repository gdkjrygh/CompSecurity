// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class gr
    implements go, mau
{

    private gg a;
    private gt b;

    public gr()
    {
    }

    public gr(hq hq1)
    {
        a = gh.a((IBinder)hq1.a);
    }

    public final gt a()
    {
        if (b == null)
        {
            b = new gw(a);
        }
        return b;
    }

    public lzx a(jyw jyw)
    {
        return new mgg((lmi)jyw);
    }

    public final void a(gk gk1)
    {
        if (gk1 == null)
        {
            throw new IllegalArgumentException("callback may not be null.");
        }
        try
        {
            a.b((gd)gk.c(gk1));
            a.asBinder().unlinkToDeath(gk1, 0);
            gk.a(gk1, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (gk gk1)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in unregisterCallback. ")).append(gk1).toString());
        }
    }

    public final void a(gk gk1, Handler handler)
    {
        if (gk1 == null)
        {
            throw new IllegalArgumentException("callback may not be null.");
        }
        try
        {
            a.asBinder().linkToDeath(gk1, 0);
            a.a((gd)gk.c(gk1));
            gk.a(gk1, handler);
            gk.a(gk1, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in registerCallback. ")).append(handler).toString());
        }
        gk1.a();
    }

    public final ib b()
    {
        ib ib;
        try
        {
            ib = a.o();
        }
        catch (RemoteException remoteexception)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in getPlaybackState. ")).append(remoteexception).toString());
            return null;
        }
        return ib;
    }

    public final fw c()
    {
        fw fw;
        try
        {
            fw = a.n();
        }
        catch (RemoteException remoteexception)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in getMetadata. ")).append(remoteexception).toString());
            return null;
        }
        return fw;
    }
}
