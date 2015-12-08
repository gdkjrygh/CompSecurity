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

    private int xW;

    x()
    {
        xW = 5;
    }

    public void S(String s)
    {
        if (xW <= 3)
        {
            Log.d("GoogleTagManager", s);
        }
    }

    public void T(String s)
    {
        if (xW <= 6)
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void U(String s)
    {
        if (xW <= 4)
        {
            Log.i("GoogleTagManager", s);
        }
    }

    public void V(String s)
    {
        if (xW <= 2)
        {
            Log.v("GoogleTagManager", s);
        }
    }

    public void W(String s)
    {
        if (xW <= 5)
        {
            Log.w("GoogleTagManager", s);
        }
    }

    public void b(String s, Throwable throwable)
    {
        if (xW <= 6)
        {
            Log.e("GoogleTagManager", s, throwable);
        }
    }

    public void d(String s, Throwable throwable)
    {
        if (xW <= 5)
        {
            Log.w("GoogleTagManager", s, throwable);
        }
    }

    public void setLogLevel(int i)
    {
        xW = i;
    }
}
