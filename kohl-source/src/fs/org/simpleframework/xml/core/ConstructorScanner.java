// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Attribute;
import fs.org.simpleframework.xml.Element;
import fs.org.simpleframework.xml.ElementArray;
import fs.org.simpleframework.xml.ElementList;
import fs.org.simpleframework.xml.ElementMap;
import fs.org.simpleframework.xml.Text;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Signature, Initializer, ParameterFactory, Parameter, 
//            ConstructorException, PersistenceException, MethodException, ClassCreator, 
//            Creator

class ConstructorScanner
{

    private List list;
    private Initializer primary;
    private Signature registry;
    private Class type;

    public ConstructorScanner(Class class1)
        throws Exception
    {
        list = new ArrayList();
        registry = new Signature(class1);
        type = class1;
        scan(class1);
    }

    private void build(Constructor constructor, Signature signature)
        throws Exception
    {
        constructor = new Initializer(constructor, signature);
        if (constructor.isDefault())
        {
            primary = constructor;
        }
        list.add(constructor);
    }

    private Parameter create(Constructor constructor, Annotation annotation, int i)
        throws Exception
    {
        constructor = ParameterFactory.getInstance(constructor, annotation, i);
        annotation = constructor.getPath();
        if (registry.containsKey(annotation))
        {
            validate(constructor, annotation);
        }
        return constructor;
    }

    private boolean isInstantiable(Class class1)
    {
        while (Modifier.isStatic(class1.getModifiers()) || !class1.isMemberClass()) 
        {
            return true;
        }
        return false;
    }

    private Parameter process(Constructor constructor, Annotation annotation, int i)
        throws Exception
    {
        if (annotation instanceof Attribute)
        {
            return create(constructor, annotation, i);
        }
        if (annotation instanceof ElementList)
        {
            return create(constructor, annotation, i);
        }
        if (annotation instanceof ElementArray)
        {
            return create(constructor, annotation, i);
        }
        if (annotation instanceof ElementMap)
        {
            return create(constructor, annotation, i);
        }
        if (annotation instanceof Element)
        {
            return create(constructor, annotation, i);
        }
        if (annotation instanceof Text)
        {
            return create(constructor, annotation, i);
        } else
        {
            return null;
        }
    }

    private void scan(Class class1)
        throws Exception
    {
        Constructor aconstructor[] = class1.getDeclaredConstructors();
        if (!isInstantiable(class1))
        {
            throw new ConstructorException("Can not construct inner %s", new Object[] {
                class1
            });
        }
        int j = aconstructor.length;
        for (int i = 0; i < j; i++)
        {
            Constructor constructor = aconstructor[i];
            Signature signature = new Signature(class1);
            if (!class1.isPrimitive())
            {
                scan(constructor, signature);
            }
        }

    }

    private void scan(Constructor constructor, Signature signature)
        throws Exception
    {
        Annotation aannotation[][] = constructor.getParameterAnnotations();
        Class aclass[] = constructor.getParameterTypes();
        for (int i = 0; i < aclass.length; i++)
        {
            for (int j = 0; j < aannotation[i].length; j++)
            {
                Parameter parameter = process(constructor, aannotation[i][j], i);
                if (parameter == null)
                {
                    continue;
                }
                String s = parameter.getPath();
                if (signature.containsKey(s))
                {
                    throw new PersistenceException("Parameter '%s' is a duplicate in %s", new Object[] {
                        s, constructor
                    });
                }
                registry.put(s, parameter);
                signature.put(s, parameter);
            }

        }

        if (aclass.length == signature.size())
        {
            build(constructor, signature);
        }
    }

    private void validate(Parameter parameter, String s)
        throws Exception
    {
        Parameter parameter1 = (Parameter)registry.get(s);
        Annotation annotation = parameter1.getAnnotation();
        if (!parameter.getAnnotation().equals(annotation))
        {
            throw new MethodException("Annotations do not match for '%s' in %s", new Object[] {
                s, type
            });
        }
        if (parameter1.getType() != parameter.getType())
        {
            throw new MethodException("Method types do not match for '%s' in %s", new Object[] {
                s, type
            });
        } else
        {
            return;
        }
    }

    public Creator getCreator()
    {
        return new ClassCreator(list, registry, primary);
    }
}
