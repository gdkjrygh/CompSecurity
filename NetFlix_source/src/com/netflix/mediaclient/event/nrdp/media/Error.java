// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import com.netflix.mediaclient.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class Error extends BaseMediaEvent
{

    private static final String ATTR_ERROR = "error";
    private static final String ATTR_ERROR_CODE = "errorcode";
    private static final String ATTR_STACK = "stack";
    public static final String TYPE = "error";
    private int error;
    private JSONArray mArray;

    public Error(JSONObject jsonobject)
        throws JSONException
    {
        super("error", jsonobject);
    }

    public boolean checkForOpenDeviceFailureInStack()
    {
        if (mArray == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i >= mArray.length()) goto _L2; else goto _L3
_L3:
        boolean flag = mArray.getJSONObject(i).getString("errorcode").equals("NFErr_MC_OpenDeviceFailure");
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_55;
        Object obj;
        obj;
        Log.e("nf_event", "checkForOpenDeviceFailureInStack: JSONException:", ((Throwable) (obj)));
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e("nf_event", "checkForOpenDeviceFailureInStack:", ((Throwable) (obj)));
        if (true) goto _L4; else goto _L2
_L2:
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int getError()
    {
        return error;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        error = getInt(jsonobject, "error", 0);
        mArray = getJsonArray(jsonobject, "stack");
    }
}
