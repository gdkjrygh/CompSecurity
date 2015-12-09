// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            fq

public final class fj
{

    private final String DH;

    public fj(String s)
    {
        DH = (String)fq.f(s);
    }

    public boolean P(int i)
    {
        return Log.isLoggable(DH, i);
    }

    public void a(String s, String s1, Throwable throwable)
    {
        if (P(6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public void f(String s, String s1)
    {
        if (P(2))
        {
            Log.v(s, s1);
        }
    }

    public void g(String s, String s1)
    {
        if (P(5))
        {
            Log.w(s, s1);
        }
    }

    public void h(String s, String s1)
    {
        if (P(6))
        {
            Log.e(s, s1);
        }
    }
}
