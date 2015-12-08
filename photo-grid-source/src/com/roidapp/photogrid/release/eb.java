// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.roidapp.photogrid.video.HorizontalScrollViewEx;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, PhotoGridActivity

final class eb
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final dk a;

    eb(dk dk1)
    {
        a = dk1;
        super();
    }

    public final void onGlobalLayout()
    {
label0:
        {
            if (dk.k(a) != null && dk.k(a).getViewTreeObserver() != null)
            {
                dk.k(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            if (dk.b(a).A)
            {
                dk.b(a).A = false;
                if (dk.k(a) != null && dk.k(a).a() != null && dk.k(a).a().getWidth() > dk.k(a).getWidth() && dk.k(a).getWidth() != 0)
                {
                    break label0;
                }
            }
            return;
        }
        TranslateAnimation translateanimation = new TranslateAnimation(1, -((float)(dk.k(a).a().getWidth() - dk.k(a).getWidth()) / (float)dk.k(a).a().getWidth()), 1, 0.0F, 1, 0.0F, 1, 0.0F);
        translateanimation.setDuration(800L);
        dk.k(a).a().setAnimation(translateanimation);
    }
}
