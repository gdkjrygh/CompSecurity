// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GamesBoostFragment, b

class a extends BroadcastReceiver
{

    final GamesBoostFragment a;

    public void onReceive(Context context, Intent intent)
    {
        b.a().a(a);
    }

    _cls9(GamesBoostFragment gamesboostfragment)
    {
        a = gamesboostfragment;
        super();
    }
}
