// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;

// Referenced classes of package com.umeng.analytics:
//            b

class c
    implements Runnable
{

    final b a;
    private final Context b;
    private final String c;

    c(b b1, Context context, String s)
    {
        a = b1;
        b = context;
        c = s;
        super();
    }

    public void run()
    {
        com.umeng.analytics.b.a(a, b, c);
    }
}
