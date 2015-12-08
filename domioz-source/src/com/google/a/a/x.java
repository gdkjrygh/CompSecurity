// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            w

final class x extends w
{

    final String a;
    final w b;

    x(w w1, w w2, String s)
    {
        b = w1;
        a = s;
        super(w2, (byte)0);
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

    public final w b()
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    public final w b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
