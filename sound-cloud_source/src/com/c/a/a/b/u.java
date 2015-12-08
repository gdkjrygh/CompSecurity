// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import com.c.a.a.c;
import java.io.IOException;

// Referenced classes of package com.c.a.a.b:
//            s, c

final class u extends c
{

    final int b;
    final long c;
    final s d;

    transient u(s s1, String s2, Object aobj[], int i, long l)
    {
        d = s1;
        b = i;
        c = l;
        super(s2, aobj);
    }

    public final void a()
    {
        try
        {
            d.i.a(b, c);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }
}
