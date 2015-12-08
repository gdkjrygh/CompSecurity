// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.model;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.model:
//            d, f, e, CmObject, 
//            CmObjectList, c

final class b extends d
{

    private final Class b;

    public b(JSONObject jsonobject, Class class1)
    {
        super(jsonobject);
        b = class1;
    }

    private Object a(Object aobj[])
    {
        String s = (String)aobj[0];
        aobj = ((Object []) (CmObject.Factory.access$200(aobj[1])));
        try
        {
            ((JSONObject)a).putOpt(s, ((Object) (aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new IllegalArgumentException(((Throwable) (aobj)));
        }
        return null;
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
    {
        Object obj1;
        Class class2;
        boolean flag;
        flag = true;
        obj1 = null;
        class2 = method.getDeclaringClass();
        if (class2 != java/lang/Object) goto _L2; else goto _L1
_L1:
        obj = a(method, aobj);
_L15:
        return obj;
_L2:
        if (class2 != java/util/Map)
        {
            break MISSING_BLOCK_LABEL_508;
        }
        obj = method.getName();
        if (((String) (obj)).equals("clear"))
        {
            method = ((JSONObject)a).keys();
            do
            {
                obj = obj1;
                if (!method.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                method.next();
                method.remove();
            } while (true);
        }
        if (((String) (obj)).equals("containsKey"))
        {
            return Boolean.valueOf(((JSONObject)a).has((String)aobj[0]));
        }
        if (!((String) (obj)).equals("containsValue")) goto _L4; else goto _L3
_L3:
        obj = (JSONObject)a;
        method = ((Method) (aobj[0]));
        aobj = ((JSONObject) (obj)).keys();
_L8:
        if (!((Iterator) (aobj)).hasNext()) goto _L6; else goto _L5
_L5:
        obj1 = ((JSONObject) (obj)).opt((String)((Iterator) (aobj)).next());
        if (obj1 == null || !obj1.equals(method)) goto _L8; else goto _L7
_L7:
        flag = true;
_L9:
        return Boolean.valueOf(flag);
_L6:
        flag = false;
        if (true) goto _L9; else goto _L4
_L4:
        if (((String) (obj)).equals("entrySet"))
        {
            aobj = (JSONObject)a;
            method = new HashSet();
            obj1 = ((JSONObject) (aobj)).keys();
            do
            {
                obj = method;
                if (!((Iterator) (obj1)).hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                obj = (String)((Iterator) (obj1)).next();
                method.add(new f(((String) (obj)), ((JSONObject) (aobj)).opt(((String) (obj)))));
            } while (true);
        }
        if (((String) (obj)).equals("get"))
        {
            return ((JSONObject)a).opt((String)aobj[0]);
        }
        if (((String) (obj)).equals("isEmpty"))
        {
            if (((JSONObject)a).length() != 0)
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }
        if (((String) (obj)).equals("keySet"))
        {
            return e.a((JSONObject)a);
        }
        if (((String) (obj)).equals("put"))
        {
            return a(aobj);
        }
        if (!((String) (obj)).equals("putAll"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(aobj[0] instanceof Map)) goto _L11; else goto _L10
_L10:
        obj = (Map)aobj[0];
_L13:
        e.a((JSONObject)a, ((Map) (obj)));
        return null;
_L11:
        obj = obj1;
        if (!(aobj[0] instanceof CmObject))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((CmObject)aobj[0]).asMap();
        if (true) goto _L13; else goto _L12
_L12:
        if (true) goto _L15; else goto _L14
_L14:
        if (((String) (obj)).equals("remove"))
        {
            ((JSONObject)a).remove((String)aobj[0]);
            return null;
        }
        if (((String) (obj)).equals("size"))
        {
            return Integer.valueOf(((JSONObject)a).length());
        }
        if (((String) (obj)).equals("values"))
        {
            return e.b((JSONObject)a);
        } else
        {
            return a(method);
        }
        if (class2 == com/cleanmaster/sdk/cmloginsdkjar/model/CmObject)
        {
            String s = method.getName();
            if (s.equals("cast"))
            {
                method = (Class)aobj[0];
                if (method != null && method.isAssignableFrom(b))
                {
                    return obj;
                } else
                {
                    return CmObject.Factory.access$000(method, (JSONObject)a);
                }
            }
            if (s.equals("getInnerJSONObject"))
            {
                return ((b)Proxy.getInvocationHandler(obj)).a;
            }
            if (s.equals("asMap"))
            {
                return CmObject.Factory.access$100((JSONObject)a);
            }
            if (s.equals("getProperty"))
            {
                return ((JSONObject)a).opt((String)aobj[0]);
            }
            if (s.equals("getPropertyAs"))
            {
                return CmObject.Factory.coerceValueToExpectedType(((JSONObject)a).opt((String)aobj[0]), (Class)aobj[1], null);
            }
            if (s.equals("getPropertyAsList"))
            {
                return CmObject.Factory.coerceValueToExpectedType(((JSONObject)a).opt((String)aobj[0]), com/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList, new c(this, (Class)aobj[1]));
            }
            if (s.equals("setProperty"))
            {
                return a(aobj);
            }
            if (s.equals("removeProperty"))
            {
                ((JSONObject)a).remove((String)aobj[0]);
                return null;
            } else
            {
                return a(method);
            }
        }
        if (com/cleanmaster/sdk/cmloginsdkjar/model/CmObject.isAssignableFrom(class2))
        {
            obj = method.getName();
            int i = method.getParameterTypes().length;
            obj = CmObject.Factory.convertCamelCaseToLowercaseWithUnderscores(((String) (obj)).substring(3));
            if (i == 0)
            {
                aobj = ((Object []) (((JSONObject)a).opt(((String) (obj)))));
                Class class1 = method.getReturnType();
                obj = method.getGenericReturnType();
                if (obj instanceof ParameterizedType)
                {
                    obj = (ParameterizedType)obj;
                } else
                {
                    obj = null;
                }
                return CmObject.Factory.coerceValueToExpectedType(((Object) (aobj)), class1, ((ParameterizedType) (obj)));
            }
            if (i == 1)
            {
                method = ((Method) (CmObject.Factory.access$200(aobj[0])));
                ((JSONObject)a).putOpt(((String) (obj)), method);
                return null;
            } else
            {
                return a(method);
            }
        } else
        {
            return a(method);
        }
    }

    public final String toString()
    {
        return String.format("CmObject{graphObjectClass=%s, state=%s}", new Object[] {
            b.getSimpleName(), a
        });
    }
}
