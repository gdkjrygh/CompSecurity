// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.google.analytics.tracking.android:
//            bj, ae, a, ak, 
//            j, al, bh, GAUsage, 
//            bk, b

public class aj
    implements bj
{

    private static aj j;
    public boolean a;
    private j b;
    private Context c;
    private bh d;
    private a e;
    private volatile String f;
    private volatile Boolean g;
    private final Map h;
    private String i;

    aj()
    {
        h = new HashMap();
    }

    private aj(Context context)
    {
        this(context, ((j) (ae.a(context))));
    }

    private aj(Context context, j j1)
    {
        h = new HashMap();
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            c = context.getApplicationContext();
            b = j1;
            e = new a();
            b.a(new ak(this));
            b.a(new al(this));
            return;
        }
    }

    public static aj a(Context context)
    {
        com/google/analytics/tracking/android/aj;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            j = new aj(context);
        }
        context = j;
        com/google/analytics/tracking/android/aj;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/google/analytics/tracking/android/aj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static Boolean a(aj aj1, Boolean boolean1)
    {
        aj1.g = boolean1;
        return boolean1;
    }

    static String a(aj aj1, String s)
    {
        aj1.f = s;
        return s;
    }

    public final bh a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("trackingId cannot be null");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        bh bh2 = (bh)h.get(s);
        bh bh1;
        bh1 = bh2;
        if (bh2 != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        bh2 = new bh(s, this);
        h.put(s, bh2);
        bh1 = bh2;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        d = bh2;
        bh1 = bh2;
        GAUsage.a().a(GAUsage.Field.GET_TRACKER);
        this;
        JVM INSTR monitorexit ;
        return bh1;
    }

    public final void a(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("hit cannot be null");
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
        map.put("language", bk.a(Locale.getDefault()));
        if (e.a)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        int k = 0;
_L2:
        map.put("adSenseAdMobHitId", Integer.toString(k));
        map.put("screenResolution", (new StringBuilder()).append(c.getResources().getDisplayMetrics().widthPixels).append("x").append(c.getResources().getDisplayMetrics().heightPixels).toString());
        map.put("usage", GAUsage.a().c());
        GAUsage.a().b();
        b.a(map);
        i = (String)map.get("trackingId");
        this;
        JVM INSTR monitorexit ;
        return;
        b b1 = com.google.analytics.tracking.android.b.a();
        b1.a = b1.b.nextInt(0x7ffffffe) + 1;
        k = b1.a;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
