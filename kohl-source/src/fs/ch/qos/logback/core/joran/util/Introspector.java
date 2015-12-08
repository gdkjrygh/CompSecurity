// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package fs.ch.qos.logback.core.joran.util:
//            MethodDescriptor, PropertyDescriptor

public class Introspector
{

    public static String decapitalize(String s)
    {
        String s1;
        if (s == null || s.length() == 0)
        {
            s1 = s;
        } else
        {
            String s2 = s.substring(0, 1).toLowerCase();
            s1 = s2;
            if (s.length() > 1)
            {
                return (new StringBuilder()).append(s2).append(s.substring(1)).toString();
            }
        }
        return s1;
    }

    public static MethodDescriptor[] getMethodDescriptors(Class class1)
    {
        ArrayList arraylist = new ArrayList();
        class1 = class1.getMethods();
        int j = class1.length;
        for (int i = 0; i < j; i++)
        {
            Method method = class1[i];
            arraylist.add(new MethodDescriptor(method.getName(), method));
        }

        return (MethodDescriptor[])arraylist.toArray(new MethodDescriptor[0]);
    }

    public static PropertyDescriptor[] getPropertyDescriptors(Class class1)
    {
        int j = "set".length();
        HashMap hashmap = new HashMap();
        Method amethod[] = class1.getMethods();
        int k = amethod.length;
        int i = 0;
        while (i < k) 
        {
            Method method = amethod[i];
            class1 = method.getName();
            boolean flag;
            boolean flag1;
            if (class1.startsWith("get") && class1.length() > j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (class1.startsWith("set") && class1.length() > j)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag || flag1)
            {
                String s = decapitalize(class1.substring(j));
                PropertyDescriptor propertydescriptor = (PropertyDescriptor)hashmap.get(s);
                class1 = propertydescriptor;
                if (propertydescriptor == null)
                {
                    class1 = new PropertyDescriptor(s);
                    hashmap.put(s, class1);
                }
                Class aclass[] = method.getParameterTypes();
                if (flag1)
                {
                    if (aclass.length == 1)
                    {
                        class1.setWriteMethod(method);
                        class1.setPropertyType(aclass[0]);
                    }
                } else
                if (flag && aclass.length == 0)
                {
                    class1.setReadMethod(method);
                    if (class1.getPropertyType() == null)
                    {
                        class1.setPropertyType(method.getReturnType());
                    }
                }
            }
            i++;
        }
        return (PropertyDescriptor[])hashmap.values().toArray(new PropertyDescriptor[0]);
    }
}
