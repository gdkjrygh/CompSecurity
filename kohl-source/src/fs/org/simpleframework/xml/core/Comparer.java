// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class Comparer
{

    private final String ignore[];

    public Comparer()
    {
        this(new String[] {
            "name"
        });
    }

    public transient Comparer(String as[])
    {
        ignore = as;
    }

    private boolean isIgnore(Method method)
    {
        method = method.getName();
        if (ignore != null)
        {
            String as[] = ignore;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                if (method.equals(as[i]))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean equals(Annotation annotation, Annotation annotation1)
        throws Exception
    {
        Method amethod[];
        Object obj;
        Class class1;
        obj = annotation.annotationType();
        class1 = annotation1.annotationType();
        amethod = ((Class) (obj)).getDeclaredMethods();
        if (!obj.equals(class1)) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = amethod.length;
        i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = amethod[i];
        if (isIgnore(((Method) (obj))) || ((Method) (obj)).invoke(annotation, new Object[0]).equals(((Method) (obj)).invoke(annotation1, new Object[0]))) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return true;
    }
}
