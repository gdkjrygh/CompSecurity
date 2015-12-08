// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.callbacks;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.callbacks:
//            BaseCastConsumer

public interface DataCastConsumer
    extends BaseCastConsumer
{

    public abstract void onApplicationConnected(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag);

    public abstract void onApplicationConnectionFailed(int i);

    public abstract void onApplicationDisconnected(int i);

    public abstract void onApplicationStatusChanged(String s);

    public abstract void onApplicationStopFailed(int i);

    public abstract void onMessageReceived(CastDevice castdevice, String s, String s1);

    public abstract void onMessageSendFailed(Status status);

    public abstract void onRemoved(CastDevice castdevice, String s);

    public abstract void onVolumeChanged(double d, boolean flag);
}
