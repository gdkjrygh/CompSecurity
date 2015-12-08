// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.util.ClientInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public abstract class elg
{

    public eli a;

    public elg(Context context, elb elb, String s, RequestType requesttype, fyx fyx1)
    {
        a = new eli(elb, s, requesttype, fyx1) {

        };
        elb = a;
        elb.f = Cosmos.getResolver(context);
        elb.i = new HandlerThread("SpacesJsonHermesClientBgHandlerThread");
        ((eli) (elb)).i.start();
        elb.g = new Handler(((eli) (elb)).i.getLooper());
        elb.j = new Handler(context.getMainLooper());
    }

    public abstract String a();

    public abstract List a(JSONObject jsonobject);

    public Map a(Map map)
    {
        return map;
    }

    public final void a(int i, int j)
    {
        eli eli1 = a;
        ctz.a(eli1.f);
        elg elg1 = (elg)eli1.d.get();
        if (elg1 != null)
        {
            String s = elg1.a();
            HashMap hashmap = new HashMap();
            hashmap.put("page", String.valueOf(i));
            hashmap.put("per_page", String.valueOf(j));
            if (eli1.b != null)
            {
                hashmap.put("region", eli1.b);
            }
            hashmap.put("locale", ghq.a(Locale.getDefault()));
            hashmap.put("platform", "android");
            hashmap.put("version", ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a.versionName);
            hashmap.put("dt", gcy.a());
            hashmap.put("suppress404", "1");
            hashmap.put("suppress_response_codes", "1");
            Object obj;
            if (gex.a(eli1.h.a()))
            {
                obj = "";
            } else
            {
                obj = eli.a;
            }
            hashmap.put("product", obj);
            obj = RequestBuilder.get(eli.a(s, elg1.a(((Map) (hashmap))))).build();
            eli1.f.resolve(((com.spotify.cosmos.router.Request) (obj)), new eli._cls1(eli1, eli1.g, i, j));
        }
    }

    public Map b(JSONObject jsonobject)
    {
        return null;
    }

    public final void b()
    {
        a.a();
        a = null;
    }
}
