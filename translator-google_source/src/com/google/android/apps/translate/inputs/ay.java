// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.view.View;
import android.view.animation.Animation;
import com.google.android.apps.translate.anim.a;
import com.google.android.libraries.translate.e.p;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            KeyboardHandwritingPopup

final class ay extends a
{

    final KeyboardHandwritingPopup a;

    ay(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        a = keyboardhandwritingpopup;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        KeyboardHandwritingPopup.g(a).setVisibility(0);
        p.a(a, "KeyboardInputAnimation");
    }
}
