// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.animation.Animator;
import android.widget.ImageView;
import me.lyft.android.controls.SimpleAnimationListener;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls1 extends SimpleAnimationListener
{

    final is._cls0 this$1;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        LyftDriverToggleService.access$900(_fld0).setEnabled(true);
        cess._mth2500(this._cls1.this, false);
        cess._mth2600(this._cls1.this, false);
        if (cess._mth2700(this._cls1.this))
        {
            cess._mth2702(this._cls1.this, false);
            LyftDriverToggleService.access$2800(_fld0);
        }
    }

    public void onAnimationStart(Animator animator)
    {
        super.onAnimationStart(animator);
        LyftDriverToggleService.access$900(_fld0).setEnabled(false);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
