// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.c;

import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.facebook.common.c:
//            f

final class h
    implements Comparator
{

    h()
    {
    }

    public int a(f f1, f f2)
    {
        f1 = f1.b();
        f2 = f2.b();
        if (f1.after(f2))
        {
            return -1;
        }
        return !f2.after(f1) ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((f)obj, (f)obj1);
    }
}
