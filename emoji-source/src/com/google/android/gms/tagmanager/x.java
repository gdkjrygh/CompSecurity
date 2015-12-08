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

    private int tN;

    x()
    {
        tN = 5;
    }

    public void A(String s)
    {
        if (tN <= 6)
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void B(String s)
    {
        if (tN <= 4)
        {
            Log.i("GoogleTagManager", s);
        }
    }

    public void C(String s)
    {
        if (tN <= 2)
        {
            Log.v("GoogleTagManager", s);
        }
    }

    public void D(String s)
    {
        if (tN <= 5)
        {
            Log.w("GoogleTagManager", s);
        }
    }

    public void b(String s, Throwable throwable)
    {
        if (tN <= 6)
        {
            Log.e("GoogleTagManager", s, throwable);
        }
    }

    public void c(String s, Throwable throwable)
    {
        if (tN <= 5)
        {
            Log.w("GoogleTagManager", s, throwable);
        }
    }

    public void setLogLevel(int i)
    {
        tN = i;
    }

    public void z(String s)
    {
        if (tN <= 3)
        {
            Log.d("GoogleTagManager", s);
        }
    }
}
