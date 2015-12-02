// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;


// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

class d
    implements Runnable
{

    final d a;
    final d b;
    final vType c;
    final long d;
    final AdvDataManager e;

    public void run()
    {
        a.a(b, c, Long.valueOf(d));
    }

    vType(AdvDataManager advdatamanager, vType vtype, vType vtype1, vType vtype2, long l)
    {
        e = advdatamanager;
        a = vtype;
        b = vtype1;
        c = vtype2;
        d = l;
        super();
    }
}
