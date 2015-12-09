// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.logging.Logger;

public final class fso
    implements fsp
{

    fsl a;
    private final Resolver b;
    private final Handler c = new Handler();
    private final ObjectMapper d;

    public fso(Resolver resolver, fsl fsl1)
    {
        b = resolver;
        a = fsl1;
        d = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a(SerializationFeature.WRAP_ROOT_VALUE, true).a(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL).a();
        d.reader().withRootName("offer");
    }

    public final void a()
    {
        c.removeCallbacksAndMessages(null);
        b.destroy();
    }

    public final void a(fsq fsq)
    {
        if (a.b())
        {
            b.resolve(new Request("GET", "hm://payment-iap/upsell/1/promoted_intro_offer"), new JsonCallbackReceiver(c, com/spotify/mobile/android/ui/activity/upsell/model/Offer, d, fsq) {

                private fsq a;
                private fso b;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    Logger.b(throwable, "OfferCosmosDataStore could not find offer", new Object[0]);
                    b.a.a();
                    errorcause = a;
                    throwable.getMessage();
                    errorcause.a();
                }

                protected final void onResolved(Response response, Object obj)
                {
                    response = (Offer)obj;
                    b.a.a(response);
                    a.a(response);
                }

            
            {
                b = fso.this;
                a = fsq1;
                super(handler, class1, objectmapper);
            }
            });
            return;
        } else
        {
            a.a(new fsm(fsq) {

                private fsq a;

                public final void a()
                {
                    a.a();
                }

                public final void a(Offer offer)
                {
                    a.a(offer);
                }

            
            {
                a = fsq1;
                super();
            }
            });
            return;
        }
    }
}
