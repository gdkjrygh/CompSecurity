// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import com.c.a.a.c;
import java.io.IOException;

// Referenced classes of package com.c.a.a.b:
//            s, a

final class t extends c
{

    final int b;
    final a c;
    final s d;

    transient t(s s1, String s2, Object aobj[], int i, a a1)
    {
        d = s1;
        b = i;
        c = a1;
        super(s2, aobj);
    }

    public final void a()
    {
        try
        {
            d.b(b, c);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }
}
