// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.JSONStoreChangeOptions;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.exceptions.JSONStoreChangeException;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import java.util.LinkedList;
import java.util.List;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class ChangeActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String PARAM_DATA = "data";
    private static final String PARAM_OPTIONS = "options";

    public ChangeActionDispatcher(Context context)
    {
        super("change", context);
        addParameter("data", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.ARRAY
        });
        addParameter("options", false, true, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
        throws JSONException
    {
        Object obj = jsonstorecontext.getUntypedParameter("data");
        Object obj1 = jsonstorecontext.getObjectParameter("options");
        jsonstorecontext = new LinkedList();
        if (obj instanceof JSONArray)
        {
            obj = (JSONArray)obj;
            for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
            {
                jsonstorecontext.add((JSONObject)((JSONArray) (obj)).get(i));
            }

        } else
        if (obj instanceof JSONObject)
        {
            jsonstorecontext.add((JSONObject)obj);
        }
        obj = new JSONStoreChangeOptions(((JSONObject) (obj1)));
        obj1 = getCollectionInstance();
        if (obj1 == null)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        try
        {
            int j = ((JSONStoreCollection) (obj1)).changeData(jsonstorecontext, ((JSONStoreChangeOptions) (obj)));
            jsonstorecontext = new PluginResult(org.apache.cordova.PluginResult.Status.OK, j);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 15);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        return jsonstorecontext;
    }
}
