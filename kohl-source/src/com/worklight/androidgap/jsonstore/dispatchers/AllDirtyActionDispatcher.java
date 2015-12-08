// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.androidgap.jsonstore.types.JacksonSerializedResult;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreFindException;
import com.worklight.jsonstore.jackson.JacksonSerializedJSONArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class AllDirtyActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String PARAM_SELECTED_DOCS = "selectedDocs";

    public AllDirtyActionDispatcher(Context context)
    {
        super("allDirty", context);
        addParameter("selectedDocs", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.ARRAY, JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
        throws JSONException
    {
        HashSet hashset = new HashSet();
        JacksonSerializedJSONArray jacksonserializedjsonarray = new JacksonSerializedJSONArray();
        jsonstorecontext = ((JSONStoreContext) (jsonstorecontext.getUntypedParameter("selectedDocs")));
        if (jsonstorecontext != null)
        {
            if (jsonstorecontext instanceof JSONObject)
            {
                hashset.add(Integer.valueOf(((JSONObject)jsonstorecontext).getInt("_id")));
            } else
            {
                jsonstorecontext = (JSONArray)jsonstorecontext;
                int j = jsonstorecontext.length();
                int i = 0;
                while (i < j) 
                {
                    hashset.add(Integer.valueOf(jsonstorecontext.getJSONObject(i).getInt("_id")));
                    i++;
                }
            }
        }
        jsonstorecontext = getCollectionInstance();
        if (jsonstorecontext == null)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        try
        {
            jsonstorecontext = jsonstorecontext.findAllDirtyDocuments().iterator();
            do
            {
                if (!jsonstorecontext.hasNext())
                {
                    break;
                }
                JSONObject jsonobject = (JSONObject)jsonstorecontext.next();
                if (hashset.size() == 0 || hashset.contains(Integer.valueOf(jsonobject.getInt("_id"))))
                {
                    jacksonserializedjsonarray.put(jsonobject);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 22);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        jsonstorecontext = new JacksonSerializedResult(org.apache.cordova.PluginResult.Status.OK, jacksonserializedjsonarray);
        return jsonstorecontext;
    }
}
