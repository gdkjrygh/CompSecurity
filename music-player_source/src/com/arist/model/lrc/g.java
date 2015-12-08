// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import java.util.Comparator;

// Referenced classes of package com.arist.model.lrc:
//            h, f

final class g
    implements Comparator
{

    final f a;

    g(f f)
    {
        a = f;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (h)obj;
        obj1 = (h)obj1;
        return (int)(((h) (obj)).a() - ((h) (obj1)).a());
    }
}
