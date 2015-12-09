// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.discover.model.DiscoverGroupModel;
import com.spotify.music.spotlets.discover.model.DiscoverReasonModel;
import java.util.HashMap;

public final class gnt
{

    public final Handler a = new Handler();
    public final Resolver b;
    Context c;
    public ggh d;
    public String e;

    public gnt(Context context)
    {
        ctz.a(context);
        geh.b();
        b = Cosmos.getResolver(context);
        c = context;
    }

    // Unreferenced inner class gnt$1

/* anonymous class */
    public final class _cls1 extends JsonHttpCallbackReceiver
    {

        private gnu a;
        private gnt b;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.a(throwable, "Failed to call uri '%s'. Error was: '%s'", new Object[] {
                b.e, errorcause
            });
            a.a();
            gnv.a(b.c, gnv.a(b.e, b.d.a(), "fail", errorcause.toString()));
            b.d = null;
        }

        protected final void onResolved(Response response, Object obj)
        {
            obj = (DiscoverGroupModel[])obj;
            a.a(obj);
            Context context = b.c;
            String s = b.e;
            long l = b.d.a();
            int i = obj.length;
            HashMap hashmap = new HashMap();
            int k;
            if (i == 0)
            {
                response = "no-recs";
            } else
            {
                response = "none";
            }
            response = gnv.a(s, l, "success", response);
            k = obj.length;
            for (int j = 0; j < k; j++)
            {
                Object obj1 = obj[j];
                hashmap.put(((DiscoverGroupModel) (obj1)).discoverReasonModel.title, Integer.valueOf(((DiscoverGroupModel) (obj1)).stories.length));
            }

            response.a("opt_data", hashmap.toString());
            gnv.a(context, response);
            b.d = null;
        }

            public 
            {
                b = gnt.this;
                a = gnu1;
                super(handler, class1);
            }
    }

}
