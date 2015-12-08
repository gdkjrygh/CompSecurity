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
import com.worklight.jsonstore.api.JSONStoreRemoveOptions;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreFilterException;
import com.worklight.jsonstore.exceptions.JSONStoreFindException;
import com.worklight.jsonstore.exceptions.JSONStoreRemoveException;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class RemoveActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String OPTION_EXACT = "exact";
    private static final String OPTION_IS_ERASE = "isErase";
    private static final String PARAM_OPTIONS = "options";
    private static final String PARAM_QUERY_OBJ = "queryObj";

    public RemoveActionDispatcher(Context context)
    {
        super("remove", context);
        addParameter("queryObj", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.ARRAY, JSONStoreParameterType.OBJECT
        });
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
        throws JSONStoreFindException, JSONStoreFilterException, JSONStoreDatabaseClosedException, JSONException
    {
        JSONObject jsonobject = jsonstorecontext.getObjectParameter("options");
        Object obj1 = jsonstorecontext.getUntypedParameter("queryObj");
        JSONStoreCollection jsonstorecollection;
        if (obj1 instanceof JSONObject)
        {
            jsonstorecontext = new ArrayList(1);
            jsonstorecontext.add((JSONObject)obj1);
        } else
        {
            jsonstorecontext = JSONStoreUtil.convertJSONArrayToJSONObjectList((JSONArray)obj1);
        }
        obj1 = new JSONStoreRemoveOptions();
        if (jsonobject != null)
        {
            boolean flag = jsonobject.optBoolean("isErase", false);
            jsonobject.optBoolean("exact", false);
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((JSONStoreRemoveOptions) (obj1)).setMarkDirty(flag);
        }
        jsonstorecollection = getCollectionInstance();
        if (jsonstorecollection == null)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        HashMap hashmap = new HashMap();
        for (Iterator iterator = jsonstorecontext.iterator(); iterator.hasNext();)
        {
            JSONObject jsonobject1 = (JSONObject)iterator.next();
            JSONStoreQueryParts jsonstorequeryparts = new JSONStoreQueryParts();
            JSONStoreQueryPart jsonstorequerypart = new JSONStoreQueryPart();
            Iterator iterator1 = jsonobject1.keys();
            while (iterator1.hasNext()) 
            {
                String s = (String)iterator1.next();
                Object obj = jsonobject1.get(s);
                jsonstorecontext = ((JSONStoreContext) (obj));
                if (obj instanceof Boolean)
                {
                    int i;
                    if (((Boolean)obj).booleanValue())
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    jsonstorecontext = Integer.valueOf(i);
                }
                jsonstorequerypart.addEqual(s, jsonstorecontext.toString());
            }
            jsonstorequeryparts.addQueryPart(jsonstorequerypart);
            jsonstorecontext = new JSONStoreFindOptions();
            jsonstorecontext.addSearchFilter("_id");
            jsonstorecontext = jsonstorecollection.findDocuments(jsonstorequeryparts, jsonstorecontext).iterator();
            while (jsonstorecontext.hasNext()) 
            {
                hashmap.put(Integer.valueOf(((JSONObject)jsonstorecontext.next()).getInt("_id")), Boolean.valueOf(true));
            }
        }

        jsonstorecontext = new ArrayList(hashmap.keySet());
        try
        {
            int j = jsonstorecollection.removeDocumentsById(jsonstorecontext, ((JSONStoreRemoveOptions) (obj1)));
            jsonstorecontext = new PluginResult(org.apache.cordova.PluginResult.Status.OK, j);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new JacksonSerializedResult(org.apache.cordova.PluginResult.Status.ERROR, JSONStoreUtil.convertJSONObjectListToJSONArray(jsonstorecontext.getFailedObjects()));
        }
        return jsonstorecontext;
    }
}
