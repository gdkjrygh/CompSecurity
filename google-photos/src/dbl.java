// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.moviemaker.ui.ThemeItemView;
import com.google.android.apps.moviemaker.ui.ThemeSelectorView;

public final class dbl extends AnimatorListenerAdapter
{

    private ThemeItemView a;
    private ThemeSelectorView b;

    public dbl(ThemeSelectorView themeselectorview, ThemeItemView themeitemview)
    {
        b = themeselectorview;
        a = themeitemview;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        ThemeSelectorView.a(b, a, 0);
    }
}
