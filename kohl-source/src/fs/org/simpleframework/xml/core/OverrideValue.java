// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Value;

class OverrideValue
    implements Value
{

    private final Class type;
    private final Value value;

    public OverrideValue(Value value1, Class class1)
    {
        value = value1;
        type = class1;
    }

    public int getLength()
    {
        return value.getLength();
    }

    public Class getType()
    {
        return type;
    }

    public Object getValue()
    {
        return value.getValue();
    }

    public boolean isReference()
    {
        return value.isReference();
    }

    public void setValue(Object obj)
    {
        value.setValue(obj);
    }
}
