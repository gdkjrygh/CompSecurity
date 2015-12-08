// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

public final class kzj extends kbo
    implements android.os.IBinder.DeathRecipient
{

    static final jwx a = new jwx("CastRemoteDisplayClientImpl");
    CastDevice b;
    private jux c;

    public kzj(Context context, Looper looper, kax kax, CastDevice castdevice, jux jux, jyq jyq, jys jys)
    {
        super(context, looper, 83, kax, jyq, jys);
        a.a("instance created", new Object[0]);
        c = jux;
        b = castdevice;
    }

    static jux a(kzj kzj1)
    {
        return kzj1.c;
    }

    static jwx f()
    {
        return a;
    }

    public final IInterface a(IBinder ibinder)
    {
        return kzp.a(ibinder);
    }

    public final void a()
    {
        Exception exception;
        a.a("disconnect", new Object[0]);
        c = null;
        b = null;
        try
        {
            ((kzo)o()).b();
        }
        catch (RemoteException remoteexception)
        {
            super.a();
            return;
        }
        finally
        {
            super.a();
        }
        super.a();
        return;
        throw exception;
    }

    public final void binderDied()
    {
    }

    protected final String c()
    {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

}
