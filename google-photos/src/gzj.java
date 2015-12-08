// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;
import android.widget.ImageButton;

final class gzj extends dud
{

    private gzf a;

    gzj(gzf gzf1)
    {
        a = gzf1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (gzf.d(a))
        {
            gzf.f(a).setVisibility(8);
        }
    }
}
