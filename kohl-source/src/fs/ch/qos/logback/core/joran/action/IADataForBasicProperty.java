// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.util.PropertySetter;
import fs.ch.qos.logback.core.util.AggregationType;

class IADataForBasicProperty
{

    final AggregationType aggregationType;
    final PropertySetter parentBean;
    final String propertyName;

    IADataForBasicProperty(PropertySetter propertysetter, AggregationType aggregationtype, String s)
    {
        parentBean = propertysetter;
        aggregationType = aggregationtype;
        propertyName = s;
    }
}
