// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import ah;
import ctz;
import ezw;
import fxw;
import fyw;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            PlayerActivity

final class b
    implements Runnable
{

    private boolean a;
    private PlayerActivity b;

    public final void run()
    {
        if (b.g || a)
        {
            return;
        }
        a = true;
        ctz.a(PlayerActivity.a(b));
        android.support.v4.app.Fragment fragment = ezw.a(PlayerActivity.a(b), PlayerActivity.b(b));
        fyw.a(fragment, PlayerActivity.a(b));
        aa aa1 = b.a_();
        fxw.a(aa1, PlayerActivity.a(b), com/spotify/mobile/android/ui/activity/PlayerActivity);
        if (aa1.a("player") == null)
        {
            aa1.a().b(0x7f1102b1, fragment, "player").c();
        }
        b.setVisible(true);
    }

    (PlayerActivity playeractivity)
    {
        b = playeractivity;
        super();
    }
}
