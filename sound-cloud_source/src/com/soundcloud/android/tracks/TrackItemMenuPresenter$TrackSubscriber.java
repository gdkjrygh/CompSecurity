// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.view.MenuItem;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.view.menu.PopupMenuWrapper;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemMenuPresenter, TrackItem

private static class menu extends DefaultSubscriber
{

    private final PopupMenuWrapper menu;
    private final TrackItem track;

    private void updateLikeActionTitle(boolean flag)
    {
        MenuItem menuitem = menu.findItem(0x7f0f02c8);
        if (flag)
        {
            menuitem.setTitle(0x7f0700b3);
        } else
        {
            menuitem.setTitle(0x7f0700ac);
        }
        menu.setItemEnabled(0x7f0f02c8, true);
    }

    private void updateRepostActionTitle(boolean flag)
    {
        MenuItem menuitem = menu.findItem(0x7f0f0254);
        if (flag)
        {
            menuitem.setTitle(0x7f070217);
            return;
        } else
        {
            menuitem.setTitle(0x7f0701ce);
            return;
        }
    }

    public void onNext(PropertySet propertyset)
    {
        track.update(propertyset);
        updateLikeActionTitle(track.isLiked());
        updateRepostActionTitle(track.isReposted());
    }

    public volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }

    public (TrackItem trackitem, PopupMenuWrapper popupmenuwrapper)
    {
        track = trackitem;
        menu = popupmenuwrapper;
    }
}
