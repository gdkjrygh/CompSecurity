// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import aav;
import abo;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import evd;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart.view:
//            MomentMenuView

final class a
    implements android.view.ner
{

    private MomentMenuView a;

    public final void onClick(View view)
    {
        boolean flag1 = false;
        boolean flag;
        if (a.a.getAlpha() == 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (a.c())
            {
                a.a();
            } else
            {
                view = a;
                ((MomentMenuView) (view)).a.setCompoundDrawablesWithIntrinsicBounds(null, null, ((MomentMenuView) (view)).c, null);
                ((MomentMenuView) (view)).g.startTransition(200);
                ((MomentMenuView) (view)).b.setVisibility(0);
                for (int i = ((flag1) ? 1 : 0); i < ((MomentMenuView) (view)).h.b(); i++)
                {
                    Object obj = ((MomentMenuView) (view)).b.c(i);
                    if (obj != null)
                    {
                        obj = ((abo) (obj)).a;
                        ((View) (obj)).animate().cancel();
                        ((View) (obj)).setAlpha(0.0F);
                        ((View) (obj)).setTranslationY(-60F);
                        ((View) (obj)).animate().alpha(1.0F).translationY(0.0F).setStartDelay((long)i * 30L).setDuration(100L).start();
                    }
                }

                if (((MomentMenuView) (view)).f != null)
                {
                    ((MomentMenuView) (view)).f.b();
                    return;
                }
            }
        }
    }

    (MomentMenuView momentmenuview)
    {
        a = momentmenuview;
        super();
    }
}
