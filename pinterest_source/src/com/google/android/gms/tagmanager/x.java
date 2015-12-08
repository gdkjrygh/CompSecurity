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

    private int yM;

    x()
    {
        yM = 5;
    }

    public void S(String s)
    {
        if (yM <= 3)
        {
            Log.d("GoogleTagManager", s);
        }
    }

    public void T(String s)
    {
        if (yM <= 6)
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void U(String s)
    {
        if (yM <= 4)
        {
            Log.i("GoogleTagManager", s);
        }
    }

    public void V(String s)
    {
        if (yM <= 2)
        {
            Log.v("GoogleTagManager", s);
        }
    }

    public void W(String s)
    {
        if (yM <= 5)
        {
            Log.w("GoogleTagManager", s);
        }
    }

    public void b(String s, Throwable throwable)
    {
        if (yM <= 6)
        {
            Log.e("GoogleTagManager", s, throwable);
        }
    }

    public void d(String s, Throwable throwable)
    {
        if (yM <= 5)
        {
            Log.w("GoogleTagManager", s, throwable);
        }
    }

    public void setLogLevel(int i)
    {
        yM = i;
    }
}
