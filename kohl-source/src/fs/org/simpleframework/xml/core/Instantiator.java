// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ConstructorCache, ClassInstance, Instance

class Instantiator
{

    private final ConstructorCache cache = new ConstructorCache();

    public Instantiator()
    {
    }

    public Instance getInstance(Class class1)
    {
        return new ClassInstance(this, class1);
    }

    public Object getObject(Class class1)
        throws Exception
    {
        Constructor constructor1 = (Constructor)cache.get(class1);
        Constructor constructor = constructor1;
        if (constructor1 == null)
        {
            constructor = class1.getDeclaredConstructor(new Class[0]);
            if (!constructor.isAccessible())
            {
                constructor.setAccessible(true);
            }
            cache.put(class1, constructor);
        }
        return constructor.newInstance(new Object[0]);
    }
}
