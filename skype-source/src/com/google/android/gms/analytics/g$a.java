// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.l;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.io;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            g, c

private final class d extends q
    implements rnal.q
{

    final g a;
    private boolean b;
    private int c;
    private long d;
    private boolean e;
    private long f;

    protected final void a()
    {
    }

    public final void a(Activity activity)
    {
        if (c == 0)
        {
            Intent intent;
            Object obj;
            HashMap hashmap;
            g g1;
            boolean flag;
            if (l().b() >= f + Math.max(1000L, d))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                e = true;
            }
        }
        c = c + 1;
        if (!b) goto _L2; else goto _L1
_L1:
        intent = activity.getIntent();
        if (intent != null)
        {
            a.a(intent.getData());
        }
        hashmap = new HashMap();
        hashmap.put("&t", "screenview");
        g1 = a;
        String s;
        if (g.k(a) != null)
        {
            obj = g.k(a);
            s = activity.getClass().getCanonicalName();
            obj = (String)((l) (obj)).a.get(s);
            if (obj != null)
            {
                s = ((String) (obj));
            }
        } else
        {
            s = activity.getClass().getCanonicalName();
        }
        g1.a("&cd", s);
        if (!TextUtils.isEmpty((CharSequence)hashmap.get("&dr"))) goto _L4; else goto _L3
_L3:
        y.a(activity);
        activity = activity.getIntent();
        if (activity != null) goto _L6; else goto _L5
_L5:
        activity = null;
_L8:
        if (!TextUtils.isEmpty(activity))
        {
            hashmap.put("&dr", activity);
        }
_L4:
        a.a(hashmap);
_L2:
        return;
_L6:
        String s1 = activity.getStringExtra("android.intent.extra.REFERRER_NAME");
        activity = s1;
        if (TextUtils.isEmpty(s1))
        {
            activity = null;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b()
    {
        d = 5000L;
        if (d >= 0L || b)
        {
            q().a(g.a(a));
            return;
        } else
        {
            q().b(g.a(a));
            return;
        }
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = e;
        e = false;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c_()
    {
        c = c - 1;
        c = Math.max(0, c);
        if (c == 0)
        {
            f = l().b();
        }
    }

    protected rnal.s(g g1, s s)
    {
        a = g1;
        super(s);
        d = -1L;
    }
}
