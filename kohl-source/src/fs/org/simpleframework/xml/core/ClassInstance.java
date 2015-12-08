// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


// Referenced classes of package fs.org.simpleframework.xml.core:
//            Instance, Instantiator

class ClassInstance
    implements Instance
{

    private Instantiator creator;
    private Class type;
    private Object value;

    public ClassInstance(Instantiator instantiator, Class class1)
    {
        creator = instantiator;
        type = class1;
    }

    public Object getInstance()
        throws Exception
    {
        if (value == null)
        {
            value = creator.getObject(type);
        }
        return value;
    }

    public Class getType()
    {
        return type;
    }

    public boolean isReference()
    {
        return false;
    }

    public Object setInstance(Object obj)
        throws Exception
    {
        value = obj;
        return obj;
    }
}
