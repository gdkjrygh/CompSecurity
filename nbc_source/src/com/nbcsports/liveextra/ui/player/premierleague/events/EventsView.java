// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuffColorFilter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventsAdapter, EventsPresenter

public class EventsView extends RelativeLayout
{

    private EventsAdapter adapter;
    AssetViewModel asset;
    PremierLeagueEngine engine;
    RecyclerView events;
    TextView goLive;
    View prematch;
    ImageView prematchPlayIcon;
    EventsPresenter presenter;
    TextView teamMatchup;

    public EventsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (isInEditMode())
        {
            return;
        } else
        {
            PremierLeagueEngine.component().inject(this);
            return;
        }
    }

    public void add(com.nbcsports.liveextra.content.models.overlay.premierleague.MajorEventsTimeline.TimelineEvent timelineevent)
    {
        adapter.add(timelineevent);
    }

    public void bindPrematch(String s, String s1)
    {
        if (teamMatchup == null)
        {
            return;
        } else
        {
            teamMatchup.setText(getContext().getString(0x7f07015a, new Object[] {
                s, s1
            }));
            return;
        }
    }

    public void enablePrematch(boolean flag)
    {
        prematch.setClickable(flag);
        Resources resources = getResources();
        int i;
        if (flag)
        {
            i = 0x7f0e004a;
        } else
        {
            i = 0x7f0e0031;
        }
        i = resources.getColor(i);
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            prematchPlayIcon.setColorFilter(new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_ATOP));
            return;
        } else
        {
            prematchPlayIcon.setImageTintList(ColorStateList.valueOf(i));
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        presenter.takeView(this);
    }

    public void onClickPrematch()
    {
        presenter.seek();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.release();
    }

    public void onGoLiveClick()
    {
        presenter.goLive();
    }

    void setupRecyclerView()
    {
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), 0, false);
        events.setLayoutManager(layoutManager);
        adapter = new EventsAdapter(getContext());
        events.setAdapter(adapter);
        adapter.registerAdapterDataObserver(new android.support.v7.widget.RecyclerView.AdapterDataObserver() {

            final EventsView this$0;
            final LinearLayoutManager val$layoutManager;

            public void onChanged()
            {
                super.onChanged();
                int i;
                if (adapter != null)
                {
                    if ((i = adapter.getItemCount()) != 0)
                    {
                        layoutManager.scrollToPosition(i - 1);
                        return;
                    }
                }
            }

            
            {
                this$0 = EventsView.this;
                layoutManager = linearlayoutmanager;
                super();
            }
        });
    }

    public void showGoLive(boolean flag)
    {
        TextView textview = goLive;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    public void update(List list)
    {
        View view = prematch;
        byte byte0;
        if (list.size() > 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        adapter.update(list);
    }

}
