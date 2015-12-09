// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.am;
import com.google.b.c.a;
import com.google.b.k;

// Referenced classes of package com.google.b.b.a:
//            bh

final class at
    implements am
{

    at()
    {
    }

    public final al a(k k, a a1)
    {
        a1 = a1.getRawType();
        if (!java/lang/Enum.isAssignableFrom(a1) || a1 == java/lang/Enum)
        {
            return null;
        }
        k = a1;
        if (!a1.isEnum())
        {
            k = a1.getSuperclass();
        }
        return new bh(k);
    }
}
