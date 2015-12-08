// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

final class eys
{

    final int a[];

    eys(Collection collection)
    {
        a = new int[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            Integer integer = (Integer)collection.next();
            a[i] = integer.intValue();
        }

    }
}
