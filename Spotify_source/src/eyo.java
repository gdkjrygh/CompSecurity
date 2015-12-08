// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;

public final class eyo
{

    public final Handler a;
    public Resolver b;

    public eyo(Resolver resolver, Handler handler)
    {
        b = resolver;
        a = handler;
    }

    // Unreferenced inner class eyo$1

/* anonymous class */
    public final class _cls1 extends JsonCallbackReceiver
    {

        private eyp a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.c("Failed to load preset: %s", new Object[] {
                errorcause.toString()
            });
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (eyt)obj;
            a.a(response);
        }

            public 
            {
                a = eyp1;
                super(handler, class1);
            }
    }

}
