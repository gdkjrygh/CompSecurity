// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.microsoft.advertising.android:
//            ah, h

final class bj
{

    private ah a;
    private ConcurrentMap b;

    public bj(ah ah1)
    {
        b = new ConcurrentHashMap();
        if (ah1 == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            a = ah1;
            return;
        }
    }

    public final void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            b.put(s, Long.valueOf(System.currentTimeMillis()));
            return;
        }
    }

    public final void b(String s)
    {
        Long long1;
        if (!TextUtils.isEmpty(s) && b.containsKey(s))
        {
            if ((long1 = (Long)b.remove(s)) != null)
            {
                long l = System.currentTimeMillis();
                long l1 = long1.longValue();
                a.b(h.a(a.a(), s, Long.valueOf(l - l1)));
                return;
            }
        }
    }
}
