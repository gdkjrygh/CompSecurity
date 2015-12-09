// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;

import com.google.b.b.a;
import com.google.b.m;

// Referenced classes of package com.google.b.e.a.a.a:
//            i

abstract class f extends i
{

    f(a a1)
    {
        super(a1);
    }

    public String a()
    {
        if (b().a() != 60)
        {
            throw m.a();
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            b(stringbuilder, 5);
            b(stringbuilder, 45, 15);
            return stringbuilder.toString();
        }
    }
}
