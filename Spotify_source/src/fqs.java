// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.payment.iap.proto.GoogleIAPProceedPurchaseRequest;
import com.spotify.payment.iap.proto.GoogleIAPProceedPurchaseResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class fqs
    implements Runnable
{

    private static final gfa e;
    private static final gfa f;
    private static final gfa g;
    final Context a;
    final gey b;
    final gfi c;
    DeferredResolver d;
    private final fqt h;
    private final gxt i = new gxt(new Class[0]);
    private fqx j;
    private boolean k;
    private boolean l;

    public fqs(Context context, fqt fqt1)
    {
        a = context;
        h = fqt1;
        context = new gez("gpiab-register-purchases", this);
        context.a = e;
        context.c = f;
        context.d = 10;
        context.e = g;
        b = context.a();
        c = new gfi(a, new fqu(this));
    }

    static gxt a(fqs fqs1)
    {
        return fqs1.i;
    }

    static void a(fqs fqs1, boolean flag)
    {
        fqs1.h.a(fqs1.j, flag);
        fqs1.j = null;
        if (flag)
        {
            fqs1.b();
        } else
        {
            fqs1.b.e();
            if (fqs1.b.f())
            {
                fqs1.d.destroy();
                return;
            }
        }
    }

    static fqx b(fqs fqs1)
    {
        return fqs1.j;
    }

    private void b()
    {
        boolean flag;
        if (j == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "field should be null");
        l = false;
        j = h.a();
        if (j != null)
        {
            Logger.a("Register purchase (%s)", new Object[] {
                j.b
            });
            Request request = new Request("POST", "hm://payment-iap/googleplay/1/google_proceed_payment/", new HashMap(), (new com.spotify.payment.iap.proto.GoogleIAPProceedPurchaseRequest.Builder()).response_code(Integer.valueOf(0)).purchase_data(j.c).data_signature(j.d).build().a());
            d.resolve(request, new HttpCallbackReceiver(new Handler(Looper.getMainLooper())) {

                private fqs a;

                private GoogleIAPProceedPurchaseResponse a(Response response)
                {
                    try
                    {
                        response = (GoogleIAPProceedPurchaseResponse)fqs.a(a).a(response.getBody(), com/spotify/payment/iap/proto/GoogleIAPProceedPurchaseResponse);
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
                    ctz.a(fqs.b(a));
                    Logger.b(throwable, "Failed posting", new Object[0]);
                    fqs.a(a, false);
                }

                protected final void onResolved(Response response, Object obj)
                {
                    boolean flag1 = true;
                    response = (GoogleIAPProceedPurchaseResponse)obj;
                    ctz.a(fqs.b(a));
                    if (((GoogleIAPProceedPurchaseResponse) (response)).success == null || !((GoogleIAPProceedPurchaseResponse) (response)).success.booleanValue())
                    {
                        Logger.c("Registration was not successful", new Object[0]);
                        flag1 = false;
                    } else
                    {
                        Logger.a("Purchase (%s) registration success", new Object[] {
                            fqs.b(a).b
                        });
                    }
                    fqs.a(a, flag1);
                }

                protected final Object parseResponse(Response response)
                {
                    return a(response);
                }

            
            {
                a = fqs.this;
                super(handler);
            }
            });
            return;
        } else
        {
            Logger.a("No more purchases to register", new Object[0]);
            h.b();
            return;
        }
    }

    static void b(fqs fqs1, boolean flag)
    {
        fqs1.k = flag;
        if (fqs1.k && fqs1.l)
        {
            Logger.a("Connected. Continue registration", new Object[0]);
            fqs1.b();
        }
    }

    public final void a()
    {
        c.b();
        b.c();
        d.destroy();
    }

    public final void run()
    {
        if (k)
        {
            b();
            return;
        } else
        {
            Logger.a("Not connected. Defer registration", new Object[0]);
            l = true;
            return;
        }
    }

    static 
    {
        e = new gfd(1L, TimeUnit.SECONDS);
        f = new gfe(10L, 30L, TimeUnit.MINUTES);
        g = new gfe(8L, 14L, TimeUnit.HOURS);
    }
}
