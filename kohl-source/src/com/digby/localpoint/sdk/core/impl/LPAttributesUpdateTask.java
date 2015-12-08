// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import android.os.AsyncTask;
import android.util.Log;
import com.digby.localpoint.sdk.core.util.AuthenticationHelper;
import com.digby.mm.android.library.utils.HttpRequests;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPAttributeManager

public class LPAttributesUpdateTask extends AsyncTask
{

    private LPAttributeManager attrMgr;
    private Map attributes;
    private AuthenticationHelper authHelper;
    private String lpServerRootUrl;
    private String requestUri;

    LPAttributesUpdateTask(String s, String s1, LPAttributeManager lpattributemanager, AuthenticationHelper authenticationhelper)
    {
        lpServerRootUrl = s;
        requestUri = s1;
        attrMgr = lpattributemanager;
        authHelper = authenticationhelper;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Map[])aobj);
    }

    protected transient JSONObject doInBackground(Map amap[])
    {
        attributes = amap[0];
        if (!"/v1/attribute".equals(requestUri)) goto _L2; else goto _L1
_L1:
        amap = attrMgr.profileAttributesUpdateRequestBody(attributes);
_L4:
        String s = null;
        if (authHelper != null)
        {
            s = authHelper.generateAuthHeaderValue(requestUri, null, amap);
        }
        return HttpRequests.doPost((new StringBuilder()).append(lpServerRootUrl).append(requestUri).toString(), amap, true, s, null);
_L2:
        amap = attrMgr.userAttributesUpdateRequestBody(attributes);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        amap = new JSONObject();
        try
        {
            amap.put("exception", exception.getMessage());
        }
        catch (JSONException jsonexception)
        {
            Log.e("DigbyLibrary", Arrays.toString(jsonexception.getStackTrace()));
            return amap;
        }
        return amap;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((JSONObject)obj);
    }

    protected void onPostExecute(JSONObject jsonobject)
    {
        attrMgr.notifyListeners(attributes, jsonobject);
    }
}
