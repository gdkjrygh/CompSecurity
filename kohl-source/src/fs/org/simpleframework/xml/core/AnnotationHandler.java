// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Comparer, PersistenceException

class AnnotationHandler
    implements InvocationHandler
{

    private final Comparer comparer = new Comparer();
    private final boolean required;
    private final Class type;

    public AnnotationHandler(Class class1, boolean flag)
    {
        required = flag;
        type = class1;
    }

    private void attributes(StringBuilder stringbuilder)
    {
        Method amethod[] = type.getDeclaredMethods();
        for (int i = 0; i < amethod.length; i++)
        {
            String s = amethod[i].getName();
            Object obj = value(amethod[i]);
            if (i > 0)
            {
                stringbuilder.append(',');
                stringbuilder.append(' ');
            }
            stringbuilder.append(s);
            stringbuilder.append('=');
            stringbuilder.append(obj);
        }

        stringbuilder.append(')');
    }

    private boolean equals(Object obj, Object aobj[])
        throws Throwable
    {
        obj = (Annotation)obj;
        aobj = (Annotation)aobj[0];
        if (((Annotation) (obj)).annotationType() != ((Annotation) (aobj)).annotationType())
        {
            throw new PersistenceException("Annotation %s is not the same as %s", new Object[] {
                obj, aobj
            });
        } else
        {
            return comparer.equals(((Annotation) (obj)), ((Annotation) (aobj)));
        }
    }

    private void name(StringBuilder stringbuilder)
    {
        String s = type.getName();
        if (s != null)
        {
            stringbuilder.append('@');
            stringbuilder.append(s);
            stringbuilder.append('(');
        }
    }

    private Object value(Method method)
    {
        if (method.getName().equals("required"))
        {
            return Boolean.valueOf(required);
        } else
        {
            return method.getDefaultValue();
        }
    }

    public Object invoke(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        String s = method.getName();
        if (s.equals("toString"))
        {
            return toString();
        }
        if (s.equals("equals"))
        {
            return Boolean.valueOf(equals(obj, aobj));
        }
        if (s.equals("annotationType"))
        {
            return type;
        }
        if (s.equals("required"))
        {
            return Boolean.valueOf(required);
        } else
        {
            return method.getDefaultValue();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (type != null)
        {
            name(stringbuilder);
            attributes(stringbuilder);
        }
        return stringbuilder.toString();
    }
}
