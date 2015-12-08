// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.rt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

public class ConnectivityChangeReceiver extends BroadcastReceiver
{

    private static final boolean DBG = false;
    private static final String TAG = "rt::";
    private int m_writeFd;

    ConnectivityChangeReceiver(int i)
    {
        m_writeFd = i;
    }

    public native void connectivityChanged(int i, boolean flag, int j, int k);

    public void onReceive(Context context, Intent intent)
    {
        boolean flag2 = false;
        if (!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            return;
        }
        boolean flag3 = intent.getBooleanExtra("noConnectivity", false);
        intent.getStringExtra("reason");
        context = (NetworkInfo)intent.getParcelableExtra("networkInfo");
        boolean flag = false;
        int j = -1;
        int i = -1;
        if (context != null)
        {
            flag = context.isAvailable();
            j = context.getType();
            i = context.getSubtype();
        }
        int k = m_writeFd;
        boolean flag1 = flag2;
        if (!flag3)
        {
            flag1 = flag2;
            if (flag)
            {
                flag1 = true;
            }
        }
        connectivityChanged(k, flag1, j, i);
    }
}
