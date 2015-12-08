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
//            BaseCastConsumerImpl, VideoCastConsumer

public class VideoCastConsumerImpl extends BaseCastConsumerImpl
    implements VideoCastConsumer
{

    public VideoCastConsumerImpl()
    {
    }

    public void onApplicationConnected(ApplicationMetadata applicationmetadata, String s, boolean flag)
    {
    }

    public void onApplicationConnectionFailed(int i)
    {
    }

    public void onApplicationDisconnected(int i)
    {
    }

    public void onApplicationStatusChanged(String s)
    {
    }

    public void onApplicationStopFailed(int i)
    {
    }

    public void onDataMessageReceived(String s)
    {
    }

    public void onDataMessageSendFailed(int i)
    {
    }

    public void onMediaLoadResult(int i)
    {
    }

    public void onMediaQueueOperationResult(int i, int j)
    {
    }

    public void onMediaQueueUpdated(List list, o o, int i, boolean flag)
    {
    }

    public void onNamespaceRemoved()
    {
    }

    public void onRemoteMediaPlayerMetadataUpdated()
    {
    }

    public void onRemoteMediaPlayerStatusUpdated()
    {
    }

    public void onRemoteMediaPreloadStatusUpdated(o o)
    {
    }

    public void onTextTrackEnabledChanged(boolean flag)
    {
    }

    public void onTextTrackLocaleChanged(Locale locale)
    {
    }

    public void onTextTrackStyleChanged(Q q)
    {
    }

    public void onUpcomingPlayClicked(View view, o o)
    {
    }

    public void onUpcomingStopClicked(View view, o o)
    {
    }

    public void onVolumeChanged(double d, boolean flag)
    {
    }
}
