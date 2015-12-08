// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamSyncOperations

class t> extends DefaultSubscriber
{

    final SoundStreamSyncOperations this$0;

    public void onNext(Notification notification)
    {
        ((NotificationManager)SoundStreamSyncOperations.access$000(SoundStreamSyncOperations.this).getSystemService("notification")).notify(4, notification);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Notification)obj);
    }

    ()
    {
        this$0 = SoundStreamSyncOperations.this;
        super();
    }
}
