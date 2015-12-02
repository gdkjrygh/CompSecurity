// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.view.View;
import com.nineoldandroids.a.b;
import com.qihoo.security.adv.AdvDataManager;
import com.qihoo.security.ui.main.a;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            BaseResultFragment

class a extends b
{

    final BaseResultFragment a;

    public void b(com.nineoldandroids.a.a a1)
    {
        a.n();
        if (BaseResultFragment.i(a) != null && !BaseResultFragment.j(a))
        {
            AdvDataManager.a().a(com.qihoo.security.adv.ortType.Show, BaseResultFragment.i(a));
            com.qihoo.security.ui.result.view.BaseResultFragment.a(a, null);
        }
        com.qihoo.security.ui.main.a.a(null, new View[] {
            a.r
        });
    }

    (BaseResultFragment baseresultfragment)
    {
        a = baseresultfragment;
        super();
    }
}
