// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.tile.Tile;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalancePlasticCardFragment

final class this._cls0
    implements com.google.android.apps.wallet.tile.ment._cls1
{

    final WalletBalancePlasticCardFragment this$0;

    public final void onTileDismissed(Tile tile)
    {
        notifyTileChanged();
    }

    ()
    {
        this$0 = WalletBalancePlasticCardFragment.this;
        super();
    }
}
