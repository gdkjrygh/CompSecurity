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

    private int tK;

    x()
    {
        tK = 5;
    }

    public void A(String s)
    {
        if (tK <= 6)
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void B(String s)
    {
        if (tK <= 4)
        {
            Log.i("GoogleTagManager", s);
        }
    }

    public void C(String s)
    {
        if (tK <= 2)
        {
            Log.v("GoogleTagManager", s);
        }
    }

    public void D(String s)
    {
        if (tK <= 5)
        {
            Log.w("GoogleTagManager", s);
        }
    }

    public void b(String s, Throwable throwable)
    {
        if (tK <= 6)
        {
            Log.e("GoogleTagManager", s, throwable);
        }
    }

    public void c(String s, Throwable throwable)
    {
        if (tK <= 5)
        {
            Log.w("GoogleTagManager", s, throwable);
        }
    }

    public void setLogLevel(int i)
    {
        tK = i;
    }

    public void z(String s)
    {
        if (tK <= 3)
        {
            Log.d("GoogleTagManager", s);
        }
    }
}
