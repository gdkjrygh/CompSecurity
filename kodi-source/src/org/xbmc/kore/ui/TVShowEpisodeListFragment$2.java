// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.ExpandableListView;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowEpisodeListFragment

class this._cls0
    implements android.widget.ickListener
{

    final TVShowEpisodeListFragment this$0;

    public boolean onChildClick(ExpandableListView expandablelistview, View view, int i, int j, long l)
    {
        expandablelistview = (isodeViewHolder)view.getTag();
        TVShowEpisodeListFragment.access$100(TVShowEpisodeListFragment.this).onEpisodeSelected(TVShowEpisodeListFragment.access$000(TVShowEpisodeListFragment.this), ((isodeViewHolder) (expandablelistview)).episodeId);
        return true;
    }

    EpisodeSelectedListener()
    {
        this$0 = TVShowEpisodeListFragment.this;
        super();
    }
}
