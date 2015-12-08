// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.apps.translate.anim.a;
import com.google.android.apps.translate.m;

// Referenced classes of package com.google.android.apps.translate.widget:
//            FloatingInputCard

public final class e extends a
{

    final FloatingInputCard a;

    public e(FloatingInputCard floatinginputcard)
    {
        a = floatinginputcard;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        FloatingInputCard.c(a).setVisibility(8);
        ((TextView)a.findViewById(m.touch_to_type_text)).setVisibility(0);
    }
}
