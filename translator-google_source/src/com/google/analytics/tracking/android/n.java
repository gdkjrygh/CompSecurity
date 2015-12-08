// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            o, bh, ax, aj, 
//            bd, l

public final class n
{

    private static n r;
    public boolean a;
    public String b;
    public String c;
    public String d;
    public int e;
    public boolean f;
    public Double g;
    public boolean h;
    public boolean i;
    public Thread.UncaughtExceptionHandler j;
    public boolean k;
    public long l;
    public Context m;
    public bh n;
    public ax o;
    public aj p;
    public bd q;
    private int s;
    private final Map t = new HashMap();
    private l u;
    private boolean v;

    private n()
    {
        a = false;
        e = 1800;
        k = false;
        s = 0;
        n = null;
        v = false;
        u = new o(this);
    }

    public static n a()
    {
        if (r == null)
        {
            r = new n();
        }
        return r;
    }

    public static bh b()
    {
        if (a().m == null)
        {
            throw new IllegalStateException("You must call EasyTracker.getInstance().setContext(context) or startActivity(activity) before calling getTracker()");
        } else
        {
            return a().n;
        }
    }
}
