// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.flow.login;

import android.view.animation.Animation;
import android.widget.ImageView;
import gbu;

// Referenced classes of package com.spotify.mobile.android.service.flow.login:
//            StartFragment

final class a extends gbu
{

    private int a;
    private StartFragment b;

    public final void onAnimationEnd(Animation animation)
    {
        StartFragment.e(b).setImageResource(StartFragment.d(a));
    }

    (StartFragment startfragment, int i)
    {
        b = startfragment;
        a = i;
        super();
    }
}
