// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.a;

import com.google.common.base.Function;
import java.lang.annotation.Annotation;
import java.util.Collection;

// Referenced classes of package com.google.inject.a:
//            b

class c
    implements Function
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public Boolean a(Class class1)
    {
        class1 = class1.getAnnotations();
        int j = class1.length;
        for (int i = 0; i < j; i++)
        {
            Annotation annotation = class1[i];
            if (b.a(a).contains(annotation.annotationType()))
            {
                return Boolean.valueOf(true);
            }
        }

        return Boolean.valueOf(false);
    }

    public Object apply(Object obj)
    {
        return a((Class)obj);
    }
}
