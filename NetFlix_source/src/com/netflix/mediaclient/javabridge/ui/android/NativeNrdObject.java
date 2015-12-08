// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import android.util.SparseArray;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.CallbackEvent;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.ui.BaseNrdObject;
import com.netflix.mediaclient.javabridge.ui.Callback;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class NativeNrdObject extends BaseNrdObject
{

    protected static final String TAG = "nf_object";
    protected SparseArray callbacks;
    protected Map listeners;
    protected int nextCallbackId;

    public NativeNrdObject(Bridge bridge)
    {
        super(bridge);
        listeners = new HashMap();
        callbacks = new SparseArray();
    }

    public int addCallback(Callback callback)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        nextCallbackId = nextCallbackId + 1;
        callbacks.append(nextCallbackId, callback);
        i = nextCallbackId;
        this;
        JVM INSTR monitorexit ;
        return i;
        callback;
        throw callback;
    }

    public void addEventListener(String s, EventListener eventlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (eventlistener != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("nf_object", 3))
        {
            Log.w("nf_object", (new StringBuilder()).append("Do not add! Listener is null for event type ").append(s).toString());
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        Log.e("nf_object", "Event type is null. Do not add event listener! It should NOT happen!");
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        List list = (List)listeners.get(s);
        if (list != null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj;
        if (Log.isLoggable("nf_object", 3))
        {
            Log.d("nf_object", (new StringBuilder()).append("Listeners not found for event type ").append(s).toString());
        }
        obj = new ArrayList();
        listeners.put(s, obj);
_L6:
        ((List) (obj)).add(eventlistener);
        if (true) goto _L4; else goto _L3
_L3:
        obj = list;
        if (!Log.isLoggable("nf_object", 3)) goto _L6; else goto _L5
_L5:
        Log.d("nf_object", (new StringBuilder()).append("Listeners found for event type ").append(s).append(": ").append(list.size()).toString());
        obj = list;
          goto _L6
    }

    protected int handleCallback(CallbackEvent callbackevent)
    {
        this;
        JVM INSTR monitorenter ;
        Callback callback;
        int i;
        i = callbackevent.getCallerId();
        callback = removeCallback(i);
        if (callback == null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("nf_object", 3))
        {
            Log.d("nf_object", (new StringBuilder()).append("Callback found: ").append(i).toString());
        }
        callback.done(callbackevent);
        Log.d("nf_object", "Callback executed.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return 1;
_L2:
        if (Log.isLoggable("nf_object", 3))
        {
            Log.e("nf_object", (new StringBuilder()).append("Callback not found for key ").append(i).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
        callbackevent;
        throw callbackevent;
    }

    protected int handleListener(String s, UIEvent uievent)
    {
        this;
        JVM INSTR monitorenter ;
        List list = (List)listeners.get(s);
        if (list != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("nf_object", 3))
        {
            Log.d("nf_object", (new StringBuilder()).append("Listeners not found for event type ").append(s).toString());
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return 1;
_L2:
        s = list.iterator();
        while (s.hasNext()) 
        {
            ((EventListener)s.next()).received(uievent);
        }
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    protected int handleNccpEvent(String s, JSONObject jsonobject)
        throws JSONException
    {
        if (Log.isLoggable("nf_object", 3))
        {
            Log.d("nf_object", (new StringBuilder()).append("NCCP event ").append(s).toString());
        }
        if (jsonobject.has("origin") || jsonobject.getString("origin").equalsIgnoreCase("complete"))
        {
            Log.d("nf_object", "NCCP event with origin equal complete. Ignore.");
            return 1;
        } else
        {
            Log.d("nf_object", "NCCP event: handle by implementation");
            return 0;
        }
    }

    protected void invokeMethodWithCallback(String s, String s1, JSONObject jsonobject, Callback callback)
    {
        JSONObject jsonobject1;
        jsonobject1 = jsonobject;
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        jsonobject1 = new JSONObject();
        jsonobject1.put("idx", addCallback(callback));
        bridge.getNrdProxy().invokeMethod(s, s1, jsonobject1.toString());
        return;
        s;
        Log.e("nf_object", "Create device account failed because of ", s);
        return;
    }

    public Callback removeCallback(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Callback callback;
        callback = (Callback)callbacks.get(i);
        callbacks.delete(i);
        this;
        JVM INSTR monitorexit ;
        return callback;
        Exception exception;
        exception;
        throw exception;
    }

    public void removeEventListener(String s, EventListener eventlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (eventlistener != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("nf_object", 3))
        {
            Log.w("nf_object", (new StringBuilder()).append("Do not remove! Listener is null for event type ").append(s).toString());
        }
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        Log.e("nf_object", "Event type is null. Can not remove event listener! It should NOT happen!");
          goto _L3
        s;
        throw s;
        List list = (List)listeners.get(s);
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (!Log.isLoggable("nf_object", 3)) goto _L3; else goto _L4
_L4:
        Log.d("nf_object", (new StringBuilder()).append("Listeners not found for event type ").append(s).toString());
          goto _L3
        boolean flag = list.remove(eventlistener);
        if (Log.isLoggable("nf_object", 3))
        {
            Log.d("nf_object", (new StringBuilder()).append("Listeners found for event type ").append(s).append(": ").append(list.size()).append(" and listener was ").append(flag).toString());
        }
          goto _L3
    }
}
