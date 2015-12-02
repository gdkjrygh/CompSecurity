// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json.jsonmirror;

import com.facebook.common.json.jsonmirror.a.a;
import com.facebook.common.json.jsonmirror.a.c;
import com.facebook.common.json.jsonmirror.a.e;
import com.facebook.common.json.jsonmirror.a.f;
import com.facebook.common.json.jsonmirror.a.h;
import com.facebook.common.json.jsonmirror.a.k;
import com.facebook.common.w.m;
import com.facebook.common.w.s;
import com.facebook.debug.log.b;
import com.google.common.a.ik;
import com.google.common.a.kl;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.common.json.jsonmirror:
//            b, f, a

public class JMAutogen
{

    protected static Map a = ik.a();
    private static Class b = com/facebook/common/json/jsonmirror/JMAutogen;

    public JMAutogen()
    {
    }

    protected static c a(DynamicKeyDictType dynamickeydicttype)
    {
        HashSet hashset = kl.a();
        Class class1 = dynamickeydicttype.valueElementType();
        hashset.add(b(class1));
        return new e(class1, dynamickeydicttype.a());
    }

    public static c a(Class class1)
    {
        com/facebook/common/json/jsonmirror/JMAutogen;
        JVM INSTR monitorenter ;
        Object obj1 = (c)a.get(class1);
        Object obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        java.util.HashMap hashmap;
        int j;
        hashmap = ik.a();
        obj = class1.getDeclaredAnnotations();
        j = obj.length;
        int i = 0;
_L18:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_541;
        }
        if (!(obj[i] instanceof IgnoreUnexpectedJsonFields)) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L24:
        k k1;
        Iterator iterator;
        k1 = new k(class1, hashmap, flag);
        a.put(class1, k1);
        iterator = c(class1).entrySet().iterator();
_L17:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        Object obj2;
        Annotation annotation;
        obj = (java.util.Map.Entry)iterator.next();
        obj2 = (Field)((java.util.Map.Entry) (obj)).getKey();
        annotation = (Annotation)((java.util.Map.Entry) (obj)).getValue();
        if (!(annotation instanceof InferredType) && !(annotation instanceof ExplicitType) && !(annotation instanceof EscapedObjectType)) goto _L8; else goto _L7
_L7:
        if (!(annotation instanceof InferredType)) goto _L10; else goto _L9
_L9:
        obj = ((InferredType)annotation).jsonFieldName();
        obj1 = ((Field) (obj2)).getType();
_L19:
        a a1;
        String s1;
        s1 = ((Field) (obj2)).getName();
        a1 = com.facebook.common.json.jsonmirror.a.a.a(((Class) (obj1)));
        obj2 = a1;
        if (a1 != null) goto _L12; else goto _L11
_L11:
        if (!com/facebook/common/json/jsonmirror/b.isAssignableFrom(((Class) (obj1)))) goto _L14; else goto _L13
_L13:
        obj2 = a(((Class) (obj1)));
_L12:
        if (!(annotation instanceof EscapedObjectType)) goto _L16; else goto _L15
_L15:
        obj1 = new f(((a) (obj2)), com.facebook.common.json.c.a);
_L23:
        com.facebook.debug.b.a.a(m.b("json field [%s] is defined multiple times in the model", new Object[] {
            obj
        }), hashmap.containsKey(obj));
        hashmap.put(obj, new s(s1, obj1));
          goto _L17
        class1;
        throw class1;
_L4:
        i++;
          goto _L18
_L10:
label0:
        {
            if (!(annotation instanceof ExplicitType))
            {
                break label0;
            }
            obj1 = (ExplicitType)annotation;
            obj = ((ExplicitType) (obj1)).jsonFieldName();
            obj1 = ((ExplicitType) (obj1)).type();
        }
          goto _L19
        obj = ((EscapedObjectType)annotation).jsonFieldName();
        obj1 = ((Field) (obj2)).getType();
          goto _L19
_L14:
        throw new com.facebook.common.json.jsonmirror.f((new StringBuilder()).append("could not infer type for ").append(class1.getName()).append(":").append(s1).toString());
_L8:
        if (!(annotation instanceof ListType)) goto _L21; else goto _L20
_L20:
        obj = (ListType)annotation;
        obj1 = ((Field) (obj2)).getName();
        obj2 = ((ListType) (obj)).jsonFieldName();
        obj = a(((ListType) (obj)));
        com.facebook.debug.b.a.a(hashmap.containsKey(obj2));
        hashmap.put(obj2, new s(obj1, obj));
          goto _L17
_L21:
        if (!(annotation instanceof DynamicKeyDictType)) goto _L17; else goto _L22
_L22:
        obj = (DynamicKeyDictType)annotation;
        obj1 = ((Field) (obj2)).getName();
        obj2 = ((DynamicKeyDictType) (obj)).jsonFieldName();
        obj = a(((DynamicKeyDictType) (obj)));
        com.facebook.debug.b.a.a(hashmap.containsKey(obj2));
        hashmap.put(obj2, new s(obj1, obj));
          goto _L17
_L6:
        a(class1, ((Map) (hashmap)));
        obj = k1;
_L2:
        com/facebook/common/json/jsonmirror/JMAutogen;
        JVM INSTR monitorexit ;
        return ((c) (obj));
_L16:
        obj1 = obj2;
          goto _L23
        flag = false;
          goto _L24
    }

    protected static h a(ListType listtype)
    {
        Object obj = kl.a();
        Class aclass[] = listtype.b();
        int l = aclass.length;
        for (int i = 0; i < l; i++)
        {
            ((Set) (obj)).add(b(aclass[i]));
        }

        obj = new h(((Set) (obj)));
        int j = listtype.a();
        listtype = ((ListType) (obj));
        for (; j > 0; j--)
        {
            HashSet hashset = new HashSet();
            hashset.add(listtype);
            listtype = new h(hashset);
        }

        return listtype;
    }

    private static void a(Class class1, Map map)
    {
        Method method;
        try
        {
            method = class1.getDeclaredMethod("postprocessJMAutogenFields", new Class[] {
                java/util/Map
            });
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            com.facebook.debug.log.b.e(b, "Can't access %s in %s", new Object[] {
                "postprocessJMAutogenFields", class1.getName()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            com.facebook.debug.log.b.e(b, "InvocationTargetException while invoking %s on %s", new Object[] {
                "postprocessJMAutogenFields", class1.getName()
            });
            return;
        }
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        method.setAccessible(true);
        method.invoke(null, new Object[] {
            map
        });
    }

    public static a b(Class class1)
    {
label0:
        {
            a a1 = com.facebook.common.json.jsonmirror.a.a.a(class1);
            Object obj = a1;
            if (a1 == null)
            {
                if (!com/facebook/common/json/jsonmirror/b.isAssignableFrom(class1))
                {
                    break label0;
                }
                obj = a(class1);
            }
            return ((a) (obj));
        }
        throw new com.facebook.common.json.jsonmirror.f((new StringBuilder()).append("could not infer type for ").append(class1.getName()).toString());
    }

    private static Map c(Class class1)
    {
        return com.facebook.common.w.f.a(class1, new com.facebook.common.json.jsonmirror.a(class1), EnumSet.of(com.facebook.common.w.h.INCLUDE_SUPERCLASSES, com.facebook.common.w.h.INCLUDE_FIELDS));
    }


    private class DynamicKeyDictType
        implements Annotation
    {

        public abstract boolean a();

        public abstract String jsonFieldName();

        public abstract Class valueElementType();
    }


    private class IgnoreUnexpectedJsonFields
        implements Annotation
    {
    }


    private class InferredType
        implements Annotation
    {

        public abstract String jsonFieldName();
    }


    private class ExplicitType
        implements Annotation
    {

        public abstract String jsonFieldName();

        public abstract Class type();
    }


    private class EscapedObjectType
        implements Annotation
    {

        public abstract String jsonFieldName();
    }


    private class ListType
        implements Annotation
    {

        public abstract int a();

        public abstract Class[] b();

        public abstract String jsonFieldName();
    }

}
