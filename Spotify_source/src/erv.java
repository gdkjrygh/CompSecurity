// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResults;
import com.spotify.mobile.android.util.Assertion;

public final class erv
{

    public final Handler a;
    public final Resolver b;

    public erv(Resolver resolver, Handler handler)
    {
        Assertion.a(resolver);
        b = resolver;
        a = handler;
    }

    public final void a(erw erw, String s)
    {
        Assertion.a(erw);
        s = erx.a().appendPath("location").appendPath("suggest").appendQueryParameter("q", s).toString();
        b.resolve(RequestBuilder.get(s).build(), new JsonCallbackReceiver(a, com/spotify/mobile/android/spotlets/eventshub/locationsearch/model/Locations, erw) {

            private erw a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                a.a();
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (Locations)obj;
                a.a(response);
            }

            
            {
                a = erw1;
                super(handler, class1);
            }
        });
    }

    // Unreferenced inner class erv$1

/* anonymous class */
    public final class _cls1 extends JsonCallbackReceiver
    {

        private erw a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            a.a();
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (ConcertResults)obj;
            a.a(response);
        }

            public 
            {
                a = erw1;
                super(handler, class1);
            }
    }

}
