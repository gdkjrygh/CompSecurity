// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.os.Handler;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dwx;
import gex;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            PlayerActivity

final class a
    implements dwx
{

    private PlayerActivity a;

    public final void a(Flags flags)
    {
        boolean flag = gex.a(PlayerActivity.a(a), flags);
        PlayerActivity.a(a, flags);
        PlayerActivity.d(a).post(PlayerActivity.c(a));
        if (flag)
        {
            PlayerActivity.d(a).post(PlayerActivity.e(a));
        }
    }

    (PlayerActivity playeractivity)
    {
        a = playeractivity;
        super();
    }
}
