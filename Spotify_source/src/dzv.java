// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class dzv
{

    final Context a;
    public Subscription b;
    public Subscription c;
    public Subscription d;
    public DeferredResolver e;
    fnm f;
    public Player g;
    private Handler h;

    public dzv(Context context, Looper looper, fnm fnm)
    {
        a = context;
        e = Cosmos.getResolver(context);
        f = fnm;
        h = new Handler(looper);
        g = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(e, "", FeatureIdentifier.b, FeatureIdentifier.b);
    }

    public final Subscription a(eek eek1, dzw dzw)
    {
        dzw = new JsonHttpCallbackReceiver(h, com/spotify/mobile/android/spotlets/ads/model/AdEvent, eek1, dzw) {

            private eek a;
            private dzw b;
            private dzv c;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.b(throwable, "Error receiving %s = %s", new Object[] {
                    a.getSubEvent(), errorcause
                });
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (AdEvent)obj;
                Logger.a("pub %s %s %s %s", new Object[] {
                    response.getFormat(), response.getAd().getAdType(), response.getEvent(), response
                });
                obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.an, a.getSubEvent());
                dmz.a(fop);
                fop.a(c.a, ViewUri.bN, ((ClientEvent) (obj)));
                ctz.a(response);
                if (b != null)
                {
                    b.a(response, c.a);
                }
            }

            
            {
                c = dzv.this;
                a = eek1;
                b = dzw1;
                super(handler, class1);
            }
        };
        dzw = e.subscribe(eek1.getCosmosEndpoint(), dzw);
        if (dzw != null)
        {
            Logger.a("subscribed to %s", new Object[] {
                eek1.getCosmosEndpoint()
            });
            return dzw;
        } else
        {
            Logger.c("failed to subscribe to %s", new Object[] {
                eek1.getCosmosEndpoint()
            });
            return dzw;
        }
    }

    public final boolean a(AdSlot adslot)
    {
        com.spotify.cosmos.router.Request request = null;
        com.spotify.cosmos.router.Request request1 = RequestBuilder.post("sp://ads/v1/adslots", adslot).build();
        request = request1;
_L2:
        return e.resolve(request, new com.spotify.cosmos.android.Resolver.CallbackReceiver(h, adslot) {

            private AdSlot a;
            private dzv b;

            protected final void onError(Throwable throwable)
            {
                Logger.c("error registering %s", new Object[] {
                    a.getSubEvent()
                });
            }

            protected final void onResolved(Response response)
            {
                Logger.a("registered adslot %s", new Object[] {
                    a.getSubEvent()
                });
                response = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.am, a.getSubEvent());
                dmz.a(fop);
                fop.a(b.a, ViewUri.bN, response);
                a.onRegistered(b.f);
            }

            
            {
                b = dzv.this;
                a = adslot;
                super(handler);
            }
        });
        ParserException parserexception;
        parserexception;
        Logger.c("could not parse endpoint %s %s", new Object[] {
            adslot.getSlotId(), parserexception
        });
        if (true) goto _L2; else goto _L1
_L1:
    }
}
