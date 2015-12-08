// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.a;

import com.arist.b.b;
import java.util.Comparator;

// Referenced classes of package com.arist.model.a:
//            b

final class c
    implements Comparator
{

    final com.arist.model.a.b a;

    c(com.arist.model.a.b b1)
    {
        a = b1;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (b)obj;
        obj1 = (b)obj1;
        return ((b) (obj)).d().compareTo(((b) (obj1)).d());
    }
}
