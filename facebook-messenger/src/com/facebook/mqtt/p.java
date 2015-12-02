// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;

import android.net.ConnectivityManager;
import com.facebook.analytics.cj;
import com.facebook.k.a;

// Referenced classes of package com.facebook.mqtt:
//            b, y, w

public class p
{

    private final ConnectivityManager a;
    private final y b;
    private final cj c;
    private final a d;
    private final com.facebook.common.time.a e;

    public p(ConnectivityManager connectivitymanager, y y, cj cj, a a1, com.facebook.common.time.a a2)
    {
        a = connectivitymanager;
        b = y;
        c = cj;
        d = a1;
        e = a2;
    }

    public b a(w w)
    {
        return new b(a, b, c, d, w, e);
    }
}
