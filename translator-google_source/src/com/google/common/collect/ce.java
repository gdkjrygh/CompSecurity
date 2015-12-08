// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            bx, cj, cd

final class ce extends bx
{

    cj a;
    cj b;
    final cd c;

    ce(cd cd)
    {
        c = cd;
        super();
        a = this;
        b = this;
    }

    public final long getExpirationTime()
    {
        return 0x7fffffffffffffffL;
    }

    public final cj getNextExpirable()
    {
        return a;
    }

    public final cj getPreviousExpirable()
    {
        return b;
    }

    public final void setExpirationTime(long l)
    {
    }

    public final void setNextExpirable(cj cj)
    {
        a = cj;
    }

    public final void setPreviousExpirable(cj cj)
    {
        b = cj;
    }
}
