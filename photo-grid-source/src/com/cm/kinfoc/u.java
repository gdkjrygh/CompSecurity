// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import com.cm.kinfoc.a.j;

// Referenced classes of package com.cm.kinfoc:
//            f, v, s

final class u
    implements j
{

    final String a;
    final String b;
    final s c;

    u(s s1, String s2, String s3)
    {
        c = s1;
        a = s2;
        b = s3;
        super();
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            return;
        } else
        {
            f f1 = new f();
            f1.a = 1;
            v v1 = new v(c, (byte)0);
            v1.a = a;
            v1.b = b;
            f1.b = v1;
            s.a(c, f1);
            return;
        }
    }
}
