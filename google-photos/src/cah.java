// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class cah
{

    private final ConnectivityManager a;

    public cah(ConnectivityManager connectivitymanager)
    {
        a = (ConnectivityManager)b.a(connectivitymanager, "connectivityManager", null);
    }

    public final boolean a()
    {
        NetworkInfo networkinfo = a.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected();
    }
}
