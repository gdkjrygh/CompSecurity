// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment.settings;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment.settings:
//            PreferenceFragment

final class f
    implements android.widget.AbsListView.OnScrollListener
{

    final View a;
    final PreferenceFragment b;

    f(PreferenceFragment preferencefragment, View view)
    {
        b = preferencefragment;
        a = view;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (PreferenceFragment.b(b))
        {
            if (i > 0)
            {
                PreferenceFragment.c(b).getBackground().mutate().setAlpha(255);
                a.setAlpha(1.0F);
            } else
            if (abslistview.getChildAt(0) != null)
            {
                i = abslistview.getChildAt(0).getTop();
                if (i == abslistview.getTop())
                {
                    PreferenceFragment.c(b).getBackground().mutate().setAlpha(0);
                    a.setAlpha(0.0F);
                    return;
                }
                float f1 = (float)Math.abs(i) / (float)PreferenceFragment.c(b).getHeight();
                if (f1 < 1.0F)
                {
                    PreferenceFragment.c(b).getBackground().mutate().setAlpha((int)(255F * f1));
                    a.setAlpha(f1);
                    return;
                } else
                {
                    PreferenceFragment.c(b).getBackground().mutate().setAlpha(255);
                    a.setAlpha(1.0F);
                    cv.b(new View[] {
                        a
                    });
                    return;
                }
            }
        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
