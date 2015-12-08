// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.support.v7.widget.LinearLayoutManager;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventsView, EventsAdapter

class val.layoutManager extends android.support.v7.widget.AdapterDataObserver
{

    final EventsView this$0;
    final LinearLayoutManager val$layoutManager;

    public void onChanged()
    {
        super.onChanged();
        int i;
        if (EventsView.access$000(EventsView.this) != null)
        {
            if ((i = EventsView.access$000(EventsView.this).getItemCount()) != 0)
            {
                val$layoutManager.scrollToPosition(i - 1);
                return;
            }
        }
    }

    ()
    {
        this$0 = final_eventsview;
        val$layoutManager = LinearLayoutManager.this;
        super();
    }
}
