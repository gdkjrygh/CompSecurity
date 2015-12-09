// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.churnlockedstate;

import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dwx;
import fys;

// Referenced classes of package com.spotify.music.spotlets.churnlockedstate:
//            ChurnLockedStateActivity

final class a
    implements dwx
{

    private ChurnLockedStateActivity a;

    public final void a(Flags flags)
    {
        ChurnLockedStateActivity.a(a, flags);
        if (!((Boolean)ChurnLockedStateActivity.b(a).a(fys.X)).booleanValue())
        {
            ChurnLockedStateActivity.c(a);
            if (ChurnLockedStateActivity.c(a))
            {
                a.setResult(1);
                a.finish();
            }
        }
    }

    (ChurnLockedStateActivity churnlockedstateactivity)
    {
        a = churnlockedstateactivity;
        super();
    }
}
