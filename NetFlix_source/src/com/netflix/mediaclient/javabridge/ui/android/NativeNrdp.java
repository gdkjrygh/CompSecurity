// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.nrdp.InitEvent;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.ui.Device;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.javabridge.ui.Registration;
import com.netflix.mediaclient.javabridge.ui.Storage;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeNrdObject

public final class NativeNrdp extends NativeNrdObject
    implements Nrdp
{

    public static final String METHOD_getConfigList = "getConfigList";
    public static final String METHOD_setConfigData = "setConfigData";
    private static final String TAG = "nf_nedp";
    private boolean ready;

    public NativeNrdp(Bridge bridge)
    {
        super(bridge);
        ready = false;
    }

    private int handleEvent(JSONObject jsonobject)
        throws Exception
    {
        String s = jsonobject.getString("name");
        String s1 = jsonobject.getString("type");
        if (!"config".equals(s))
        {
            JSONObject jsonobject1 = getJSONObject(jsonobject, "data", null);
            if (Log.isLoggable("nf_nedp", 3))
            {
                Log.d("nf_nedp", (new StringBuilder()).append("NativeNrdp received event ").append(jsonobject).toString());
            }
            if ("background".equals(s))
            {
                return handleNccpEvent(s, jsonobject1);
            }
            if ("config".equals(s))
            {
                jsonobject = new JSONObject();
                jsonobject.put("type", "config");
                jsonobject.put("list", jsonobject1);
                return 1;
            }
            if (!"nrdconf".equals(s))
            {
                if ("commandReceived".equals(s))
                {
                    jsonobject = new JSONObject();
                    jsonobject.put("type", "command");
                    jsonobject.put("parameters", jsonobject1);
                    return 1;
                }
                if ("ObjectSyncComplete".equals(s))
                {
                    ready = true;
                    return handleListener("init", new InitEvent());
                }
                if ("EventSourceError".equals(s1))
                {
                    (new JSONObject()).put("type", "fatalerror");
                    return 1;
                }
                if ("Method".equals(s1))
                {
                    JSONObject jsonobject2 = new JSONObject();
                    jsonobject2.put("type", "invalidargument");
                    jsonobject2.put("object", "");
                    jsonobject2.put("method", jsonobject.get("method"));
                    jsonobject2.put("argument", jsonobject.get("returnValue"));
                    return 1;
                }
                if (Log.isLoggable("nf_nedp", 5))
                {
                    Log.w("nf_nedp", (new StringBuilder()).append("Nobody to handle by name ").append(s).toString());
                    return 1;
                }
            }
        }
        return 1;
    }

    private int handlePropertyUpdate(JSONObject jsonobject)
        throws JSONException
    {
        if (getJSONObject(jsonobject, "properties", null) == null)
        {
            Log.w("nf_nedp", "handlePropertyUpdate:: properties does not exist");
            return 0;
        } else
        {
            return 1;
        }
    }

    public boolean debug()
    {
        return false;
    }

    public void exit()
    {
        Log.d("nf_nedp", "exit:: noop");
    }

    public void getConfigList()
    {
        bridge.getNrdProxy().invokeMethod("", "getConfigList", null);
    }

    public Device getDevice()
    {
        return null;
    }

    public com.netflix.mediaclient.javabridge.ui.Log getLog()
    {
        return null;
    }

    public MdxController getMdxController()
    {
        return null;
    }

    public IMedia getMedia()
    {
        return null;
    }

    public String getName()
    {
        return "";
    }

    public String getPath()
    {
        return "nrdp";
    }

    public Registration getRegistration()
    {
        return null;
    }

    public Storage getStorage()
    {
        return null;
    }

    public boolean isReady()
    {
        return ready;
    }

    public long now()
    {
        return System.currentTimeMillis();
    }

    public int processUpdate(JSONObject jsonobject)
    {
        int i;
        try
        {
            String s = getString(jsonobject, "type", null);
            if (Log.isLoggable("nf_nedp", 3))
            {
                Log.d("nf_nedp", (new StringBuilder()).append("processUpdate: handle type ").append(s).toString());
            }
            if (!"PropertyUpdate".equalsIgnoreCase(s))
            {
                break MISSING_BLOCK_LABEL_99;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("nf_nedp", "Failed with JSON", jsonobject);
            return 1;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (Log.isLoggable("nf_nedp", 3))
        {
            Log.d("nf_nedp", (new StringBuilder()).append("processUpdate: handle prop update ").append(jsonobject.toString()).toString());
        }
        return handlePropertyUpdate(jsonobject);
        Log.d("nf_nedp", "processUpdate: handle event");
        i = handleEvent(jsonobject);
        return i;
    }

    public void setConfigData(String s, String s1)
    {
        try
        {
            s = new JSONObject();
            s.put("name", URLEncoder.encode(s1, "utf8"));
            bridge.getNrdProxy().invokeMethod("", "setConfigData", s.toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_nedp", "Failed to setConfigData", s);
        }
    }
}
