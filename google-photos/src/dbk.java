// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.moviemaker.ui.ThemeItemView;
import com.google.android.apps.moviemaker.ui.ThemeSelectorView;

public final class dbk extends AnimatorListenerAdapter
{

    private ThemeItemView a;
    private int b;
    private ThemeSelectorView c;

    dbk(ThemeSelectorView themeselectorview, ThemeItemView themeitemview, int i)
    {
        c = themeselectorview;
        a = themeitemview;
        b = i;
        super();
    }

    public final void onAnimationCancel(Animator animator)
    {
        a.a(0.0F);
        animator.removeAllListeners();
    }

    public final void onAnimationEnd(Animator animator)
    {
        c.i();
        if (ThemeSelectorView.a(c) != null)
        {
            ThemeSelectorView.a(c).a(b);
        }
        ThemeSelectorView.a(c, b);
    }
}
