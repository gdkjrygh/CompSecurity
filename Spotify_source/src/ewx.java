// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.router.Response;

public final class ewx
{

    public DeferredResolver a;
    public Handler b;

    public ewx(DeferredResolver deferredresolver)
    {
        b = new Handler();
        a = (DeferredResolver)ctz.a(deferredresolver);
    }

    // Unreferenced inner class ewx$1

/* anonymous class */
    public final class _cls1 extends com.spotify.cosmos.android.Resolver.CallbackReceiver
    {

        private ewy a;

        protected final void onError(Throwable throwable)
        {
            a.a();
        }

        protected final void onResolved(Response response)
        {
            a.a(response);
        }

            public 
            {
                a = ewy1;
                super(handler);
            }
    }

}
