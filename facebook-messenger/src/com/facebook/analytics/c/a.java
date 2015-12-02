// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.c;

import android.content.Context;
import com.google.common.a.es;

// Referenced classes of package com.facebook.analytics.c:
//            d

public class a extends com.facebook.d.d.a
{

    private final d a;

    public a(Context context, com.facebook.common.executors.a a1, com.facebook.d.b.a a2, d d)
    {
        super(context, a1, a2, es.a(d), "analytics_db2", es.d());
        a = d;
    }

    protected int a()
    {
        return 51200;
    }
}
