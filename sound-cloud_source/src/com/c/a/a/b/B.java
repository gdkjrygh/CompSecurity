// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import com.c.a.a.c;
import java.io.IOException;

// Referenced classes of package com.c.a.a.b:
//            s, c, q

final class B extends c
{

    final q b;
    final s.b c;

    transient B(s.b b1, String s1, Object aobj[], q q)
    {
        c = b1;
        b = q;
        super(s1, aobj);
    }

    public final void a()
    {
        try
        {
            c.c.i.a(b);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }
}
