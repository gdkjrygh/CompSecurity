// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.lang.ref.WeakReference;

public final class bkt
{

    final bku a;
    final Runnable b;
    AdRequestParcel c;
    boolean d;
    boolean e;
    long f;

    public bkt(bkc bkc)
    {
        this(bkc, new bku(cjj.a));
    }

    private bkt(bkc bkc, bku bku1)
    {
        d = false;
        e = false;
        f = 0L;
        a = bku1;
        b = new Runnable(new WeakReference(bkc)) {

            private WeakReference a;
            private bkt b;

            public final void run()
            {
                b.d = false;
                bkc bkc1 = (bkc)a.get();
                if (bkc1 != null)
                {
                    bkc1.c(b.c);
                }
            }

            
            {
                b = bkt.this;
                a = weakreference;
                super();
            }
        };
    }

    public final void a()
    {
        d = false;
        a.a(b);
    }

    public final void a(AdRequestParcel adrequestparcel)
    {
        a(adrequestparcel, 60000L);
    }

    public final void a(AdRequestParcel adrequestparcel, long l)
    {
        if (d)
        {
            bka.e("An ad refresh is already scheduled.");
        } else
        {
            c = adrequestparcel;
            d = true;
            f = l;
            if (!e)
            {
                bka.c((new StringBuilder("Scheduling ad refresh ")).append(l).append(" milliseconds from now.").toString());
                adrequestparcel = a;
                Runnable runnable = b;
                ((bku) (adrequestparcel)).a.postDelayed(runnable, l);
                return;
            }
        }
    }
}
