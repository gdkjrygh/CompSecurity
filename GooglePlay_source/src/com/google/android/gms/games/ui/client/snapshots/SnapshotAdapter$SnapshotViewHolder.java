// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.snapshots;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.common.snapshots.SnapshotEventListener;
import com.google.android.gms.games.ui.common.snapshots.SnapshotListMetadataProvider;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.client.snapshots:
//            SnapshotAdapter

private static final class Y extends com.google.android.gms.games.ui.card.tViewHolder
{

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0d0362)
        {
            SnapshotAdapter.access$200((SnapshotAdapter)mAdapter).onSnapshotDeleted((SnapshotMetadata)getData());
        }
        return false;
    }

    public final void onRootViewClicked()
    {
        SnapshotAdapter.access$200((SnapshotAdapter)mAdapter).onSnapshotClicked((SnapshotMetadata)getData());
    }

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        SnapshotMetadata snapshotmetadata = (SnapshotMetadata)obj;
        super.populateViews(gamesrecycleradapter, i, snapshotmetadata);
        SnapshotAdapter snapshotadapter = (SnapshotAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, snapshotadapter, SnapshotAdapter.access$000(snapshotadapter), 1051, snapshotmetadata);
        Resources resources = mContext.getResources();
        Asserts.checkNotNull(snapshotmetadata);
        obj = snapshotmetadata.getCoverImageUri();
        gamesrecycleradapter = ((GamesRecyclerAdapter) (obj));
        if (obj == null)
        {
            Game game = snapshotmetadata.getGame();
            gamesrecycleradapter = ((GamesRecyclerAdapter) (obj));
            if (game != null)
            {
                gamesrecycleradapter = game.getFeaturedImageUri();
            }
        }
        setImage(gamesrecycleradapter, 0x7f0201e0);
        setImageAspectRatio(2.048F);
        obj = snapshotmetadata.getGame().getDisplayName();
        String s = snapshotmetadata.getDescription();
        String s1 = UiUtils.getActualDateTimeString(mContext, snapshotmetadata.getLastModifiedTimestamp());
        long l = snapshotmetadata.getPlayedTime();
        gamesrecycleradapter = "";
        if (l != -1L)
        {
            if (l < 60000L)
            {
                i = (int)(l / 1000L);
                gamesrecycleradapter = resources.getQuantityString(0x7f0f0005, i, new Object[] {
                    Integer.valueOf(i)
                });
            } else
            if (l < 0x36ee80L)
            {
                i = (int)(l / 60000L);
                gamesrecycleradapter = resources.getQuantityString(0x7f0f0003, i, new Object[] {
                    Integer.valueOf(i)
                });
            } else
            if (l < 0x2255100L)
            {
                i = (int)(l / 0x36ee80L);
                int j = (int)((l - (long)i * 0x36ee80L) / 60000L);
                if (i == 1)
                {
                    gamesrecycleradapter = resources.getQuantityString(0x7f0f0004, j, new Object[] {
                        Integer.valueOf(j)
                    });
                } else
                {
                    gamesrecycleradapter = resources.getQuantityString(0x7f0f0002, j, new Object[] {
                        Integer.valueOf(i), Integer.valueOf(j)
                    });
                }
            } else
            {
                i = (int)(l / 0x36ee80L);
                gamesrecycleradapter = resources.getString(0x7f10015d, new Object[] {
                    Integer.valueOf(i), Integer.valueOf(i)
                });
            }
        }
        setTitle(s);
        setSubtitle(0x7f1000ba);
        setImageOverlayLeftText(s1);
        setImageOverlayRightText(gamesrecycleradapter);
        setRootViewContentDescription(resources.getString(0x7f1002c1, new Object[] {
            obj, "", resources.getString(0x7f100291), s1, gamesrecycleradapter, s
        }));
        if (SnapshotAdapter.access$100(snapshotadapter).isDeleteAllowed())
        {
            setContextMenu(0x7f12001e);
            return;
        } else
        {
            setContextMenu(0);
            return;
        }
    }

    public Y(View view)
    {
        super(view);
    }
}
