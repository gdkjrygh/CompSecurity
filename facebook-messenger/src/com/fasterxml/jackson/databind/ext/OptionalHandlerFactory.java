// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.util.Provider;
import java.util.Collection;
import java.util.Iterator;

public class OptionalHandlerFactory
{

    private static final String CLASS_NAME_DOM_DOCUMENT = "org.w3c.dom.Node";
    private static final String CLASS_NAME_DOM_NODE = "org.w3c.dom.Node";
    private static final String DESERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers";
    private static final String DESERIALIZER_FOR_DOM_DOCUMENT = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer";
    private static final String DESERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer";
    private static final String PACKAGE_PREFIX_JAVAX_XML = "javax.xml.";
    private static final String SERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers";
    private static final String SERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMSerializer";
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
        Class class3;
        Class class2 = class1.getSuperclass();
        do
        {
            class3 = class1;
            if (class2 == null)
            {
                break;
            }
            if (class2.getName().startsWith(s))
            {
                return true;
            }
            class2 = class2.getSuperclass();
        } while (true);
_L3:
        if (class3 != null)
        {
            if (hasInterfaceStartingWith(class3, s))
            {
                return true;
            }
        } else
        {
            return false;
        }
        if (true) goto _L2; else goto _L1
_L2:
        class3 = class3.getSuperclass();
        if (true) goto _L3; else goto _L1
_L1:
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

    public JsonDeserializer findDeserializer(JavaType javatype, DeserializationConfig deserializationconfig)
    {
        javatype = javatype.getRawClass();
        if (javatype.getName().startsWith("javax.xml.") || hasSupertypeStartingWith(javatype, "javax.xml."))
        {
            deserializationconfig = ((DeserializationConfig) (instantiate("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers")));
            if (deserializationconfig == null)
            {
                return null;
            }
        } else
        {
            if (doesImplement(javatype, "org.w3c.dom.Node"))
            {
                return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
            }
            if (doesImplement(javatype, "org.w3c.dom.Node"))
            {
                return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
            } else
            {
                return null;
            }
        }
        deserializationconfig = ((Provider)deserializationconfig).provide();
        for (Iterator iterator = deserializationconfig.iterator(); iterator.hasNext();)
        {
            StdDeserializer stddeserializer1 = (StdDeserializer)iterator.next();
            if (javatype == stddeserializer1.getValueClass())
            {
                return stddeserializer1;
            }
        }

        for (deserializationconfig = deserializationconfig.iterator(); deserializationconfig.hasNext();)
        {
            StdDeserializer stddeserializer = (StdDeserializer)deserializationconfig.next();
            if (stddeserializer.getValueClass().isAssignableFrom(javatype))
            {
                return stddeserializer;
            }
        }

        return null;
    }

    public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype)
    {
        serializationconfig = javatype.getRawClass();
        if (serializationconfig.getName().startsWith("javax.xml.") || hasSupertypeStartingWith(serializationconfig, "javax.xml."))
        {
            javatype = ((JavaType) (instantiate("com.fasterxml.jackson.databind.ext.CoreXMLSerializers")));
            if (javatype == null)
            {
                return null;
            }
        } else
        if (doesImplement(serializationconfig, "org.w3c.dom.Node"))
        {
            return (JsonSerializer)instantiate("com.fasterxml.jackson.databind.ext.DOMSerializer");
        } else
        {
            return null;
        }
        javatype = ((Provider)javatype).provide();
        for (Iterator iterator = javatype.iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
            if (serializationconfig == entry1.getKey())
            {
                return (JsonSerializer)entry1.getValue();
            }
        }

        for (javatype = javatype.iterator(); javatype.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)javatype.next();
            if (((Class)entry.getKey()).isAssignableFrom(serializationconfig))
            {
                return (JsonSerializer)entry.getValue();
            }
        }

        return null;
    }

}
