// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            bm, cm, cf

class cg extends bm
{

    cm a;
    cm b;
    final cf c;

    cg(cf cf)
    {
        c = cf;
        super();
        a = this;
        b = this;
    }

    public long getExpirationTime()
    {
        return 0x7fffffffffffffffL;
    }

    public cm getNextExpirable()
    {
        return a;
    }

    public cm getPreviousExpirable()
    {
        return b;
    }

    public void setExpirationTime(long l)
    {
    }

    public void setNextExpirable(cm cm)
    {
        a = cm;
    }

    public void setPreviousExpirable(cm cm)
    {
        b = cm;
    }
}
