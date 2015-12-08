// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.dispatchers;

import android.content.Context;
import com.worklight.androidgap.jsonstore.types.ActionDispatcher;
import com.worklight.androidgap.jsonstore.types.JSONStoreContext;
import com.worklight.androidgap.jsonstore.types.JSONStoreParamRequirements;
import com.worklight.androidgap.jsonstore.types.JSONStoreParameterType;
import com.worklight.jsonstore.jackson.JsonOrgModule;
import com.worklight.jsonstore.util.JSONStoreLogger;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class BaseActionDispatcher
    implements ActionDispatcher
{

    protected static final String PARAM_DBNAME = "dbName";
    protected static final int RC_FALSE = 0;
    protected static final int RC_OK = 0;
    protected static final int RC_TRUE = 1;
    private Context androidContext;
    protected JSONStoreLogger logger;
    private String name;
    private LinkedList paramReqs;

    public BaseActionDispatcher(String s, Context context)
    {
        logger = JSONStoreUtil.getCoreLogger();
        name = s;
        paramReqs = new LinkedList();
        androidContext = context;
    }

    private void collectParameters(JSONStoreContext jsonstorecontext, JSONArray jsonarray)
        throws Throwable
    {
        int i = 0;
label0:
        for (Iterator iterator = paramReqs.iterator(); iterator.hasNext(); i++)
        {
            JSONStoreParamRequirements jsonstoreparamrequirements = (JSONStoreParamRequirements)iterator.next();
            boolean flag1 = false;
            JSONStoreParameterType ajsonstoreparametertype[] = jsonstoreparamrequirements.getTypes();
            int k = ajsonstoreparametertype.length;
            int j = 0;
            do
            {
label1:
                {
                    boolean flag = flag1;
                    if (j < k)
                    {
                        Object obj = convertParameter(jsonarray, i, ajsonstoreparametertype[j]);
                        if (obj == null)
                        {
                            break label1;
                        }
                        flag = true;
                        jsonstorecontext.addParameter(jsonstoreparamrequirements.getName(), obj);
                    }
                    if (jsonstoreparamrequirements.isRequired() && !flag)
                    {
                        throw new Throwable((new StringBuilder()).append("invalid type for parameter \"").append(jsonstoreparamrequirements.getName()).append("\" in action dispatcher \"").append(getName()).append("\"").toString());
                    }
                    continue label0;
                }
                j++;
            } while (true);
        }

    }

    private Object convertParameter(JSONArray jsonarray, int i, JSONStoreParameterType jsonstoreparametertype)
        throws Throwable
    {
        static class _cls1
        {

            static final int $SwitchMap$com$worklight$androidgap$jsonstore$types$JSONStoreParameterType[];

            static 
            {
                $SwitchMap$com$worklight$androidgap$jsonstore$types$JSONStoreParameterType = new int[JSONStoreParameterType.values().length];
                try
                {
                    $SwitchMap$com$worklight$androidgap$jsonstore$types$JSONStoreParameterType[JSONStoreParameterType.ARRAY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$jsonstore$types$JSONStoreParameterType[JSONStoreParameterType.BOOLEAN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$jsonstore$types$JSONStoreParameterType[JSONStoreParameterType.DOUBLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$jsonstore$types$JSONStoreParameterType[JSONStoreParameterType.INTEGER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$jsonstore$types$JSONStoreParameterType[JSONStoreParameterType.LONG.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$jsonstore$types$JSONStoreParameterType[JSONStoreParameterType.OBJECT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$jsonstore$types$JSONStoreParameterType[JSONStoreParameterType.STRING.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.worklight.androidgap.jsonstore.types.JSONStoreParameterType[jsonstoreparametertype.ordinal()];
        JVM INSTR tableswitch 1 7: default 117
    //                   1 52
    //                   2 61
    //                   3 70
    //                   4 79
    //                   5 88
    //                   6 97
    //                   7 106;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
        return JsonOrgModule.deserializeJSONArray(jsonarray.getString(i));
_L3:
        return Boolean.valueOf(jsonarray.getBoolean(i));
_L4:
        return Double.valueOf(jsonarray.getDouble(i));
_L5:
        return Integer.valueOf(jsonarray.getInt(i));
_L6:
        return Long.valueOf(jsonarray.getLong(i));
_L7:
        return JsonOrgModule.deserializeJSONObject(jsonarray.getString(i));
_L8:
        jsonarray = jsonarray.getString(i);
        return jsonarray;
        jsonarray;
        return null;
_L1:
        return null;
    }

    public abstract PluginResult actionDispatch(JSONStoreContext jsonstorecontext)
        throws Throwable;

    protected transient void addParameter(String s, boolean flag, boolean flag1, JSONStoreParameterType ajsonstoreparametertype[])
    {
        paramReqs.add(new JSONStoreParamRequirements(s, flag, flag1, ajsonstoreparametertype));
    }

    protected transient void addParameter(String s, boolean flag, JSONStoreParameterType ajsonstoreparametertype[])
    {
        paramReqs.add(new JSONStoreParamRequirements(s, flag, true, ajsonstoreparametertype));
    }

    public PluginResult dispatch(JSONArray jsonarray)
        throws Throwable
    {
        JSONStoreContext jsonstorecontext = new JSONStoreContext();
        collectParameters(jsonstorecontext, jsonarray);
        logger.logTrace((new StringBuilder()).append("invoking action dispatcher \"").append(name).append("\" with parameters:").toString());
        for (jsonarray = paramReqs.iterator(); jsonarray.hasNext();)
        {
            JSONStoreParamRequirements jsonstoreparamrequirements = (JSONStoreParamRequirements)jsonarray.next();
            String s = jsonstoreparamrequirements.getName();
            if (jsonstoreparamrequirements.isLoggable())
            {
                logger.logTrace((new StringBuilder()).append("   ").append(s).append("=").append(jsonstorecontext.getUntypedParameter(s)).toString());
            } else
            {
                logger.logTrace((new StringBuilder()).append("   ").append(s).append("=[value not logged]").toString());
            }
        }

        return actionDispatch(jsonstorecontext);
    }

    protected Context getAndroidContext()
    {
        return androidContext;
    }

    public String getName()
    {
        return name;
    }
}
