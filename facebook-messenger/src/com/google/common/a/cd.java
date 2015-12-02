// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            bm, cm, cc

class cd extends bm
{

    cm a;
    cm b;
    final cc c;

    cd(cc cc)
    {
        c = cc;
        super();
        a = this;
        b = this;
    }

    public cm getNextEvictable()
    {
        return a;
    }

    public cm getPreviousEvictable()
    {
        return b;
    }

    public void setNextEvictable(cm cm)
    {
        a = cm;
    }

    public void setPreviousEvictable(cm cm)
    {
        b = cm;
    }
}
