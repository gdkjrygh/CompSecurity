// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.util.DeviceUtils;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            DetailsActivity, ShowDetailsFrag, EpisodeListFrag

public class ShowDetailsActivity extends DetailsActivity
    implements EpisodeRowView.EpisodeRowListenerProvider, EpisodeRowView.EpisodeRowListener
{

    public ShowDetailsActivity()
    {
    }

    private boolean shouldHideDetailsView()
    {
        return DeviceUtils.isTabletByContext(this) && DeviceUtils.isLandscape(this);
    }

    protected Fragment createPrimaryFrag()
    {
        return ShowDetailsFrag.create(getVideoId(), getEpisodeId());
    }

    protected Fragment createSecondaryFrag()
    {
        String s = getVideoId();
        String s1 = getEpisodeId();
        boolean flag;
        if (!shouldHideDetailsView())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return EpisodeListFrag.create(s, s1, flag);
    }

    public EpisodeRowView.EpisodeRowListener getEpisodeRowListener()
    {
        EpisodeRowView.EpisodeRowListener episoderowlistener = super.getEpisodeRowListener();
        if (episoderowlistener != null)
        {
            return episoderowlistener;
        } else
        {
            return this;
        }
    }

    protected void onCreateOptionsMenu(Menu menu, Menu menu1)
    {
        if (menu1 != null)
        {
            menu1.add("Display episodes dialog").setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

                final ShowDetailsActivity this$0;

                public boolean onMenuItemClick(MenuItem menuitem)
                {
                    menuitem = EpisodeListFrag.create(getVideoId(), getEpisodeId(), false);
                    menuitem.onManagerReady(getServiceManager(), 0);
                    menuitem.setCancelable(true);
                    showDialog(menuitem);
                    return true;
                }

            
            {
                this$0 = ShowDetailsActivity.this;
                super();
            }
            });
        }
        super.onCreateOptionsMenu(menu, menu1);
    }

    public void onEpisodeSelectedForPlayback(EpisodeDetails episodedetails, PlayContext playcontext)
    {
        PlaybackLauncher.startPlaybackAfterPIN(this, episodedetails, playcontext);
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        bundle = (EpisodeListFrag)getSecondaryFrag();
        if (shouldHideDetailsView())
        {
            getPrimaryFragContainer().setVisibility(0);
            bundle.hideDetailViewHeader();
            return;
        } else
        {
            getPrimaryFragContainer().setVisibility(8);
            bundle.showDetailViewHeader();
            return;
        }
    }
}
