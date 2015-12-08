// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FacebookRequestErrorClassification
{

    public static final int EC_APP_TOO_MANY_CALLS = 4;
    public static final int EC_INVALID_SESSION = 102;
    public static final int EC_INVALID_TOKEN = 190;
    public static final int EC_RATE = 9;
    public static final int EC_SERVICE_UNAVAILABLE = 2;
    public static final int EC_TOO_MANY_USER_ACTION_CALLS = 341;
    public static final int EC_USER_TOO_MANY_CALLS = 17;
    public static final String KEY_LOGIN_RECOVERABLE = "login_recoverable";
    public static final String KEY_NAME = "name";
    public static final String KEY_OTHER = "other";
    public static final String KEY_RECOVERY_MESSAGE = "recovery_message";
    public static final String KEY_TRANSIENT = "transient";
    private static FacebookRequestErrorClassification defaultInstance;
    private final Map loginRecoverableErrors;
    private final String loginRecoverableRecoveryMessage;
    private final Map otherErrors;
    private final String otherRecoveryMessage;
    private final Map transientErrors;
    private final String transientRecoveryMessage;

    FacebookRequestErrorClassification(Map map, Map map1, Map map2, String s, String s1, String s2)
    {
        otherErrors = map;
        transientErrors = map1;
        loginRecoverableErrors = map2;
        otherRecoveryMessage = s;
        transientRecoveryMessage = s1;
        loginRecoverableRecoveryMessage = s2;
    }

    public static FacebookRequestErrorClassification createFromJSON(JSONArray jsonarray)
    {
        if (jsonarray == null)
        {
            return null;
        }
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        Map map = null;
        Map map1 = null;
        Map map2 = null;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject = jsonarray.optJSONObject(i);
            Map map3 = map2;
            Map map4 = map1;
            Map map5 = map;
            String s3 = s2;
            String s4 = s1;
            String s5 = s;
            if (jsonobject != null)
            {
                String s6 = jsonobject.optString("name");
                map3 = map2;
                map4 = map1;
                map5 = map;
                s3 = s2;
                s4 = s1;
                s5 = s;
                if (s6 != null)
                {
                    if (s6.equalsIgnoreCase("other"))
                    {
                        s3 = jsonobject.optString("recovery_message", null);
                        map3 = parseJSONDefinition(jsonobject);
                        s5 = s;
                        s4 = s1;
                        map5 = map;
                        map4 = map1;
                    } else
                    if (s6.equalsIgnoreCase("transient"))
                    {
                        s4 = jsonobject.optString("recovery_message", null);
                        map4 = parseJSONDefinition(jsonobject);
                        map3 = map2;
                        map5 = map;
                        s3 = s2;
                        s5 = s;
                    } else
                    {
                        map3 = map2;
                        map4 = map1;
                        map5 = map;
                        s3 = s2;
                        s4 = s1;
                        s5 = s;
                        if (s6.equalsIgnoreCase("login_recoverable"))
                        {
                            s5 = jsonobject.optString("recovery_message", null);
                            map5 = parseJSONDefinition(jsonobject);
                            map3 = map2;
                            map4 = map1;
                            s3 = s2;
                            s4 = s1;
                        }
                    }
                }
            }
            i++;
            map2 = map3;
            map1 = map4;
            map = map5;
            s2 = s3;
            s1 = s4;
            s = s5;
        }
        return new FacebookRequestErrorClassification(map2, map1, map, s2, s1, s);
    }

    public static FacebookRequestErrorClassification getDefaultErrorClassification()
    {
        com/facebook/internal/FacebookRequestErrorClassification;
        JVM INSTR monitorenter ;
        FacebookRequestErrorClassification facebookrequesterrorclassification;
        if (defaultInstance == null)
        {
            defaultInstance = getDefaultErrorClassificationImpl();
        }
        facebookrequesterrorclassification = defaultInstance;
        com/facebook/internal/FacebookRequestErrorClassification;
        JVM INSTR monitorexit ;
        return facebookrequesterrorclassification;
        Exception exception;
        exception;
        throw exception;
    }

    private static FacebookRequestErrorClassification getDefaultErrorClassificationImpl()
    {
        return new FacebookRequestErrorClassification(null, new _cls1(), new _cls2(), null, null, null);
    }

    private static Map parseJSONDefinition(JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("items");
        if (jsonarray.length() == 0)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            jsonobject = jsonarray.optJSONObject(i);
            if (jsonobject == null)
            {
                continue;
            }
            int k = jsonobject.optInt("code");
            if (k == 0)
            {
                continue;
            }
            JSONArray jsonarray1 = jsonobject.optJSONArray("subcodes");
            if (jsonarray1 != null && jsonarray1.length() > 0)
            {
                jsonobject = new HashSet();
                for (int j = 0; j < jsonarray1.length(); j++)
                {
                    int l = jsonarray1.optInt(j);
                    if (l != 0)
                    {
                        jsonobject.add(Integer.valueOf(l));
                    }
                }

            } else
            {
                jsonobject = null;
            }
            hashmap.put(Integer.valueOf(k), jsonobject);
            i++;
        }
        return hashmap;
    }

    public final com.facebook.FacebookRequestError.Category classify(int i, int j, boolean flag)
    {
        if (flag)
        {
            return com.facebook.FacebookRequestError.Category.TRANSIENT;
        }
        if (otherErrors != null && otherErrors.containsKey(Integer.valueOf(i)))
        {
            Set set = (Set)otherErrors.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(j)))
            {
                return com.facebook.FacebookRequestError.Category.OTHER;
            }
        }
        if (loginRecoverableErrors != null && loginRecoverableErrors.containsKey(Integer.valueOf(i)))
        {
            Set set1 = (Set)loginRecoverableErrors.get(Integer.valueOf(i));
            if (set1 == null || set1.contains(Integer.valueOf(j)))
            {
                return com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE;
            }
        }
        if (transientErrors != null && transientErrors.containsKey(Integer.valueOf(i)))
        {
            Set set2 = (Set)transientErrors.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(j)))
            {
                return com.facebook.FacebookRequestError.Category.TRANSIENT;
            }
        }
        return com.facebook.FacebookRequestError.Category.OTHER;
    }

    public final Map getLoginRecoverableErrors()
    {
        return loginRecoverableErrors;
    }

    public final Map getOtherErrors()
    {
        return otherErrors;
    }

    public final String getRecoveryMessage(com.facebook.FacebookRequestError.Category category)
    {
        switch (_cls3..SwitchMap.com.facebook.FacebookRequestError.Category[category.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return otherRecoveryMessage;

        case 2: // '\002'
            return loginRecoverableRecoveryMessage;

        case 3: // '\003'
            return transientRecoveryMessage;
        }
    }

    public final Map getTransientErrors()
    {
        return transientErrors;
    }

    private class _cls1 extends HashMap
    {

        _cls1()
        {
            put(Integer.valueOf(2), null);
            put(Integer.valueOf(4), null);
            put(Integer.valueOf(9), null);
            put(Integer.valueOf(17), null);
            put(Integer.valueOf(341), null);
        }
    }


    private class _cls2 extends HashMap
    {

        _cls2()
        {
            put(Integer.valueOf(102), null);
            put(Integer.valueOf(190), null);
        }
    }


    private class _cls3
    {

        static final int $SwitchMap$com$facebook$FacebookRequestError$Category[];

        static 
        {
            $SwitchMap$com$facebook$FacebookRequestError$Category = new int[com.facebook.FacebookRequestError.Category.values().length];
            try
            {
                $SwitchMap$com$facebook$FacebookRequestError$Category[com.facebook.FacebookRequestError.Category.OTHER.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$facebook$FacebookRequestError$Category[com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$facebook$FacebookRequestError$Category[com.facebook.FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
