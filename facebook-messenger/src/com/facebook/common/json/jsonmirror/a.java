// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json.jsonmirror;

import com.facebook.common.w.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;

// Referenced classes of package com.facebook.common.json.jsonmirror:
//            f

final class a
    implements g
{

    final Class a;

    a(Class class1)
    {
        a = class1;
        super();
    }

    public Annotation a(AccessibleObject accessibleobject)
    {
        Annotation aannotation[] = accessibleobject.getDeclaredAnnotations();
        int j = aannotation.length;
        int i = 0;
        Annotation annotation;
        Annotation annotation1;
        for (annotation = null; i < j; annotation = annotation1)
        {
label0:
            {
                Annotation annotation2 = aannotation[i];
                if (!(annotation2 instanceof JMAutogen.InferredType) && !(annotation2 instanceof JMAutogen.ExplicitType) && !(annotation2 instanceof JMAutogen.ListType) && !(annotation2 instanceof JMAutogen.DynamicKeyDictType))
                {
                    annotation1 = annotation;
                    if (!(annotation2 instanceof JMAutogen.EscapedObjectType))
                    {
                        break label0;
                    }
                }
                if (annotation != null)
                {
                    throw new f((new StringBuilder()).append(a.getName()).append(":").append(accessibleobject.toString()).append(" has more than one JM annotation").toString());
                }
                annotation1 = annotation2;
            }
            i++;
        }

        return annotation;
    }

    public Object b(AccessibleObject accessibleobject)
    {
        return a(accessibleobject);
    }
}
