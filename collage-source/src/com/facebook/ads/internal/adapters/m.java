// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.util.o;
import com.facebook.ads.internal.util.s;
import com.facebook.ads.internal.view.d;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            b, l, c

public class m extends b
{

    private static final String b = com/facebook/ads/internal/adapters/m.getSimpleName();
    private final d c;
    private l d;
    private boolean e;

    public m(Context context, d d1, c c1)
    {
        super(context, c1);
        c = d1;
    }

    static d a(m m1)
    {
        return m1.c;
    }

    private void a(Map map)
    {
        String s1;
        if (d != null)
        {
            if (!s.a(s1 = d.f()))
            {
                (new o(map)).execute(new String[] {
                    s1
                });
                return;
            }
        }
    }

    static l b(m m1)
    {
        return m1.d;
    }

    static String e()
    {
        return b;
    }

    public void a(l l1)
    {
        d = l1;
    }

    protected void b()
    {
        if (d == null)
        {
            return;
        }
        if (c != null && !s.a(d.g()))
        {
            if (c.b())
            {
                Log.w(b, "Webview already destroyed, cannot send impression");
            } else
            {
                c.loadUrl((new StringBuilder()).append("javascript:").append(d.g()).toString());
            }
        }
        a(Collections.singletonMap("evt", "native_imp"));
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (e) goto _L2; else goto _L1
_L1:
        l l1 = d;
        if (l1 != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        e = true;
        if (c != null && !s.a(d.e()))
        {
            c.post(new Runnable() {

                final m a;

                public void run()
                {
                    if (m.a(a).b())
                    {
                        Log.w(m.e(), "Webview already destroyed, cannot activate");
                        return;
                    } else
                    {
                        m.a(a).loadUrl((new StringBuilder()).append("javascript:").append(m.b(a).e()).toString());
                        return;
                    }
                }

            
            {
                a = m.this;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        a(Collections.singletonMap("evt", "interstitial_displayed"));
    }

}
