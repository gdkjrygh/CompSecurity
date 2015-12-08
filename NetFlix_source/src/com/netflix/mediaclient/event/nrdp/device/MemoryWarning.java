// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.device;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import com.netflix.mediaclient.Log;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.device:
//            BaseDeviceEvent

public class MemoryWarning extends BaseDeviceEvent
{

    private static final String AVAILABLE_MEMORY = "avail";
    private static final String TOTAL_MEMORY = "total";
    public static final String TYPE = "nrdp-device-memory-warning";
    private static final String USED_MEMORY = "used";

    public MemoryWarning(Context context)
    {
        super("nrdp-device-memory-warning");
        Object obj = (ActivityManager)context.getSystemService("activity");
        context = new JSONObject();
        if (obj == null)
        {
            Log.e("nf_event", "Unable to find activity manager! Unable to get memory data!");
            try
            {
                context.put("avail", 0);
                context.put("used", 0);
                context.put("total", 0);
            }
            catch (Exception exception)
            {
                Log.e("nf_event", "Failed to add property to JSON object", exception);
            }
        } else
        {
            android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
            ((ActivityManager) (obj)).getMemoryInfo(memoryinfo);
            obj = new android.os.Debug.MemoryInfo();
            Debug.getMemoryInfo(((android.os.Debug.MemoryInfo) (obj)));
            try
            {
                context.put("avail", memoryinfo.availMem);
                context.put("used", ((android.os.Debug.MemoryInfo) (obj)).getTotalSharedDirty() * 1024);
                context.put("total", ((android.os.Debug.MemoryInfo) (obj)).getTotalPss() * 1024);
                context.put("type", getType());
            }
            catch (Exception exception1)
            {
                Log.e("nf_event", "Failed to add property to JSON object", exception1);
            }
        }
        json = context;
    }
}
