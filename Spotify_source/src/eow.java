// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.DelegableParsingCallbackReceiver;
import com.spotify.mobile.android.cosmos.parser.ResponseParser;

final class eow extends eqm
    implements ResponseParser
{

    final com.spotify.cosmos.android.Resolver.CallbackReceiver a;
    final eov b;

    eow(eov eov1)
    {
        b = eov1;
        super();
        a = new DelegableParsingCallbackReceiver(eov.a(eov1), this) {

            private eow a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                if (((eqm) (a)).c)
                {
                    return;
                } else
                {
                    eow eow1 = a;
                    com.spotify.mobile.android.spotlets.common.datasource.CosmosError.Reason.a((com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause)ctz.a(errorcause));
                    eow.c(eow1, com.spotify.mobile.android.spotlets.common.datasource.CosmosError.Reason.a(throwable));
                    return;
                }
            }

            protected final void onResolved(Response response, Object obj)
            {
                if (((eqm) (a)).c)
                {
                    return;
                }
                if (obj != null)
                {
                    eow.a(a, obj);
                    return;
                } else
                {
                    response = a;
                    obj = com.spotify.mobile.android.spotlets.common.datasource.CosmosError.Reason.b;
                    eow.b(response, com.spotify.mobile.android.spotlets.common.datasource.CosmosError.Reason.a(new Exception("Empty response!")));
                    return;
                }
            }

            
            {
                a = eow.this;
                super(handler, responseparser);
            }
        };
    }

    static void a(eow eow1, Object obj)
    {
        eow1.c(obj);
    }

    static void b(eow eow1, Object obj)
    {
        eow1.d(obj);
    }

    static void c(eow eow1, Object obj)
    {
        eow1.d(obj);
    }

    protected final void a()
    {
    }

    public final Object parseResponse(Response response)
    {
        if (super.c)
        {
            return null;
        } else
        {
            return eov.b(b).parseResponse(response);
        }
    }
}
