// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv.bean;

import au.com.bytecode.opencsv.CSVReader;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package au.com.bytecode.opencsv.bean:
//            MappingStrategy

public class HeaderColumnNameMappingStrategy
    implements MappingStrategy
{

    protected Map descriptorMap;
    protected String header[];
    protected Class type;

    public HeaderColumnNameMappingStrategy()
    {
        descriptorMap = null;
    }

    private PropertyDescriptor[] loadDescriptors(Class class1)
        throws IntrospectionException
    {
        return Introspector.getBeanInfo(class1).getPropertyDescriptors();
    }

    public void captureHeader(CSVReader csvreader)
        throws IOException
    {
        header = csvreader.readNext();
    }

    public Object createBean()
        throws InstantiationException, IllegalAccessException
    {
        return type.newInstance();
    }

    public PropertyDescriptor findDescriptor(int i)
        throws IntrospectionException
    {
        String s = getColumnName(i);
        if (s != null && s.trim().length() > 0)
        {
            return findDescriptor(s);
        } else
        {
            return null;
        }
    }

    protected PropertyDescriptor findDescriptor(String s)
        throws IntrospectionException
    {
        if (descriptorMap == null)
        {
            descriptorMap = loadDescriptorMap(getType());
        }
        return (PropertyDescriptor)descriptorMap.get(s.toUpperCase().trim());
    }

    protected String getColumnName(int i)
    {
        if (header != null && i < header.length)
        {
            return header[i];
        } else
        {
            return null;
        }
    }

    public Class getType()
    {
        return type;
    }

    protected Map loadDescriptorMap(Class class1)
        throws IntrospectionException
    {
        class1 = new HashMap();
        PropertyDescriptor apropertydescriptor[] = loadDescriptors(getType());
        int j = apropertydescriptor.length;
        for (int i = 0; i < j; i++)
        {
            PropertyDescriptor propertydescriptor = apropertydescriptor[i];
            class1.put(propertydescriptor.getName().toUpperCase().trim(), propertydescriptor);
        }

        return class1;
    }

    protected boolean matches(String s, PropertyDescriptor propertydescriptor)
    {
        return propertydescriptor.getName().equals(s.trim());
    }

    public void setType(Class class1)
    {
        type = class1;
    }
}
