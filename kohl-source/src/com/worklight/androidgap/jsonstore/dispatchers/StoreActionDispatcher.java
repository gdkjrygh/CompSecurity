// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.JSONStoreAddOptions;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.exceptions.JSONStoreAddException;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.List;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class StoreActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String OPTION_IS_ARRAY = "isArray";
    private static final String PARAM_DATA = "data";
    private static final String PARAM_OPTIONS = "options";

    public StoreActionDispatcher(Context context)
    {
        super("store", context);
        addParameter("data", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.ARRAY, JSONStoreParameterType.OBJECT
        });
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
    {
        Object obj;
        Object obj1;
        boolean flag;
        obj = jsonstorecontext.getUntypedParameter("data");
        obj1 = jsonstorecontext.getObjectParameter("options");
        flag = false;
        if (obj1 != null)
        {
            flag = ((JSONObject) (obj1)).optBoolean("isArray", false);
        }
        jsonstorecontext = getCollectionInstance();
        if (jsonstorecontext == null)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        obj1 = new JSONStoreAddOptions(((JSONObject) (obj1)));
        if (flag) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof JSONObject)) goto _L3; else goto _L2
_L2:
        jsonstorecontext.addData((JSONObject)obj, ((JSONStoreAddOptions) (obj1)));
        int i = 1;
_L5:
        return new PluginResult(org.apache.cordova.PluginResult.Status.OK, i);
_L3:
        try
        {
            obj = JSONStoreUtil.convertJSONArrayToJSONObjectList((JSONArray)obj);
            jsonstorecontext.addData(((List) (obj)), ((JSONStoreAddOptions) (obj1)));
            i = ((List) (obj)).size();
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            jsonstorecontext.printStackTrace();
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, jsonstorecontext.getAmountAdded());
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            jsonstorecontext.printStackTrace();
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
