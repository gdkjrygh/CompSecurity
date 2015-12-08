// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class t extends AnimatorListenerAdapter
{

    final Camera2InputPopup a;

    t(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void onAnimationStart(Animator animator)
    {
        Camera2InputPopup.r(a).requestLayout();
    }
}
