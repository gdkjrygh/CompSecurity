// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;

public class CarrierUtils extends PhoneStateListener
{

    private static final String TAG = "nf-carrier";
    private static CarrierUtils instance;
    private String carrier;
    private NetflixApplication context;
    private boolean listening;

    private CarrierUtils()
    {
    }

    public static CarrierUtils getInstance()
    {
        com/netflix/mediaclient/util/CarrierUtils;
        JVM INSTR monitorenter ;
        CarrierUtils carrierutils;
        if (instance == null)
        {
            instance = new CarrierUtils();
        }
        carrierutils = instance;
        com/netflix/mediaclient/util/CarrierUtils;
        JVM INSTR monitorexit ;
        return carrierutils;
        Exception exception;
        exception;
        throw exception;
    }

    public void destroy(Context context1)
    {
        this;
        JVM INSTR monitorenter ;
        context1 = (TelephonyManager)context1.getSystemService("phone");
        if (context1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (listening)
        {
            context1.listen(this, 0);
            listening = false;
        }
        context = null;
        instance = null;
        this;
        JVM INSTR monitorexit ;
        return;
        context1;
        throw context1;
    }

    public String getCarrier()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (context != null)
        {
            updateCarrier(context);
        }
        s = carrier;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void onServiceStateChanged(ServiceState servicestate)
    {
        if (servicestate != null)
        {
            String s = servicestate.getOperatorAlphaShort();
            Log.d("nf-carrier", (new StringBuilder()).append("onServiceStateChanged: New carrier: ").append(s).append(", old carrier: ").append(carrier).toString());
            if (s == null || s.indexOf("N/A") > -1)
            {
                Log.w("nf-carrier", "onServiceStateChanged: Invalid carrier name, keep old carrier data");
            } else
            {
                carrier = s;
            }
        } else
        {
            Log.w("nf-carrier", "onServiceStateChanged: null!");
        }
        super.onServiceStateChanged(servicestate);
    }

    public void updateCarrier(NetflixApplication netflixapplication)
    {
        this;
        JVM INSTR monitorenter ;
        if (netflixapplication != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Context is null!");
        netflixapplication;
        this;
        JVM INSTR monitorexit ;
        throw netflixapplication;
        context = netflixapplication;
        netflixapplication = (TelephonyManager)netflixapplication.getSystemService("phone");
        if (netflixapplication == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        carrier = netflixapplication.getNetworkOperatorName();
        if (carrier != null) goto _L2; else goto _L1
_L1:
        carrier = "";
        Log.w("nf-carrier", "Carrier not received!");
_L3:
        if (!listening)
        {
            netflixapplication.listen(this, 1);
            listening = true;
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d("nf-carrier", (new StringBuilder()).append("Carrier: ").append(carrier).toString());
          goto _L3
        Log.w("nf-carrier", "Telephony manager not found!");
          goto _L4
    }
}
