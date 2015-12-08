// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.moviemaker.ui.ThemeItemView;
import com.google.android.apps.moviemaker.ui.ThemeScrollView;
import com.google.android.apps.moviemaker.ui.ThemeSelectorView;
import java.util.List;

public final class dbi
    implements android.view.View.OnClickListener
{

    private dbj a;
    private ThemeSelectorView b;
    private ThemeScrollView c;

    public dbi(ThemeScrollView themescrollview, dbj dbj1, ThemeSelectorView themeselectorview)
    {
        c = themescrollview;
        a = dbj1;
        b = themeselectorview;
        super();
    }

    public final void onClick(View view)
    {
        a.a(view);
        ThemeScrollView.a(c).a(view);
        int i = ThemeScrollView.b(c).indexOf(cyy.valueOf(view.getTag().toString()));
        view = b;
        if (i != ((ViewPager) (view)).c)
        {
            if (((ThemeSelectorView) (view)).x != null)
            {
                ((ThemeSelectorView) (view)).x.a();
            }
            czx.a(view).alpha(1.0F);
            view.a(i, false);
            if (((ThemeSelectorView) (view)).v != null)
            {
                ((ThemeSelectorView) (view)).v.cancel();
            }
            i = ((ViewPager) (view)).c;
            ThemeItemView themeitemview = view.j();
            if (themeitemview != null)
            {
                themeitemview.b(1.0F);
                view.v = ObjectAnimator.ofFloat(themeitemview, ThemeItemView.a, new float[] {
                    0.0F, 360F
                });
                ((ThemeSelectorView) (view)).v.setDuration(view.getResources().getInteger(b.hw));
                ((ThemeSelectorView) (view)).v.setInterpolator(dac.a);
                ((ThemeSelectorView) (view)).v.setStartDelay(500L);
                ((ThemeSelectorView) (view)).v.addListener(new dbk(view, themeitemview, i));
                ((ThemeSelectorView) (view)).v.start();
            }
        }
    }
}
