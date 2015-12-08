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

    public boolean onGroupClick(ExpandableListView expandablelistview, View view, int i, long l)
    {
        if (expandablelistview.isGroupExpanded(i))
        {
            expandablelistview.collapseGroup(i);
        } else
        {
            expandablelistview.expandGroup(i);
        }
        return true;
    }

    kListener()
    {
        this$0 = TVShowEpisodeListFragment.this;
        super();
    }
}
