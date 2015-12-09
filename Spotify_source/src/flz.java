// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.sso.bakery.Cookie;
import java.net.HttpCookie;

public final class flz
{

    public final DeferredResolver a;
    public final Handler b = new Handler();

    public flz(Context context)
    {
        a = Cosmos.getResolver(context);
    }

    // Unreferenced inner class flz$1

/* anonymous class */
    public final class _cls1 extends JsonCallbackReceiver
    {

        private fma a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            a.a(throwable);
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (Cookie)obj;
            obj = new HttpCookie(((Cookie) (response)).name, ((Cookie) (response)).value);
            ((HttpCookie) (obj)).setDomain(((Cookie) (response)).domain);
            ((HttpCookie) (obj)).setMaxAge(((Cookie) (response)).maxAge);
            ((HttpCookie) (obj)).setSecure(((Cookie) (response)).secure);
            a.a(((HttpCookie) (obj)));
        }

            public 
            {
                a = fma1;
                super(handler, class1);
            }
    }

}
