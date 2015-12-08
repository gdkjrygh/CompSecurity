// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleAdapter, SchedulePresenter

public class ScheduleView extends RecyclerView
{
    public static interface Callback
    {

        public abstract void onListUpdated();
    }


    private ScheduleAdapter adapter;
    private List callbacks;
    SchedulePresenter presenter;

    public ScheduleView(Context context)
    {
        this(context, null);
    }

    public ScheduleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ScheduleView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        callbacks = new ArrayList();
        if (isInEditMode())
        {
            return;
        } else
        {
            PremierLeagueEngine.component().inject(this);
            setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            adapter = new ScheduleAdapter(context);
            setAdapter(adapter);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        presenter.takeView(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.release();
    }

    public void registerCallback(Callback callback)
    {
        callbacks.add(callback);
    }

    public void unregisterCallback(Callback callback)
    {
        callbacks.remove(callback);
    }

    public void update(List list)
    {
        adapter.update(list);
        for (list = callbacks.iterator(); list.hasNext(); ((Callback)list.next()).onListUpdated()) { }
    }
}
