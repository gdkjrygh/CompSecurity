// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.common.decorator.UpdateModel;
import com.spotify.mobile.android.util.Assertion;
import java.util.Map;

public abstract class epa
    implements epb
{

    final epc a;
    public boolean b;
    private Handler c;
    private final Resolver d;
    private final ObjectMapper e;

    public epa(Context context, Resolver resolver, epc epc1)
    {
        this(context, resolver, epc1, (byte)0);
    }

    private epa(Context context, Resolver resolver, epc epc1, byte byte0)
    {
        ctz.a(context);
        ctz.a(epc1);
        ctz.a(resolver);
        a = epc1;
        e = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        c = new Handler(context.getMainLooper());
        d = resolver;
    }

    private transient Subscription a(boolean flag, String as[])
    {
        ctz.a(as);
        Object obj;
        HttpCallbackReceiver httpcallbackreceiver;
        boolean flag1;
        if (as.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertion.a(flag1, "There must be at least one uri to get()/subscribe()");
        httpcallbackreceiver = new HttpCallbackReceiver(c) {

            private epa a;

            private Map a(Response response)
            {
                try
                {
                    response = a.a(response.getBody());
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    throw new com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ParserException(response);
                }
                return response;
            }

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                a.a.a(throwable);
            }

            protected final void onResolved(Response response, Object obj1)
            {
                response = (Map)obj1;
                a.a.a(response);
            }

            protected final Object parseResponse(Response response)
            {
                return a(response);
            }

            
            {
                a = epa.this;
                super(handler);
            }
        };
        try
        {
            obj = a();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            a.a(as);
            return null;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        obj = RequestBuilder.subscribe(((String) (obj))).build();
_L1:
        as = new UpdateModel(as, null);
        ((Request) (obj)).setBody(e.writeValueAsBytes(as));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        return d.subscribe(((Request) (obj)), httpcallbackreceiver);
        obj = RequestBuilder.get(((String) (obj))).build();
          goto _L1
        d.resolve(((Request) (obj)), httpcallbackreceiver);
        return null;
    }

    public final transient Subscription a(String as[])
    {
        return a(true, as);
    }

    public abstract String a();

    public abstract Map a(byte abyte0[]);

    public final void b()
    {
        b = true;
    }

    public final transient void b(String as[])
    {
        a(false, as);
    }
}
