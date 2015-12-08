// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.translate.c.a;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class s extends AnimatorListenerAdapter
{

    final a a;
    final Camera2InputPopup b;

    s(Camera2InputPopup camera2inputpopup, a a1)
    {
        b = camera2inputpopup;
        a = a1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        b.a = a.a;
        b.b = a.b;
        Camera2InputPopup.q(b);
    }
}
