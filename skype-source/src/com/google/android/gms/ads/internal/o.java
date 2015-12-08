// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.gm;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            a

public final class o
{
    public static final class a
    {

        private final Handler a;

        public final void a(Runnable runnable)
        {
            a.removeCallbacks(runnable);
        }

        public final boolean a(Runnable runnable, long l)
        {
            return a.postDelayed(runnable, l);
        }

        public a(Handler handler)
        {
            a = handler;
        }
    }


    private final a a;
    private final Runnable b;
    private AdRequestParcel c;
    private boolean d;
    private boolean e;
    private long f;

    public o(com.google.android.gms.ads.internal.a a1)
    {
        this(a1, new a(gm.a));
    }

    private o(com.google.android.gms.ads.internal.a a1, a a2)
    {
        d = false;
        e = false;
        f = 0L;
        a = a2;
        b = new Runnable(new WeakReference(a1)) {

            final WeakReference a;
            final o b;

            public final void run()
            {
                o.a(b);
                com.google.android.gms.ads.internal.a a3 = (com.google.android.gms.ads.internal.a)a.get();
                if (a3 != null)
                {
                    a3.c(com.google.android.gms.ads.internal.o.b(b));
                }
            }

            
            {
                b = o.this;
                a = weakreference;
                super();
            }
        };
    }

    static boolean a(o o1)
    {
        o1.d = false;
        return false;
    }

    static AdRequestParcel b(o o1)
    {
        return o1.c;
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
            com.google.android.gms.ads.internal.util.client.b.c("An ad refresh is already scheduled.");
        } else
        {
            c = adrequestparcel;
            d = true;
            f = l;
            if (!e)
            {
                com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("Scheduling ad refresh ")).append(l).append(" milliseconds from now.").toString());
                a.a(b, l);
                return;
            }
        }
    }

    public final void b()
    {
        e = true;
        if (d)
        {
            a.a(b);
        }
    }

    public final void c()
    {
        e = false;
        if (d)
        {
            d = false;
            a(c, f);
        }
    }

    public final boolean d()
    {
        return d;
    }
}
