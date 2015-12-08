// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.data.ObjectExclusionFilterable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.requests:
//            RequestAdapter

private static final class er extends com.google.android.gms.games.ui.card.r
{

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        RequestAdapter requestadapter = (RequestAdapter)mAdapter;
        GameRequest gamerequest = (GameRequest)getData();
        int i = menuitem.getItemId();
        if (i == 0x7f0d0358)
        {
            menuitem = gamerequest.getGame();
            RequestAdapter.access$200(requestadapter).onRequestMuteAppClicked(menuitem);
            return true;
        }
        if (i == 0x7f0d035a)
        {
            ((ObjectExclusionFilterable)getDataBuffer()).filterOut(gamerequest);
            RequestAdapter.access$200(requestadapter).onRequestDismissed(gamerequest);
            return true;
        } else
        {
            return false;
        }
    }

    public final void onPrimaryActionClicked()
    {
        RequestAdapter.access$200((RequestAdapter)mAdapter).onRequestsClicked(new GameRequest[] {
            (GameRequest)getData()
        });
    }

    public final void onSecondaryActionClicked()
    {
        RequestAdapter requestadapter = (RequestAdapter)mAdapter;
        GameRequest gamerequest = (GameRequest)getData();
        ((ObjectExclusionFilterable)getDataBuffer()).filterOut(gamerequest);
        RequestAdapter.access$200(requestadapter).onRequestDismissed(gamerequest);
    }

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        obj = (GameRequest)obj;
        super.populateViews(gamesrecycleradapter, i, obj);
        RequestAdapter requestadapter = (RequestAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, requestadapter, RequestAdapter.access$000(requestadapter), 1052, obj);
        setRootViewFocusable(true);
        i = 0x7f100245;
        if (((GameRequest) (obj)).getType() == 2)
        {
            i = 0x7f100246;
        }
        setTitle(i);
        setImagePaddingEnabled(true);
        gamesrecycleradapter = ((GameRequest) (obj)).getSender();
        if (RequestAdapter.access$100(requestadapter))
        {
            setImageCircleCropEnabled(true);
            setImage(gamesrecycleradapter.getHiResImageUri(), 0x7f0200db);
            obj = getSubtitleViewBuffer();
            gamesrecycleradapter.getDisplayName(((android.database.CharArrayBuffer) (obj)));
            setSubtitle(((android.database.CharArrayBuffer) (obj)));
        } else
        {
            obj = ((GameRequest) (obj)).getGame();
            setImage(((Game) (obj)).getHiResImageUri(), 0x7f0200da);
            android.database.CharArrayBuffer chararraybuffer = getSubtitleViewBuffer();
            ((Game) (obj)).getDisplayName(chararraybuffer);
            setSubtitle(chararraybuffer);
            obj = new ArrayList(1);
            ((ArrayList) (obj)).add(gamesrecycleradapter.getIconImageUri());
            setAvatarRowData(((ArrayList) (obj)), 0x7f0200db);
        }
        setPrimaryAction(0x7f100242);
        setPrimaryActionContentDescription(0x7f100243);
        setSecondaryAction(0x7f100248);
        setSecondaryActionContentDescription(0x7f100249);
        setRootViewClickable(false);
        setContextMenu(0x7f12000b);
    }

    public er(View view)
    {
        super(view);
    }
}
