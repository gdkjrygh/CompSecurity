// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.moviemaker.ui.ThemeItemView;
import com.google.android.apps.moviemaker.ui.ThemeSelectorView;

public final class dbm extends AnimatorListenerAdapter
{

    private ThemeItemView a;
    private ThemeSelectorView b;

    public dbm(ThemeSelectorView themeselectorview, ThemeItemView themeitemview)
    {
        b = themeselectorview;
        a = themeitemview;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.setScaleX(1.0F);
        a.setScaleY(1.0F);
        a.setAlpha(1.0F);
        a.a(0.0F);
        if (ThemeSelectorView.b(b) != 1)
        {
            b.setAlpha(0.0F);
        }
        ThemeSelectorView.b(b, -1);
    }
}
