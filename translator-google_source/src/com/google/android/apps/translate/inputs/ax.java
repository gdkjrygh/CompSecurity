// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.google.android.apps.translate.anim.a;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            KeyboardHandwritingPopup

final class ax extends a
{

    final KeyboardHandwritingPopup a;

    ax(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        a = keyboardhandwritingpopup;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        KeyboardHandwritingPopup.l(a).removeAllViews();
        KeyboardHandwritingPopup.l(a).setVisibility(8);
    }
}
