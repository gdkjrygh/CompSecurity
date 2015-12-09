// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.Comparator;

final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (Field)obj;
        obj1 = (Field)obj1;
        return ((Field) (obj)).getName().compareTo(((Field) (obj1)).getName());
    }

    ()
    {
    }
}
