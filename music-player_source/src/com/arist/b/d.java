// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.b;

import java.util.Comparator;

// Referenced classes of package com.arist.b:
//            b, c

final class d
    implements Comparator
{

    final c a;

    d(c c)
    {
        a = c;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (b)obj;
        obj1 = (b)obj1;
        return ((b) (obj)).d().compareTo(((b) (obj1)).d());
    }
}
