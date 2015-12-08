// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Value;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Instance, Context

class ObjectInstance
    implements Instance
{

    private final Context context;
    private final Class type;
    private final Value value;

    public ObjectInstance(Context context1, Value value1)
    {
        type = value1.getType();
        context = context1;
        value = value1;
    }

    public Object getInstance()
        throws Exception
    {
        Object obj;
        if (value.isReference())
        {
            obj = value.getValue();
        } else
        {
            Object obj1 = getInstance(type);
            obj = obj1;
            if (value != null)
            {
                value.setValue(obj1);
                return obj1;
            }
        }
        return obj;
    }

    public Object getInstance(Class class1)
        throws Exception
    {
        return context.getInstance(class1).getInstance();
    }

    public Class getType()
    {
        return type;
    }

    public boolean isReference()
    {
        return value.isReference();
    }

    public Object setInstance(Object obj)
    {
        if (value != null)
        {
            value.setValue(obj);
        }
        return obj;
    }
}
