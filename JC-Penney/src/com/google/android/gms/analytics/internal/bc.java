// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.k;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            bj, bk

class bc
    implements k
{

    private int a;
    private boolean b;

    bc()
    {
        a = 2;
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
        if (!b)
        {
            Log.i((String)bj.c.a(), (new StringBuilder()).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)bj.c.a()).append(" DEBUG").toString());
            b = true;
        }
    }

    public void a(String s)
    {
    }

    public void b(String s)
    {
    }
}
