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

public class StoreDPKActionDispatcher extends BaseActionDispatcher
{

    private static final String PARAM_CBK_CLEAR = "cbkClear";
    private static final String PARAM_DPK_CLEAR = "dpkClear";
    private static final String PARAM_LOCALKEYGEN = "localKeyGen";
    private static final String PARAM_OPTIONS = "options";
    private static final String PARAM_SALT = "salt";
    private static final String PARAM_USERNAME = "username";

    public StoreDPKActionDispatcher(Context context)
    {
        super("storeDPK", context);
        addParameter("dpkClear", true, false, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
        addParameter("cbkClear", true, false, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
        addParameter("salt", true, false, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
        addParameter("username", true, true, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
        addParameter("localKeyGen", true, true, new JSONStoreParameterType[] {
            JSONStoreParameterType.BOOLEAN
        });
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    private String getCBKClear(JSONStoreContext jsonstorecontext)
    {
        return jsonstorecontext.getStringParameter("cbkClear");
    }

    private String getDPKClear(JSONStoreContext jsonstorecontext)
    {
        return jsonstorecontext.getStringParameter("dpkClear");
    }

    private Boolean getLocalKeyGen(JSONStoreContext jsonstorecontext)
    {
        return jsonstorecontext.getBooleanParameter("localKeyGen");
    }

    private String getSalt(JSONStoreContext jsonstorecontext)
    {
        return jsonstorecontext.getStringParameter("salt");
    }

    private String getUserName(JSONStoreContext jsonstorecontext)
    {
        return jsonstorecontext.getStringParameter("username");
    }

    public PluginResult actionDispatch(JSONStoreContext jsonstorecontext)
        throws Throwable
    {
        String s = getCBKClear(jsonstorecontext);
        String s1 = getDPKClear(jsonstorecontext);
        String s2 = getSalt(jsonstorecontext);
        String s3 = getUserName(jsonstorecontext);
        getLocalKeyGen(jsonstorecontext);
        SecurityManager.getInstance(getAndroidContext()).storeDPK(s, s3, s1, s2, false);
        return new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0);
    }
}
