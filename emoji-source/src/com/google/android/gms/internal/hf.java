// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            hm

public final class hf
{

    private final String GI;

    public hf(String s)
    {
        GI = (String)hm.f(s);
    }

    public void a(String s, String s1, Throwable throwable)
    {
        if (ap(4))
        {
            Log.i(s, s1, throwable);
        }
    }

    public boolean ap(int l)
    {
        return Log.isLoggable(GI, l);
    }

    public void b(String s, String s1, Throwable throwable)
    {
        if (ap(6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public void i(String s, String s1)
    {
        if (ap(2))
        {
            Log.v(s, s1);
        }
    }

    public void j(String s, String s1)
    {
        if (ap(5))
        {
            Log.w(s, s1);
        }
    }

    public void k(String s, String s1)
    {
        if (ap(6))
        {
            Log.e(s, s1);
        }
    }
}
