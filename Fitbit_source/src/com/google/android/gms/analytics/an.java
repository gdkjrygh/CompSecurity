// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.util.Log;

// Referenced classes of package com.google.android.gms.analytics:
//            e

class an
    implements e
{

    private int a;

    an()
    {
        a = 2;
    }

    private String e(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(Exception exception)
    {
        if (a <= 3)
        {
            Log.e("GAV4", null, exception);
        }
    }

    public void a(String s)
    {
        if (a <= 0)
        {
            Log.v("GAV4", e(s));
        }
    }

    public void b(String s)
    {
        if (a <= 1)
        {
            Log.i("GAV4", e(s));
        }
    }

    public void c(String s)
    {
        if (a <= 2)
        {
            Log.w("GAV4", e(s));
        }
    }

    public void d(String s)
    {
        if (a <= 3)
        {
            Log.e("GAV4", e(s));
        }
    }
}
