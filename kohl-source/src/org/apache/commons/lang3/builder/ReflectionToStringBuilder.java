// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

// Referenced classes of package org.apache.commons.lang3.builder:
//            ToStringBuilder, ToStringStyle

public class ReflectionToStringBuilder extends ToStringBuilder
{

    private boolean appendStatics;
    private boolean appendTransients;
    protected String excludeFieldNames[];
    private Class upToClass;

    public ReflectionToStringBuilder(Object obj)
    {
        super(obj);
        appendStatics = false;
        appendTransients = false;
        upToClass = null;
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle tostringstyle)
    {
        super(obj, tostringstyle);
        appendStatics = false;
        appendTransients = false;
        upToClass = null;
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle tostringstyle, StringBuffer stringbuffer)
    {
        super(obj, tostringstyle, stringbuffer);
        appendStatics = false;
        appendTransients = false;
        upToClass = null;
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle tostringstyle, StringBuffer stringbuffer, Class class1, boolean flag, boolean flag1)
    {
        super(obj, tostringstyle, stringbuffer);
        appendStatics = false;
        appendTransients = false;
        upToClass = null;
        setUpToClass(class1);
        setAppendTransients(flag);
        setAppendStatics(flag1);
    }

    static String[] toNoNullStringArray(Collection collection)
    {
        if (collection == null)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        } else
        {
            return toNoNullStringArray(collection.toArray());
        }
    }

    static String[] toNoNullStringArray(Object aobj[])
    {
        ArrayList arraylist = new ArrayList(aobj.length);
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            if (obj != null)
            {
                arraylist.add(obj.toString());
            }
        }

        return (String[])arraylist.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public static String toString(Object obj)
    {
        return toString(obj, null, false, false, null);
    }

    public static String toString(Object obj, ToStringStyle tostringstyle)
    {
        return toString(obj, tostringstyle, false, false, null);
    }

    public static String toString(Object obj, ToStringStyle tostringstyle, boolean flag)
    {
        return toString(obj, tostringstyle, flag, false, null);
    }

    public static String toString(Object obj, ToStringStyle tostringstyle, boolean flag, boolean flag1)
    {
        return toString(obj, tostringstyle, flag, flag1, null);
    }

    public static String toString(Object obj, ToStringStyle tostringstyle, boolean flag, boolean flag1, Class class1)
    {
        return (new ReflectionToStringBuilder(obj, tostringstyle, null, class1, flag, flag1)).toString();
    }

    public static String toStringExclude(Object obj, Collection collection)
    {
        return toStringExclude(obj, toNoNullStringArray(collection));
    }

    public static transient String toStringExclude(Object obj, String as[])
    {
        return (new ReflectionToStringBuilder(obj)).setExcludeFieldNames(as).toString();
    }

    protected boolean accept(Field field)
    {
        while (field.getName().indexOf('$') != -1 || Modifier.isTransient(field.getModifiers()) && !isAppendTransients() || Modifier.isStatic(field.getModifiers()) && !isAppendStatics() || excludeFieldNames != null && Arrays.binarySearch(excludeFieldNames, field.getName()) >= 0) 
        {
            return false;
        }
        return true;
    }

    protected void appendFieldsIn(Class class1)
    {
        if (class1.isArray())
        {
            reflectionAppendArray(getObject());
        } else
        {
            class1 = class1.getDeclaredFields();
            AccessibleObject.setAccessible(class1, true);
            int j = class1.length;
            int i = 0;
            while (i < j) 
            {
                Field field = class1[i];
                String s = field.getName();
                if (accept(field))
                {
                    try
                    {
                        append(s, getValue(field));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Class class1)
                    {
                        throw new InternalError((new StringBuilder()).append("Unexpected IllegalAccessException: ").append(class1.getMessage()).toString());
                    }
                }
                i++;
            }
        }
    }

    public String[] getExcludeFieldNames()
    {
        return (String[])excludeFieldNames.clone();
    }

    public Class getUpToClass()
    {
        return upToClass;
    }

    protected Object getValue(Field field)
        throws IllegalArgumentException, IllegalAccessException
    {
        return field.get(getObject());
    }

    public boolean isAppendStatics()
    {
        return appendStatics;
    }

    public boolean isAppendTransients()
    {
        return appendTransients;
    }

    public ReflectionToStringBuilder reflectionAppendArray(Object obj)
    {
        getStyle().reflectionAppendArrayDetail(getStringBuffer(), null, obj);
        return this;
    }

    public void setAppendStatics(boolean flag)
    {
        appendStatics = flag;
    }

    public void setAppendTransients(boolean flag)
    {
        appendTransients = flag;
    }

    public transient ReflectionToStringBuilder setExcludeFieldNames(String as[])
    {
        if (as == null)
        {
            excludeFieldNames = null;
            return this;
        } else
        {
            excludeFieldNames = toNoNullStringArray(as);
            Arrays.sort(excludeFieldNames);
            return this;
        }
    }

    public void setUpToClass(Class class1)
    {
        if (class1 != null)
        {
            Object obj = getObject();
            if (obj != null && !class1.isInstance(obj))
            {
                throw new IllegalArgumentException("Specified class is not a superclass of the object");
            }
        }
        upToClass = class1;
    }

    public String toString()
    {
        if (getObject() == null)
        {
            return getStyle().getNullText();
        }
        Class class1 = getObject().getClass();
        appendFieldsIn(class1);
        for (; class1.getSuperclass() != null && class1 != getUpToClass(); appendFieldsIn(class1))
        {
            class1 = class1.getSuperclass();
        }

        return super.toString();
    }
}
