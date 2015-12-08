// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Log;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bi

class x
    implements bi
{

    private int sz;

    x()
    {
        sz = 5;
    }

    public void b(String s, Throwable throwable)
    {
        if (sz <= 6)
        {
            Log.e("GoogleTagManager", s, throwable);
        }
    }

    public void c(String s, Throwable throwable)
    {
        if (sz <= 5)
        {
            Log.w("GoogleTagManager", s, throwable);
        }
    }

    public void setLogLevel(int i)
    {
        sz = i;
    }

    public void v(String s)
    {
        if (sz <= 3)
        {
            Log.d("GoogleTagManager", s);
        }
    }

    public void w(String s)
    {
        if (sz <= 6)
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void x(String s)
    {
        if (sz <= 4)
        {
            Log.i("GoogleTagManager", s);
        }
    }

    public void y(String s)
    {
        if (sz <= 2)
        {
            Log.v("GoogleTagManager", s);
        }
    }

    public void z(String s)
    {
        if (sz <= 5)
        {
            Log.w("GoogleTagManager", s);
        }
    }
}
