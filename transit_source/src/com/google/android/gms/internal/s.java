// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            cn, cm, v, r

public final class s
{

    private final Runnable el;
    private v em;
    private boolean en;

    public s(r r)
    {
        en = false;
        el = new Runnable(r) {

            private final WeakReference eo;
            final r ep;
            final s eq;

            public void run()
            {
                s.a(eq, false);
                r r1 = (r)eo.get();
                if (r1 != null)
                {
                    r1.b(s.a(eq));
                }
            }

            
            {
                eq = s.this;
                ep = r1;
                super();
                eo = new WeakReference(ep);
            }
        };
    }

    static v a(s s1)
    {
        return s1.em;
    }

    static boolean a(s s1, boolean flag)
    {
        s1.en = flag;
        return flag;
    }

    public void a(v v, long l)
    {
        if (en)
        {
            cn.q("An ad refresh is already scheduled.");
            return;
        } else
        {
            cn.o((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
            em = v;
            en = true;
            cm.hO.postDelayed(el, l);
            return;
        }
    }

    public void cancel()
    {
        cm.hO.removeCallbacks(el);
    }

    public void d(v v)
    {
        a(v, 60000L);
    }
}
