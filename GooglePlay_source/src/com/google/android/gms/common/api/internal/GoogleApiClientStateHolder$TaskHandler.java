// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientStateHolder

final class this._cls0 extends Handler
{

    final GoogleApiClientStateHolder this$0;

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.w("GACStateManager", (new StringBuilder("Unknown message id: ")).append(message.what).toString());
            return;

        case 1: // '\001'
            ((this._cls0)message.obj).run(GoogleApiClientStateHolder.this);
            return;

        case 2: // '\002'
            throw (RuntimeException)message.obj;
        }
    }

    (Looper looper)
    {
        this$0 = GoogleApiClientStateHolder.this;
        super(looper);
    }
}
