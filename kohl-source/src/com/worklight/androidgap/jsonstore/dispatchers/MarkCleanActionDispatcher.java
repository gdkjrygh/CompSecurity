// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreMarkCleanException;
import java.util.LinkedList;
import java.util.List;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class MarkCleanActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String PARAM_DOCS = "docs";
    private static final String PARAM_OPTIONS = "options";

    public MarkCleanActionDispatcher(Context context)
    {
        super("markClean", context);
        addParameter("docs", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.ARRAY
        });
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
        throws JSONException
    {
        jsonstorecontext = jsonstorecontext.getArrayParameter("docs");
        JSONStoreCollection jsonstorecollection = getCollectionInstance();
        if (jsonstorecollection == null)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        LinkedList linkedlist = new LinkedList();
        for (int i = 0; i < jsonstorecontext.length(); i++)
        {
            linkedlist.add(jsonstorecontext.getJSONObject(i));
        }

        int j;
        try
        {
            j = jsonstorecollection.markDocumentsClean(linkedlist);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            jsonstorecontext.printStackTrace();
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 15);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            jsonstorecontext.printStackTrace();
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        return new PluginResult(org.apache.cordova.PluginResult.Status.OK, j);
    }
}
