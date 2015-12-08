// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Contact, Reflector

class FieldContact
    implements Contact
{

    private Field field;
    private Annotation label;
    private int modifier;
    private String name;

    public FieldContact(Field field1, Annotation annotation)
    {
        modifier = field1.getModifiers();
        label = annotation;
        field = field1;
    }

    private String getName(Field field1)
    {
        String s = field1.getName();
        field1 = s;
        if (s != null)
        {
            field1 = s.intern();
        }
        return field1;
    }

    public Object get(Object obj)
        throws Exception
    {
        return field.get(obj);
    }

    public Annotation getAnnotation()
    {
        return label;
    }

    public Annotation getAnnotation(Class class1)
    {
        if (class1 == label.annotationType())
        {
            return label;
        } else
        {
            return field.getAnnotation(class1);
        }
    }

    public Class getDependent()
    {
        return Reflector.getDependent(field);
    }

    public Class[] getDependents()
    {
        return Reflector.getDependents(field);
    }

    public String getName()
    {
        if (name == null)
        {
            name = getName(field);
        }
        return name;
    }

    public Class getType()
    {
        return field.getType();
    }

    public boolean isFinal()
    {
        return Modifier.isFinal(modifier);
    }

    public boolean isReadOnly()
    {
        return !isStatic() && isFinal();
    }

    public boolean isStatic()
    {
        return Modifier.isStatic(modifier);
    }

    public void set(Object obj, Object obj1)
        throws Exception
    {
        if (!isFinal())
        {
            field.set(obj, obj1);
        }
    }

    public String toString()
    {
        return String.format("field '%s' %s", new Object[] {
            getName(), field.toString()
        });
    }
}
