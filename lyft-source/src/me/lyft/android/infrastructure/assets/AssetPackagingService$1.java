// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.assets;

import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;

// Referenced classes of package me.lyft.android.infrastructure.assets:
//            AssetPackagingService

class this._cls0 extends SimpleSubscriber
{

    final AssetPackagingService this$0;

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        L.w(throwable, "updateAssets", new Object[0]);
    }

    ()
    {
        this$0 = AssetPackagingService.this;
        super();
    }
}
