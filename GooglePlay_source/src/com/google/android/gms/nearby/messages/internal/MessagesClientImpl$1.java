// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import com.google.android.gms.nearby.messages.StatusCallback;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessagesClientImpl

final class apperCache extends apperCache
{

    final MessagesClientImpl this$0;

    protected final volatile IBinder createWrapper(Object obj)
    {
        return new atusCallbackWrapper((StatusCallback)obj, (byte)0);
    }

    atusCallbackWrapper()
    {
        this$0 = MessagesClientImpl.this;
        super((byte)0);
    }
}
