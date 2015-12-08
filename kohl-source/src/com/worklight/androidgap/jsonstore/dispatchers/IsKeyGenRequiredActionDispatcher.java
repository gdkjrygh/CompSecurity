// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.security.SecurityManager;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import org.apache.cordova.PluginResult;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseActionDispatcher

public class IsKeyGenRequiredActionDispatcher extends BaseActionDispatcher
{

    private static final String PARAM_USERNAME = "username";

    public IsKeyGenRequiredActionDispatcher(Context context)
    {
        super("isKeyGenRequired", context);
        addParameter("username", true, true, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
    }

    private String getUserName(JSONStoreContext jsonstorecontext)
    {
        return jsonstorecontext.getStringParameter("username");
    }

    public PluginResult actionDispatch(JSONStoreContext jsonstorecontext)
        throws Throwable
    {
        jsonstorecontext = getUserName(jsonstorecontext);
        int i;
        if (SecurityManager.getInstance(getAndroidContext()).isDPKAvailable(jsonstorecontext))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return new PluginResult(org.apache.cordova.PluginResult.Status.OK, i);
    }
}
