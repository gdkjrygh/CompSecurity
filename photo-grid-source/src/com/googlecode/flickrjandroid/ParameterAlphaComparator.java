// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;

import java.util.Comparator;

// Referenced classes of package com.googlecode.flickrjandroid:
//            Parameter

public class ParameterAlphaComparator
    implements Comparator
{

    public ParameterAlphaComparator()
    {
    }

    public int compare(Parameter parameter, Parameter parameter1)
    {
        return parameter.getName().compareTo(parameter1.getName());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Parameter)obj, (Parameter)obj1);
    }
}
