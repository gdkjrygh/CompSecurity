// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            dm

public final class dh
{

    private final String li;

    public dh(String s)
    {
        li = (String)dm.e(s);
    }

    public void a(String s, String s1, Throwable throwable)
    {
        if (x(6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public void b(String s, String s1)
    {
        if (x(3))
        {
            Log.d(s, s1);
        }
    }

    public void c(String s, String s1)
    {
        if (x(5))
        {
            Log.w(s, s1);
        }
    }

    public void d(String s, String s1)
    {
        if (x(6))
        {
            Log.e(s, s1);
        }
    }

    public void e(String s, String s1)
    {
        if (!x(4));
    }

    public boolean x(int i)
    {
        return Log.isLoggable(li, i);
    }
}
