// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.androidgap.jsonstore.types.JacksonSerializedResult;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.api.JSONStoreFindOptions;
import com.worklight.jsonstore.api.JSONStoreQueryPart;
import com.worklight.jsonstore.api.JSONStoreQueryParts;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreFilterException;
import com.worklight.jsonstore.exceptions.JSONStoreFindException;
import com.worklight.jsonstore.exceptions.JSONStoreInvalidSortObjectException;
import com.worklight.jsonstore.util.JSONStoreLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class FindActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String OPTION_EXACT = "exact";
    private static final String PARAM_OPTIONS = "options";
    private static final String PARAM_QUERY_OBJ = "queryObj";

    public FindActionDispatcher(Context context)
    {
        super("find", context);
        addParameter("queryObj", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.ARRAY
        });
        addParameter("options", false, true, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
    {
        Object obj;
        Object obj1;
        obj = jsonstorecontext.getArrayParameter("queryObj");
        obj1 = jsonstorecontext.getObjectParameter("options");
        JSONStoreCollection jsonstorecollection = getCollectionInstance();
        if (jsonstorecollection != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        jsonstorecontext = new JSONStoreFindOptions();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        jsonstorecontext = new JSONStoreFindOptions(((JSONObject) (obj1)));
        JSONArray jsonarray;
        jsonarray = ((JSONArray) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        jsonarray = new JSONArray();
        jsonarray.put(new JSONObject());
        boolean flag;
        boolean flag1 = false;
        flag = flag1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        flag = flag1;
        if (((JSONObject) (obj1)).optBoolean("exact"))
        {
            flag = true;
        }
        LinkedHashMap linkedhashmap;
        new LinkedHashMap();
        new ArrayList();
        linkedhashmap = new LinkedHashMap();
        int i = 0;
_L10:
        int j = jsonarray.length();
        if (i >= j) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject1 = jsonarray.getJSONObject(i);
        if (jsonobject1 == null) goto _L4; else goto _L3
_L3:
        JSONStoreQueryParts jsonstorequeryparts;
        JSONStoreQueryPart jsonstorequerypart;
        Iterator iterator1;
        jsonstorequeryparts = new JSONStoreQueryParts();
        jsonstorequerypart = new JSONStoreQueryPart();
        iterator1 = jsonobject1.keys();
_L9:
        if (!iterator1.hasNext()) goto _L6; else goto _L5
_L5:
        String s3;
        s3 = (String)iterator1.next();
        obj1 = jsonobject1.get(s3);
        obj = obj1;
        if (!(obj1 instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_259;
        }
        if (((Boolean)obj1).booleanValue())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        obj = Integer.valueOf(j);
        if (!flag) goto _L8; else goto _L7
_L7:
        jsonstorequerypart.addEqual(s3, obj.toString());
          goto _L9
        jsonstorecontext;
        jsonstorecontext = new JSONStoreFindException("Error when attempting to find a document. A JSONException occurred.", jsonstorecontext);
        logger.logError("Error when attempting to find a document. A JSONException occurred.", jsonstorecontext);
        throw jsonstorecontext;
        jsonstorecontext;
_L15:
        return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
_L8:
        jsonstorequerypart.addLike(s3, obj.toString());
          goto _L9
        jsonstorecontext;
_L14:
        return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 28);
_L6:
        jsonstorequeryparts.addQueryPart(jsonstorequerypart);
        for (Iterator iterator = jsonstorecollection.findDocuments(jsonstorequeryparts, jsonstorecontext).iterator(); iterator.hasNext();)
        {
            JSONObject jsonobject = (JSONObject)iterator.next();
            String s2 = jsonobject.toString();
            if (!linkedhashmap.containsKey(s2))
            {
                linkedhashmap.put(s2, jsonobject);
            }
        }

          goto _L4
        jsonstorecontext;
_L13:
        return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 29);
_L4:
        i++;
          goto _L10
_L2:
        jsonstorecontext = new ArrayList(linkedhashmap.values());
        jsonstorecontext = new JacksonSerializedResult(org.apache.cordova.PluginResult.Status.OK, new JSONArray(jsonstorecontext));
        return jsonstorecontext;
        jsonstorecontext;
_L12:
        String s1 = getCollectionName();
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        s = (new StringBuilder()).append("error while executing find query on database \"").append(s).append("\"").append(jsonstorecontext.toString()).toString();
        logger.logError(s, jsonstorecontext);
        return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 22);
        jsonstorecontext;
        if (true) goto _L12; else goto _L11
_L11:
        jsonstorecontext;
          goto _L13
        jsonstorecontext;
          goto _L14
        jsonstorecontext;
          goto _L15
    }
}
