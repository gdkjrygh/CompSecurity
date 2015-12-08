// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.google.android.apps.translate.widget:
//            LanguagePicker, LangSpinner

final class ak extends AnimatorListenerAdapter
{

    final LanguagePicker a;

    ak(LanguagePicker languagepicker)
    {
        a = languagepicker;
        super();
    }

    public final void onAnimationStart(Animator animator)
    {
        LanguagePicker.b(a).requestLayout();
    }
}
