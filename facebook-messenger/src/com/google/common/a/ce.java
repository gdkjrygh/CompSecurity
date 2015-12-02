// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            o, cm, cc

class ce extends o
{

    final cc a;

    ce(cc cc1, cm cm1)
    {
        a = cc1;
        super(cm1);
    }

    protected cm a(cm cm1)
    {
        cm cm2 = cm1.getNextEvictable();
        cm1 = cm2;
        if (cm2 == a.a)
        {
            cm1 = null;
        }
        return cm1;
    }

    protected volatile Object a(Object obj)
    {
        return a((cm)obj);
    }
}
