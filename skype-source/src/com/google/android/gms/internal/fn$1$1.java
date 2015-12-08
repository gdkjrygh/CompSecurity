// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            ae, be, fp, bd, 
//            fn, cu

final class a
    implements a
{

    final bd a;
    final l.client.b.a b;

    public final void a(Object obj)
    {
        obj = (ae)obj;
        b.b.a(a, new String[] {
            "jsf"
        });
        b.b.b();
        ((ae) (obj)).a("/invalidRequest", b.b.c);
        ((ae) (obj)).a("/loadAdURL", b.b.d);
        try
        {
            ((ae) (obj)).a("AFMA_buildAdURL", b.b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Error requesting an ad url", ((Throwable) (obj)));
        }
    }

    a(a a1, bd bd)
    {
        b = a1;
        a = bd;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/fn$1

/* anonymous class */
    static final class fn._cls1
        implements Runnable
    {

        final cu a;
        final fp b;
        final be c;
        final bd d;
        final String e;

        public final void run()
        {
            cu.d d1 = a.b();
            b.b = d1;
            c.a(d, new String[] {
                "rwc"
            });
            d1.a(new fn._cls1._cls1(this, c.a()), new fn._cls1._cls2());
        }

            
            {
                a = cu1;
                b = fp1;
                c = be1;
                d = bd;
                e = s;
                super();
            }

        // Unreferenced inner class com/google/android/gms/internal/fn$1$2

/* anonymous class */
        final class fn._cls1._cls2
            implements hc.a
        {

            final fn._cls1 a;

            public final void a()
            {
            }

                    
                    {
                        a = fn._cls1.this;
                        super();
                    }
        }

    }

}
