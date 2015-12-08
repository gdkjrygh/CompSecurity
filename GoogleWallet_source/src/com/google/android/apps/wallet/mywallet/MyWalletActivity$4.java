// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletActivity, MyWalletManager

final class this._cls0
    implements com.google.android.apps.wallet.tile.istener
{

    final MyWalletActivity this$0;

    public final void onTileDismissed(final Tile tile)
    {
        actionExecutor.executeAction(new Callable() {

            final MyWalletActivity._cls4 this$1;
            final Tile val$tile;

            private Void call()
                throws Exception
            {
                myWalletManager.dismissTile(tile.getServerId());
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$1 = MyWalletActivity._cls4.this;
                tile = tile1;
                super();
            }
        });
    }

    _cls1.val.tile()
    {
        this$0 = MyWalletActivity.this;
        super();
    }
}
