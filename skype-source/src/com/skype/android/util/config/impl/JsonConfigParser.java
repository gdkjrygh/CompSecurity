// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config.impl;

import com.skype.android.util.Log;
import com.skype.android.util.config.ConfigParams;
import com.skype.android.util.config.impl.resolvers.CustomNameResolver;
import com.skype.android.util.config.impl.resolvers.DeobfuscationNameResolver;
import com.skype.android.util.config.impl.resolvers.PropertyNameResolver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.skype.android.util.config.impl:
//            NameResolver, ConfigParseException, ExpressionEvaluationUtils

public class JsonConfigParser
{

    private static final CustomNameResolver CUSTOM_NAME_RESOLVER = new CustomNameResolver();
    private static final DeobfuscationNameResolver DEOBFUSCATION_NAME_RESOLVER = new DeobfuscationNameResolver();
    private static final PropertyNameResolver PROPERTY_NAME_RESOLVER = new PropertyNameResolver();
    private static final String VERSION_KEY = "ver";
    private final NameResolver nameResolvers[];
    private final Map result = new HashMap();

    public JsonConfigParser()
    {
        nameResolvers = (new NameResolver[] {
            PROPERTY_NAME_RESOLVER, CUSTOM_NAME_RESOLVER, DEOBFUSCATION_NAME_RESOLVER
        });
        DEOBFUSCATION_NAME_RESOLVER.setResolvers(nameResolvers);
    }

    private static boolean isPlainType(Object obj)
    {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof String);
    }

    private boolean match(String s)
        throws ConfigParseException
    {
        NameResolver anameresolver[] = nameResolvers;
        int j = anameresolver.length;
        for (int i = 0; i < j; i++)
        {
            NameResolver nameresolver = anameresolver[i];
            if (s.startsWith(nameresolver.getPrefix()))
            {
                return ExpressionEvaluationUtils.match(s.substring(nameresolver.getPrefix().length()), nameresolver);
            }
        }

        throw new ConfigParseException((new StringBuilder("Could not evaluate expression: ")).append(s).toString());
    }

    private void parseInnerObj(JSONObject jsonobject)
        throws JSONException, ConfigParseException
    {
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            String s = ((String)iterator.next()).trim();
            if (!"ver".equals(s))
            {
                Object obj = jsonobject.get(s);
                if (isPlainType(obj))
                {
                    result.put(s, obj);
                    if (Log.isLoggable("Utils", 3))
                    {
                        Log.d("Utils", (new StringBuilder("Mapping added '")).append(s).append("' -> '").append(obj).append("'").toString());
                    }
                } else
                if (obj instanceof JSONObject)
                {
                    if (match(s))
                    {
                        if (Log.isLoggable("Utils", 3))
                        {
                            Log.d("Utils", (new StringBuilder("Condition '")).append(s).append("' passed").toString());
                        }
                        parseInnerObj((JSONObject)obj);
                    } else
                    if (Log.isLoggable("Utils", 3))
                    {
                        Log.d("Utils", (new StringBuilder("Condition '")).append(s).append("' failed").toString());
                    }
                } else
                {
                    throw new ConfigParseException("object or plain value expected");
                }
            }
        }

    }

    private boolean parseVersionedObj(JSONObject jsonobject)
        throws JSONException, ConfigParseException
    {
        int i = jsonobject.optInt("ver");
        if (i > 2 || i <= 0)
        {
            if (Log.isLoggable("Utils", 4))
            {
                Log.i("Utils", (new StringBuilder("Skipping JSON object with version ")).append(i).append(": ").append(jsonobject).toString());
            }
            return false;
        }
        if (Log.isLoggable("Utils", 4))
        {
            Log.i("Utils", (new StringBuilder("Parsing JSON object with version ")).append(i).append(": ").append(jsonobject).toString());
        }
        parseInnerObj(jsonobject);
        return true;
    }

    public ConfigParams getResult()
    {
        return new ConfigParams(result);
    }

    public boolean parse(String s)
        throws JSONException, ConfigParseException
    {
        s = new JSONTokener(s);
        Object obj;
        boolean flag;
        for (flag = false; s.more(); flag |= parseVersionedObj((JSONObject)obj))
        {
            obj = s.nextValue();
            if (!(obj instanceof JSONObject))
            {
                throw s.syntaxError("object expected");
            }
        }

        return flag;
    }

}
