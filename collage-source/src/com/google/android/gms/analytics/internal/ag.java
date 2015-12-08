// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.e;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            am

class ag
    implements e
{

    private int a;
    private boolean b;

    ag()
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
            Log.i((String)am.c.a(), (new StringBuilder()).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)am.c.a()).append(" DEBUG").toString());
            b = true;
        }
    }

    public void a(String s)
    {
    }

    public void b(String s)
    {
    }

    public void c(String s)
    {
    }

    public void d(String s)
    {
    }
}
