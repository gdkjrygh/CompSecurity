// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;

public final class eyd
    implements eyb
{

    private final Context a;
    private Handler b;
    private String c;

    public eyd(Context context, String s)
    {
        a = context;
        b = new Handler(context.getMainLooper());
        c = s;
    }

    public final void a(String s, eyc eyc)
    {
        com.spotify.cosmos.android.DeferredResolver deferredresolver = Cosmos.getResolver(a);
        deferredresolver.resolve(new Request("PUT", String.format("hm://opt-in/%s/%s", new Object[] {
            Uri.encode(s), Uri.encode(c)
        })), new HttpCallbackReceiver(b, eyc, deferredresolver) {

            private eyc a;
            private Resolver b;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                a.b();
                b.destroy();
            }

            protected final void onResolved(Response response, Object obj)
            {
                a.a();
                b.destroy();
            }

            protected final Object parseResponse(Response response)
            {
                return response;
            }

            
            {
                a = eyc1;
                b = resolver;
                super(handler);
            }
        });
    }
}
