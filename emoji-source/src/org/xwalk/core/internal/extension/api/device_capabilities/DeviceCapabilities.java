// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import android.app.Activity;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.internal.extension.XWalkExtensionWithActivityStateListener;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            DeviceCapabilitiesCPU, DeviceCapabilitiesCodecs, DeviceCapabilitiesDisplay, DeviceCapabilitiesMemory, 
//            DeviceCapabilitiesStorage

public class DeviceCapabilities extends XWalkExtensionWithActivityStateListener
{

    public static final String JS_API_PATH = "jsapi/device_capabilities_api.js";
    private static final String NAME = "xwalk.experimental.system";
    private static final String TAG = "DeviceCapabilities";
    private DeviceCapabilitiesCPU mCPU;
    private DeviceCapabilitiesCodecs mCodecs;
    private DeviceCapabilitiesDisplay mDisplay;
    private DeviceCapabilitiesMemory mMemory;
    private DeviceCapabilitiesStorage mStorage;

    public DeviceCapabilities(String s, Activity activity)
    {
        super("xwalk.experimental.system", s, activity);
        s = activity.getApplicationContext();
        mCPU = new DeviceCapabilitiesCPU(this);
        mCodecs = new DeviceCapabilitiesCodecs(this);
        mDisplay = new DeviceCapabilitiesDisplay(this, s);
        mMemory = new DeviceCapabilitiesMemory(this, s);
        mStorage = new DeviceCapabilitiesStorage(this, activity);
    }

    private void handleAddEventListener(String s)
    {
        if (s.equals("storageattach") || s.equals("storagedetach"))
        {
            mStorage.registerListener();
        }
    }

    private void handleGetDeviceInfo(int i, String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        if (!s1.equals("getCPUInfo")) goto _L2; else goto _L1
_L1:
        jsonobject.put("data", mCPU.getInfo());
_L3:
        jsonobject.put("asyncCallId", s);
        postMessage(i, jsonobject.toString());
        return;
_L2:
label0:
        {
            if (!s1.equals("getCodecsInfo"))
            {
                break label0;
            }
            jsonobject.put("data", mCodecs.getInfo());
        }
          goto _L3
        try
        {
label1:
            {
                if (!s1.equals("getDisplayInfo"))
                {
                    break label1;
                }
                jsonobject.put("data", mDisplay.getInfo());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printErrorMessage(s);
            return;
        }
          goto _L3
        if (!s1.equals("getMemoryInfo")) goto _L5; else goto _L4
_L4:
        jsonobject.put("data", mMemory.getInfo());
          goto _L3
_L5:
        if (!s1.equals("getStorageInfo")) goto _L3; else goto _L6
_L6:
        jsonobject.put("data", mStorage.getInfo());
          goto _L3
    }

    private void handleMessage(int i, String s)
    {
        String s1;
        s = new JSONObject(s);
        s1 = s.getString("cmd");
        if (s1.equals("addEventListener"))
        {
            handleAddEventListener(s.getString("eventName"));
            return;
        }
        try
        {
            handleGetDeviceInfo(i, s.getString("asyncCallId"), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printErrorMessage(s);
        }
        return;
    }

    public void onActivityStateChange(Activity activity, int i)
    {
        switch (i)
        {
        case 5: // '\005'
        default:
            return;

        case 3: // '\003'
            mDisplay.onResume();
            mStorage.onResume();
            return;

        case 4: // '\004'
            mDisplay.onPause();
            mStorage.onPause();
            return;

        case 6: // '\006'
            mDisplay.onDestroy();
            break;
        }
        mStorage.onDestroy();
    }

    public void onMessage(int i, String s)
    {
        if (!s.isEmpty())
        {
            handleMessage(i, s);
        }
    }

    public String onSyncMessage(int i, String s)
    {
        return null;
    }

    protected void printErrorMessage(JSONException jsonexception)
    {
        Log.e("DeviceCapabilities", jsonexception.toString());
    }

    protected JSONObject setErrorMessage(String s)
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject1.put("message", s);
            jsonobject.put("error", jsonobject1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("DeviceCapabilities", s.toString());
            return jsonobject;
        }
        return jsonobject;
    }
}
