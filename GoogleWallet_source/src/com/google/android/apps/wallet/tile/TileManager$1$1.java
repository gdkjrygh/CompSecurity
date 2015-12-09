// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tile;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.tile:
//            TileManager, Tile

final class val.tile
    implements Runnable
{

    final val.tile this$1;
    final Tile val$tile;

    public final void run()
    {
        if (TileManager.access$000(_fld0).containsKey(val$tile))
        {
            TileManager.access$100(_fld0, val$tile);
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$tile = Tile.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/tile/TileManager$1

/* anonymous class */
    final class TileManager._cls1
        implements Tile.TileDismissedListener
    {

        final TileManager this$0;

        public final void onTileDismissed(Tile tile1)
        {
            View view = tile1.getView();
            int i = view.getContext().getResources().getInteger(0x10e0001);
            view.postDelayed(tile1. new TileManager._cls1._cls1(), i);
        }

            
            {
                this$0 = TileManager.this;
                super();
            }
    }

}
