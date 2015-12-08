// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import java.lang.annotation.Annotation;

class ClassType
    implements Type
{

    private final Class type;

    public ClassType(Class class1)
    {
        type = class1;
    }

    public Annotation getAnnotation(Class class1)
    {
        return null;
    }

    public Class getType()
    {
        return type;
    }

    public String toString()
    {
        return type.toString();
    }
}
