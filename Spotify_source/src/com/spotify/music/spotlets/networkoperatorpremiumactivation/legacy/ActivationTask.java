// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy;

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import gey;
import gez;
import gfb;
import gfd;
import gnz;
import goa;
import java.util.concurrent.TimeUnit;

public final class ActivationTask
{

    public final Resolver a;
    final gey b;
    gnz c;
    public String d;
    boolean e;

    public ActivationTask(Resolver resolver)
    {
        a = resolver;
        resolver = new gez("network-operator-premium-activation", new goa(this));
        resolver.a = new gfd(0L, TimeUnit.MILLISECONDS);
        resolver.c = new gfb(200L, TimeUnit.MILLISECONDS);
        resolver.d = 5;
        b = resolver.a();
    }

    // Unreferenced inner class com/spotify/music/spotlets/networkoperatorpremiumactivation/legacy/ActivationTask$1

/* anonymous class */
    public final class _cls1 extends JsonHttpCallbackReceiver
    {

        private ActivationTask a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            if (a.e)
            {
                return;
            } else
            {
                Logger.a(throwable, "Error when communicating with backend (%s)", new Object[] {
                    errorcause
                });
                a.b.a(false);
                return;
            }
        }

        protected final void onResolved(Response response, Object obj)
        {
            boolean flag = true;
            response = (ResponseMessage)obj;
            if (!a.e)
            {
                obj = a;
                ((ActivationTask) (obj)).b.a(true);
                if (((ActivationTask) (obj)).c != null)
                {
                    obj = ((ActivationTask) (obj)).c;
                    if (!response.isSuccess())
                    {
                        flag = false;
                    }
                    ((gnz) (obj)).a(flag, response.getMessage());
                }
            }
        }

            public 
            {
                a = ActivationTask.this;
                super(handler, class1);
            }

        private class ResponseMessage
            implements JacksonModel
        {

            private final String mMessage;
            private final String mStatus;

            public String getMessage()
            {
                return mMessage;
            }

            public boolean isSuccess()
            {
                return "success".equals(mStatus);
            }

            public String toString()
            {
                return (new StringBuilder("ResponseMessage{mStatus='")).append(mStatus).append('\'').append(", mMessage='").append(mMessage).append('\'').append('}').toString();
            }

            public ResponseMessage(String s, String s1)
            {
                mStatus = s;
                mMessage = s1;
            }
        }

    }

}
