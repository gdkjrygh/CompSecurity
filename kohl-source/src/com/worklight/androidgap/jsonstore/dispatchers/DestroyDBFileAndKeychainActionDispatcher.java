// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.WLJSONStore;
import com.worklight.jsonstore.exceptions.JSONStoreDestroyFailureException;
import com.worklight.jsonstore.exceptions.JSONStoreDestroyFileError;
import com.worklight.jsonstore.exceptions.JSONStoreMetadataRemovalFailure;
import com.worklight.jsonstore.exceptions.JSONStoreTransactionFailureException;
import com.worklight.jsonstore.util.JSONStoreLogger;
import org.apache.cordova.PluginResult;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseActionDispatcher

public class DestroyDBFileAndKeychainActionDispatcher extends BaseActionDispatcher
{

    private static final String PARAM_OPTIONS = "options";
    private static final String PARAM_USERNAME = "username";

    public DestroyDBFileAndKeychainActionDispatcher(Context context)
    {
        super("destroyDbFileAndKeychain", context);
        addParameter("username", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult actionDispatch(JSONStoreContext jsonstorecontext)
    {
        jsonstorecontext = jsonstorecontext.getStringParameter("username");
        WLJSONStore wljsonstore;
        try
        {
            wljsonstore = WLJSONStore.getInstance(getAndroidContext());
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            logger.logError("Fail destroying all", jsonstorecontext);
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 25);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -46);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            logger.logError("Fail removing file", jsonstorecontext);
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -18);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            logger.logError("Fail removing metadata", jsonstorecontext);
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -19);
        }
        if (jsonstorecontext == null) goto _L2; else goto _L1
_L1:
        if (jsonstorecontext.equalsIgnoreCase("null") || jsonstorecontext.length() <= 0) goto _L2; else goto _L3
_L3:
        wljsonstore.destroy(jsonstorecontext);
_L5:
        return new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0);
_L2:
        wljsonstore.destroy();
        if (true) goto _L5; else goto _L4
_L4:
    }
}
