// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.logging.Logger;

public final class ecx
{

    public final Resolver a;
    final ecw b;

    public ecx(Context context, ecw ecw1)
    {
        a = Cosmos.getResolver((Context)ctz.a(context));
        b = (ecw)ctz.a(ecw1);
        a.registerConnectionCallback(new com.spotify.cosmos.android.Resolver.ConnectionCallback() {

            final ecx a;

            public final void onServiceConnected(Resolver resolver)
            {
                a.a.connect();
                resolver = new Handler();
                a.a.subscribe(new Request("SUB", "sp://session/v2/state"), new com.spotify.cosmos.android.Resolver.CallbackReceiver(this, resolver) {

                    private _cls1 a;

                    protected final void onError(Throwable throwable)
                    {
                        Logger.b(throwable, " onError for session state request", new Object[0]);
                    }

                    protected final void onResolved(Response response)
                    {
                        response.getStatus();
                        JVM INSTR tableswitch 200 200: default 24
                    //                                   200 25;
                           goto _L1 _L2
_L1:
                        return;
_L2:
                        response = new String(response.getBody());
                        if (response.contains("true"))
                        {
                            a.a.b.a(true);
                            return;
                        }
                        if (response.contains("false"))
                        {
                            a.a.b.a(false);
                            return;
                        }
                        if (true) goto _L1; else goto _L3
_L3:
                    }

            
            {
                a = _pcls1;
                super(handler);
            }
                });
            }

            public final void onServiceConnectionFailed(Resolver resolver, com.spotify.cosmos.android.Resolver.ConnectionError connectionerror)
            {
                Logger.c(connectionerror.name(), new Object[] {
                    " Session state resolver connection failed"
                });
            }

            public final void onServiceDisconnected(Resolver resolver)
            {
            }

            
            {
                a = ecx.this;
                super();
            }
        });
    }
}
