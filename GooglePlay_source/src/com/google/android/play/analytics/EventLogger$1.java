// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.play.analytics:
//            EventLogger

final class this._cls0 extends Handler
{

    final EventLogger this$0;

    public final void dispatchMessage(Message message)
    {
        EventLogger.access$000(EventLogger.this, message);
    }

    (Looper looper)
    {
        this$0 = EventLogger.this;
        super(looper);
    }
}
