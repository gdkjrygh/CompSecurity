// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.graphics.Bitmap;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class ag
    implements android.view.animation.Animation.AnimationListener
{

    final MainPage a;

    ag(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.a = true;
        MainPage.i(a).setVisibility(8);
        if (MainPage.j(a) != null)
        {
            MainPage.j(a).setImageBitmap(null);
        }
        if (MainPage.k(a) != null)
        {
            MainPage.k(a).setImageBitmap(null);
        }
        if (MainPage.l(a) != null && !MainPage.l(a).isRecycled())
        {
            MainPage.l(a).recycle();
        }
        if (MainPage.m(a) != null && !MainPage.m(a).isRecycled())
        {
            MainPage.m(a).recycle();
        }
        MainPage.n(a);
        MainPage.o(a);
        MainPage.p(a);
        if (!MainPage.q(a))
        {
            MainPage.r(a);
            if (!MainPage.a(a, "workspace_info"))
            {
                MainPage.s(a);
            }
        }
        MainPage.h(a);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
