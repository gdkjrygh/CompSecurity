// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.view.View;
import android.view.animation.Animation;
import android.widget.Spinner;
import com.google.android.apps.translate.anim.a;
import com.google.android.apps.translate.inputtools.InputToolsInput;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            KeyboardHandwritingPopup

final class bg extends a
{

    final KeyboardHandwritingPopup a;

    bg(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        a = keyboardhandwritingpopup;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        KeyboardHandwritingPopup.h(a);
        KeyboardHandwritingPopup.g(a).setVisibility(0);
        if (KeyboardHandwritingPopup.i(a))
        {
            KeyboardHandwritingPopup.e(a);
        } else
        {
            KeyboardHandwritingPopup.j(a).a();
        }
        KeyboardHandwritingPopup.c(a).setOnItemSelectedListener(a);
    }
}
