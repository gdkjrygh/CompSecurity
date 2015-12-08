// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

final class jvc
    implements ServiceConnection
{

    private String a;
    private CastDevice b;
    private jvk c;
    private Context d;
    private jvj e;

    jvc(String s, CastDevice castdevice, jvk jvk, Context context, jvj jvj1)
    {
        a = s;
        b = castdevice;
        c = jvk;
        d = context;
        e = jvj1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = ((jvm)ibinder).a;
        if (componentname != null && jva.a(componentname, a, b, c, d, this, e))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        jva.b().d("Connected but unable to get the service instance", new Object[0]);
        e.a(new Status(2200));
        jva.c().set(false);
        d.unbindService(this);
        return;
        componentname;
        jva.b().a("No need to unbind service, already unbound", new Object[0]);
        return;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        jva.b().a("onServiceDisconnected", new Object[0]);
        e.a(new Status(2201, "Service Disconnected"));
        jva.c().set(false);
        try
        {
            d.unbindService(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            jva.b().a("No need to unbind service, already unbound", new Object[0]);
        }
    }
}
