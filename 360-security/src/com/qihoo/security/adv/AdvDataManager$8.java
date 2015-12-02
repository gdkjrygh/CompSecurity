// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import java.util.List;

// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

class a
    implements Runnable
{

    final List a;
    final AdvDataManager b;

    public void run()
    {
        AdvDataManager.a(b, a);
    }

    (AdvDataManager advdatamanager, List list)
    {
        b = advdatamanager;
        a = list;
        super();
    }
}
