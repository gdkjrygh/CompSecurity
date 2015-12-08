// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.strategy.Value;
import fs.org.simpleframework.xml.stream.InputNode;
import java.lang.reflect.Array;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Factory, InstantiationException, ArrayInstance, ElementException, 
//            Context, Instance

class ArrayFactory extends Factory
{

    public ArrayFactory(Context context, Type type)
    {
        super(context, type);
    }

    private Class getComponentType()
        throws Exception
    {
        Class class1 = getType();
        if (!class1.isArray())
        {
            throw new InstantiationException("The %s not an array for %s", new Object[] {
                class1, type
            });
        } else
        {
            return class1.getComponentType();
        }
    }

    private Instance getInstance(Value value, Class class1)
        throws Exception
    {
        Class class2 = getComponentType();
        if (!class2.isAssignableFrom(class1))
        {
            throw new InstantiationException("Array of type %s cannot hold %s for %s", new Object[] {
                class2, class1, type
            });
        } else
        {
            return new ArrayInstance(value);
        }
    }

    public Instance getInstance(InputNode inputnode)
        throws Exception
    {
        fs.org.simpleframework.xml.stream.Position position = inputnode.getPosition();
        inputnode = getOverride(inputnode);
        if (inputnode == null)
        {
            throw new ElementException("Array length required for %s at %s", new Object[] {
                type, position
            });
        } else
        {
            return getInstance(((Value) (inputnode)), inputnode.getType());
        }
    }

    public Object getInstance()
        throws Exception
    {
        Class class1 = getComponentType();
        if (class1 != null)
        {
            return Array.newInstance(class1, 0);
        } else
        {
            return null;
        }
    }
}
