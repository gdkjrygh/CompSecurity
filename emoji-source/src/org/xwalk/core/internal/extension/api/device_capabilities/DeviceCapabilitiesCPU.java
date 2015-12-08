// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import java.io.IOException;
import java.io.RandomAccessFile;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            DeviceCapabilities

class DeviceCapabilitiesCPU
{

    private static final String SYSTEM_INFO_STAT_FILE = "/proc/stat";
    private static final String TAG = "DeviceCapabilitiesCPU";
    private String mCPUArch;
    private double mCPULoad;
    private int mCoreNum;
    private DeviceCapabilities mDeviceCapabilities;

    public DeviceCapabilitiesCPU(DeviceCapabilities devicecapabilities)
    {
        mCoreNum = 0;
        mCPUArch = "Unknown";
        mCPULoad = 0.0D;
        mDeviceCapabilities = devicecapabilities;
        mCoreNum = Runtime.getRuntime().availableProcessors();
        mCPUArch = System.getProperty("os.arch");
    }

    private boolean getCPULoad()
    {
        Object obj;
        String as[];
        String s;
        int i;
        long l;
        long l1;
        long l2;
        long l3;
        try
        {
            obj = new RandomAccessFile("/proc/stat", "r");
            as = ((RandomAccessFile) (obj)).readLine().split("\\s+");
        }
        catch (IOException ioexception)
        {
            mCPULoad = 0.0D;
            return false;
        }
        l = 0L;
        i = 1;
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        l += Long.parseLong(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_27;
_L1:
        l2 = Long.parseLong(as[4]);
        Thread.sleep(1000L);
        ((RandomAccessFile) (obj)).seek(0L);
        s = ((RandomAccessFile) (obj)).readLine();
        ((RandomAccessFile) (obj)).close();
        obj = s.split("\\s+");
        l1 = 0L;
        i = 1;
_L4:
        if (i >= obj.length)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 += Long.parseLong(obj[i]);
        i++;
        if (true) goto _L4; else goto _L3
        obj;
        mCPULoad = 0.0D;
        return false;
_L3:
        l3 = Long.parseLong(obj[4]);
        if (l1 != l)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        mCPULoad = 0.0D;
        break MISSING_BLOCK_LABEL_181;
        mCPULoad = (double)(l1 - l3 - (l - l2)) / (double)(l1 - l);
        return true;
    }

    public JSONObject getInfo()
    {
        getCPULoad();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("numOfProcessors", mCoreNum);
            jsonobject.put("archName", mCPUArch);
            jsonobject.put("load", mCPULoad);
        }
        catch (JSONException jsonexception)
        {
            return mDeviceCapabilities.setErrorMessage(jsonexception.toString());
        }
        return jsonobject;
    }
}
