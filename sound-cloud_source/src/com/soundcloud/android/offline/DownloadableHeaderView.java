// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import a.a;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineState, DownloadImageView

public class DownloadableHeaderView
{

    DownloadImageView downloadStateView;
    private String headerText;
    TextView headerView;
    private final Resources resources;

    public DownloadableHeaderView(Resources resources1)
    {
        resources = resources1;
    }

    private void updateHeaderText(OfflineState offlinestate)
    {
        if (offlinestate == OfflineState.DOWNLOADING)
        {
            headerView.setText(resources.getString(0x7f0702e1));
            return;
        } else
        {
            headerView.setText(headerText);
            return;
        }
    }

    public void onDestroyView()
    {
        a.a(this);
    }

    public void onViewCreated(View view)
    {
        a.a(this, view);
    }

    public void setHeaderText(String s)
    {
        headerText = s;
        if (!downloadStateView.isDownloading())
        {
            headerView.setText(headerText);
        }
    }

    public void show(OfflineState offlinestate)
    {
        downloadStateView.setState(offlinestate);
        updateHeaderText(offlinestate);
    }
}
