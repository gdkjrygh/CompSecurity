// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.callbacks;

import android.view.View;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Q;
import com.google.android.gms.cast.o;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.callbacks:
//            BaseCastConsumer

public interface VideoCastConsumer
    extends BaseCastConsumer
{

    public abstract void onApplicationConnected(ApplicationMetadata applicationmetadata, String s, boolean flag);

    public abstract void onApplicationConnectionFailed(int i);

    public abstract void onApplicationDisconnected(int i);

    public abstract void onApplicationStatusChanged(String s);

    public abstract void onApplicationStopFailed(int i);

    public abstract void onDataMessageReceived(String s);

    public abstract void onDataMessageSendFailed(int i);

    public abstract void onMediaLoadResult(int i);

    public abstract void onMediaQueueOperationResult(int i, int j);

    public abstract void onMediaQueueUpdated(List list, o o, int i, boolean flag);

    public abstract void onNamespaceRemoved();

    public abstract void onRemoteMediaPlayerMetadataUpdated();

    public abstract void onRemoteMediaPlayerStatusUpdated();

    public abstract void onRemoteMediaPreloadStatusUpdated(o o);

    public abstract void onTextTrackEnabledChanged(boolean flag);

    public abstract void onTextTrackLocaleChanged(Locale locale);

    public abstract void onTextTrackStyleChanged(Q q);

    public abstract void onUpcomingPlayClicked(View view, o o);

    public abstract void onUpcomingStopClicked(View view, o o);

    public abstract void onVolumeChanged(double d, boolean flag);
}
