// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv.bean;

import au.com.bytecode.opencsv.CSVReader;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package au.com.bytecode.opencsv.bean:
//            MappingStrategy

public class CsvToBean
{

    private Map editorMap;

    public CsvToBean()
    {
        editorMap = null;
    }

    private void addEditorToMap(Class class1, PropertyEditor propertyeditor)
    {
        if (propertyeditor != null)
        {
            editorMap.put(class1, propertyeditor);
        }
    }

    private String checkForTrim(String s, PropertyDescriptor propertydescriptor)
    {
        String s1 = s;
        if (trimmableProperty(propertydescriptor))
        {
            s1 = s.trim();
        }
        return s1;
    }

    private PropertyEditor getPropertyEditorValue(Class class1)
    {
        if (editorMap == null)
        {
            editorMap = new HashMap();
        }
        PropertyEditor propertyeditor1 = (PropertyEditor)editorMap.get(class1);
        PropertyEditor propertyeditor = propertyeditor1;
        if (propertyeditor1 == null)
        {
            propertyeditor = PropertyEditorManager.findEditor(class1);
            addEditorToMap(class1, propertyeditor);
        }
        return propertyeditor;
    }

    private boolean trimmableProperty(PropertyDescriptor propertydescriptor)
    {
        return !propertydescriptor.getPropertyType().getName().contains("String");
    }

    protected Object convertValue(String s, PropertyDescriptor propertydescriptor)
        throws InstantiationException, IllegalAccessException
    {
        PropertyEditor propertyeditor = getPropertyEditor(propertydescriptor);
        propertydescriptor = s;
        if (propertyeditor != null)
        {
            propertyeditor.setAsText(s);
            propertydescriptor = ((PropertyDescriptor) (propertyeditor.getValue()));
        }
        return propertydescriptor;
    }

    protected PropertyEditor getPropertyEditor(PropertyDescriptor propertydescriptor)
        throws InstantiationException, IllegalAccessException
    {
        Class class1 = propertydescriptor.getPropertyEditorClass();
        if (class1 != null)
        {
            return (PropertyEditor)class1.newInstance();
        } else
        {
            return getPropertyEditorValue(propertydescriptor.getPropertyType());
        }
    }

    public List parse(MappingStrategy mappingstrategy, CSVReader csvreader)
    {
        ArrayList arraylist;
        mappingstrategy.captureHeader(csvreader);
        arraylist = new ArrayList();
_L1:
        String as[] = csvreader.readNext();
        if (as != null)
        {
            try
            {
                arraylist.add(processLine(mappingstrategy, as));
            }
            // Misplaced declaration of an exception variable
            catch (MappingStrategy mappingstrategy)
            {
                throw new RuntimeException("Error parsing CSV!", mappingstrategy);
            }
        } else
        {
            return arraylist;
        }
          goto _L1
    }

    public List parse(MappingStrategy mappingstrategy, Reader reader)
    {
        return parse(mappingstrategy, new CSVReader(reader));
    }

    protected Object processLine(MappingStrategy mappingstrategy, String as[])
        throws IllegalAccessException, InvocationTargetException, InstantiationException, IntrospectionException
    {
        Object obj = mappingstrategy.createBean();
        for (int i = 0; i < as.length; i++)
        {
            PropertyDescriptor propertydescriptor = mappingstrategy.findDescriptor(i);
            if (propertydescriptor != null)
            {
                Object obj1 = convertValue(checkForTrim(as[i], propertydescriptor), propertydescriptor);
                propertydescriptor.getWriteMethod().invoke(obj, new Object[] {
                    obj1
                });
            }
        }

        return obj;
    }
}
