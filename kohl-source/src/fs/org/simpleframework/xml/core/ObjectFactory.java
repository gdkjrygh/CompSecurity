// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            PrimitiveFactory, InstantiationException, Context, ObjectInstance, 
//            Instance

class ObjectFactory extends PrimitiveFactory
{

    public ObjectFactory(Context context, Type type, Class class1)
    {
        super(context, type, class1);
    }

    public Instance getInstance(InputNode inputnode)
        throws Exception
    {
        inputnode = getOverride(inputnode);
        Class class1 = getType();
        if (inputnode == null)
        {
            if (!isInstantiable(class1))
            {
                throw new InstantiationException("Cannot instantiate %s for %s", new Object[] {
                    class1, type
                });
            } else
            {
                return context.getInstance(class1);
            }
        } else
        {
            return new ObjectInstance(context, inputnode);
        }
    }
}
