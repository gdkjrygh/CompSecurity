// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.view.View;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.dialog.i;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.d;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GamesBoostFragment

class a
    implements android.view.esBoostFragment._cls2
{

    final i a;
    final GamesBoostFragment b;

    public void onClick(View view)
    {
        if (GamesBoostFragment.a(b))
        {
            com.qihoo.security.support.b.b(11115);
            GamesBoostFragment.a(b, false);
            q.a().a(0x7f0c009b);
        } else
        {
            com.qihoo.security.support.b.b(11117);
            GamesBoostFragment.a(b, true);
            q.a().a(0x7f0c009d);
        }
        SharedPref.a(SecurityApplication.a(), "game_booster_show_toast", GamesBoostFragment.a(b));
        GamesBoostFragment.a(b, com.qihoo.security.gamebooster.GamesBoostFragment.b(b));
        d.b(a);
    }

    _cls9(GamesBoostFragment gamesboostfragment, i i)
    {
        b = gamesboostfragment;
        a = i;
        super();
    }
}
