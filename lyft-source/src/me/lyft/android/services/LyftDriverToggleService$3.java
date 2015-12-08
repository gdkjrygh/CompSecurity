// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import me.lyft.android.controls.SimpleAnimationListener;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls0
    implements Action0
{

    final LyftDriverToggleService this$0;

    public void call()
    {
        LyftDriverToggleService.access$200(LyftDriverToggleService.this).setVisibility(0);
        LyftDriverToggleService.access$300(LyftDriverToggleService.this).setVisibility(0);
        LyftDriverToggleService.access$400(LyftDriverToggleService.this).setVisibility(0);
        LyftDriverToggleService.access$500(LyftDriverToggleService.this).setVisibility(0);
        if (LyftDriverToggleService.access$600(LyftDriverToggleService.this) != 128)
        {
            LyftDriverToggleService.access$700(LyftDriverToggleService.this, LyftDriverToggleService.access$200(LyftDriverToggleService.this), LyftDriverToggleService.access$600(LyftDriverToggleService.this), 128);
        }
        if (LyftDriverToggleService.access$800(LyftDriverToggleService.this) != null)
        {
            LyftDriverToggleService.access$800(LyftDriverToggleService.this).cancel();
        }
        if (LyftDriverToggleService.access$500(LyftDriverToggleService.this).getVisibility() == 0 && LyftDriverToggleService.access$900(LyftDriverToggleService.this).getAlpha() > 0.0F)
        {
            LyftDriverToggleService.access$802(LyftDriverToggleService.this, LyftDriverToggleService.access$500(LyftDriverToggleService.this).animate().alpha(0.0F).setDuration(325L).setListener(new SimpleAnimationListener() {

                final LyftDriverToggleService._cls3 this$1;

                public void onAnimationEnd(Animator animator)
                {
                    super.onAnimationEnd(animator);
                    LyftDriverToggleService.access$500(this$0).setVisibility(4);
                }

            
            {
                this$1 = LyftDriverToggleService._cls3.this;
                super();
            }
            }));
        }
    }

    nit>()
    {
        this$0 = LyftDriverToggleService.this;
        super();
    }
}
