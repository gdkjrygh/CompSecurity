// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.common.datasource.CosmosError;
import com.spotify.mobile.android.spotlets.search.model.offline.OfflineResults;
import java.util.List;

public final class ffx
    implements eox
{

    private static final ghl a = new ghl() {

        public final Object a(Object obj)
        {
            obj = (eqv)obj;
            ctz.b(((eqw)((eqv) (obj)).a.get(0)).b.b());
            return (CosmosError)((eqw)((eqv) (obj)).a.get(0)).b.c();
        }

    };
    private final ghl b;
    private final ghl c;
    private final eou d;
    private final eou e;

    private ffx(Resolver resolver, Class class1, ghl ghl1, ghl ghl2, Handler handler)
    {
        d = eou.a(class1, resolver, handler);
        e = eou.a(com/spotify/mobile/android/spotlets/search/model/offline/OfflineResults, resolver, handler);
        b = ghl1;
        c = ghl2;
    }

    public static eox a(Resolver resolver, Class class1, ghl ghl1, ghl ghl2, Handler handler)
    {
        return new ffx((Resolver)ctz.a(resolver), (Class)ctz.a(class1), (ghl)ctz.a(ghl1), (ghl)ctz.a(ghl2), (Handler)ctz.a(handler));
    }

    public final eqm a(Object obj)
    {
        Object obj1 = (ffv)obj;
        if (!ffv.a(((ffv) (obj1)).b))
        {
            eou eou1 = e;
            ((ffv) (obj1)).a();
            boolean flag;
            if (!ffv.a(((ffv) (obj1)).b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.b(flag, "Cannot create offline request based on raw request!");
            if (((ffv) (obj1)).e != null)
            {
                obj = ((ffv) (obj1)).e;
            } else
            {
                obj = RequestBuilder.get((new android.net.Uri.Builder()).scheme("sp").authority("offlinesearch").path("/v1").appendQueryParameter("query", ((ffv) (obj1)).a).appendQueryParameter("include_synced", String.valueOf(((ffv) (obj1)).c)).appendQueryParameter("limit", "-1").toString()).setHermesCacheIdentifier(((ffv) (obj1)).g.a()).build();
                obj1.e = ((com.spotify.cosmos.router.Request) (obj));
            }
            obj = eou1.a(((com.spotify.cosmos.router.Request) (obj)), 32000L).a(b, ghk.a());
            if (((ffv) (obj1)).c)
            {
                return ((eqm) (obj));
            } else
            {
                equ equ1 = new equ();
                obj1 = d.a(((ffv) (obj1)).b(), 32000L);
                equ1.a.c(obj1);
                equ1.b.c(obj);
                return (new eqt(equ1.a.a(), equ1.b.a())).a(c, a);
            }
        } else
        {
            return d.a(((ffv) (obj1)).b(), 32000L);
        }
    }

    public final void a()
    {
        d.a();
        e.a();
    }

}
