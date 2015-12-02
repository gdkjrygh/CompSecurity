// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package com.facebook.auth.login:
//            g, AuthFragmentLogoViewGroup

class i
    implements Runnable
{

    final g a;

    i(g g1)
    {
        a = g1;
        super();
    }

    public void run()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(125L);
        AuthFragmentLogoViewGroup.access$900(a.a).setVisibility(0);
        AuthFragmentLogoViewGroup.access$900(a.a).startAnimation(alphaanimation);
    }
}
