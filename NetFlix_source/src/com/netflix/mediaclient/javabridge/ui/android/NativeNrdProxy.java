// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdpObject;
import com.netflix.mediaclient.javabridge.invoke.Invoke;
import com.netflix.mediaclient.javabridge.transport.Transport;
import com.netflix.mediaclient.javabridge.ui.BaseNrdProxy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeNrdp, NativeMedia, NativeDevice, NativeStorage, 
//            NativeRegistration, NativeLog, NativeMdx

public final class NativeNrdProxy extends BaseNrdProxy
{

    private final String TAG = "native_nrd_proxy";
    private NrdpObject media;
    private NrdpObject nrdp;
    private Map objMap;

    public NativeNrdProxy(Bridge bridge)
    {
        super(bridge);
        objMap = new HashMap();
        Log.d("native_nrd_proxy", "Add all NRD objects");
        nrdp = new NativeNrdp(bridge);
        media = new NativeMedia(bridge);
        NativeDevice nativedevice = new NativeDevice(bridge);
        NativeStorage nativestorage = new NativeStorage(bridge);
        NativeRegistration nativeregistration = new NativeRegistration(bridge);
        NativeLog nativelog = new NativeLog(bridge);
        bridge = new NativeMdx(bridge);
        objMap.put(nrdp.getPath(), nrdp);
        objMap.put(media.getPath(), media);
        objMap.put(nativedevice.getPath(), nativedevice);
        objMap.put(nativestorage.getPath(), nativestorage);
        objMap.put(nativeregistration.getPath(), nativeregistration);
        objMap.put(bridge.getPath(), bridge);
        objMap.put(nativelog.getPath(), nativelog);
    }

    private String getKey(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = "nrdp";
        } else
        {
            s1 = s;
            if (!s.startsWith("nrdp"))
            {
                return (new StringBuilder()).append("nrdp.").append(s).toString();
            }
        }
        return s1;
    }

    private int handleName(JSONObject jsonobject)
        throws JSONException
    {
        Log.d("native_nrd_proxy", "MUNRDP::handleName: start");
        String s = getString(jsonobject, "name", null);
        if (s == null)
        {
            Log.d("native_nrd_proxy", "handleName:: name not found");
        } else
        {
            if ("IMediaControl".equalsIgnoreCase(s))
            {
                Log.d("native_nrd_proxy", "handleName:: IMC event, pass to Media proxy");
                return media.processUpdate(jsonobject);
            }
            if ("background".equalsIgnoreCase(s))
            {
                Log.d("native_nrd_proxy", "handleName:: background event, pass to Media proxy");
                return media.processUpdate(jsonobject);
            }
            if ("ObjectSyncComplete".equalsIgnoreCase(s))
            {
                Log.d("native_nrd_proxy", "handleName:: ObjectSyncComplete event, pass to Nrdp proxy");
                return nrdp.processUpdate(jsonobject);
            }
            if (Log.isLoggable("native_nrd_proxy", 3))
            {
                Log.d("native_nrd_proxy", (new StringBuilder()).append("Pass to UI. Handler not found for name ").append(s).toString());
                return 0;
            }
        }
        return 0;
    }

    private int handleObject(JSONObject jsonobject)
        throws JSONException
    {
        Log.d("native_nrd_proxy", "MUNRDP::handleObject: start");
        String s = getString(jsonobject, "object", null);
        if (s == null)
        {
            Log.d("native_nrd_proxy", "handleObject:: object not found");
        } else
        {
            NrdpObject nrdpobject = (NrdpObject)objMap.get(getKey(s));
            if (nrdpobject != null)
            {
                if (Log.isLoggable("native_nrd_proxy", 3))
                {
                    Log.d("native_nrd_proxy", (new StringBuilder()).append("Handler found for object ").append(s).toString());
                }
                return nrdpobject.processUpdate(jsonobject);
            }
            if (Log.isLoggable("native_nrd_proxy", 3))
            {
                Log.d("native_nrd_proxy", (new StringBuilder()).append("Pass to UI. Handler not found for object ").append(s).toString());
                return 0;
            }
        }
        return 0;
    }

    public NrdpObject findObjectCache(String s)
    {
        if (Log.isLoggable("native_nrd_proxy", 3))
        {
            Log.d("native_nrd_proxy", (new StringBuilder()).append("findObjectCache::  ").append(s).toString());
        }
        return (NrdpObject)objMap.get(s);
    }

    protected String getLogTag()
    {
        return "native_nrd_proxy";
    }

    public void invokeMethod(Invoke invoke)
    {
        if (invoke == null)
        {
            Log.w(getLogTag(), "Command is nul, noop");
            return;
        } else
        {
            transport.invokeMethod(invoke);
            return;
        }
    }

    public void invokeMethod(String s, String s1, String s2)
    {
        if (Log.isLoggable("native_nrd_proxy", 3))
        {
            Log.d("native_nrd_proxy", (new StringBuilder()).append("invokeMethod(SSS):: object: ").append(s).append(", method: ").append(s1).append(", arguments: ").append(s2).toString());
        }
        transport.invokeMethod(s, s1, s2);
    }

    public void processUpdate(String s)
    {
        if (Log.isLoggable("native_nrd_proxy", 3))
        {
            Log.d("native_nrd_proxy", (new StringBuilder()).append("processUpdate:: ").append(s).toString());
        }
        int i;
        s = new JSONObject(s);
        i = handleName(s);
        if (1 == i)
        {
            try
            {
                Log.d("native_nrd_proxy", "MUNRDP::processUpdate: update consumed by name handler");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("native_nrd_proxy", "Invalid JSON string received from NRDlib", s);
            }
            break MISSING_BLOCK_LABEL_91;
        }
        if (!s.has("object"))
        {
            Log.d("native_nrd_proxy", "Object property not found. Push update!");
            return;
        }
        break MISSING_BLOCK_LABEL_92;
        return;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (1 == handleObject(s))
        {
            Log.d("native_nrd_proxy", "MUNRDP::processUpdate: update consumed by object handler");
        }
    }

    public void setProperty(String s, String s1, String s2)
    {
        if (Log.isLoggable("native_nrd_proxy", 3))
        {
            Log.d("native_nrd_proxy", (new StringBuilder()).append("setProperty:: object: ").append(s).append(", property: ").append(s1).append(", value: ").append(s2).toString());
        }
        transport.setProperty(s, s1, s2);
    }
}
