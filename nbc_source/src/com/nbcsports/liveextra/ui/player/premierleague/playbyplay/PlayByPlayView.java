// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayByPlayAdapter, PlayByPlayPresenter

public class PlayByPlayView extends RelativeLayout
{

    private PlayByPlayAdapter adapter;
    private LinearLayoutManager layoutManager;
    RecyclerView playlist;
    PlayByPlayPresenter presenter;

    public PlayByPlayView(Context context)
    {
        this(context, null);
    }

    public PlayByPlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayByPlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (isInEditMode())
        {
            return;
        } else
        {
            PremierLeagueEngine.component().inject(this);
            return;
        }
    }

    public void bind(List list)
    {
        adapter.update(list);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            presenter.takeView(this);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.release();
    }

    public void resetList()
    {
        adapter.clearAdapter();
    }

    void setupRecyclerView()
    {
        layoutManager = new LinearLayoutManager(getContext());
        playlist.setLayoutManager(layoutManager);
        if (adapter == null)
        {
            adapter = new PlayByPlayAdapter(getContext());
            playlist.setAdapter(adapter);
            adapter.registerAdapterDataObserver(new android.support.v7.widget.RecyclerView.AdapterDataObserver() {

                final PlayByPlayView this$0;

                public void onChanged()
                {
                    super.onChanged();
                    while (adapter == null || adapter.getItemCount() == 0) 
                    {
                        return;
                    }
                    layoutManager.scrollToPosition(0);
                }

                public void onItemRangeInserted(int i, int j)
                {
                    super.onItemRangeInserted(i, j);
                    while (adapter == null || adapter.getItemCount() == 0) 
                    {
                        return;
                    }
                    layoutManager.scrollToPosition(0);
                }

            
            {
                this$0 = PlayByPlayView.this;
                super();
            }
            });
        }
    }


}
