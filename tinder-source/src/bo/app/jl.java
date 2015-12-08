// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Comparator;

public final class jl
    implements Comparator
{

    public jl()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (String)obj;
        obj1 = (String)obj1;
        return ((String) (obj)).substring(0, ((String) (obj)).lastIndexOf("_")).compareTo(((String) (obj1)).substring(0, ((String) (obj1)).lastIndexOf("_")));
    }
}
