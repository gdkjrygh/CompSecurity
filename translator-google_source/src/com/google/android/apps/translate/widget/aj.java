// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.translate.c.a;

// Referenced classes of package com.google.android.apps.translate.widget:
//            LanguagePicker, LangSpinner

final class aj extends AnimatorListenerAdapter
{

    final a a;
    final LanguagePicker b;

    aj(LanguagePicker languagepicker, a a1)
    {
        b = languagepicker;
        a = a1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        com.google.android.apps.translate.widget.LanguagePicker.a(b).setSelectedLang(a.a);
        LanguagePicker.b(b).setSelectedLang(a.b);
    }
}
