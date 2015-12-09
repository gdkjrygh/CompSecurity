// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

final class Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        dmz.a(ggc);
        ggc.a(a.a.a.b, a.a.a.uri(), a.a.a);
    }

    Object(Object obj)
    {
        a = obj;
        super();
    }

    // Unreferenced inner class fuk$4

/* anonymous class */
    public final class fuk._cls4
        implements fxo
    {

        final Context a;
        final PlayerTrack b;
        final Flags c;
        final fuk d;

        public final void a(fxp fxp)
        {
            fuk.a(d, com.spotify.mobile.android.util.ClientEvent.Event.p);
            d.a.addTrack(a, b, new fuk._cls4._cls1(this));
        }

            public 
            {
                d = fuk1;
                a = context;
                b = playertrack;
                c = flags;
                super();
            }
    }


    // Unreferenced inner class fuk$4$1

/* anonymous class */
    final class fuk._cls4._cls1
        implements com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager.QueueObserver
    {

        final fuk._cls4 a;

        public final void onError(com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager.QueueObserver.ErrorCause errorcause)
        {
            (new Handler(Looper.getMainLooper())).post(new fuk._cls4._cls1._cls2(errorcause));
        }

        public final void onSuccess()
        {
            (new Handler(Looper.getMainLooper())).post(new fuk._cls4._cls1._cls1(this));
        }

            
            {
                a = _pcls4;
                super();
            }

        // Unreferenced inner class fuk$4$1$2

/* anonymous class */
        final class fuk._cls4._cls1._cls2
            implements Runnable
        {

            private com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager.QueueObserver.ErrorCause a;
            private fuk._cls4._cls1 b;

            public final void run()
            {
                dfj dfj1;
                switch (fuk._cls33.b[a.ordinal()])
                {
                default:
                    dmz.a(ggc);
                    Context context = b.a.d.b;
                    b.a.b.uri();
                    ggc.a(context, 0x7f08054b, 1, new Object[0]);
                    return;

                case 1: // '\001'
                    dfj1 = new dfj(b.a.a, 0x7f0b017f);
                    break;
                }
                dfj1.a(0x7f080276);
                dfj1.b(0x7f080274);
                dfj1.a(0x7f080275, new fuk._cls32());
                dfj1.b().show();
            }

                    
                    {
                        b = fuk._cls4._cls1.this;
                        a = errorcause;
                        super();
                    }
        }

    }

}
