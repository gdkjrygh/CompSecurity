// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;

import java.util.Comparator;

// Referenced classes of package com.github.anrwatchdog:
//            ANRError

final class a
    implements Comparator
{

    private Thread a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (Thread)obj;
        obj1 = (Thread)obj1;
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == a)
        {
            return 1;
        }
        if (obj1 == a)
        {
            return -1;
        } else
        {
            return ((Thread) (obj1)).getName().compareTo(((Thread) (obj)).getName());
        }
    }

    (Thread thread)
    {
        a = thread;
        super();
    }
}
