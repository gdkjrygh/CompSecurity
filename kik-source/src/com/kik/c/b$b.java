// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.c;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.kik.c:
//            b

private final class <init>
    implements Comparator
{

    final b a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        obj1 = (File)obj1;
        obj = ((File) (obj)).getName().split("\\.");
        obj1 = ((File) (obj1)).getName().split("\\.");
        int i = Long.decode(obj[0]).compareTo(Long.decode(obj1[0]));
        if (i != 0)
        {
            return i;
        } else
        {
            return Long.decode(obj[1]).compareTo(Long.decode(obj1[1]));
        }
    }

    private ct(b b1)
    {
        a = b1;
        super();
    }

    ct(b b1, byte byte0)
    {
        this(b1);
    }
}
