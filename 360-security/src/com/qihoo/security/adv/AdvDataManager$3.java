// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import com.android.volley.VolleyError;

// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

class b
    implements com.android.volley.r._cls3
{

    final vReportType a;
    final int b;
    final AdvDataManager c;

    public void a(VolleyError volleyerror)
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
