// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ParameterFactory

private static class type
{

    public Class create;
    public Class type;

    private transient Constructor getConstructor(Class aclass[])
        throws Exception
    {
        return create.getConstructor(aclass);
    }

    public Constructor getConstructor()
        throws Exception
    {
        return getConstructor(new Class[] {
            java/lang/reflect/Constructor, type, Integer.TYPE
        });
    }

    public (Class class1, Class class2)
    {
        create = class1;
        type = class2;
    }
}
