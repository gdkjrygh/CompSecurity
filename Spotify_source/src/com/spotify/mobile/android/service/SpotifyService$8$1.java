// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import ecw;
import fmd;
import fne;
import fnm;

// Referenced classes of package com.spotify.mobile.android.service:
//            GaiaJacksonModel, SpotifyService

final class  extends JsonCallbackReceiver
{

    final Active a;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.iver.ErrorCause errorcause)
    {
        Logger.b(throwable, "Unable to connect to gaia resolver due to: %s", new Object[] {
            errorcause.name()
        });
    }

    protected final void onResolved(Response response, Object obj)
    {
        response = (GaiaJacksonModel)obj;
        SpotifyService.j(a.a).post(new Runnable(response) {

            private GaiaJacksonModel a;
            private SpotifyService._cls8._cls1 b;

            public final void run()
            {
                Object obj2;
label0:
                {
                    obj2 = SpotifyService.i(b.a.a);
                    Object obj1 = a;
                    ctz.a(((fnm) (obj2)).B);
                    obj2 = ((fnm) (obj2)).B;
                    ctz.a(obj1);
                    obj1 = Optional.b(Boolean.valueOf(((GaiaJacksonModel) (obj1)).isActive()));
                    if (!((fmd) (obj2)).a.equals(obj1))
                    {
                        obj2.a = ((Optional) (obj1));
                        if (!((Boolean)((Optional) (obj1)).c()).booleanValue())
                        {
                            break label0;
                        }
                        ((fmd) (obj2)).b.N_();
                    }
                    return;
                }
                ((fmd) (obj2)).b.b();
            }

            
            {
                b = SpotifyService._cls8._cls1.this;
                a = gaiajacksonmodel;
                super();
            }
        });
    }

    _cls1.a(_cls1.a a1, Class class1)
    {
        a = a1;
        super(null, class1);
    }

    // Unreferenced inner class com/spotify/mobile/android/service/SpotifyService$8

/* anonymous class */
    final class SpotifyService._cls8
        implements ecw
    {

        final SpotifyService a;

        public final void a(boolean flag)
        {
            if (flag)
            {
                SpotifyService._cls8._cls1 _lcls1 = new SpotifyService._cls8._cls1(this, com/spotify/mobile/android/service/GaiaJacksonModel);
                SpotifyService.a(a, SpotifyService.k(a).subscribe("sp://gaia/v1/", _lcls1));
            }
        }

            
            {
                a = spotifyservice;
                super();
            }
    }

}
