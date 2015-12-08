// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;

public abstract class epe
{

    fip a;
    public String b;
    public gfp c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public Integer i;
    public Integer j;
    private Handler k;
    private final ObjectMapper l;
    private final ObjectMapper m;
    private final Resolver n;
    private Subscription o;

    public epe(Context context, Resolver resolver)
    {
        n = resolver;
        k = new Handler(context.getMainLooper());
        l = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        m = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL).a();
    }

    private void a(String s, JacksonModel jacksonmodel, boolean flag, boolean flag1)
    {
        {
            Object obj;
            HttpCallbackReceiver httpcallbackreceiver;
            if (flag1)
            {
                obj = "DELETE";
            } else
            {
                obj = "POST";
            }
            httpcallbackreceiver = new HttpCallbackReceiver(k) {

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    throwable.getMessage();
                }

                protected final volatile void onResolved(Response response, Object obj1)
                {
                    response = (String)obj1;
                }

                protected final Object parseResponse(Response response)
                {
                    return new String(response.getBody());
                }

            };
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            try
            {
                s = RequestBuilder.delete(s).build();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.getMessage();
                return;
            }
        }
        if (jacksonmodel == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        obj = l;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj = m;
        s.setBody(((ObjectMapper) (obj)).writeValueAsBytes(jacksonmodel));
        n.resolve(s, httpcallbackreceiver);
        return;
        s = RequestBuilder.post(s).build();
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_35;
        }
    }

    public abstract fip a(byte abyte0[]);

    public final void a()
    {
        if (o != null)
        {
            o.unsubscribe();
        }
    }

    public final void a(Bundle bundle)
    {
        fip fip1 = a;
        if (a != null)
        {
            bundle.putByteArray("model", a(a));
        }
    }

    public final void a(Bundle bundle, epg epg1)
    {
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        try
        {
            bundle = bundle.getByteArray("model");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.getMessage();
            Assertion.a(bundle);
            return;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        bundle = a(((byte []) (bundle)));
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (!bundle.isLoading())
        {
            epg1.a(bundle);
        }
    }

    public final void a(gfp gfp)
    {
        c = gfp;
    }

    public final void a(Integer integer, Integer integer1)
    {
        i = integer;
        j = integer1;
    }

    public final void a(String s)
    {
        a(s, ((JacksonModel) (null)), false, true);
    }

    public final void a(String s, JacksonModel jacksonmodel, boolean flag)
    {
        a(s, jacksonmodel, flag, false);
    }

    public final void a(String s, Policy policy, epg epg1, boolean flag)
    {
        String s1;
        if (flag)
        {
            s1 = "SUB";
        } else
        {
            s1 = "GET";
        }
        if (flag)
        {
            s = RequestBuilder.subscribe(s).build();
        } else
        {
            s = RequestBuilder.get(s).build();
        }
        if (policy != null)
        {
            try
            {
                s.setBody(l.writeValueAsBytes(policy));
            }
            // Misplaced declaration of an exception variable
            catch (Policy policy)
            {
                epg1.a(policy.getMessage());
            }
        }
        policy = new HttpCallbackReceiver(k, epg1) {

            private epg a;
            private epe b;

            private fip a(Response response)
            {
                try
                {
                    response = b.b(response.getBody());
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
                throwable.getMessage();
                a.a(throwable.getMessage());
            }

            protected final void onResolved(Response response, Object obj)
            {
                obj = (fip)obj;
                int i1 = response.getBody().length;
                i1 = ((epq[])((fip) (obj)).getItems()).length;
                b.a = ((fip) (obj));
                a.a(obj);
            }

            protected final Object parseResponse(Response response)
            {
                return a(response);
            }

            
            {
                b = epe.this;
                a = epg1;
                super(handler);
            }
        };
        if (flag)
        {
            a();
            o = n.subscribe(s, policy);
            return;
        } else
        {
            n.resolve(s, policy);
            return;
        }
    }

    public final void a(String s, epg epg1, Policy policy)
    {
        a(s, policy, epg1, false);
    }

    public final void a(boolean flag, boolean flag1, boolean flag2)
    {
        d = flag;
        e = flag1;
        f = flag2;
    }

    public abstract byte[] a(fip fip1);

    public abstract fip b(byte abyte0[]);

    public final void b(String s)
    {
        b = s;
    }

    public final void b(String s, epg epg1, Policy policy)
    {
        a(s, policy, epg1, true);
    }

    public final void b(boolean flag)
    {
        g = flag;
    }

    public final void c(boolean flag)
    {
        h = flag;
    }
}
