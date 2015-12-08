// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringStyle;

// Referenced classes of package org.apache.commons.lang3:
//            AnnotationUtils, ClassUtils

static class setArrayEnd extends ToStringStyle
{

    private static final long serialVersionUID = 1L;

    protected void appendDetail(StringBuffer stringbuffer, String s, Object obj)
    {
        Object obj1 = obj;
        if (obj instanceof Annotation)
        {
            obj1 = AnnotationUtils.toString((Annotation)obj);
        }
        super.appendDetail(stringbuffer, s, obj1);
    }

    protected String getShortClassName(Class class1)
    {
        Object obj = null;
        Iterator iterator = ClassUtils.getAllInterfaces(class1).iterator();
        do
        {
            class1 = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            class1 = (Class)iterator.next();
        } while (!java/lang/annotation/Annotation.isAssignableFrom(class1));
        if (class1 == null)
        {
            class1 = "";
        } else
        {
            class1 = class1.getName();
        }
        return (new StringBuilder(class1)).insert(0, '@').toString();
    }

    yle()
    {
        setDefaultFullDetail(true);
        setArrayContentDetail(true);
        setUseClassName(true);
        setUseShortClassName(true);
        setUseIdentityHashCode(false);
        setContentStart("(");
        setContentEnd(")");
        setFieldSeparator(", ");
        setArrayStart("[");
        setArrayEnd("]");
    }
}
