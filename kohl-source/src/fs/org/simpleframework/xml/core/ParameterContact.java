// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Contact, Reflector

abstract class ParameterContact
    implements Contact
{

    protected final Constructor factory;
    protected final int index;
    protected final Annotation label;
    protected final Annotation labels[];

    public ParameterContact(Annotation annotation, Constructor constructor, int i)
    {
        labels = constructor.getParameterAnnotations()[i];
        factory = constructor;
        index = i;
        label = annotation;
    }

    public Object get(Object obj)
    {
        return null;
    }

    public Annotation getAnnotation()
    {
        return label;
    }

    public Annotation getAnnotation(Class class1)
    {
        Annotation aannotation[] = labels;
        int j = aannotation.length;
        for (int i = 0; i < j; i++)
        {
            Annotation annotation = aannotation[i];
            if (annotation.annotationType().equals(class1))
            {
                return annotation;
            }
        }

        return null;
    }

    public Class getDependent()
    {
        return Reflector.getParameterDependent(factory, index);
    }

    public Class[] getDependents()
    {
        return Reflector.getParameterDependents(factory, index);
    }

    public Class getType()
    {
        return factory.getParameterTypes()[index];
    }

    public boolean isReadOnly()
    {
        return false;
    }

    public void set(Object obj, Object obj1)
    {
    }

    public String toString()
    {
        return String.format("parameter %s of constructor %s", new Object[] {
            Integer.valueOf(index), factory
        });
    }
}
