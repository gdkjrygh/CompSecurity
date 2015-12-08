// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.view.animation.Animation;
import com.google.android.apps.translate.anim.a;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class p extends a
{

    final Camera2InputPopup a;

    p(Camera2InputPopup camera2inputpopup)
    {
        a = camera2inputpopup;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.dismiss();
    }
}
