// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.google.android.libraries.social.login.ui.CurrentAccountBannerView;

final class nji
    implements Runnable
{

    private njh a;

    nji(njh njh1)
    {
        a = njh1;
        super();
    }

    public final void run()
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(200L);
        a.a.setAnimation(alphaanimation);
        a.a.setVisibility(8);
    }
}
