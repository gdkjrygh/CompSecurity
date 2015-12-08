// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.model;

import com.cleanmaster.sdk.cmloginsdkjar.CmLoginSdkCmObjectException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.model:
//            CmObject, CmObjectList, b, a

public final class tion
{

    private static final SimpleDateFormat dateFormats[];
    private static final HashSet verifiedGraphObjectClasses = new HashSet();

    static Object coerceValueToExpectedType(Object obj, Class class1, ParameterizedType parameterizedtype)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (!Boolean.TYPE.equals(class1)) goto _L4; else goto _L3
_L3:
        Object obj1 = Boolean.valueOf(false);
_L6:
        return obj1;
_L4:
        if (Character.TYPE.equals(class1))
        {
            return Character.valueOf('\0');
        }
        if (class1.isPrimitive())
        {
            return Integer.valueOf(0);
        } else
        {
            return null;
        }
_L2:
        Class class2;
        class2 = obj.getClass();
        obj1 = obj;
        if (class1.isAssignableFrom(class2)) goto _L6; else goto _L5
_L5:
        obj1 = obj;
        if (class1.isPrimitive()) goto _L6; else goto _L7
_L7:
        int i;
        int j;
        if (com/cleanmaster/sdk/cmloginsdkjar/model/CmObject.isAssignableFrom(class1))
        {
            if (org/json/JSONObject.isAssignableFrom(class2))
            {
                return createGraphObjectProxy(class1, (JSONObject)obj);
            }
            if (com/cleanmaster/sdk/cmloginsdkjar/model/CmObject.isAssignableFrom(class2))
            {
                return ((CmObject)obj).cast(class1);
            } else
            {
                throw new CmLoginSdkCmObjectException((new StringBuilder("Can't create CmObject from ")).append(class2.getName()).toString());
            }
        }
        if (java/lang/Iterable.equals(class1) || java/util/Collection.equals(class1) || java/util/List.equals(class1) || com/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList.equals(class1))
        {
            if (parameterizedtype == null)
            {
                throw new CmLoginSdkCmObjectException((new StringBuilder("can't infer generic type of: ")).append(class1.toString()).toString());
            }
            class1 = parameterizedtype.getActualTypeArguments();
            if (class1 == null || class1.length != 1 || !(class1[0] instanceof Class))
            {
                throw new CmLoginSdkCmObjectException("Expect collection properties to be of a type with exactly one generic parameter.");
            }
            class1 = (Class)class1[0];
            if (org/json/JSONArray.isAssignableFrom(class2))
            {
                return createList((JSONArray)obj, class1);
            } else
            {
                throw new CmLoginSdkCmObjectException((new StringBuilder("Can't create Collection from ")).append(class2.getName()).toString());
            }
        }
        if (java/lang/String.equals(class1))
        {
            if (java/lang/Double.isAssignableFrom(class2) || java/lang/Float.isAssignableFrom(class2))
            {
                return String.format("%f", new Object[] {
                    obj
                });
            }
            if (java/lang/Number.isAssignableFrom(class2))
            {
                return String.format("%d", new Object[] {
                    obj
                });
            }
            break MISSING_BLOCK_LABEL_444;
        }
        if (!java/util/Date.equals(class1) || !java/lang/String.isAssignableFrom(class2))
        {
            break MISSING_BLOCK_LABEL_444;
        }
        parameterizedtype = dateFormats;
        j = parameterizedtype.length;
        i = 0;
_L10:
        if (i >= j) goto _L9; else goto _L8
_L8:
        obj1 = parameterizedtype[i];
        obj1 = ((SimpleDateFormat) (obj1)).parse((String)obj);
        if (obj1 != null)
        {
            return obj1;
        }
        continue; /* Loop/switch isn't completed */
        ParseException parseexception;
        parseexception;
        i++;
          goto _L10
_L9:
        throw new CmLoginSdkCmObjectException((new StringBuilder("Can't convert type")).append(class2.getName()).append(" to ").append(class1.getName()).toString());
    }

    static String convertCamelCaseToLowercaseWithUnderscores(String s)
    {
        return s.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase(Locale.US);
    }

    public static CmObject create()
    {
        return create(com/cleanmaster/sdk/cmloginsdkjar/model/CmObject);
    }

    public static CmObject create(Class class1)
    {
        return createGraphObjectProxy(class1, new JSONObject());
    }

    public static CmObject create(JSONObject jsonobject)
    {
        return create(jsonobject, com/cleanmaster/sdk/cmloginsdkjar/model/CmObject);
    }

    public static CmObject create(JSONObject jsonobject, Class class1)
    {
        return createGraphObjectProxy(class1, jsonobject);
    }

    private static CmObject createGraphObjectProxy(Class class1, JSONObject jsonobject)
    {
        verifyCanProxyClass(class1);
        jsonobject = new b(jsonobject, class1);
        return (CmObject)Proxy.newProxyInstance(com/cleanmaster/sdk/cmloginsdkjar/model/CmObject.getClassLoader(), new Class[] {
            class1
        }, jsonobject);
    }

    private static Map createGraphObjectProxyForMap(JSONObject jsonobject)
    {
        jsonobject = new b(jsonobject, java/util/Map);
        return (Map)Proxy.newProxyInstance(com/cleanmaster/sdk/cmloginsdkjar/model/CmObject.getClassLoader(), new Class[] {
            java/util/Map
        }, jsonobject);
    }

    public static CmObjectList createList(Class class1)
    {
        return createList(new JSONArray(), class1);
    }

    public static CmObjectList createList(JSONArray jsonarray, Class class1)
    {
        return new a(jsonarray, class1);
    }

    private static Object getUnderlyingJSONObject(Object obj)
    {
        Object obj1;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            Class class1 = obj.getClass();
            if (com/cleanmaster/sdk/cmloginsdkjar/model/CmObject.isAssignableFrom(class1))
            {
                return ((CmObject)obj).getInnerJSONObject();
            }
            if (com/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList.isAssignableFrom(class1))
            {
                return ((CmObjectList)obj).getInnerJSONArray();
            }
            obj1 = obj;
            if (java/lang/Iterable.isAssignableFrom(class1))
            {
                JSONArray jsonarray = new JSONArray();
                for (obj = ((Iterable)obj).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    Object obj2 = ((Iterator) (obj)).next();
                    if (com/cleanmaster/sdk/cmloginsdkjar/model/CmObject.isAssignableFrom(obj2.getClass()))
                    {
                        jsonarray.put(((CmObject)obj2).getInnerJSONObject());
                    } else
                    {
                        jsonarray.put(obj2);
                    }
                }

                return jsonarray;
            }
        }
        return obj1;
    }

    private static boolean hasClassBeenVerified(Class class1)
    {
        com/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;
        JVM INSTR monitorenter ;
        boolean flag = verifiedGraphObjectClasses.contains(class1);
        com/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;
        JVM INSTR monitorexit ;
        return flag;
        class1;
        throw class1;
    }

    public static boolean hasSameId(CmObject cmobject, CmObject cmobject1)
    {
        if (cmobject != null && cmobject1 != null && cmobject.asMap().containsKey("id") && cmobject1.asMap().containsKey("id"))
        {
            if (cmobject.equals(cmobject1))
            {
                return true;
            }
            cmobject = ((CmObject) (cmobject.getProperty("id")));
            cmobject1 = ((CmObject) (cmobject1.getProperty("id")));
            if (cmobject != null && cmobject1 != null && (cmobject instanceof String) && (cmobject1 instanceof String))
            {
                return cmobject.equals(cmobject1);
            }
        }
        return false;
    }

    private static void recordClassHasBeenVerified(Class class1)
    {
        com/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;
        JVM INSTR monitorenter ;
        verifiedGraphObjectClasses.add(class1);
        com/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

    private static void verifyCanProxyClass(Class class1)
    {
        if (hasClassBeenVerified(class1))
        {
            return;
        }
        if (!class1.isInterface())
        {
            throw new CmLoginSdkCmObjectException((new StringBuilder("Factory can only wrap interfaces, not class: ")).append(class1.getName()).toString());
        }
        Method amethod[] = class1.getMethods();
        int j = amethod.length;
        for (int i = 0; i < j;)
        {
            Method method = amethod[i];
            String s = method.getName();
            int k = method.getParameterTypes().length;
            Class class2 = method.getReturnType();
            if (method.getDeclaringClass().isAssignableFrom(com/cleanmaster/sdk/cmloginsdkjar/model/CmObject) || (k != 1 || class2 != Void.TYPE ? k == 0 && class2 != Void.TYPE && s.startsWith("get") && s.length() > 3 : s.startsWith("set") && s.length() > 3))
            {
                i++;
            } else
            {
                throw new CmLoginSdkCmObjectException((new StringBuilder("Factory can't proxy method: ")).append(method.toString()).toString());
            }
        }

        recordClassHasBeenVerified(class1);
    }

    static 
    {
        dateFormats = (new SimpleDateFormat[] {
            new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US), new SimpleDateFormat("yyyy-MM-dd", Locale.US)
        });
    }




    private tion()
    {
    }
}
