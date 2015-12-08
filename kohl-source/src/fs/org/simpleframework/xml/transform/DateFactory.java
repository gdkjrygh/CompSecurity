// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.lang.reflect.Constructor;
import java.util.Date;

class DateFactory
{

    private final Constructor factory;

    public DateFactory(Class class1)
        throws Exception
    {
        this(class1, new Class[] {
            Long.TYPE
        });
    }

    public transient DateFactory(Class class1, Class aclass[])
        throws Exception
    {
        factory = class1.getDeclaredConstructor(aclass);
    }

    public transient Date getInstance(Object aobj[])
        throws Exception
    {
        return (Date)factory.newInstance(aobj);
    }
}
