// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package android.support.v4.net:
//            ConnectivityManagerCompatGingerbread, ConnectivityManagerCompatHoneycombMR2, ConnectivityManagerCompatJellyBean

public class ConnectivityManagerCompat
{
    static class BaseConnectivityManagerCompatImpl
        implements ConnectivityManagerCompatImpl
    {

        public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
        {
            connectivitymanager = connectivitymanager.getActiveNetworkInfo();
            if (connectivitymanager != null) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            switch (connectivitymanager.getType())
            {
            default:
                return true;

            case 1: // '\001'
                return false;

            case 0: // '\0'
                break;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        BaseConnectivityManagerCompatImpl()
        {
        }
    }

    static interface ConnectivityManagerCompatImpl
    {

        public abstract boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager);
    }

    static class GingerbreadConnectivityManagerCompatImpl
        implements ConnectivityManagerCompatImpl
    {

        public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
        {
            return ConnectivityManagerCompatGingerbread.isActiveNetworkMetered(connectivitymanager);
        }

        GingerbreadConnectivityManagerCompatImpl()
        {
        }
    }

    static class HoneycombMR2ConnectivityManagerCompatImpl
        implements ConnectivityManagerCompatImpl
    {

        public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
        {
            return ConnectivityManagerCompatHoneycombMR2.isActiveNetworkMetered(connectivitymanager);
        }

        HoneycombMR2ConnectivityManagerCompatImpl()
        {
        }
    }

    static class JellyBeanConnectivityManagerCompatImpl
        implements ConnectivityManagerCompatImpl
    {

        public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
        {
            return ConnectivityManagerCompatJellyBean.isActiveNetworkMetered(connectivitymanager);
        }

        JellyBeanConnectivityManagerCompatImpl()
        {
        }
    }


    private static final ConnectivityManagerCompatImpl IMPL;

    public ConnectivityManagerCompat()
    {
    }

    public static NetworkInfo getNetworkInfoFromBroadcast(ConnectivityManager connectivitymanager, Intent intent)
    {
        return connectivitymanager.getNetworkInfo(((NetworkInfo)intent.getParcelableExtra("networkInfo")).getType());
    }

    public static boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
    {
        return IMPL.isActiveNetworkMetered(connectivitymanager);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new JellyBeanConnectivityManagerCompatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            IMPL = new HoneycombMR2ConnectivityManagerCompatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            IMPL = new GingerbreadConnectivityManagerCompatImpl();
        } else
        {
            IMPL = new BaseConnectivityManagerCompatImpl();
        }
    }
}
