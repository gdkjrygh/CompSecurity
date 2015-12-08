// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Value;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Instance, Context

class ConversionInstance
    implements Instance
{

    private final Context context;
    private final Class convert;
    private final Value value;

    public ConversionInstance(Context context1, Value value1, Class class1)
        throws Exception
    {
        context = context1;
        convert = class1;
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
            Object obj1 = getInstance(convert);
            obj = obj1;
            if (obj1 != null)
            {
                setInstance(obj1);
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
        return convert;
    }

    public boolean isReference()
    {
        return value.isReference();
    }

    public Object setInstance(Object obj)
        throws Exception
    {
        if (value != null)
        {
            value.setValue(obj);
        }
        return obj;
    }
}
