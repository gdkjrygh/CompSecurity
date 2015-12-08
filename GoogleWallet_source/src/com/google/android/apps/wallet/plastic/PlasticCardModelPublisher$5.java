// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.frontinginstrument.FrontingInstrumentInfoManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

final class val.info
    implements Callable
{

    final PlasticCardModelPublisher this$0;
    final com.google.wallet.proto.nstrumentInfo val$info;

    private Void call()
    {
        PlasticCardModelPublisher.access$600(PlasticCardModelPublisher.this).saveFrontingInstrumentInfo(val$info);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    tInfoManager()
    {
        this$0 = final_plasticcardmodelpublisher;
        val$info = com.google.wallet.proto.nstrumentInfo.this;
        super();
    }
}
