// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.tile.Tile;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            WoblTileFactory

final class val.walletTile
    implements com.google.android.apps.wallet.tile.Listener
{

    final WoblTileFactory this$0;
    final com.google.wallet.proto.api..WalletTile val$walletTile;

    public final void onTileDismissed(Tile tile)
    {
        if (val$walletTile.dismissEvent != null)
        {
            WoblTileFactory.access$000(WoblTileFactory.this).sendEventFromProto(val$walletTile.dismissEvent);
        }
    }

    ener()
    {
        this$0 = final_wobltilefactory;
        val$walletTile = com.google.wallet.proto.api..WalletTile.this;
        super();
    }
}
