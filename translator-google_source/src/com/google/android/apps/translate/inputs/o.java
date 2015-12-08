// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.apps.translate.widget.TintImageView;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class o
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final Camera2InputPopup a;

    o(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
        Camera2InputPopup.d(a).setTextColor(i);
        Camera2InputPopup.e(a).setTint(i);
    }
}
