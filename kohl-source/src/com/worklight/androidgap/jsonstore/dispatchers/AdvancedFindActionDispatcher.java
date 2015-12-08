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
import com.worklight.jsonstore.api.JSONStoreQueryParts;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreFilterException;
import com.worklight.jsonstore.exceptions.JSONStoreInvalidSortObjectException;
import com.worklight.jsonstore.util.JSONStoreLogger;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class AdvancedFindActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String PARAM_OPTIONS = "options";
    private static final String PARAM_QUERY_OBJ = "queryObj";

    public AdvancedFindActionDispatcher(Context context)
    {
        super("advancedFind", context);
        addParameter("queryObj", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.ARRAY
        });
        addParameter("options", false, true, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
    {
        JSONArray jsonarray = jsonstorecontext.getArrayParameter("queryObj");
        org.json.JSONObject jsonobject = jsonstorecontext.getObjectParameter("options");
        JSONStoreCollection jsonstorecollection;
        try
        {
            jsonstorecollection = getCollectionInstance();
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 28);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 29);
        }
        catch (Throwable throwable)
        {
            String s = getCollectionName();
            jsonstorecontext = s;
            if (s == null)
            {
                jsonstorecontext = "";
            }
            jsonstorecontext = (new StringBuilder()).append("error while executing find query on database \"").append(jsonstorecontext).append("\"").append(throwable.toString()).toString();
            logger.logError(jsonstorecontext, throwable);
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 22);
        }
        if (jsonstorecollection != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        jsonstorecontext = new JSONStoreFindOptions();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        jsonstorecontext = new JSONStoreFindOptions(jsonobject);
        jsonstorecontext = jsonstorecollection.findDocuments(new JSONStoreQueryParts(jsonarray), jsonstorecontext);
        jsonstorecontext = new JacksonSerializedResult(org.apache.cordova.PluginResult.Status.OK, new JSONArray(jsonstorecontext));
        return jsonstorecontext;
    }
}
