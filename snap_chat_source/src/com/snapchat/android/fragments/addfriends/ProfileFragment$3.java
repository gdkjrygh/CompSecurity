// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import OC;
import PI;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import com.caverock.androidsvg.SVGImageView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.camera.ui.viewflipper.CameraViewFlipper;
import com.snapchat.android.ui.ProfileCameraMaskView;
import com.snapchat.android.ui.ProfilePictureView;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.squareup.otto.Bus;
import rr;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            ProfileFragment

final class a
    implements Runnable
{

    final ProfileFragment a;

    public final void run()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (a.e == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ProfileFragment.c(a) == null || !ProfileFragment.c(a).b())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (ProfileFragment.d(a) == null || ((VerticalSwipeLayout) (ProfileFragment.d(a))).c == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag || flag1 || flag2)
        {
            Timber.c("ProfileFragment", "profile images - ignore animateToProfilePictureView if profile picture view is not initialized(%s), or no front camera(%s), or current page is CAMERA_PAGE(%s)", new Object[] {
                Boolean.valueOf(flag), Boolean.valueOf(flag1), Boolean.valueOf(flag2)
            });
            return;
        }
        ProfileFragment.e(a).a(com.snapchat.android.analytics.alyticsContext.PROFILE_PICTURES_PAGE_VIEW);
        if (!ProfileFragment.c(a).a() && ProfileFragment.c(a).b())
        {
            ProfileFragment.c(a).c();
        }
        a.h();
        a.f = new AnimatorSet();
        a.f.play(ObjectAnimator.ofFloat(ProfileFragment.o(a), "alpha", new float[] {
            0.0F
        })).with(ObjectAnimator.ofFloat(ProfileFragment.n(a), "alpha", new float[] {
            0.0F
        })).with(ObjectAnimator.ofFloat(ProfileFragment.m(a), "alpha", new float[] {
            0.0F
        })).with(ObjectAnimator.ofFloat(ProfileFragment.l(a), "alpha", new float[] {
            0.0F
        })).with(ObjectAnimator.ofFloat(ProfileFragment.k(a), "alpha", new float[] {
            0.0F
        })).with(ObjectAnimator.ofFloat(ProfileFragment.j(a), "alpha", new float[] {
            0.0F
        })).with(ObjectAnimator.ofFloat(ProfileFragment.i(a), "alpha", new float[] {
            0.0F
        })).with(ObjectAnimator.ofFloat(ProfileFragment.h(a), "alpha", new float[] {
            0.0F
        })).with(ObjectAnimator.ofFloat(a.e, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(ProfileFragment.f(a), "translationY", new float[] {
            ProfileFragment.g(a).c
        })).with(ObjectAnimator.ofFloat(ProfileFragment.f(a), "scaleX", new float[] {
            ProfileFragment.g(a).b
        })).with(ObjectAnimator.ofFloat(ProfileFragment.f(a), "scaleY", new float[] {
            ProfileFragment.g(a).b
        }));
        a.f.addListener(new android.animation.Animator.AnimatorListener() {

            private ProfileFragment._cls3 a;

            public final void onAnimationCancel(Animator animator)
            {
                Timber.c("ProfileFragment", "profile images - animating to profile picture view has been canceled", new Object[0]);
            }

            public final void onAnimationEnd(Animator animator)
            {
                ProfileFragment.d(a.a).setBackgroundViewVisibility(4);
                ProfileFragment.p(a.a).a(0);
                a.a.e.a.setVisibility(0);
                a.a.e.setProfilePicturesControlButtonsVisibility(0);
                ProfileFragment.r(a.a).setVisibility(4);
                a.a.e.h = true;
                float f;
                float f1;
                if (a.a.i.getDrawable() != null)
                {
                    a.a.e.a(true);
                    a.a.i.setVisibility(0);
                } else
                {
                    a.a.e.a(false);
                    a.a.i.setVisibility(4);
                }
                f = ProfileFragment.g(a.a).d;
                f1 = ProfileFragment.g(a.a).e;
                ProfileFragment.c(a.a).a(0.65F, 0.65F, f - f1);
                ProfileFragment.d(a.a).setInProfilePictureView(true);
                ProfileFragment.s(a.a).a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN));
                Timber.c("ProfileFragment", "profile images - animated into profile picture view", new Object[0]);
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
                a.a.e.setVisibility(0);
                ProfileFragment.d(a.a).setScrollableInBothDirections(false);
                boolean flag3;
                if (((ProfileCameraMaskView)ProfileFragment.p(a.a).a()).a != null)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3)
                {
                    ProfileFragment.q(a.a);
                }
            }

            
            {
                a = ProfileFragment._cls3.this;
                super();
            }
        });
        a.f.setDuration(300L);
        a.f.start();
    }

    _cls1.a(ProfileFragment profilefragment)
    {
        a = profilefragment;
        super();
    }
}
