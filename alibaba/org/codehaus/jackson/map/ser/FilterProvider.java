// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;


// Referenced classes of package org.codehaus.jackson.map.ser:
//            BeanPropertyFilter

public abstract class FilterProvider
{

    public FilterProvider()
    {
    }

    public abstract BeanPropertyFilter findFilter(Object obj);
}
