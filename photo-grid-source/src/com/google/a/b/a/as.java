// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.c.a;
import com.google.a.k;

// Referenced classes of package com.google.a.b.a:
//            bg

final class as
    implements an
{

    as()
    {
    }

    public final am a(k k, a a1)
    {
        a1 = a1.a();
        if (!java/lang/Enum.isAssignableFrom(a1) || a1 == java/lang/Enum)
        {
            return null;
        }
        k = a1;
        if (!a1.isEnum())
        {
            k = a1.getSuperclass();
        }
        return new bg(k);
    }
}
