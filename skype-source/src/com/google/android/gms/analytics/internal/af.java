// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.e;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            al

final class af
    implements e
{

    private int a;
    private boolean b;

    af()
    {
        a = 2;
    }

    public final void a()
    {
    }

    public final void a(int i)
    {
        a = i;
        if (!b)
        {
            Log.i((String)al.c.a(), (new StringBuilder("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.")).append((String)al.c.a()).append(" DEBUG").toString());
            b = true;
        }
    }

    public final void a(String s)
    {
    }

    public final int b()
    {
        return a;
    }

    public final void b(String s)
    {
    }

    public final void c(String s)
    {
    }
}
