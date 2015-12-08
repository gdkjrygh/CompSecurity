// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            bx, cj, ca

final class cb extends bx
{

    cj a;
    cj b;
    final ca c;

    cb(ca ca)
    {
        c = ca;
        super();
        a = this;
        b = this;
    }

    public final cj getNextEvictable()
    {
        return a;
    }

    public final cj getPreviousEvictable()
    {
        return b;
    }

    public final void setNextEvictable(cj cj)
    {
        a = cj;
    }

    public final void setPreviousEvictable(cj cj)
    {
        b = cj;
    }
}
