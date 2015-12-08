// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.DialogInterface;
import org.xbmc.kore.utils.FileDownloadHelper;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowEpisodeDetailsFragment

class this._cls0
    implements android.content.
{

    final TVShowEpisodeDetailsFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        FileDownloadHelper.downloadFiles(getActivity(), TVShowEpisodeDetailsFragment.access$400(TVShowEpisodeDetailsFragment.this), TVShowEpisodeDetailsFragment.access$500(TVShowEpisodeDetailsFragment.this), 1, TVShowEpisodeDetailsFragment.access$200(TVShowEpisodeDetailsFragment.this));
    }

    ()
    {
        this$0 = TVShowEpisodeDetailsFragment.this;
        super();
    }
}
