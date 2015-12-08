// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public class lqi
{

    int a;

    public lqi()
    {
        a = 5;
    }

    public void a(String s)
    {
        if (a <= 6)
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void a(String s, Throwable throwable)
    {
        if (a <= 6)
        {
            Log.e("GoogleTagManager", s, throwable);
        }
    }

    public void b(String s)
    {
        if (a <= 5)
        {
            Log.w("GoogleTagManager", s);
        }
    }
}
