// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            DeviceCapabilities

class DeviceCapabilitiesMemory
{

    private static final String MEM_INFO_FILE = "/proc/meminfo";
    private static final String TAG = "DeviceCapabilitiesMemory";
    private long mAvailableCapacity;
    private long mCapacity;
    private Context mContext;
    private DeviceCapabilities mDeviceCapabilities;

    public DeviceCapabilitiesMemory(DeviceCapabilities devicecapabilities, Context context)
    {
        mAvailableCapacity = 0L;
        mCapacity = 0L;
        mDeviceCapabilities = devicecapabilities;
        mContext = context;
    }

    private long getTotalMemFromFile()
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = null;
        Object obj1 = new RandomAccessFile("/proc/meminfo", "r");
        boolean flag;
        obj = ((RandomAccessFile) (obj1)).readLine().split(":");
        flag = obj[0].equals("MemTotal");
        if (!flag)
        {
            if (obj1 != null)
            {
                try
                {
                    ((RandomAccessFile) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("DeviceCapabilitiesMemory", ((IOException) (obj)).toString());
                }
            }
            return 0L;
        }
        long l = Long.parseLong(obj[1].trim().split("\\s+")[0]);
        l *= 1024L;
        if (obj1 != null)
        {
            try
            {
                ((RandomAccessFile) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("DeviceCapabilitiesMemory", ((IOException) (obj)).toString());
            }
        }
_L2:
        return l;
        obj;
        obj1 = obj2;
        obj2 = obj;
_L5:
        long l1;
        l1 = 0L;
        obj = obj1;
        Log.e("DeviceCapabilitiesMemory", ((IOException) (obj2)).toString());
        l = l1;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((RandomAccessFile) (obj1)).close();
        l = l1;
          goto _L2
        obj;
        Log.e("DeviceCapabilitiesMemory", ((IOException) (obj)).toString());
        l = l1;
          goto _L2
        obj1;
_L4:
        if (obj != null)
        {
            try
            {
                ((RandomAccessFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("DeviceCapabilitiesMemory", ((IOException) (obj)).toString());
            }
        }
        throw obj1;
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
          goto _L5
    }

    private void readMemoryInfo()
    {
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        ((ActivityManager)mContext.getSystemService("activity")).getMemoryInfo(memoryinfo);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            mCapacity = memoryinfo.totalMem;
        } else
        {
            mCapacity = getTotalMemFromFile();
        }
        mAvailableCapacity = memoryinfo.availMem;
    }

    public JSONObject getInfo()
    {
        readMemoryInfo();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("capacity", mCapacity);
            jsonobject.put("availCapacity", mAvailableCapacity);
        }
        catch (JSONException jsonexception)
        {
            return mDeviceCapabilities.setErrorMessage(jsonexception.toString());
        }
        return jsonobject;
    }
}
