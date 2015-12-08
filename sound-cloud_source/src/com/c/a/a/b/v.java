// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import com.c.a.a.c;
import java.io.IOException;

// Referenced classes of package com.c.a.a.b:
//            s, n

final class v extends c
{

    final boolean b = true;
    final int c;
    final int d;
    final n e = null;
    final s f;

    transient v(s s1, String s2, Object aobj[], int i, int j)
    {
        f = s1;
        c = i;
        d = j;
        super(s2, aobj);
    }

    public final void a()
    {
        try
        {
            s.a(f, b, c, d, e);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }
}
