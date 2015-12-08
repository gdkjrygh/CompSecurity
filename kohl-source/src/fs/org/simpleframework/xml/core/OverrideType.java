// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import java.lang.annotation.Annotation;

class OverrideType
    implements Type
{

    private final Class override;
    private final Type type;

    public OverrideType(Type type1, Class class1)
    {
        override = class1;
        type = type1;
    }

    public Annotation getAnnotation(Class class1)
    {
        return type.getAnnotation(class1);
    }

    public Class getType()
    {
        return override;
    }

    public String toString()
    {
        return type.toString();
    }
}
