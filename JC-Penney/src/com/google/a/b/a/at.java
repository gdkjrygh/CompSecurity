// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.ag;
import com.google.a.c.a;
import com.google.a.j;

// Referenced classes of package com.google.a.b.a:
//            bg

final class at
    implements ag
{

    at()
    {
    }

    public af a(j j, a a1)
    {
        a1 = a1.a();
        if (!java/lang/Enum.isAssignableFrom(a1) || a1 == java/lang/Enum)
        {
            return null;
        }
        j = a1;
        if (!a1.isEnum())
        {
            j = a1.getSuperclass();
        }
        return new bg(j);
    }
}
