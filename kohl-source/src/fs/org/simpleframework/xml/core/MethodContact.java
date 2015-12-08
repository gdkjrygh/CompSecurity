// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Contact, MethodPart, MethodException

class MethodContact
    implements Contact
{

    private Method get;
    private Class item;
    private Class items[];
    private Annotation label;
    private String name;
    private MethodPart set;
    private Class type;

    public MethodContact(MethodPart methodpart)
    {
        this(methodpart, null);
    }

    public MethodContact(MethodPart methodpart, MethodPart methodpart1)
    {
        label = methodpart.getAnnotation();
        items = methodpart.getDependents();
        item = methodpart.getDependent();
        get = methodpart.getMethod();
        type = methodpart.getType();
        name = methodpart.getName();
        set = methodpart1;
    }

    public Object get(Object obj)
        throws Exception
    {
        return get.invoke(obj, new Object[0]);
    }

    public Annotation getAnnotation()
    {
        return label;
    }

    public Annotation getAnnotation(Class class1)
    {
        Annotation annotation1 = get.getAnnotation(class1);
        Annotation annotation;
        if (class1 == label.annotationType())
        {
            annotation = label;
        } else
        {
            annotation = annotation1;
            if (annotation1 == null)
            {
                annotation = annotation1;
                if (set != null)
                {
                    return set.getAnnotation(class1);
                }
            }
        }
        return annotation;
    }

    public Class getDependent()
    {
        return item;
    }

    public Class[] getDependents()
    {
        return items;
    }

    public String getName()
    {
        return name;
    }

    public Class getType()
    {
        return type;
    }

    public boolean isReadOnly()
    {
        return set == null;
    }

    public void set(Object obj, Object obj1)
        throws Exception
    {
        Class class1 = get.getDeclaringClass();
        if (set == null)
        {
            throw new MethodException("Property '%s' is read only in %s", new Object[] {
                name, class1
            });
        } else
        {
            set.getMethod().invoke(obj, new Object[] {
                obj1
            });
            return;
        }
    }

    public String toString()
    {
        return String.format("method '%s'", new Object[] {
            name
        });
    }
}
