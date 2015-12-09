// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.search.SearchMenu;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            DetailsActivity

public class DetailsMenu
{
    private class OnVideoHideCallback extends LoggingManagerCallback
    {

        final DetailsMenu this$0;

        public void onVideoHide(int i)
        {
            super.onVideoHide(i);
            shareItem.setEnabled(true);
            if (i != 0)
            {
                Log.w("DetailsMenu", "Invalid status code");
                Toast.makeText(activity, 0x7f0c010b, 1).show();
                return;
            } else
            {
                Toast.makeText(activity, 0x7f0c0108, 1).show();
                updateShareItemAsUnshared();
                return;
            }
        }

        public OnVideoHideCallback()
        {
            this$0 = DetailsMenu.this;
            super("DetailsMenu");
        }
    }

    private class UnshareClickHandler
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private final ServiceManager serviceMan;
        final DetailsMenu this$0;
        private final String videoId;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            menuitem.setEnabled(false);
            if (serviceMan != null)
            {
                serviceMan.hideVideo(videoId, new OnVideoHideCallback());
            }
            return true;
        }

        public UnshareClickHandler(ServiceManager servicemanager, String s)
        {
            this$0 = DetailsMenu.this;
            super();
            serviceMan = servicemanager;
            videoId = s;
        }
    }


    private static final String TAG = "DetailsMenu";
    private final DetailsActivity activity;
    private final MenuItem shareItem;

    public DetailsMenu(DetailsActivity detailsactivity, Menu menu, String s)
    {
        activity = detailsactivity;
        SearchMenu.addSearchNavigation(detailsactivity, menu);
        shareItem = createShareItem(menu);
    }

    private MenuItem createShareItem(Menu menu)
    {
        menu = menu.add("");
        menu.setShowAsAction(0);
        menu.setVisible(false);
        return menu;
    }

    private void updateShareItemAsUnshared()
    {
        shareItem.setTitle(0x7f0c010a).setEnabled(false).setVisible(true);
    }

    private void updateShareItemToUnshare(ServiceManager servicemanager, String s)
    {
        shareItem.setTitle(0x7f0c0109).setOnMenuItemClickListener(new UnshareClickHandler(servicemanager, s)).setEnabled(true).setVisible(true);
    }

    public void updateShareItem(ServiceManager servicemanager, VideoDetails videodetails)
    {
        if (servicemanager == null)
        {
            Log.w("DetailsMenu", "Service manager is null");
            return;
        }
        boolean flag = false;
        if (videodetails instanceof MovieDetails)
        {
            flag = ((MovieDetails)videodetails).isShared();
        } else
        if (videodetails instanceof ShowDetails)
        {
            flag = ((ShowDetails)videodetails).isShared();
        }
        if (flag)
        {
            updateShareItemToUnshare(servicemanager, videodetails.getId());
            return;
        } else
        {
            updateShareItemAsUnshared();
            return;
        }
    }



}
