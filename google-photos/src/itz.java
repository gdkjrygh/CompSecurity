// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.google.android.apps.photos.stories.StoryEditText;

final class itz extends AnimatorListenerAdapter
{

    private ity a;

    itz(ity ity1)
    {
        a = ity1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (itf.c(a.a) != iua.d)
        {
            itf.a(a.a, iua.c);
            if (itf.p(a.a) != null)
            {
                if (itf.p(a.a) instanceof Animatable)
                {
                    itf.a(a.a, itf.p(a.a));
                }
                itf.a(a.a).setImageDrawable(itf.p(a.a));
            }
            itf.q(a.a);
            if (itf.r(a.a))
            {
                itf.s(a.a).requestFocus();
                ((InputMethodManager)a.a.O_().getSystemService("input_method")).showSoftInput(itf.s(a.a), 0);
            }
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        ((am) (a.a)).R.findViewById(s.cm).setVisibility(0);
    }
}
