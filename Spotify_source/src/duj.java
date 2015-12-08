// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class duj
    implements hey
{

    final Context a;
    private final Intent b;

    public duj(Context context, Intent intent)
    {
        a = context;
        b = intent;
    }

    public final void a(Object obj)
    {
        ServiceConnection serviceconnection;
        obj = (hff)obj;
        geh.b("Must subscribe to service binding on main thread!");
        serviceconnection = new ServiceConnection(((hff) (obj))) {

            private hff a;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                a.onNext(ibinder);
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
                a.onNext(null);
            }

            
            {
                a = hff1;
                super();
            }
        };
        if (!dvk.a(a, b, serviceconnection, "ServiceObservable"))
        {
            ((hff) (obj)).onError(new Exception((new StringBuilder("Failed to bind to service using intent: ")).append(b.toString()).toString()));
            return;
        }
        try
        {
            ((hff) (obj)).add(new cvx(serviceconnection, ((hff) (obj))) {

                private ServiceConnection a;
                private hff b;
                private duj c;

                protected final void a()
                {
                    dvk.a(c.a, a, "ServiceObservable");
                    b.onCompleted();
                }

            
            {
                c = duj.this;
                a = serviceconnection;
                b = hff1;
                super();
            }
            });
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            if (!((hff) (obj)).isUnsubscribed())
            {
                ((hff) (obj)).onError(runtimeexception);
            }
        }
        return;
    }
}
