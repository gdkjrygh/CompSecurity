// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.k;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            bh, bi

final class ba
    implements k
{

    private int a;
    private boolean b;

    ba()
    {
        a = 2;
    }

    public final int a()
    {
        return a;
    }

    public final void a(int i)
    {
        a = i;
        if (!b)
        {
            Log.i((String)bh.c.a(), (new StringBuilder("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.")).append((String)bh.c.a()).append(" DEBUG").toString());
            b = true;
        }
    }
}
