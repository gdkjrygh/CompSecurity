// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            p

final class g extends p
{

    final char q;
    final char r;

    g(String s, char c, char c1)
    {
        q = c;
        r = c1;
        super(s);
    }

    public final boolean a(char c)
    {
        return q <= c && c <= r;
    }
}
