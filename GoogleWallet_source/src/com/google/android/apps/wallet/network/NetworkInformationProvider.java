// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Joiner;

public class NetworkInformationProvider
{

    private static final String TAG = com/google/android/apps/wallet/network/NetworkInformationProvider.getSimpleName();
    private final ConnectivityManager mConnectivityManager;
    private com.google.wallet.proto.NanoWalletShared.StableNetworkDetails mStableNetworkDetails;
    private final TelephonyManager mTelephonyManager;

    NetworkInformationProvider(ConnectivityManager connectivitymanager, TelephonyManager telephonymanager)
    {
        mConnectivityManager = connectivitymanager;
        mTelephonyManager = telephonymanager;
    }

    private com.google.wallet.proto.NanoWalletShared.StableNetworkDetails doGetStableNetworkDetails()
    {
        String s = getNetworkOperatorCode();
        String s1 = getNetworkOperatorName();
        String s2 = getSimOperatorCode();
        String s3 = getSimOperatorName();
        com.google.wallet.proto.NanoWalletShared.StableNetworkDetails stablenetworkdetails = new com.google.wallet.proto.NanoWalletShared.StableNetworkDetails();
        stablenetworkdetails.phoneType = Integer.valueOf(mTelephonyManager.getPhoneType());
        stablenetworkdetails.carrier = getCarrier();
        if (s != null)
        {
            stablenetworkdetails.networkOperatorCode = s;
        }
        if (s1 != null)
        {
            stablenetworkdetails.networkOperatorName = s1;
        }
        if (s2 != null)
        {
            stablenetworkdetails.simOperatorCode = s2;
        }
        if (s3 != null)
        {
            stablenetworkdetails.simOperatorName = s3;
        }
        return stablenetworkdetails;
    }

    private String getCarrier()
    {
        String s;
        String s1;
        Object obj1;
        s1 = "UNKNOWN_RADIO_TYPE";
        s = "UNKNOWN_OPERATOR";
        obj1 = null;
        mTelephonyManager.getPhoneType();
        JVM INSTR tableswitch 1 2: default 40
    //                   1 65
    //                   2 103;
           goto _L1 _L2 _L3
_L1:
        Object obj = obj1;
_L5:
        return Joiner.on("_").skipNulls().join(s1, s, new Object[] {
            obj
        });
_L2:
        String s2 = "GSM";
        s1 = s2;
        obj = obj1;
        if (mTelephonyManager.getSimState() == 5)
        {
            s = mTelephonyManager.getSimOperatorName();
            s1 = s2;
            obj = obj1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "CDMA";
        s = mTelephonyManager.getNetworkOperatorName();
        if (mTelephonyManager.isNetworkRoaming())
        {
            obj = "ROAMING";
        } else
        {
            obj = null;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private String getNetworkOperatorCode()
    {
        return mTelephonyManager.getNetworkOperator();
    }

    private String getNetworkOperatorName()
    {
        return mTelephonyManager.getNetworkOperatorName();
    }

    private String getSimOperatorCode()
    {
        if (mTelephonyManager.getPhoneType() == 1 && mTelephonyManager.getSimState() == 5)
        {
            return mTelephonyManager.getSimOperator();
        } else
        {
            return null;
        }
    }

    private String getSimOperatorName()
    {
        if (mTelephonyManager.getPhoneType() == 1 && mTelephonyManager.getSimState() == 5)
        {
            return mTelephonyManager.getSimOperatorName();
        } else
        {
            return null;
        }
    }

    public final com.google.wallet.proto.NanoWalletShared.StableNetworkDetails getStableNetworkDetails()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.wallet.proto.NanoWalletShared.StableNetworkDetails stablenetworkdetails;
        if (mStableNetworkDetails == null)
        {
            mStableNetworkDetails = doGetStableNetworkDetails();
        }
        stablenetworkdetails = mStableNetworkDetails;
        this;
        JVM INSTR monitorexit ;
        return stablenetworkdetails;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean hasNetworkAccess()
    {
        NetworkInfo networkinfo;
        boolean flag;
        flag = true;
        networkinfo = mConnectivityManager.getActiveNetworkInfo();
        if (networkinfo != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        WLog.v(TAG, (new StringBuilder(27)).append("NetworkAccessExists = ").append(flag).toString());
        return flag;
_L2:
        if (!networkinfo.isAvailable())
        {
            flag = false;
        } else
        if (!networkinfo.isConnected())
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
