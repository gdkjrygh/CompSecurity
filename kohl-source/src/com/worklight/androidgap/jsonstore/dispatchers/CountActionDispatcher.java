// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.api.JSONStoreCountOptions;
import com.worklight.jsonstore.api.JSONStoreQueryPart;
import com.worklight.jsonstore.api.JSONStoreQueryParts;
import com.worklight.jsonstore.util.JSONStoreLogger;
import java.util.Iterator;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class CountActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String OPTION_EXACT = "exact";
    private static final String OPTION_LIMIT = "limit";
    private static final String OPTION_OFFSET = "offset";
    private static final String PARAM_OPTIONS = "options";
    private static final String PARAM_QUERY_OBJ = "queryObj";

    public CountActionDispatcher(Context context)
    {
        super("count", context);
        addParameter("queryObj", false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
        addParameter("options", false, true, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
    {
        JSONObject jsonobject1;
        jsonobject1 = jsonstorecontext.getObjectParameter("queryObj");
        JSONObject jsonobject = jsonstorecontext.getObjectParameter("options");
        jsonstorecontext = jsonobject;
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        jsonstorecontext = new JSONObject();
        boolean flag = jsonstorecontext.optBoolean("exact");
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (jsonstorecontext == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj = jsonstorecontext.optString("limit", null);
        obj1 = jsonstorecontext.optString("offset", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        Integer.parseInt(((String) (obj)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        Integer.parseInt(((String) (obj1)));
        obj1 = getCollectionInstance();
        int i;
        if (obj1 == null)
        {
            try
            {
                return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -50);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj = getCollectionName();
            }
            jsonstorecontext = ((JSONStoreContext) (obj));
            if (obj == null)
            {
                jsonstorecontext = "";
            }
            jsonstorecontext = (new StringBuilder()).append("error while executing find query on database \"").append(jsonstorecontext).append("\"").toString();
            logger.logError(jsonstorecontext, ((Throwable) (obj1)));
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, 22);
        }
        if (jsonobject1 != null) goto _L2; else goto _L1
_L1:
        i = ((JSONStoreCollection) (obj1)).countAllDocuments();
_L4:
        jsonstorecontext = new PluginResult(org.apache.cordova.PluginResult.Status.OK, i);
        return jsonstorecontext;
_L2:
        JSONStoreQueryParts jsonstorequeryparts;
        JSONStoreQueryPart jsonstorequerypart;
        Iterator iterator;
        jsonstorequeryparts = new JSONStoreQueryParts();
        jsonstorequerypart = new JSONStoreQueryPart();
        iterator = jsonobject1.keys();
_L3:
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_311;
        }
        s = (String)iterator.next();
        obj = jsonobject1.get(s);
        jsonstorecontext = ((JSONStoreContext) (obj));
        if (!(obj instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_272;
        }
        if (((Boolean)obj).booleanValue())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        jsonstorecontext = Integer.valueOf(i);
        if (!Boolean.valueOf(flag).booleanValue())
        {
            break MISSING_BLOCK_LABEL_297;
        }
        jsonstorequerypart.addEqual(s, jsonstorecontext.toString());
          goto _L3
        jsonstorequerypart.addLike(s, jsonstorecontext.toString());
          goto _L3
        jsonstorequeryparts.addQueryPart(jsonstorequerypart);
        jsonstorecontext = new JSONStoreCountOptions();
        jsonstorecontext.includeDeletedDocuments(true);
        (new JSONArray()).put(jsonobject1);
        i = ((JSONStoreCollection) (obj1)).countDocuments(jsonstorequeryparts, jsonstorecontext);
          goto _L4
    }
}
