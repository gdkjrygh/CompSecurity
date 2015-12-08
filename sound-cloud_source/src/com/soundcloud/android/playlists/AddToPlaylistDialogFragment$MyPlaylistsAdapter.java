// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import a.a;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CellRendererBinding;
import com.soundcloud.android.presentation.ListItemAdapter;
import java.util.List;

// Referenced classes of package com.soundcloud.android.playlists:
//            AddToPlaylistDialogFragment, AddTrackToPlaylistItem

static class featureOperations extends ListItemAdapter
{

    private final Context context;
    private final FeatureOperations featureOperations;
    ImageView offlineIcon;
    ImageView privateIcon;
    TextView titleView;
    TextView trackCountView;

    private void setIconsVisibility(boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        ImageView imageview = privateIcon;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        if (featureOperations.isOfflineContentEnabled() && flag1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        imageview = offlineIcon;
        if (i != 0)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    private void setTitleText(AddTrackToPlaylistItem addtracktoplaylistitem)
    {
        if (addtracktoplaylistitem.playlistUrn == Urn.NOT_SET)
        {
            titleView.setText(context.getString(0x7f0700fa));
            return;
        } else
        {
            titleView.setText(addtracktoplaylistitem.title);
            return;
        }
    }

    private void setTrackCountView(int i)
    {
        if (i == -1)
        {
            trackCountView.setCompoundDrawablesWithIntrinsicBounds(null, null, context.getResources().getDrawable(0x7f02018a), null);
            trackCountView.setText(null);
            return;
        } else
        {
            trackCountView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(0x7f020245), null, null, null);
            trackCountView.setText(String.valueOf(i));
            return;
        }
    }

    public AddTrackToPlaylistItem getItem(int i)
    {
        return (AddTrackToPlaylistItem)items.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public int getItemCount()
    {
        return items.size();
    }

    public long getItemId(int i)
    {
        return getItem(i).playlistUrn.getNumericId();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = View.inflate(context, 0x7f03001c, null);
        }
        a.a(this, viewgroup);
        view = getItem(i);
        titleView.setEnabled(isEnabled(i));
        setTitleText(view);
        setTrackCountView(((AddTrackToPlaylistItem) (view)).trackCount);
        setIconsVisibility(((AddTrackToPlaylistItem) (view)).isPrivate, ((AddTrackToPlaylistItem) (view)).isOffline);
        return viewgroup;
    }

    public boolean isEnabled(int i)
    {
        return !getItem(i).isTrackAdded;
    }

    public (Context context1, FeatureOperations featureoperations)
    {
        super(new CellRendererBinding[0]);
        context = context1;
        featureOperations = featureoperations;
    }
}
