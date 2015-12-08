// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.ae;
import com.google.android.gms.internal.ck;
import com.google.android.gms.internal.cu;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            m

final class b
    implements Runnable
{

    final JSONObject a;
    final String b;
    final m c;

    public final void run()
    {
        m.a(c, m.d().b());
        com.google.android.gms.ads.internal.request.m.b(c).a(new com.google.android.gms.internal.hc.c() {

            final m._cls2 a;

            public final void a(Object obj)
            {
                obj = (ae)obj;
                try
                {
                    ((ae) (obj)).a("AFMA_getAdapterLessMediationAd", a.a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    com.google.android.gms.ads.internal.util.client.b.a("Error requesting an ad url", ((Throwable) (obj)));
                }
                m.c().b(a.b);
            }

            
            {
                a = m._cls2.this;
                super();
            }
        }, new com.google.android.gms.internal.hc.a() {

            final m._cls2 a;

            public final void a()
            {
                m.c().b(a.b);
            }

            
            {
                a = m._cls2.this;
                super();
            }
        });
    }

    _cls2.a(m m1, JSONObject jsonobject, String s)
    {
        c = m1;
        a = jsonobject;
        b = s;
        super();
    }
}
