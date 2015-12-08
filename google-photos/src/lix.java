// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class lix
    implements Comparator
{

    lix(liw liw)
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (liz)obj;
        obj1 = (liz)obj1;
        return obj.getClass().getCanonicalName().compareTo(obj1.getClass().getCanonicalName());
    }
}
