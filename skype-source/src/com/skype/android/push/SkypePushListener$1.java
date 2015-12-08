// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.android.inject.AccountProvider;
import com.skype.android.util.concurrent.KeyedJoin;

// Referenced classes of package com.skype.android.push:
//            SkypePushListener, SkyLibPushMessage, PushTelemetry

final class  extends KeyedJoin
{

    final SkypePushListener this$0;

    protected final void onJoin(Integer integer, SkyLibPushMessage skylibpushmessage, com.skype.ESULT esult)
    {
        SkypePushListener.access$100(SkypePushListener.this).reportMessageHandled(SkypePushListener.access$000(SkypePushListener.this).get(), skylibpushmessage, skylibpushmessage.getServiceToken(), esult);
    }

    protected final volatile void onJoin(Object obj, Object obj1, Object obj2)
    {
        onJoin((Integer)obj, (SkyLibPushMessage)obj1, (com.skype.ESULT)obj2);
    }

    ()
    {
        this$0 = SkypePushListener.this;
        super();
    }
}
