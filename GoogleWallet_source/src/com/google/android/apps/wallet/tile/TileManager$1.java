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

final class this._cls0
    implements ssedListener
{

    final TileManager this$0;

    public final void onTileDismissed(final Tile tile)
    {
        View view = tile.getView();
        int i = view.getContext().getResources().getInteger(0x10e0001);
        view.postDelayed(new Runnable() {

            final TileManager._cls1 this$1;
            final Tile val$tile;

            public final void run()
            {
                if (TileManager.access$000(this$0).containsKey(tile))
                {
                    TileManager.access$100(this$0, tile);
                }
            }

            
            {
                this$1 = TileManager._cls1.this;
                tile = tile1;
                super();
            }
        }, i);
    }

    _cls1.val.tile()
    {
        this$0 = TileManager.this;
        super();
    }
}
