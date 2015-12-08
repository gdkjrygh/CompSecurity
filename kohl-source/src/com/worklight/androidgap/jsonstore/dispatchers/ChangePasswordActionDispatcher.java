// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.WLJSONStore;
import com.worklight.jsonstore.exceptions.JSONStoreChangePasswordException;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import org.apache.cordova.PluginResult;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseActionDispatcher

public class ChangePasswordActionDispatcher extends BaseActionDispatcher
{

    private static final String PARAM_NEW_PW = "newPW";
    private static final String PARAM_OLD_PW = "oldPW";
    private static final String PARAM_OPTIONS = "options";
    private static final String PARAM_USERNAME = "username";

    public ChangePasswordActionDispatcher(Context context)
    {
        super("changePassword", context);
        addParameter("oldPW", true, false, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
        addParameter("newPW", true, false, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
        addParameter("username", true, true, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult actionDispatch(JSONStoreContext jsonstorecontext)
    {
        String s = jsonstorecontext.getStringParameter("newPW");
        String s1 = jsonstorecontext.getStringParameter("oldPW");
        jsonstorecontext = jsonstorecontext.getStringParameter("username");
        WLJSONStore wljsonstore = WLJSONStore.getInstance(getAndroidContext());
        try
        {
            wljsonstore.changePassword(jsonstorecontext, s1, s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 24);
        }
        return new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0);
    }
}
