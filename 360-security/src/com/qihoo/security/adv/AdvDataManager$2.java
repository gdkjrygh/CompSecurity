// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;


// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

class b
    implements com.android.volley.r._cls2
{

    final vReportType a;
    final int b;
    final AdvDataManager c;

    public volatile void a(Object obj)
    {
        a((String)obj);
    }

    public void a(String s)
    {
    }

    vReportType(AdvDataManager advdatamanager, vReportType vreporttype, int i)
    {
        c = advdatamanager;
        a = vreporttype;
        b = i;
        super();
    }
}
