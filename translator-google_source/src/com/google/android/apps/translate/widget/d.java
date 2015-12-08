// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.google.android.apps.translate.widget:
//            FloatingInputCard

final class d extends ViewOutlineProvider
{

    final FloatingInputCard a;

    d(FloatingInputCard floatinginputcard)
    {
        a = floatinginputcard;
        super();
    }

    public final void getOutline(View view, Outline outline)
    {
        outline.setRect(0, 0, FloatingInputCard.a(a).getMeasuredWidth(), FloatingInputCard.a(a).getMeasuredHeight() - FloatingInputCard.b(a));
    }
}
