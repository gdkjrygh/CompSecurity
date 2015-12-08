// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app;


// Referenced classes of package com.skype.android.app.app2app:
//            Stream

final class this._cls0
    implements Runnable
{

    final Stream this$0;

    public final void run()
    {
        checkAndSendPingPacket();
    }

    ()
    {
        this$0 = Stream.this;
        super();
    }
}
