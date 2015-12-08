// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;

import com.google.b.b.a;
import com.google.b.m;

// Referenced classes of package com.google.b.e.a.a.a:
//            h, t, p

final class c extends h
{

    c(a a1)
    {
        super(a1);
    }

    public String a()
    {
        if (b().a() < 48)
        {
            throw m.a();
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            b(stringbuilder, 8);
            int i = c().a(48, 2);
            stringbuilder.append("(392");
            stringbuilder.append(i);
            stringbuilder.append(')');
            stringbuilder.append(c().a(50, null).a());
            return stringbuilder.toString();
        }
    }
}
