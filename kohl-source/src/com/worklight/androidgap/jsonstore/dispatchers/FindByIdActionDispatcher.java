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
import com.worklight.jsonstore.util.JSONStoreLogger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class FindByIdActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String PARAM_IDS = "ids";

    public FindByIdActionDispatcher(Context context)
    {
        super("findById", context);
        addParameter("ids", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.ARRAY
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
        throws JSONException
    {
        Object obj = jsonstorecontext.getArrayParameter("ids");
        jsonstorecontext = new LinkedList();
        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
        {
            jsonstorecontext.add(Integer.valueOf(((JSONArray) (obj)).getInt(i)));
        }

        obj = getCollectionInstance();
        if (obj == null)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        try
        {
            obj = ((JSONStoreCollection) (obj)).findDocumentsById(jsonstorecontext);
            jsonstorecontext = new JSONArray();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsonstorecontext.put((JSONObject)((Iterator) (obj)).next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        catch (JSONStoreFindException jsonstorefindexception)
        {
            String s = getCollectionName();
            jsonstorecontext = s;
            if (s == null)
            {
                jsonstorecontext = "";
            }
            logger.logError((new StringBuilder()).append("error while executing find by ID query on database \"").append(jsonstorecontext).append("\"").toString(), jsonstorefindexception);
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 22);
        }
        jsonstorecontext = new JacksonSerializedResult(org.apache.cordova.PluginResult.Status.OK, jsonstorecontext);
        return jsonstorecontext;
    }
}
