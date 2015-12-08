// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


// Referenced classes of package com.c.a.a:
//            r

final class s extends r
{

    final String a;
    final r b;

    s(r r1, r r2, String s1)
    {
        b = r1;
        a = s1;
        super(r2, (byte)0);
    }

    final CharSequence a(Object obj)
    {
        if (obj == null)
        {
            return a;
        } else
        {
            return b.a(obj);
        }
    }

    public final r b(String s1)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
