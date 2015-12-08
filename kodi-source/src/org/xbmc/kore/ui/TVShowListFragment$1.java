// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowListFragment

class this._cls0
    implements android.widget.ckListener
{

    final TVShowListFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (ewHolder)view.getTag();
        TVShowListFragment.access$000(TVShowListFragment.this).onTVShowSelected(((ewHolder) (adapterview)).tvshowId, ((ewHolder) (adapterview)).tvshowTitle);
    }

    TVShowSelectedListener()
    {
        this$0 = TVShowListFragment.this;
        super();
    }
}
