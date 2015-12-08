// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.app.SharedElementCallback;
import android.content.res.Resources;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.google.android.gms.games.ui.transition.BannerExpando;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

final class val.res extends SharedElementCallback
{

    final GameDetailActivity this$0;
    final ViewGroup val$backgroundView;
    final ViewGroup val$containerView;
    final ViewGroup val$heroContainerView;
    final Resources val$res;

    public final void onSharedElementStart(List list, List list1, List list2)
    {
        list1 = null;
        if (list2.size() > 0)
        {
            list1 = (View)list2.get(0);
        }
        if (GameDetailActivity.access$1900(GameDetailActivity.this) && list1 != null)
        {
            boolean _tmp = GameDetailActivity.access$1902$1b0751c8(GameDetailActivity.this);
            val$containerView.setTransitionGroup(true);
            val$heroContainerView.setTransitionGroup(true);
            val$backgroundView.setTransitionGroup(true);
            UiUtils.setVisible(false, 4, new View[] {
                GameDetailActivity.access$200(GameDetailActivity.this), GameDetailActivity.access$300(GameDetailActivity.this), GameDetailActivity.access$400(GameDetailActivity.this), GameDetailActivity.access$000(GameDetailActivity.this), GameDetailActivity.access$2000(GameDetailActivity.this), GameDetailActivity.access$500(GameDetailActivity.this), findViewById(0x7f0d0159), findViewById(0x7f0d015c), findViewById(0x7f0d0161), findViewById(0x7f0d0157), 
                findViewById(0x7f0d031d)
            });
            list2 = list1.getBackground();
            list = list2;
            if (list2 == null)
            {
                list = list2;
                if (list1 instanceof ImageView)
                {
                    list = ((ImageView)list1).getDrawable();
                }
            }
            if (list != null)
            {
                GameDetailActivity.access$2100$58303095(GameDetailActivity.this, list, GameDetailActivity.access$600(GameDetailActivity.this));
            }
            findViewById(0x7f0d0156).setBackgroundColor(val$res.getColor(0x106000d));
            list1 = BannerExpando.enterTransition$4300a761(GameDetailActivity.this, GameDetailActivity.access$2200(GameDetailActivity.this)).setDuration(GameDetailActivity.access$600(GameDetailActivity.this));
            getWindow().setEnterTransition(list1);
            list1 = BannerExpando.returnTransition(GameDetailActivity.this, val$heroContainerView, val$containerView, GameDetailActivity.access$2300(GameDetailActivity.this), GameDetailActivity.access$200(GameDetailActivity.this), GameDetailActivity.access$300(GameDetailActivity.this), GameDetailActivity.access$2400(GameDetailActivity.this).findViewById(0x7f0d031b), val$backgroundView).setDuration(GameDetailActivity.access$900(GameDetailActivity.this));
            getWindow().setReturnTransition(list1);
            list = BannerExpando.sharedElementReturnTransition$4840fd25(GameDetailActivity.access$2500(GameDetailActivity.this), list).setDuration(GameDetailActivity.access$900(GameDetailActivity.this));
            getWindow().setSharedElementReturnTransition(list);
        }
    }

    ()
    {
        this$0 = final_gamedetailactivity;
        val$containerView = viewgroup;
        val$heroContainerView = viewgroup1;
        val$backgroundView = viewgroup2;
        val$res = Resources.this;
        super();
    }
}
