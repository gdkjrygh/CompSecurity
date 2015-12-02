// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            o, cm, cf

class ch extends o
{

    final cf a;

    ch(cf cf1, cm cm1)
    {
        a = cf1;
        super(cm1);
    }

    protected cm a(cm cm1)
    {
        cm cm2 = cm1.getNextExpirable();
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
