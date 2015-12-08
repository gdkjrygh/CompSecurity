// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.util.PropertySetter;
import fs.ch.qos.logback.core.util.AggregationType;

public class IADataForComplexProperty
{

    final AggregationType aggregationType;
    final String complexPropertyName;
    boolean inError;
    private Object nestedComplexProperty;
    final PropertySetter parentBean;

    public IADataForComplexProperty(PropertySetter propertysetter, AggregationType aggregationtype, String s)
    {
        parentBean = propertysetter;
        aggregationType = aggregationtype;
        complexPropertyName = s;
    }

    public AggregationType getAggregationType()
    {
        return aggregationType;
    }

    public String getComplexPropertyName()
    {
        return complexPropertyName;
    }

    public Object getNestedComplexProperty()
    {
        return nestedComplexProperty;
    }

    public void setNestedComplexProperty(Object obj)
    {
        nestedComplexProperty = obj;
    }
}
