// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import com.google.android.apps.translate.anim.AnimationScheme;
import com.google.android.apps.translate.anim.a;
import com.google.android.apps.translate.widget.PulseView;
import com.google.android.apps.translate.widget.VoiceButton;
import com.google.android.libraries.translate.e.o;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            VoiceInputPopup

final class bq extends a
{

    final android.widget.LinearLayout.LayoutParams a;
    final View b;
    final VoiceInputPopup c;

    bq(VoiceInputPopup voiceinputpopup, android.widget.LinearLayout.LayoutParams layoutparams, View view)
    {
        c = voiceinputpopup;
        a = layoutparams;
        b = view;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        boolean flag = false;
        VoiceInputPopup.j(c).setVisibility(0);
        a.height = 0;
        a.weight = 1.0F;
        b.setBackgroundColor(-1);
        VoiceInputPopup.k(c);
        VoiceInputPopup.l(c).setVisibility(4);
        VoiceInputPopup.m(c).setVisibility(0);
        VoiceInputPopup.n(c).setVisibility(0);
        AnimationScheme.FADE.showView(com.google.android.apps.translate.inputs.VoiceInputPopup.o(c));
        AnimationScheme.FADE.showView(VoiceInputPopup.p(c));
        if (VoiceInputPopup.q(c))
        {
            AnimationScheme.TOP_PARENT.showView(VoiceInputPopup.r(c));
        } else
        {
            AnimationScheme.SIDE.showView(VoiceInputPopup.r(c));
            animation = c;
            if (!o.a())
            {
                flag = true;
            }
            com.google.android.apps.translate.inputs.VoiceInputPopup.a(animation, flag);
            if (VoiceInputPopup.s(c))
            {
                c.getOwnerActivity().setRequestedOrientation(4);
                return;
            }
        }
    }
}
