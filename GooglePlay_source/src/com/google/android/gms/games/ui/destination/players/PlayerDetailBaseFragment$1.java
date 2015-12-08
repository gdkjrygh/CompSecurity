// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.support.v4.app.SharedElementCallback;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.play.transition.CircularExpando;
import com.google.android.play.transition.PlayTransitionUtil;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailBaseFragment

final class val.levelView extends SharedElementCallback
{

    final PlayerDetailBaseFragment this$0;
    final ViewGroup val$heroContainerView;
    final TextView val$levelView;
    final ViewGroup val$listView;

    public final void onSharedElementStart$70d861b8(List list)
    {
        Object obj = val$heroContainerView.findViewById(0x7f0d01f2);
        if (PlayerDetailBaseFragment.access$000(PlayerDetailBaseFragment.this) && obj != null)
        {
            boolean _tmp = PlayerDetailBaseFragment.access$002$1fd666c8(PlayerDetailBaseFragment.this);
            val$listView.setTransitionGroup(true);
            val$heroContainerView.setTransitionGroup(true);
            obj = CircularExpando.windowTransition(PlayerDetailBaseFragment.access$200(PlayerDetailBaseFragment.this), ((android.view.View) (obj)), val$listView, PlayerDetailBaseFragment.access$300(PlayerDetailBaseFragment.this), true).setDuration(PlayerDetailBaseFragment.access$100(PlayerDetailBaseFragment.this));
            Transition transition = CircularExpando.windowTransition(PlayerDetailBaseFragment.access$400(PlayerDetailBaseFragment.this), null, val$listView, PlayerDetailBaseFragment.access$500(PlayerDetailBaseFragment.this), false);
            Window window = PlayerDetailBaseFragment.access$600(PlayerDetailBaseFragment.this).getWindow();
            window.setEnterTransition(((Transition) (obj)));
            window.setReturnTransition(PlayTransitionUtil.aggregate(new Transition[] {
                transition, (new Slide(48)).addTarget(val$heroContainerView)
            }).setDuration(PlayerDetailBaseFragment.access$100(PlayerDetailBaseFragment.this)));
            if (!list.contains("level"))
            {
                val$levelView.setAlpha(0.0F);
                boolean _tmp1 = PlayerDetailBaseFragment.access$702$1fd666c8(PlayerDetailBaseFragment.this);
            }
        }
    }

    ()
    {
        this$0 = final_playerdetailbasefragment;
        val$heroContainerView = viewgroup;
        val$listView = viewgroup1;
        val$levelView = TextView.this;
        super();
    }
}
