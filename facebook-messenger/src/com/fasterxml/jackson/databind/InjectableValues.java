// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//            DeserializationContext, BeanProperty

public abstract class InjectableValues
{

    public InjectableValues()
    {
    }

    public abstract Object findInjectableValue(Object obj, DeserializationContext deserializationcontext, BeanProperty beanproperty, Object obj1);
}
