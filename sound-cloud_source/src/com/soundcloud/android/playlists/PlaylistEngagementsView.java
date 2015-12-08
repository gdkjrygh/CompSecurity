// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import a.a;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import com.soundcloud.android.offline.DownloadableHeaderView;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.android.view.menu.PopupMenuWrapper;

public class PlaylistEngagementsView
    implements com.soundcloud.android.view.menu.PopupMenuWrapper.PopupMenuWrapperListener
{
    public static interface OnEngagementListener
    {

        public abstract void onMakeOfflineAvailable(boolean flag);

        public abstract void onPlayShuffled();

        public abstract void onShare();

        public abstract void onToggleLike(boolean flag);

        public abstract void onToggleRepost(boolean flag, boolean flag1);

        public abstract void onUpsell(Context context1);

        public abstract void onUpsellImpression();
    }


    private final Context context;
    private final DownloadableHeaderView downloadableHeaderView;
    ToggleButton likeToggle;
    private OnEngagementListener listener;
    private final CondensedNumberFormatter numberFormatter;
    View overflowButton;
    private PopupMenuWrapper popupMenuWrapper;
    private final com.soundcloud.android.view.menu.PopupMenuWrapper.Factory popupMenuWrapperFactory;
    private final Resources resources;

    public PlaylistEngagementsView(Context context1, CondensedNumberFormatter condensednumberformatter, com.soundcloud.android.view.menu.PopupMenuWrapper.Factory factory, DownloadableHeaderView downloadableheaderview)
    {
        context = context1;
        numberFormatter = condensednumberformatter;
        resources = context1.getResources();
        popupMenuWrapperFactory = factory;
        downloadableHeaderView = downloadableheaderview;
    }

    private OnEngagementListener getListener()
    {
        return listener;
    }

    private void updateToggleButton(ToggleButton togglebutton, int i, int j, int k, boolean flag, int l)
    {
        String s = numberFormatter.format(k);
        togglebutton.setTextOn(s);
        togglebutton.setTextOff(s);
        togglebutton.setChecked(flag);
        togglebutton.invalidate();
        if (AndroidUtils.accessibilityFeaturesAvailable(context) && TextUtils.isEmpty(togglebutton.getContentDescription()))
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(resources.getString(i));
            if (k >= 0)
            {
                stringbuilder.append(", ");
                stringbuilder.append(resources.getQuantityString(j, k, new Object[] {
                    Integer.valueOf(k)
                }));
            }
            if (flag)
            {
                stringbuilder.append(", ");
                stringbuilder.append(resources.getString(l));
            }
            togglebutton.setContentDescription(stringbuilder.toString());
        }
    }

    void disableShuffle()
    {
        popupMenuWrapper.setItemEnabled(0x7f0f02c4, false);
    }

    void enableShuffle()
    {
        popupMenuWrapper.setItemEnabled(0x7f0f02c4, true);
    }

    void hideOfflineContentOptions()
    {
        popupMenuWrapper.setItemVisible(0x7f0f02c6, false);
        popupMenuWrapper.setItemVisible(0x7f0f02c7, false);
        popupMenuWrapper.setItemVisible(0x7f0f02c5, false);
    }

    void hidePublicOptions()
    {
        popupMenuWrapper.setItemVisible(0x7f0f02bf, false);
        popupMenuWrapper.setItemVisible(0x7f0f02c0, false);
        popupMenuWrapper.setItemVisible(0x7f0f02c1, false);
    }

    public void onDestroyView()
    {
        a.a(this);
    }

    public void onDismiss()
    {
    }

    public boolean onMenuItemClick(MenuItem menuitem, Context context1)
    {
        switch (menuitem.getItemId())
        {
        case 2131690178: 
        case 2131690179: 
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected menu item clicked ")).append(menuitem).toString());

        case 2131690176: 
            getListener().onToggleRepost(true, true);
            return true;

        case 2131690177: 
            getListener().onToggleRepost(false, true);
            return true;

        case 2131690175: 
            getListener().onShare();
            return true;

        case 2131690182: 
            getListener().onMakeOfflineAvailable(true);
            return true;

        case 2131690183: 
            getListener().onMakeOfflineAvailable(false);
            return true;

        case 2131690181: 
            getListener().onUpsell(context1);
            return true;

        case 2131690180: 
            getListener().onPlayShuffled();
            return true;
        }
    }

    void onOverflowButtonClicked()
    {
        popupMenuWrapper.show();
        if (popupMenuWrapper.findItem(0x7f0f02c5).isVisible())
        {
            listener.onUpsellImpression();
        }
    }

    void onToggleLikeClicked()
    {
        getListener().onToggleLike(likeToggle.isChecked());
    }

    public void onViewCreated(View view)
    {
        Object obj = (ViewGroup)view.findViewById(0x7f0f01ff);
        obj = View.inflate(view.getContext(), 0x7f030082, ((ViewGroup) (obj)));
        a.a(this, ((View) (obj)));
        popupMenuWrapper = popupMenuWrapperFactory.build(view.getContext(), overflowButton);
        popupMenuWrapper.inflate(0x7f100005);
        popupMenuWrapper.setOnMenuItemClickListener(this);
        downloadableHeaderView.onViewCreated(((View) (obj)));
    }

    void setInfoText(String s)
    {
        downloadableHeaderView.setHeaderText(s);
    }

    void setOfflineOptionsMenu(boolean flag)
    {
        PopupMenuWrapper popupmenuwrapper = popupMenuWrapper;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        popupmenuwrapper.setItemVisible(0x7f0f02c6, flag1);
        popupMenuWrapper.setItemVisible(0x7f0f02c7, flag);
        popupMenuWrapper.setItemVisible(0x7f0f02c5, false);
    }

    void setOnEngagement(OnEngagementListener onengagementlistener)
    {
        listener = onengagementlistener;
    }

    void showOfflineState(OfflineState offlinestate)
    {
        downloadableHeaderView.show(offlinestate);
    }

    void showPublicOptions(boolean flag)
    {
        boolean flag1 = true;
        popupMenuWrapper.setItemVisible(0x7f0f02bf, true);
        PopupMenuWrapper popupmenuwrapper = popupMenuWrapper;
        if (flag)
        {
            flag1 = false;
        }
        popupmenuwrapper.setItemVisible(0x7f0f02c0, flag1);
        popupMenuWrapper.setItemVisible(0x7f0f02c1, flag);
    }

    void showPublicOptionsForYourTrack()
    {
        popupMenuWrapper.setItemVisible(0x7f0f02bf, true);
        popupMenuWrapper.setItemVisible(0x7f0f02c0, false);
        popupMenuWrapper.setItemVisible(0x7f0f02c1, false);
    }

    void showUpsell()
    {
        popupMenuWrapper.setItemVisible(0x7f0f02c5, true);
        popupMenuWrapper.setItemVisible(0x7f0f02c6, false);
        popupMenuWrapper.setItemVisible(0x7f0f02c7, false);
    }

    public void updateLikeItem(int i, boolean flag)
    {
        updateToggleButton(likeToggle, 0x7f07005d, 0x7f090000, i, flag, 0x7f07005f);
    }
}
