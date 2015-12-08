// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.games.provider:
//            PlayGamesContentProvider

final class this._cls0 extends Handler
{

    final PlayGamesContentProvider this$0;

    public final void handleMessage(Message message)
    {
        performBackgroundTask(message.what, message.obj);
    }

    (Looper looper)
    {
        this$0 = PlayGamesContentProvider.this;
        super(looper);
    }
}
