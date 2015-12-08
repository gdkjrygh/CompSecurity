// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import android.location.Location;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.util.location.LocationFetcher;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletManager, MyWalletStorageManager

final class this._cls0
    implements Callable
{

    final MyWalletManager this$0;

    private com.google.wallet.proto.api..FetchMyWalletResponse call()
        throws Exception
    {
        Object obj = new com.google.wallet.proto.api..FetchMyWalletRequest();
        obj.renderInfo = new com.google.wallet.proto.t.RequestRenderInfo();
        ((com.google.wallet.proto.api..FetchMyWalletRequest) (obj)).renderInfo.contextParameters = MyWalletManager.access$900(MyWalletManager.this);
        ((com.google.wallet.proto.api..FetchMyWalletRequest) (obj)).renderInfo.entrypointNames = (new String[] {
            "g_my_wallet_tile"
        });
        Location location = MyWalletManager.access$1000(MyWalletManager.this).getLastKnownLocation(TimeUnit.MINUTES.toMillis(10L));
        if (location != null)
        {
            com.google.wallet.proto..PhysicalLocation physicallocation = new com.google.wallet.proto..PhysicalLocation();
            physicallocation.accuracy = Float.valueOf(location.getAccuracy());
            physicallocation.longitude = Double.valueOf(location.getLongitude());
            physicallocation.latitude = Double.valueOf(location.getLatitude());
            obj.location = physicallocation;
        }
        obj.supportedTileType = (new int[] {
            16, 5, 9, 17, 4, 10, 11, 3, 12, 15, 
            14
        });
        obj = (com.google.wallet.proto.api..FetchMyWalletResponse)MyWalletManager.access$1100(MyWalletManager.this).call("b/mywallet/fetch", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api..FetchMyWalletResponse());
        MyWalletManager.access$500(MyWalletManager.this).put(((com.google.protobuf.nano.MessageNano) (obj)));
        return ((com.google.wallet.proto.api..FetchMyWalletResponse) (obj));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    etResponse()
    {
        this$0 = MyWalletManager.this;
        super();
    }
}
