// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp;

import com.netflix.mediaclient.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp:
//            BaseNccpEvent

public abstract class BaseUIEvent extends BaseNccpEvent
{

    public static final String DATA = "data";
    public static final String NAME = "name";
    public static final String NAME_IMC = "IMediaControl";
    public static final String NRDP = "nrdp";
    public static final String OBJECT = "object";
    protected static final String TAG = "nf_ui_event";
    public static final String TYPE = "type";
    public static final String TYPE_EVENT = "Event";

    public BaseUIEvent(String s)
    {
        super(s);
    }

    protected String getJSON()
    {
        Object obj = null;
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("name", getName());
        jsonobject.put("type", "Event");
        jsonobject.put("object", getObject());
        jsonobject.put("nrdp", 0);
        if (getData() == null) goto _L2; else goto _L1
_L1:
        jsonobject.put("data", getData());
_L4:
        return jsonobject.toString();
_L2:
        jsonobject.put("data", new JSONObject());
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
_L5:
        Log.e("nf_ui_event", "Failed to create", jsonexception);
        if (true) goto _L4; else goto _L3
_L3:
        jsonexception;
        jsonobject = obj;
          goto _L5
    }

    public String getName()
    {
        return getType();
    }

    public int getNrdSource()
    {
        return 0;
    }
}
