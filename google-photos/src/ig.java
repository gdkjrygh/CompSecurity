// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.ConnectivityManager;

public final class ig
{

    private static final ii a;

    public static boolean a(ConnectivityManager connectivitymanager)
    {
        return a.a(connectivitymanager);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new il();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            a = new ik();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new ij();
        } else
        {
            a = new ih();
        }
    }
}
