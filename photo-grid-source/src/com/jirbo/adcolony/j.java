// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            d

abstract class j
{

    d o;

    j(d d1)
    {
        this(d1, true);
    }

    j(d d1, boolean flag)
    {
        o = d1;
        if (flag)
        {
            d1.a(this);
        }
    }

    abstract void a();
}
