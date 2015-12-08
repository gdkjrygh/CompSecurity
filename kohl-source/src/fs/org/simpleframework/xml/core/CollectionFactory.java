// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.strategy.Value;
import fs.org.simpleframework.xml.stream.InputNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Factory, InstantiationException, ConversionInstance, Context, 
//            Instance

class CollectionFactory extends Factory
{

    public CollectionFactory(Context context, Type type)
    {
        super(context, type);
    }

    private boolean isCollection(Class class1)
    {
        return java/util/Collection.isAssignableFrom(class1);
    }

    public Class getConversion(Class class1)
        throws Exception
    {
        if (class1.isAssignableFrom(java/util/ArrayList))
        {
            return java/util/ArrayList;
        }
        if (class1.isAssignableFrom(java/util/HashSet))
        {
            return java/util/HashSet;
        }
        if (class1.isAssignableFrom(java/util/TreeSet))
        {
            return java/util/TreeSet;
        } else
        {
            throw new InstantiationException("Cannot instantiate %s for %s", new Object[] {
                class1, type
            });
        }
    }

    public Instance getInstance(Value value)
        throws Exception
    {
        Class class2 = value.getType();
        Class class1 = class2;
        if (!isInstantiable(class2))
        {
            class1 = getConversion(class2);
        }
        if (!isCollection(class1))
        {
            throw new InstantiationException("Invalid collection %s for %s", new Object[] {
                class1, type
            });
        } else
        {
            return new ConversionInstance(context, value, class1);
        }
    }

    public Instance getInstance(InputNode inputnode)
        throws Exception
    {
        inputnode = getOverride(inputnode);
        Class class1 = getType();
        if (inputnode != null)
        {
            return getInstance(((Value) (inputnode)));
        }
        inputnode = class1;
        if (!isInstantiable(class1))
        {
            inputnode = getConversion(class1);
        }
        if (!isCollection(inputnode))
        {
            throw new InstantiationException("Invalid collection %s for %s", new Object[] {
                inputnode, type
            });
        } else
        {
            return context.getInstance(inputnode);
        }
    }

    public Object getInstance()
        throws Exception
    {
        Class class3 = getType();
        Class class1 = class3;
        Class class2 = class1;
        if (!isInstantiable(class1))
        {
            class2 = getConversion(class3);
        }
        if (!isCollection(class2))
        {
            throw new InstantiationException("Invalid collection %s for %s", new Object[] {
                class3, type
            });
        } else
        {
            return class2.newInstance();
        }
    }
}
