// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.strategy;


// Referenced classes of package fs.org.simpleframework.xml.strategy:
//            Value

class ObjectValue
    implements Value
{

    private Class type;
    private Object value;

    public ObjectValue(Class class1)
    {
        type = class1;
    }

    public int getLength()
    {
        return 0;
    }

    public Class getType()
    {
        return type;
    }

    public Object getValue()
    {
        return value;
    }

    public boolean isReference()
    {
        return false;
    }

    public void setValue(Object obj)
    {
        value = obj;
    }
}
