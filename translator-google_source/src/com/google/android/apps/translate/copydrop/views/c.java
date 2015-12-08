// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.translate.c.a;
import com.google.android.apps.translate.widget.LangSpinner;

// Referenced classes of package com.google.android.apps.translate.copydrop.views:
//            PopoverView

final class c extends AnimatorListenerAdapter
{

    final a a;
    final PopoverView b;

    c(PopoverView popoverview, a a1)
    {
        b = popoverview;
        a = a1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        com.google.android.apps.translate.copydrop.views.PopoverView.a(b).setSelectedLang(a.a);
        PopoverView.b(b).setSelectedLang(a.b);
    }
}
