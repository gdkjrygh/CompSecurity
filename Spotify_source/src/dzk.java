// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;

public final class dzk
{

    final dzm a;
    public Resolver b;
    final Context c;
    public com.spotify.cosmos.android.Resolver.ConnectionCallback d;
    public com.spotify.cosmos.android.Resolver.CallbackReceiver e;
    public com.spotify.cosmos.android.Resolver.CallbackReceiver f;

    public dzk(Context context, dzm dzm)
    {
        d = new com.spotify.cosmos.android.Resolver.ConnectionCallback() {

            private dzk a;

            public final void onServiceConnected(Resolver resolver)
            {
                a.a.a();
            }

            public final void onServiceConnectionFailed(Resolver resolver, com.spotify.cosmos.android.Resolver.ConnectionError connectionerror)
            {
                a.a.b();
            }

            public final void onServiceDisconnected(Resolver resolver)
            {
            }

            
            {
                a = dzk.this;
                super();
            }
        };
        e = new com.spotify.cosmos.android.Resolver.CallbackReceiver() {

            private dzk a;

            protected final void onError(Throwable throwable)
            {
                a.a.e();
            }

            protected final void onResolved(Response response)
            {
                String s = new String(response.getBody());
                response.getStatus();
                if ("false".equalsIgnoreCase(s))
                {
                    a.a.d();
                    return;
                } else
                {
                    a.a.c();
                    return;
                }
            }

            
            {
                a = dzk.this;
                super(null);
            }
        };
        f = new com.spotify.cosmos.android.Resolver.CallbackReceiver() {

            private dzk a;

            protected final void onError(Throwable throwable)
            {
                a.a.h();
            }

            protected final void onResolved(Response response)
            {
                a.a.g();
            }

            
            {
                a = dzk.this;
                super(null);
            }
        };
        c = context;
        a = dzm;
        b = Cosmos.getResolver(context);
    }
}
