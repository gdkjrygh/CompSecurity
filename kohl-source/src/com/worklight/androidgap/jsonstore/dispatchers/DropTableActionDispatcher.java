// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreRemoveCollectionException;
import com.worklight.jsonstore.exceptions.JSONStoreTransactionFailureException;
import org.apache.cordova.PluginResult;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class DropTableActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String PARAM_OPTIONS = "options";

    public DropTableActionDispatcher(Context context)
    {
        super("dropTable", context);
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
    {
        try
        {
            jsonstorecontext = getCollectionInstance();
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -1);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -47);
        }
        if (jsonstorecontext != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        jsonstorecontext.removeCollection();
        jsonstorecontext = new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0);
        return jsonstorecontext;
    }
}
