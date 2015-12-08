// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.MediaServiceConsumer;
import org.msgpack.jackson.dataformat.MessagePackFactory;

public final class ehz
    implements eap
{

    final MediaServiceConsumer a = eaq.a(this);
    final Context b;
    public Handler c;
    private final egv d;
    private ehe e;

    public ehz(Context context, egv egv1)
    {
        c = new Handler(Looper.getMainLooper());
        b = context;
        d = (egv)ctz.a(egv1);
        c = new Handler(Looper.getMainLooper());
        dmz.a(eaq);
        dmz.a(dxd);
    }

    public final void a(MediaService mediaservice)
    {
        egv egv1 = d;
        e = new ehe(new ehk(new ehv(new ObjectMapper(new MessagePackFactory())), egv1), mediaservice, c);
        d.a();
    }

    public final void f()
    {
        if (e != null)
        {
            e.b();
        }
    }

    // Unreferenced inner class ehz$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private ehz a;

        public final void run()
        {
            a.a.a(a.b);
        }

            public 
            {
                a = ehz.this;
                super();
            }
    }


    // Unreferenced inner class ehz$2

/* anonymous class */
    public final class _cls2
        implements Runnable
    {

        private ehz a;

        public final void run()
        {
            a.a.a();
        }

            public 
            {
                a = ehz.this;
                super();
            }
    }

}
