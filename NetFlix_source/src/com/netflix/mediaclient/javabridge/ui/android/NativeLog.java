// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.javabridge.ui.Log;
import com.netflix.mediaclient.javabridge.ui.LogArguments;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeNrdObject

public final class NativeLog extends NativeNrdObject
    implements Log
{

    public static final String METHOD_flush = "flush";
    public static final String METHOD_resetSessionID = "resetSessionID";
    private String mAppId;
    private com.netflix.mediaclient.javabridge.ui.Log.ResetSessionIdCallback mSessionCallback;
    private String mSessionId;
    private String mXid;

    public NativeLog(Bridge bridge)
    {
        super(bridge);
    }

    private int handleEvent(JSONObject jsonobject)
        throws Exception
    {
        return 0;
    }

    private int handlePropertyUpdate(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = getJSONObject(jsonobject, "properties", null);
        if (obj == null)
        {
            com.netflix.mediaclient.Log.w("nf_object", "Log.handlePropertyUpdate:: properties does not exist");
            return 0;
        }
        if (((JSONObject) (obj)).has("appid"))
        {
            mAppId = getString(((JSONObject) (obj)), "appid", null);
        }
        if (((JSONObject) (obj)).has("xid"))
        {
            mXid = getString(((JSONObject) (obj)), "xid", null);
        }
        if (((JSONObject) (obj)).has("sessionid"))
        {
            jsonobject = mSessionId;
            obj = getString(((JSONObject) (obj)), "sessionid", null);
            if (com.netflix.mediaclient.Log.isLoggable("nf_object", 3))
            {
                com.netflix.mediaclient.Log.d("nf_object", (new StringBuilder()).append("Log.handlePropertyUpdate:: Old session id: ").append(jsonobject).append(", new session id ").append(((String) (obj))).toString());
            }
            mSessionId = ((String) (obj));
            boolean flag1 = false;
            boolean flag;
            if (jsonobject == null && obj != null)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (jsonobject != null)
                {
                    flag = flag1;
                    if (!jsonobject.equals(obj))
                    {
                        flag = true;
                    }
                }
            }
            if (flag && mSessionCallback != null)
            {
                com.netflix.mediaclient.Log.w("nf_object", "Log.handlePropertyUpdate:: session id is changed and callback exist, report");
                mSessionCallback.sessionCreated(((String) (obj)));
                mSessionCallback = null;
            } else
            if (flag && mSessionCallback == null)
            {
                com.netflix.mediaclient.Log.w("nf_object", "Log.handlePropertyUpdate:: session id is changed but callback does NOT exist");
            } else
            {
                com.netflix.mediaclient.Log.w("nf_object", "Log.handlePropertyUpdate:: session id is not changed");
            }
        }
        return -1;
    }

    public void addEventListener(String s, EventListener eventlistener)
    {
    }

    public void debug(LogArguments logarguments)
    {
    }

    public void error(LogArguments logarguments)
    {
    }

    public void fatal(LogArguments logarguments)
    {
    }

    public void flush()
    {
        bridge.getNrdProxy().invokeMethod("log", "flush", null);
    }

    public String getAppId()
    {
        return mAppId;
    }

    public String getName()
    {
        return "log";
    }

    public String getPath()
    {
        return "nrdp.log";
    }

    public String getSessionId()
    {
        return mSessionId;
    }

    public String getXid()
    {
        return mXid;
    }

    public void info(LogArguments logarguments)
    {
    }

    public int processUpdate(JSONObject jsonobject)
    {
        int i;
        try
        {
            String s = getString(jsonobject, "type", null);
            if (com.netflix.mediaclient.Log.isLoggable("nf_object", 3))
            {
                com.netflix.mediaclient.Log.d("nf_object", (new StringBuilder()).append("processUpdate: handle type ").append(s).toString());
            }
            if (!"PropertyUpdate".equalsIgnoreCase(s))
            {
                break MISSING_BLOCK_LABEL_99;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            com.netflix.mediaclient.Log.e("nf_object", "Failed with JSON", jsonobject);
            return 0;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (com.netflix.mediaclient.Log.isLoggable("nf_object", 3))
        {
            com.netflix.mediaclient.Log.d("nf_object", (new StringBuilder()).append("processUpdate: handle prop update ").append(jsonobject.toString()).toString());
        }
        return handlePropertyUpdate(jsonobject);
        com.netflix.mediaclient.Log.d("nf_object", "processUpdate: handle event");
        i = handleEvent(jsonobject);
        return i;
    }

    public void removeEventListener(String s, EventListener eventlistener)
    {
    }

    public void resetSessionID(com.netflix.mediaclient.javabridge.ui.Log.ResetSessionIdCallback resetsessionidcallback)
    {
        mSessionCallback = resetsessionidcallback;
        bridge.getNrdProxy().invokeMethod("log", "resetSessionID", null);
    }

    public void trace(LogArguments logarguments)
    {
    }

    public void warn(LogArguments logarguments)
    {
    }
}
