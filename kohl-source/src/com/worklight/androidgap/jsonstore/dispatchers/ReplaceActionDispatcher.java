// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.androidgap.jsonstore.types.JacksonSerializedResult;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.api.JSONStoreReplaceOptions;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreReplaceException;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.Iterator;
import java.util.List;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class ReplaceActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String OPTION_IS_REFRESH = "isRefresh";
    private static final String PARAM_OPTIONS = "options";
    private static final String PARAM_TO_UPDATE = "toUpdate";

    public ReplaceActionDispatcher(Context context)
    {
        super("replace", context);
        addParameter("toUpdate", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.ARRAY, JSONStoreParameterType.OBJECT
        });
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
    {
        Object obj;
        JSONStoreReplaceOptions jsonstorereplaceoptions;
        int i;
        obj = jsonstorecontext.getObjectParameter("options");
        jsonstorecontext = ((JSONStoreContext) (jsonstorecontext.getUntypedParameter("toUpdate")));
        jsonstorereplaceoptions = new JSONStoreReplaceOptions();
        if (obj != null)
        {
            boolean flag;
            if (!((JSONObject) (obj)).optBoolean("isRefresh"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jsonstorereplaceoptions.setMarkDirty(flag);
        }
        obj = getCollectionInstance();
        if (obj == null)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        i = 0;
        if (!(jsonstorecontext instanceof JSONObject))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        ((JSONStoreCollection) (obj)).replaceDocument((JSONObject)jsonstorecontext, jsonstorereplaceoptions);
        i = 1;
        try
        {
            if (jsonstorecontext instanceof JSONArray)
            {
                ((JSONStoreCollection) (obj)).replaceDocuments(JSONStoreUtil.convertJSONArrayToJSONObjectList((JSONArray)jsonstorecontext), jsonstorereplaceoptions);
                i = ((JSONArray)jsonstorecontext).length();
            }
        }
        catch (JSONStoreReplaceException jsonstorereplaceexception)
        {
            jsonstorecontext = new JSONArray();
            for (Iterator iterator = jsonstorereplaceexception.getFailedObjects().iterator(); iterator.hasNext(); jsonstorecontext.put((JSONObject)iterator.next())) { }
            return new JacksonSerializedResult(org.apache.cordova.PluginResult.Status.ERROR, jsonstorecontext);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        return new PluginResult(org.apache.cordova.PluginResult.Status.OK, i);
    }
}
