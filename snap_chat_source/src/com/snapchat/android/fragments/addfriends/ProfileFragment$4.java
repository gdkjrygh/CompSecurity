// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import OC;
import PI;
import android.animation.Animator;
import android.widget.ImageView;
import com.caverock.androidsvg.SVGImageView;
import com.snapchat.android.Timber;
import com.snapchat.android.camera.ui.viewflipper.CameraViewFlipper;
import com.snapchat.android.ui.ProfilePictureView;
import com.squareup.otto.Bus;
import rr;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            ProfileFragment

final class a
    implements android.animation.istener
{

    private ProfileFragment a;

    public final void onAnimationCancel(Animator animator)
    {
        Timber.c("ProfileFragment", "profile images - animating back to profile view has been canceled", new Object[0]);
    }

    public final void onAnimationEnd(Animator animator)
    {
        ProfileFragment.p(a).a(4);
        a.e.setVisibility(4);
        a.i.setVisibility(0);
        ProfileFragment.d(a).setScrollableInBothDirections(true);
        ProfileFragment.d(a).setInProfilePictureView(false);
        ProfileFragment.s(a).a(new OC(com.snapchat.android.util.sibility.VISIBLE));
        Timber.c("ProfileFragment", "profile images - animated back to profile view", new Object[0]);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        a.e.h = false;
        a.e.a.setVisibility(4);
        ProfileFragment.r(a).setVisibility(0);
        ProfileFragment.d(a).setBackgroundViewVisibility(0);
        ProfileFragment.p(a).a(4);
        float f = ProfileFragment.g(a).e;
        float f1 = ProfileFragment.g(a).e;
        ProfileFragment.c(a).a(1.0F, 1.0F, f - f1);
    }

    (ProfileFragment profilefragment)
    {
        a = profilefragment;
        super();
    }
}
