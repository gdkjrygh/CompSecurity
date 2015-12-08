// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import java.io.Serializable;

public class OptionalHandlerFactory
    implements Serializable
{

    public static final OptionalHandlerFactory instance = new OptionalHandlerFactory();

    protected OptionalHandlerFactory()
    {
    }

    private boolean doesImplement(Class class1, String s)
    {
        for (; class1 != null; class1 = class1.getSuperclass())
        {
            while (class1.getName().equals(s) || hasInterface(class1, s)) 
            {
                return true;
            }
        }

        return false;
    }

    private boolean hasInterface(Class class1, String s)
    {
        int i;
        int k;
        class1 = class1.getInterfaces();
        k = class1.length;
        i = 0;
_L7:
        if (i >= k) goto _L2; else goto _L1
_L1:
        if (!class1[i].getName().equals(s)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        int l = class1.length;
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= l)
                {
                    break label1;
                }
                if (hasInterface(class1[j], s))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean hasInterfaceStartingWith(Class class1, String s)
    {
        int i;
        int k;
        class1 = class1.getInterfaces();
        k = class1.length;
        i = 0;
_L7:
        if (i >= k) goto _L2; else goto _L1
_L1:
        if (!class1[i].getName().startsWith(s)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        int l = class1.length;
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= l)
                {
                    break label1;
                }
                if (hasInterfaceStartingWith(class1[j], s))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean hasSupertypeStartingWith(Class class1, String s)
    {
        Class class2 = class1.getSuperclass();
_L7:
        if (class2 == null) goto _L2; else goto _L1
_L1:
        if (!class2.getName().startsWith(s)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        class2 = class2.getSuperclass();
        continue; /* Loop/switch isn't completed */
_L2:
label0:
        do
        {
label1:
            {
                if (class1 == null)
                {
                    break label1;
                }
                if (hasInterfaceStartingWith(class1, s))
                {
                    break label0;
                }
                class1 = class1.getSuperclass();
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private Object instantiate(String s)
    {
        s = ((String) (Class.forName(s).newInstance()));
        return s;
        s;
_L2:
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public JsonDeserializer findDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
        throws JsonMappingException
    {
        Object obj = javatype.getRawClass();
        if (!((Class) (obj)).getName().startsWith("javax.xml.") && !hasSupertypeStartingWith(((Class) (obj)), "javax.xml.")) goto _L2; else goto _L1
_L1:
        obj = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
        if (obj != null) goto _L4; else goto _L3
_L3:
        return null;
_L2:
        if (doesImplement(((Class) (obj)), "org.w3c.dom.Node"))
        {
            return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
        }
        if (doesImplement(((Class) (obj)), "org.w3c.dom.Node"))
        {
            return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
        }
        if (true) goto _L3; else goto _L4
_L4:
        return ((Deserializers)obj).findBeanDeserializer(javatype, deserializationconfig, beandescription);
    }

    public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
    {
        Object obj = javatype.getRawClass();
        if (!((Class) (obj)).getName().startsWith("javax.xml.") && !hasSupertypeStartingWith(((Class) (obj)), "javax.xml.")) goto _L2; else goto _L1
_L1:
        obj = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLSerializers");
        if (obj != null) goto _L4; else goto _L3
_L3:
        return null;
_L2:
        if (doesImplement(((Class) (obj)), "org.w3c.dom.Node"))
        {
            return (JsonSerializer)instantiate("com.fasterxml.jackson.databind.ext.DOMSerializer");
        }
        if (true) goto _L3; else goto _L4
_L4:
        return ((Serializers)obj).findSerializer(serializationconfig, javatype, beandescription);
    }

}
