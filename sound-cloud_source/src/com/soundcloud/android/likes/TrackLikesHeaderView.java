// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import a.a;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageButton;
import com.soundcloud.android.offline.DownloadableHeaderView;
import com.soundcloud.android.offline.OfflineState;

class TrackLikesHeaderView
{

    private final DownloadableHeaderView downloadableHeaderView;
    private View headerView;
    private final Resources resources;
    ImageButton shuffleButton;
    private int trackCount;

    TrackLikesHeaderView(Resources resources1, DownloadableHeaderView downloadableheaderview)
    {
        resources = resources1;
        downloadableHeaderView = downloadableheaderview;
    }

    private String getHeaderText(int i)
    {
        return resources.getQuantityString(0x7f09001b, i, new Object[] {
            Integer.valueOf(i)
        });
    }

    private void updateShuffleButton(int i)
    {
        if (i <= 1)
        {
            shuffleButton.setVisibility(8);
            shuffleButton.setEnabled(false);
            return;
        } else
        {
            shuffleButton.setVisibility(0);
            shuffleButton.setEnabled(true);
            return;
        }
    }

    View getHeaderView()
    {
        return headerView;
    }

    public boolean isViewCreated()
    {
        return headerView != null;
    }

    void onDestroyView()
    {
        downloadableHeaderView.onDestroyView();
        a.a(this);
        headerView = null;
    }

    void onViewCreated(View view)
    {
        headerView = view.findViewById(0x7f0f0278);
        downloadableHeaderView.onViewCreated(headerView);
        a.a(this, headerView);
    }

    void setOnShuffleButtonClick(android.view.View.OnClickListener onclicklistener)
    {
        shuffleButton.setOnClickListener(onclicklistener);
    }

    public void show(OfflineState offlinestate)
    {
        downloadableHeaderView.show(offlinestate);
        if (offlinestate == OfflineState.NO_OFFLINE || offlinestate == OfflineState.DOWNLOADED)
        {
            updateTrackCount(trackCount);
        }
    }

    void updateTrackCount(int i)
    {
        trackCount = i;
        View view = headerView;
        byte byte0;
        if (i == 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        downloadableHeaderView.setHeaderText(getHeaderText(i));
        updateShuffleButton(i);
    }
}
