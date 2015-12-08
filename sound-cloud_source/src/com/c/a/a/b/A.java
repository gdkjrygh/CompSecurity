// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import com.c.a.a.c;
import java.io.IOException;

// Referenced classes of package com.c.a.a.b:
//            s, i, C

final class A extends c
{

    final C b;
    final s.b c;

    transient A(s.b b1, String s1, Object aobj[], C c1)
    {
        c = b1;
        b = c1;
        super(s1, aobj);
    }

    public final void a()
    {
        try
        {
            s.f(c.c).a(b);
            return;
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
    }
}
