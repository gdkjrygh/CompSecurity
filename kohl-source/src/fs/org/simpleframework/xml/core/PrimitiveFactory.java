// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Factory, Context, ObjectInstance, Support, 
//            Instance

class PrimitiveFactory extends Factory
{

    public PrimitiveFactory(Context context, Type type)
    {
        super(context, type);
    }

    public PrimitiveFactory(Context context, Type type, Class class1)
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
            return context.getInstance(class1);
        } else
        {
            return new ObjectInstance(context, inputnode);
        }
    }

    public Object getInstance(String s, Class class1)
        throws Exception
    {
        return support.read(s, class1);
    }

    public String getText(Object obj)
        throws Exception
    {
        Class class1 = obj.getClass();
        if (class1.isEnum())
        {
            return support.write(obj, class1);
        } else
        {
            return support.write(obj, class1);
        }
    }
}
