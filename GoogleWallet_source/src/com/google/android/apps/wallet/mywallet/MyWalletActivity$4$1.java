// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletActivity, MyWalletManager

final class val.tile
    implements Callable
{

    final call this$1;
    final Tile val$tile;

    private Void call()
        throws Exception
    {
        myWalletManager.dismissTile(val$tile.getServerId());
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$tile = Tile.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/mywallet/MyWalletActivity$4

/* anonymous class */
    final class MyWalletActivity._cls4
        implements com.google.android.apps.wallet.tile.Tile.TileDismissedListener
    {

        final MyWalletActivity this$0;

        public final void onTileDismissed(Tile tile1)
        {
            actionExecutor.executeAction(tile1. new MyWalletActivity._cls4._cls1());
        }

            
            {
                this$0 = MyWalletActivity.this;
                super();
            }
    }

}
