// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreDirtyCheckException;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class IsDirtyActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String PARAM_OBJ = "obj";

    public IsDirtyActionDispatcher(Context context)
    {
        super("isDirty", context);
        addParameter("obj", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
        throws JSONException
    {
        int i = jsonstorecontext.getObjectParameter("obj").getInt("_id");
        jsonstorecontext = getCollectionInstance();
        if (jsonstorecontext == null)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        boolean flag;
        try
        {
            flag = jsonstorecontext.isDocumentDirty(i);
            jsonstorecontext = org.apache.cordova.PluginResult.Status.OK;
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 22);
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        jsonstorecontext = new PluginResult(jsonstorecontext, i);
        return jsonstorecontext;
    }
}
