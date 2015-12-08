// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.exceptions.JSONStoreCountException;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import org.apache.cordova.PluginResult;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class LocalCountActionDispatcher extends BaseDatabaseActionDispatcher
{

    public LocalCountActionDispatcher(Context context)
    {
        super("localCount", context);
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
    {
        jsonstorecontext = getCollectionInstance();
        if (jsonstorecontext == null)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        try
        {
            int i = jsonstorecontext.countAllDirtyDocuments();
            jsonstorecontext = new PluginResult(org.apache.cordova.PluginResult.Status.OK, i);
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
        return jsonstorecontext;
    }
}
