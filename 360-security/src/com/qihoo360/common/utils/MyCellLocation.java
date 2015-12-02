// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo360.common.utils:
//            Utils

public class MyCellLocation
{

    public MyCellLocation()
    {
    }

    private String a(CellLocation celllocation, String s, String s1)
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (!"android.telephony.cdma.CdmaCellLocation".equals(celllocation.getClass().getName()))
        {
            return null;
        }
        Object obj;
        Method method;
        try
        {
            obj = celllocation.getClass();
            method = ((Class) (obj)).getMethod("getSystemId", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (CellLocation celllocation)
        {
            return null;
        }
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        i = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
_L5:
        method = ((Class) (obj)).getMethod("getBaseStationId", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        j = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
_L4:
        method = ((Class) (obj)).getMethod("getNetworkId", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        k = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
_L3:
        method = ((Class) (obj)).getMethod("getBaseStationLongitude", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        l = ((Integer)method.invoke(celllocation, new Object[0])).intValue();
_L2:
        obj = ((Class) (obj)).getMethod("getBaseStationLatitude", new Class[0]);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        i1 = ((Integer)((Method) (obj)).invoke(celllocation, new Object[0])).intValue();
_L1:
        celllocation = new StringBuilder();
        celllocation.append(s).append(",").append(s1).append(",").append(i).append(",").append(j).append(",").append(k).append(",").append(l).append(",").append(i1);
        celllocation = celllocation.toString();
        return celllocation;
        i1 = -1;
          goto _L1
        l = -1;
          goto _L2
        k = -1;
          goto _L3
        j = -1;
          goto _L4
        i = -1;
          goto _L5
    }

    private String a(TelephonyManager telephonymanager, String s, String s1)
    {
        telephonymanager = telephonymanager.getCellLocation();
        if (telephonymanager != null)
        {
            if (telephonymanager instanceof GsmCellLocation)
            {
                telephonymanager = (GsmCellLocation)telephonymanager;
                int i = telephonymanager.getCid();
                int j = telephonymanager.getLac();
                telephonymanager = new StringBuilder();
                telephonymanager.append(s).append(",").append(s1).append(",").append(i).append(",").append(j);
                return telephonymanager.toString();
            }
            if (android.os.Build.VERSION.SDK_INT >= 5)
            {
                return a(((CellLocation) (telephonymanager)), s, s1);
            }
        }
        return null;
    }

    private String b(TelephonyManager telephonymanager, String s, String s1)
    {
        Object obj;
        if (telephonymanager == null)
        {
            return null;
        }
        obj = telephonymanager.getNeighboringCellInfo();
        telephonymanager = new StringBuilder();
        if (obj == null || ((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L4:
        boolean flag = ((Iterator) (obj)).hasNext();
        if (flag) goto _L3; else goto _L2
_L2:
        return telephonymanager.toString();
_L3:
        NeighboringCellInfo neighboringcellinfo = (NeighboringCellInfo)((Iterator) (obj)).next();
        Object obj1 = neighboringcellinfo.getClass();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj1 = ((Class) (obj1)).getMethod("getLac", null);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj1 = ((Method) (obj1)).invoke(neighboringcellinfo, null);
        int i;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        try
        {
            i = ((Integer)obj1).intValue();
        }
        catch (Exception exception)
        {
            i = -1;
        }
_L5:
        telephonymanager.append(s).append(",").append(s1).append(",").append(i).append(",").append(neighboringcellinfo.getCid()).append(",").append(neighboringcellinfo.getRssi()).append("|");
          goto _L4
        s;
        s.printStackTrace();
          goto _L2
        i = -1;
          goto _L5
    }

    public String getCellInfo(Context context)
    {
        Object obj = (TelephonyManager)Utils.getSystemService(context, "phone");
        Object obj1 = ((TelephonyManager) (obj)).getSimOperator();
        String s = ((TelephonyManager) (obj)).getDeviceId();
        context = a(((TelephonyManager) (obj)), ((String) (obj1)), s);
        obj = b(((TelephonyManager) (obj)), ((String) (obj1)), s);
        obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append(context).append("|").append(((String) (obj)));
        return ((StringBuilder) (obj1)).toString();
    }
}
