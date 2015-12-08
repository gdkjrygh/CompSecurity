// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.view.MenuItem;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            ShowDetailsActivity, EpisodeListFrag

class this._cls0
    implements android.view.ckListener
{

    final ShowDetailsActivity this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem = EpisodeListFrag.create(getVideoId(), getEpisodeId(), false);
        menuitem.onManagerReady(getServiceManager(), 0);
        menuitem.setCancelable(true);
        showDialog(menuitem);
        return true;
    }

    g()
    {
        this$0 = ShowDetailsActivity.this;
        super();
    }
}
