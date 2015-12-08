// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.error.CrashListener;
import com.netflix.mediaclient.error.CrashReport;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.invoke.Invoke;
import com.netflix.mediaclient.javabridge.transport.Transport;
import com.netflix.mediaclient.javabridge.transport.TransportFactory;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseNrdProxy
    implements NrdProxy
{

    protected static final String DATA = "data";
    protected static final String NAME = "name";
    public static final String NAME_BGD = "background";
    public static final String NAME_IMC = "IMediaControl";
    public static final String NAME_OBJECT_SYNC_COMPLETE = "ObjectSyncComplete";
    protected static final String OBJECT = "object";
    protected static final String TYPE = "type";
    protected Bridge bridge;
    protected CrashListener listener;
    protected Transport transport;

    public BaseNrdProxy(Bridge bridge1)
    {
        if (bridge1 == null)
        {
            throw new IllegalArgumentException("Bridge can not be null");
        } else
        {
            bridge = bridge1;
            return;
        }
    }

    public void connect()
    {
        transport.uiLoaded();
    }

    public void destroy()
    {
        Log.d(getLogTag(), "NrdProxy::destroy");
        if (transport != null)
        {
            transport.disconnect();
            transport.close();
        }
    }

    public void disconnect()
    {
        Transport transport1 = transport;
        if (transport1 != null)
        {
            transport1.uiUnloaded();
            return;
        } else
        {
            Log.d(getLogTag(), "NrdProxy::disconnect: transport is NULL!");
            return;
        }
    }

    protected boolean getBoolean(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
    {
        return JsonUtils.getBoolean(jsonobject, s, flag);
    }

    protected int getInt(JSONObject jsonobject, String s, int i)
        throws JSONException
    {
        return JsonUtils.getInt(jsonobject, s, i);
    }

    protected JSONArray getJSONArray(JSONObject jsonobject, String s)
        throws JSONException
    {
        return JsonUtils.getJSONArray(jsonobject, s);
    }

    protected JSONObject getJSONObject(JSONObject jsonobject, String s, JSONObject jsonobject1)
        throws JSONException
    {
        return getJSONObject(jsonobject, s, jsonobject1);
    }

    protected abstract String getLogTag();

    protected String getString(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        return JsonUtils.getString(jsonobject, s, s1);
    }

    public void init(String s)
    {
        Log.d(getLogTag(), "NrdProxy::init");
        transport = TransportFactory.createTransport(s, bridge, this);
        transport.connect();
    }

    public void invokeMethod(Invoke invoke)
    {
        if (invoke == null)
        {
            Log.w(getLogTag(), "Command is nul, noop");
            return;
        } else
        {
            invoke.execute(transport);
            return;
        }
    }

    public void invokeMethod(String s, String s1, String s2)
    {
        transport.invokeMethod(s, s1, s2);
    }

    public void postCrashReport(CrashReport crashreport)
    {
        this;
        JVM INSTR monitorenter ;
        if (listener == null || crashreport == null) goto _L2; else goto _L1
_L1:
        listener.onCrash(crashreport);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.e(getLogTag(), "Listener or report are null!");
        if (true) goto _L4; else goto _L3
_L3:
        crashreport;
        throw crashreport;
    }

    public void removeCrashListener()
    {
        this;
        JVM INSTR monitorenter ;
        listener = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setCrashListener(CrashListener crashlistener)
    {
        this;
        JVM INSTR monitorenter ;
        listener = crashlistener;
        this;
        JVM INSTR monitorexit ;
        return;
        crashlistener;
        throw crashlistener;
    }

    public void setProperty(String s, String s1, String s2)
    {
        transport.setProperty(s, s1, s2);
    }
}
