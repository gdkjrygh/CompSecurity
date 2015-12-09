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
//            SpotifyService, GaiaJacksonModel

final class a
    implements ecw
{

    final SpotifyService a;

    public final void a(boolean flag)
    {
        if (flag)
        {
            JsonCallbackReceiver jsoncallbackreceiver = new JsonCallbackReceiver(com/spotify/mobile/android/service/GaiaJacksonModel) {

                final SpotifyService._cls8 a;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    Logger.b(throwable, "Unable to connect to gaia resolver due to: %s", new Object[] {
                        errorcause.name()
                    });
                }

                protected final void onResolved(Response response, Object obj)
                {
                    response = (GaiaJacksonModel)obj;
                    SpotifyService.j(a.a).post(new Runnable(this, response) {

                        private GaiaJacksonModel a;
                        private _cls1 b;

                        public final void run()
                        {
                            Object obj1;
label0:
                            {
                                obj1 = SpotifyService.i(b.a.a);
                                Object obj = a;
                                ctz.a(((fnm) (obj1)).B);
                                obj1 = ((fnm) (obj1)).B;
                                ctz.a(obj);
                                obj = Optional.b(Boolean.valueOf(((GaiaJacksonModel) (obj)).isActive()));
                                if (!((fmd) (obj1)).a.equals(obj))
                                {
                                    obj1.a = ((Optional) (obj));
                                    if (!((Boolean)((Optional) (obj)).c()).booleanValue())
                                    {
                                        break label0;
                                    }
                                    ((fmd) (obj1)).b.N_();
                                }
                                return;
                            }
                            ((fmd) (obj1)).b.b();
                        }

            
            {
                b = _pcls1;
                a = gaiajacksonmodel;
                super();
            }
                    });
                }

            
            {
                a = SpotifyService._cls8.this;
                super(null, class1);
            }
            };
            SpotifyService.a(a, SpotifyService.k(a).subscribe("sp://gaia/v1/", jsoncallbackreceiver));
        }
    }

    er(SpotifyService spotifyservice)
    {
        a = spotifyservice;
        super();
    }
}
