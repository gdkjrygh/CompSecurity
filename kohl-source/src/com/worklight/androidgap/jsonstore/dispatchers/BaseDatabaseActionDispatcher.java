// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.api.WLJSONStore;
import org.apache.cordova.PluginResult;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseActionDispatcher

public abstract class BaseDatabaseActionDispatcher extends BaseActionDispatcher
{

    private String collectionName;

    public BaseDatabaseActionDispatcher(String s, Context context)
    {
        super(s, context);
        collectionName = "";
        addParameter("dbName", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.STRING
        });
    }

    public PluginResult actionDispatch(JSONStoreContext jsonstorecontext)
        throws Throwable
    {
        collectionName = jsonstorecontext.getStringParameter("dbName");
        return databaseActionDispatch(jsonstorecontext);
    }

    protected abstract PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
        throws Throwable;

    protected JSONStoreCollection getCollectionInstance()
    {
        return WLJSONStore.getInstance(getAndroidContext()).getCollectionByName(getCollectionName());
    }

    protected String getCollectionName()
    {
        return collectionName;
    }
}
