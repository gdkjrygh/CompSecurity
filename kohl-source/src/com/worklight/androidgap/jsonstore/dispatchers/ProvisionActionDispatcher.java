// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.api.JSONStoreInitOptions;
import com.worklight.jsonstore.api.WLJSONStore;
import com.worklight.jsonstore.database.SearchFieldType;
import com.worklight.jsonstore.exceptions.JSONStoreCloseAllException;
import com.worklight.jsonstore.exceptions.JSONStoreInvalidPasswordException;
import com.worklight.jsonstore.exceptions.JSONStoreInvalidSchemaException;
import com.worklight.jsonstore.exceptions.JSONStoreSchemaMismatchException;
import com.worklight.jsonstore.exceptions.JSONStoreTransactionDuringInitException;
import com.worklight.jsonstore.util.JSONStoreLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.jsonstore.dispatchers:
//            BaseDatabaseActionDispatcher

public class ProvisionActionDispatcher extends BaseDatabaseActionDispatcher
{

    private static final String OPTIONS_SECURE_RANDOM = "secureRandom";
    private static final String OPTION_ADD_INDEXES = "additionalSearchFields";
    private static final String OPTION_ANALYTICS = "analytics";
    private static final String OPTION_DROP_COLLECTION = "dropCollection";
    private static final String OPTION_PASSWORD = "collectionPassword";
    private static final String OPTION_USERNAME = "username";
    private static final String PARAM_OPTIONS = "options";
    private static final String PARAM_SCHEMA = "schema";

    public ProvisionActionDispatcher(Context context)
    {
        super("provision", context);
        addParameter("schema", true, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
        addParameter("options", true, false, new JSONStoreParameterType[] {
            JSONStoreParameterType.OBJECT
        });
    }

    private JSONStoreCollection createCollectionInstance(String s, JSONStoreContext jsonstorecontext, JSONObject jsonobject)
        throws Throwable
    {
        HashMap hashmap = new HashMap();
        Map map = parseSearchFields(jsonstorecontext.getObjectParameter("schema"));
        jsonstorecontext = hashmap;
        if (jsonobject != null)
        {
            jsonstorecontext = parseSearchFields(jsonobject);
        }
        s = new JSONStoreCollection(s);
        String s1;
        for (jsonobject = map.keySet().iterator(); jsonobject.hasNext(); s.setSearchField(s1, (SearchFieldType)map.get(s1)))
        {
            s1 = (String)jsonobject.next();
        }

        String s2;
        for (jsonobject = jsonstorecontext.keySet().iterator(); jsonobject.hasNext(); s.setAdditionalSearchField(s2, (SearchFieldType)jsonstorecontext.get(s2)))
        {
            s2 = (String)jsonobject.next();
        }

        return s;
    }

    private PluginResult initializeCollection(JSONStoreCollection jsonstorecollection, JSONStoreInitOptions jsonstoreinitoptions)
    {
        WLJSONStore wljsonstore = WLJSONStore.getInstance(getAndroidContext());
        try
        {
            LinkedList linkedlist = new LinkedList();
            linkedlist.add(jsonstorecollection);
            wljsonstore.openCollections(linkedlist, jsonstoreinitoptions);
            if (jsonstorecollection.wasReopened())
            {
                return new PluginResult(org.apache.cordova.PluginResult.Status.OK, 1);
            }
            jsonstorecollection = new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreCollection jsonstorecollection)
        {
            logger.logError("Error validating schema", jsonstorecollection);
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -1);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreCollection jsonstorecollection)
        {
            logger.logError("Error setting key", jsonstorecollection);
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -3);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreCollection jsonstorecollection)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -2);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreCollection jsonstorecollection)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -6);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreCollection jsonstorecollection)
        {
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -44);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreCollection jsonstorecollection)
        {
            logger.logError("Error during provision", jsonstorecollection);
            jsonstorecollection = jsonstorecollection.getMessage();
            if (jsonstorecollection != null && jsonstorecollection.contains("file is encrypted"))
            {
                return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -3);
            } else
            {
                return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -1);
            }
        }
        return jsonstorecollection;
    }

    private void logOptionsObject(JSONObject jsonobject, boolean flag, String s, String s1)
    {
        logger.logTrace((new StringBuilder()).append("   additionalSearchFields=").append(jsonobject).toString());
        logger.logTrace((new StringBuilder()).append("   dropCollection=").append(flag).toString());
        logger.logTrace((new StringBuilder()).append("   username=").append(s1).toString());
        s1 = logger;
        StringBuilder stringbuilder = (new StringBuilder()).append("   collectionPassword=");
        if (s == null || "".equals(s))
        {
            jsonobject = "[]";
        } else
        {
            jsonobject = "xxxxxxxx";
        }
        s1.logTrace(stringbuilder.append(jsonobject).toString());
    }

    private Map parseSearchFields(JSONObject jsonobject)
        throws JSONException
    {
        HashMap hashmap = new HashMap();
        JSONArray jsonarray = jsonobject.names();
        if (jsonarray != null)
        {
            int j = jsonarray.length();
            for (int i = 0; i < j; i++)
            {
                String s = jsonarray.getString(i);
                hashmap.put(s, SearchFieldType.valueOf(jsonobject.getString(s).toUpperCase()));
            }

        }
        return hashmap;
    }

    public PluginResult databaseActionDispatch(JSONStoreContext jsonstorecontext)
        throws Throwable
    {
        JSONObject jsonobject = null;
        boolean flag = false;
        String s = null;
        Object obj = null;
        String s1 = null;
        boolean flag1 = false;
        JSONObject jsonobject1 = jsonstorecontext.getObjectParameter("options");
        if (jsonobject1 != null)
        {
            jsonobject = jsonobject1.optJSONObject("additionalSearchFields");
            flag = jsonobject1.optBoolean("dropCollection", false);
            s = jsonobject1.optString("collectionPassword", "");
            obj = jsonobject1.optString("username", "jsonstore");
            s1 = jsonobject1.optString("secureRandom", null);
            flag1 = jsonobject1.optBoolean("analytics", false);
            logOptionsObject(jsonobject, flag, s, ((String) (obj)));
        }
        try
        {
            jsonstorecontext = createCollectionInstance(getCollectionName(), jsonstorecontext, jsonobject);
            obj = new JSONStoreInitOptions(((String) (obj)));
            ((JSONStoreInitOptions) (obj)).setPassword(s);
            ((JSONStoreInitOptions) (obj)).setClear(flag);
            ((JSONStoreInitOptions) (obj)).setAnalyticsEnabled(flag1);
            ((JSONStoreInitOptions) (obj)).setSecureRandom(s1);
            jsonstorecontext = initializeCollection(jsonstorecontext, ((JSONStoreInitOptions) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreContext jsonstorecontext)
        {
            logger.logError("Error validating schema", jsonstorecontext);
            return new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, -1);
        }
        return jsonstorecontext;
    }
}
