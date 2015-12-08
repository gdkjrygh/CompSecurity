// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.androidgap.jsonstore.types.JacksonSerializedResult;
import com.worklight.jsonstore.api.JSONStoreFileInfo;
import com.worklight.jsonstore.api.WLJSONStore;
import java.util.Iterator;
import java.util.List;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseActionDispatcher

public class FileInfoActionDispatcher extends BaseActionDispatcher
{

    private static final String DISPATCHER_NAME = "fileInfo";
    private static final String PARAM_OPTIONS = "options";

    public FileInfoActionDispatcher(Context context)
    {
        super("fileInfo", context);
        addParameter("options", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult actionDispatch(JSONStoreContext jsonstorecontext)
        throws Throwable
    {
        Object obj = WLJSONStore.getInstance(getAndroidContext()).getFileInfo();
        jsonstorecontext = new JSONArray();
        JSONObject jsonobject;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsonstorecontext.put(jsonobject))
        {
            JSONStoreFileInfo jsonstorefileinfo = (JSONStoreFileInfo)((Iterator) (obj)).next();
            jsonobject = new JSONObject();
            jsonobject.put("name", jsonstorefileinfo.getUsername());
            jsonobject.put("size", jsonstorefileinfo.getFileSizeBytes());
            jsonobject.put("isEncrypted", jsonstorefileinfo.isEncrypted());
        }

        return new JacksonSerializedResult(org.apache.cordova.PluginResult.Status.OK, jsonstorecontext);
    }
}
