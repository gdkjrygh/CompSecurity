// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.ads.model.SponsorshipAdData;
import com.spotify.mobile.android.spotlets.ads.model.Sponsorships;

public final class efi
{

    public int a;
    public final Object b = new Object();
    boolean c;
    private Context d;
    private Resolver e;
    private Handler f;
    private HandlerThread g;

    public efi(Context context)
    {
        d = context.getApplicationContext();
        c = false;
    }

    static void a(efi efi1)
    {
        Object obj = efi1.b;
        obj;
        JVM INSTR monitorenter ;
        int i;
        i = efi1.a - 1;
        efi1.a = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (efi1.e != null)
        {
            efi1.e.destroy();
            efi1.e = null;
        }
        if (efi1.g != null)
        {
            efi1.g.quit();
            efi1.f = null;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        efi1;
        obj;
        JVM INSTR monitorexit ;
        throw efi1;
    }

    public final Resolver a()
    {
        if (e == null)
        {
            e = Cosmos.getResolver(d);
        }
        return e;
    }

    public final Handler b()
    {
        this;
        JVM INSTR monitorenter ;
        Handler handler;
        if (f == null)
        {
            g = new HandlerThread("AdsSponsorshipBackgroundThread");
            g.start();
            f = new Handler(g.getLooper());
        }
        handler = f;
        this;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        throw exception;
    }

    // Unreferenced inner class efi$1

/* anonymous class */
    public final class _cls1 extends JsonCallbackReceiver
    {

        private efj a;
        private efi b;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            a.a(errorcause);
            efi.a(b);
        }

        protected final void onResolved(Response response, Object obj)
        {
            obj = (SponsorshipAdData)obj;
            a.a(response, obj);
            efi.a(b);
        }

            public 
            {
                b = efi.this;
                a = efj1;
                super(handler, class1);
            }
    }


    // Unreferenced inner class efi$2

/* anonymous class */
    final class _cls2 extends JsonCallbackReceiver
    {

        private efj a;
        private efi b;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            a.a(errorcause);
            efi.a(b);
            b.c = false;
        }

        protected final void onResolved(Response response, Object obj)
        {
            obj = (Sponsorships)obj;
            a.a(response, obj);
            efi.a(b);
            b.c = false;
        }

            
            {
                b = efi.this;
                a = efj1;
                super(handler, class1);
            }
    }

}
