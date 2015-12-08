// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import java.lang.ref.WeakReference;
import p.ad.b;
import p.al.f;
import p.an.k;

// Referenced classes of package com.pandora.android.activity:
//            k

static final class b
    implements f
{

    final WeakReference a;
    final Runnable b;

    public volatile boolean a(Exception exception, Object obj, k k1, boolean flag)
    {
        return a(exception, (String)obj, k1, flag);
    }

    public boolean a(Exception exception, String s, k k1, boolean flag)
    {
        exception = (com.pandora.android.activity.k)a.get();
        if (exception != null)
        {
            k.a(exception, b);
        }
        return false;
    }

    public volatile boolean a(Object obj, Object obj1, k k1, boolean flag, boolean flag1)
    {
        return a((b)obj, (String)obj1, k1, flag, flag1);
    }

    public boolean a(b b1, String s, k k1, boolean flag, boolean flag1)
    {
        b1 = (com.pandora.android.activity.k)a.get();
        if (b1 != null)
        {
            k.a(b1, b);
        }
        return false;
    }

    (WeakReference weakreference, Runnable runnable)
    {
        a = weakreference;
        b = runnable;
        super();
    }
}
