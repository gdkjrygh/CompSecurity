// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.strategy;


// Referenced classes of package fs.org.simpleframework.xml.strategy:
//            Value

class ArrayValue
    implements Value
{

    private int size;
    private Class type;
    private Object value;

    public ArrayValue(Class class1, int i)
    {
        type = class1;
        size = i;
    }

    public int getLength()
    {
        return size;
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
