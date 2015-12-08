// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.app.SharedElementCallback;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.play.transition.BaseTransitionListener;
import com.google.android.play.transition.HeroReloadoHelper;
import com.google.android.play.transition.PlayTransitionUtil;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

final class val.containerView extends SharedElementCallback
{

    final GameDetailActivity this$0;
    final ViewGroup val$backgroundView;
    final ViewGroup val$containerView;
    final Resources val$res;

    public final void onMapSharedElements(List list, Map map)
    {
        map.put("splash", val$backgroundView);
    }

    public final void onSharedElementStart(List list, List list1, List list2)
    {
        list = null;
        if (list2.size() > 0)
        {
            list = (View)list2.get(0);
        }
        list1 = val$backgroundView;
        list = PlayTransitionUtil.viewBounds(list);
        list2 = new int[2];
        list1.getLocationInWindow(list2);
        int k = list2[0];
        int l = list1.getLeft();
        int i = list2[1];
        int j = list1.getTop();
        k = list.centerX() - list1.getWidth() / 2 - (k - l);
        i = list.centerY() - list1.getHeight() / 2 - (i - j);
        list1.setRight(list1.getWidth() + k);
        list1.setBottom(list1.getHeight() + i);
        list1.setLeft(k);
        list1.setTop(i);
        GameDetailActivity.access$100(GameDetailActivity.this).initSharedView(GameDetailActivity.access$000(GameDetailActivity.this), "icon");
        UiUtils.setVisible(false, 4, new View[] {
            GameDetailActivity.access$200(GameDetailActivity.this), GameDetailActivity.access$300(GameDetailActivity.this), GameDetailActivity.access$400(GameDetailActivity.this), GameDetailActivity.access$500(GameDetailActivity.this), findViewById(0x7f0d0159), findViewById(0x7f0d015c), findViewById(0x7f0d0161), findViewById(0x7f0d0157), findViewById(0x7f0d031d)
        });
        findViewById(0x7f0d0156).setBackgroundColor(val$res.getColor(0x106000d));
        list = HeroReloadoHelper.windowTransition(GameDetailActivity.this, null, GameDetailActivity.access$700(GameDetailActivity.this), true).setDuration(GameDetailActivity.access$600(GameDetailActivity.this));
        getWindow().setEnterTransition(list);
        list = PlayTransitionUtil.aggregate(new Transition[] {
            HeroReloadoHelper.windowTransition(GameDetailActivity.this, null, GameDetailActivity.access$800(GameDetailActivity.this), false), (new Slide(80)).addTarget(val$containerView)
        }).setDuration(GameDetailActivity.access$900(GameDetailActivity.this));
        getWindow().setReturnTransition(list);
        list.addListener(new BaseTransitionListener() {

            final GameDetailActivity._cls1 this$1;

            public final void onTransitionStart(Transition transition)
            {
                GameDetailActivity.access$1000(this$0).setVisibility(4);
                GameDetailActivity.access$1100(this$0).setVisibility(8);
            }

            
            {
                this$1 = GameDetailActivity._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = final_gamedetailactivity;
        val$backgroundView = viewgroup;
        val$res = resources;
        val$containerView = ViewGroup.this;
        super();
    }
}
