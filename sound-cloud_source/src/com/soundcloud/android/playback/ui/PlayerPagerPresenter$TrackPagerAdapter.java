// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.playback.PlayQueueManager;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter, PlayerPageData, PlayerPagePresenter, TrackPageData, 
//            TrackPageRecycler, TrackPagePresenter

private class <init> extends PagerAdapter
{

    final PlayerPagerPresenter this$0;

    private View instantiateAdView(PlayerPagePresenter playerpagepresenter, ViewGroup viewgroup, int i)
    {
        PlayerPageData playerpagedata = (PlayerPageData)PlayerPagerPresenter.access$1900(PlayerPagerPresenter.this).get(i);
        if (playerpagedata.isTrackPage() && PlayerPagerPresenter.access$2700(PlayerPagerPresenter.this) == null)
        {
            PlayerPagerPresenter.access$2702(PlayerPagerPresenter.this, playerpagepresenter.createItemView(viewgroup, PlayerPagerPresenter.access$2800(PlayerPagerPresenter.this)));
        } else
        if (playerpagedata.isVideoPage() && PlayerPagerPresenter.access$2900(PlayerPagerPresenter.this) == null)
        {
            PlayerPagerPresenter.access$2902(PlayerPagerPresenter.this, playerpagepresenter.createItemView(viewgroup, PlayerPagerPresenter.access$2800(PlayerPagerPresenter.this)));
        }
        viewgroup = PlayerPagerPresenter.this;
        if (playerpagedata.isTrackPage())
        {
            playerpagepresenter = PlayerPagerPresenter.access$2700(PlayerPagerPresenter.this);
        } else
        {
            playerpagepresenter = PlayerPagerPresenter.access$2900(PlayerPagerPresenter.this);
        }
        return PlayerPagerPresenter.access$2500(viewgroup, i, playerpagepresenter);
    }

    private View instantiateTrackView(int i)
    {
        Object obj1 = (TrackPageData)PlayerPagerPresenter.access$1900(PlayerPagerPresenter.this).get(i);
        Object obj = ((TrackPageData) (obj1)).getTrackUrn();
        if (PlayerPagerPresenter.access$2300(PlayerPagerPresenter.this).hasExistingPage(((com.soundcloud.android.model.Urn) (obj))))
        {
            obj1 = PlayerPagerPresenter.access$2300(PlayerPagerPresenter.this).removePageByUrn(((com.soundcloud.android.model.Urn) (obj)));
            obj = obj1;
            if (!PlayerPagerPresenter.access$100(PlayerPagerPresenter.this))
            {
                PlayerPagerPresenter.access$2400(PlayerPagerPresenter.this).onBackground(((View) (obj1)));
                obj = obj1;
            }
        } else
        {
            obj = PlayerPagerPresenter.access$2300(PlayerPagerPresenter.this).getRecycledPage();
            PlayerPagerPresenter.access$1300(PlayerPagerPresenter.this, ((PlayerPageData) (obj1))).clearItemView(((View) (obj)));
        }
        PlayerPagerPresenter.access$2500(PlayerPagerPresenter.this, i, ((View) (obj)));
        PlayerPagerPresenter.access$2600(PlayerPagerPresenter.this, ((View) (obj)), i);
        return ((View) (obj));
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (View)obj;
        viewgroup.removeView(((View) (obj)));
        if (isTrackView(obj))
        {
            viewgroup = ((TrackPageData)PlayerPagerPresenter.access$1200(PlayerPagerPresenter.this).get(obj)).getTrackUrn();
            PlayerPagerPresenter.access$2300(PlayerPagerPresenter.this).recyclePage(viewgroup, ((View) (obj)));
            if (!PlayerPagerPresenter.access$000(PlayerPagerPresenter.this).isCurrentTrack(viewgroup))
            {
                PlayerPagerPresenter.access$2400(PlayerPagerPresenter.this).onBackground(((View) (obj)));
            }
        }
        PlayerPagerPresenter.access$1200(PlayerPagerPresenter.this).remove(obj);
    }

    public int getCount()
    {
        return PlayerPagerPresenter.access$1900(PlayerPagerPresenter.this).size();
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        getItemViewType(i);
        JVM INSTR tableswitch 1 2: default 32
    //                   1 53
    //                   2 70;
           goto _L1 _L2 _L3
_L1:
        View view = instantiateTrackView(i);
_L5:
        PlayerPagerPresenter.access$2200(PlayerPagerPresenter.this, view);
        viewgroup.addView(view);
        return view;
_L2:
        view = instantiateAdView(PlayerPagerPresenter.access$2000(PlayerPagerPresenter.this), viewgroup, i);
        continue; /* Loop/switch isn't completed */
_L3:
        view = instantiateAdView(PlayerPagerPresenter.access$2100(PlayerPagerPresenter.this), viewgroup, i);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view.equals(obj);
    }

    private ()
    {
        this$0 = PlayerPagerPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
