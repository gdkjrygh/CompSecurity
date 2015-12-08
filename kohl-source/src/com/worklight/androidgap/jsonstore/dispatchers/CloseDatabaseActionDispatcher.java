// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.WLJSONStore;
import com.worklight.jsonstore.exceptions.JSONStoreCloseAllException;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreTransactionFailureException;
import org.apache.cordova.PluginResult;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseActionDispatcher

public class CloseDatabaseActionDispatcher extends BaseActionDispatcher
{

    private static final String PARAM_OPTIONS = "options";

    public CloseDatabaseActionDispatcher(Context context)
    {
        super("closeDatabase", context);
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult actionDispatch(JSONStoreContext jsonstorecontext)
        throws Throwable
    {
        jsonstorecontext = WLJSONStore.getInstance(getAndroidContext());
        try
        {
            jsonstorecontext.closeAll();
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 23);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext) { }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -45);
        }
        return new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0);
    }
}
