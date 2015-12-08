// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import android.content.Context;
import android.util.Log;
import com.digby.localpoint.sdk.core.profile.ILPAttributeListener;
import com.digby.localpoint.sdk.core.profile.ILPAttributeManager;
import com.digby.localpoint.sdk.core.profile.ILPAttributeValue;
import com.digby.localpoint.sdk.core.util.AttributeEventBroadcaster;
import com.digby.localpoint.sdk.core.util.AuthenticationHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPError, LPAttributesUpdateTask

public class LPAttributeManager
    implements ILPAttributeManager
{

    public static final String URI_ATTRIBUTE = "/v1/attribute";
    private static final String URI_BASE_IDENTIFIERS = "/v1/deviceIdentifier";
    public static final String URI_IDENTIFIERS_ID1 = "/v1/deviceIdentifier/ID1";
    public static final String USER_ID1 = "ID1";
    public static final String USER_ID1_UPDATE_FORMAT = "value=%s&deviceId=%s";
    private AuthenticationHelper authHelper;
    private String deviceId;
    private List listeners;
    private String lpServerRootUrl;
    private Context mContext;

    public LPAttributeManager(String s, String s1, AuthenticationHelper authenticationhelper, Context context)
    {
        mContext = context;
        deviceId = s;
        lpServerRootUrl = s1;
        authHelper = authenticationhelper;
        listeners = new ArrayList();
    }

    private JSONObject attributesToJSON(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        Iterator iterator = map.keySet().iterator();
_L2:
        String s;
        Object obj;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_89;
            }
            s = (String)iterator.next();
            obj = ((ILPAttributeValue)map.get(s)).getValue();
        } while (obj == null);
        jsonobject.put(s, obj);
        if (true) goto _L2; else goto _L1
_L1:
        map;
        Log.e("DigbyLibrary", Arrays.toString(map.getStackTrace()));
        return jsonobject;
    }

    public void addListener(ILPAttributeListener ilpattributelistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (ilpattributelistener == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        listeners.add(ilpattributelistener);
        throw new UnsupportedOperationException("Please extend LPAbstractAttributeBroadcastReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
        ilpattributelistener;
        this;
        JVM INSTR monitorexit ;
        throw ilpattributelistener;
    }

    void notifyListeners(Map map, JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        String s = null;
        String s1 = jsonobject.getString("exception");
        s = s1;
_L12:
        String s2;
        int i;
        char c = '\u07D0';
        s2 = "Unknown response";
        i = c;
        s1 = s2;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        i = c;
        int j = jsonobject.getInt("ResponseCode");
        i = j;
        s1 = jsonobject.getString("Response");
        i = j;
_L6:
        jsonobject = null;
        if (s == null) goto _L2; else goto _L1
_L1:
        jsonobject = new LPError(1000, s);
_L8:
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        Log.e("DigbyLibrary", (new StringBuilder()).append("Error code: ").append(jsonobject.getErrorCode()).append(". ").append(jsonobject.getErrorMessage()).toString());
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((ILPAttributeListener)iterator.next()).onUpdateFailure(map, jsonobject)) { }
          goto _L5
        map;
        throw map;
        jsonobject;
        Log.e("DigbyLibrary", Arrays.toString(jsonobject.getStackTrace()));
        s1 = s2;
          goto _L6
_L2:
        if (i < 400) goto _L8; else goto _L7
_L7:
        jsonobject = new LPError(i, s1);
          goto _L8
_L5:
        if (mContext != null)
        {
            map = attributesToJSON(map);
            AttributeEventBroadcaster.getInstance(mContext).broadcastAttributesUpdateFailure(map.toString(), jsonobject);
        }
_L10:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        Log.i("DigbyLibrary", (new StringBuilder()).append("HTTP status code: ").append(i).append(". ").append(s1).toString());
        for (jsonobject = listeners.iterator(); jsonobject.hasNext(); ((ILPAttributeListener)jsonobject.next()).onUpdateSuccess(map)) { }
        if (mContext != null)
        {
            map = attributesToJSON(map);
            AttributeEventBroadcaster.getInstance(mContext).broadcastAttributesUpdateSuccess(map.toString());
        }
        if (true) goto _L10; else goto _L9
_L9:
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L12; else goto _L11
_L11:
    }

    String profileAttributesUpdateRequestBody(Map map)
        throws JSONException
    {
        map = attributesToJSON(map);
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("deviceId", deviceId);
        jsonobject.put("profileAttributes", map);
        return jsonobject.toString();
    }

    public void removeAllListeners()
    {
        this;
        JVM INSTR monitorenter ;
        listeners.clear();
        throw new UnsupportedOperationException("Please extend LPAbstractAttributeBroadcastReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void removeListener(ILPAttributeListener ilpattributelistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (ilpattributelistener == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        listeners.remove(ilpattributelistener);
        throw new UnsupportedOperationException("Please extend LPAbstractAttributeBroadcastReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
        ilpattributelistener;
        this;
        JVM INSTR monitorexit ;
        throw ilpattributelistener;
    }

    public void updateProfileAttributes(Map map)
    {
        (new LPAttributesUpdateTask(lpServerRootUrl, "/v1/attribute", this, authHelper)).execute(new Map[] {
            map
        });
    }

    public void updateUserAttributes(Map map)
    {
        (new LPAttributesUpdateTask(lpServerRootUrl, "/v1/deviceIdentifier", this, authHelper)).execute(new Map[] {
            map
        });
    }

    String userAttributesUpdateRequestBody(Map map)
        throws JSONException
    {
        Object obj = "";
        ILPAttributeValue ilpattributevalue = (ILPAttributeValue)map.get("ID1");
        map = ((Map) (obj));
        if (ilpattributevalue != null)
        {
            map = (String)ilpattributevalue.getValue();
        }
        obj = new JSONObject();
        ((JSONObject) (obj)).put("name", "ID1");
        ((JSONObject) (obj)).put("value", map);
        ((JSONObject) (obj)).put("device_id", deviceId);
        return ((JSONObject) (obj)).toString();
    }
}
