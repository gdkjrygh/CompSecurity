// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.view.View;
import com.nineoldandroids.a.b;
import com.qihoo.security.alasticbutton.ElasticImageButton;
import com.qihoo.security.recommend.RecommendHelper;
import com.qihoo.security.ui.b.a;
import com.qihoo.security.ui.b.e;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

private class <init> extends b
    implements android.view.er
{

    final BoosterFragment a;

    public void onClick(View view)
    {
        if (!f.a())
        {
            com.qihoo.security.ui.result.f.a().a(0);
            com.qihoo.security.ui.b.a.a().a(0x7f03008a, (int[])null, false);
            com.qihoo.security.ui.b.b.a(0);
            BoosterFragment.i(a).a(0).a();
            if (com.qihoo.security.app.a.b(com.qihoo.security.ui.main.BoosterFragment.f(a)))
            {
                com.qihoo.security.support.b.b(11320);
            }
            SharedPref.a(com.qihoo.security.ui.main.BoosterFragment.f(a), "this_speed_of_boost", BoosterFragment.j(a));
            BoosterFragment.k(a).b();
            com.qihoo.security.ui.main.BoosterFragment.a(a, System.currentTimeMillis());
            RecommendHelper.a().d(null);
            RecommendHelper.a().b(com.qihoo.security.recommend.commendType.Boost);
            a.a(e.Action.HideRecmdBoost);
        }
    }

    private e.Action(BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }

    a(BoosterFragment boosterfragment, a a1)
    {
        this(boosterfragment);
    }
}
