// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameRecommendListActivity, AddGamesActivity

class a
    implements android.view.endListActivity._cls1
{

    final GameRecommendListActivity a;

    public void onClick(View view)
    {
        if (!GameRecommendListActivity.a(a))
        {
            return;
        }
        view = new Intent(a.getApplicationContext(), com/qihoo/security/gamebooster/AddGamesActivity);
        view.addFlags(0x10000000);
        view.putStringArrayListExtra("packages", GameRecommendListActivity.b(a));
        if (GameRecommendListActivity.c(a))
        {
            view.putExtra("from_gameboost", true);
        }
        a.startActivity(view);
        a.overridePendingTransition(0x7f040013, 0x7f040023);
    }

    (GameRecommendListActivity gamerecommendlistactivity)
    {
        a = gamerecommendlistactivity;
        super();
    }
}
