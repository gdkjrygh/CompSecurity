// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.animation.ener
{

    final SnapPreviewFragment a;

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        animation = new AlphaAnimation(1.0F, 0.0F);
        animation.setDuration(750L);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            private SnapPreviewFragment._cls14 a;

            public final void onAnimationEnd(Animation animation1)
            {
                SnapPreviewFragment.G(a.a).setVisibility(8);
            }

            public final void onAnimationRepeat(Animation animation1)
            {
            }

            public final void onAnimationStart(Animation animation1)
            {
            }

            
            {
                a = SnapPreviewFragment._cls14.this;
                super();
            }
        });
        SnapPreviewFragment.G(a).startAnimation(animation);
    }

    _cls1.a(SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}
