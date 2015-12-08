// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            FallbackRemoteAudioManager, NotificationTrack

public class RemoteAudioManager extends FallbackRemoteAudioManager
{

    private final RemoteControlClient client;
    private final Resources resources;

    public RemoteAudioManager(Context context)
    {
        super(context);
        client = createRemoteControlClient(context);
        resources = context.getResources();
    }

    private void applyRemoteMetadata(PropertySet propertyset, Bitmap bitmap)
    {
        propertyset = new NotificationTrack(resources, propertyset);
        propertyset = client.editMetadata(false).putString(7, propertyset.getTitle()).putString(1, propertyset.getCreatorName()).putLong(9, propertyset.getDuration());
        if (bitmap != null)
        {
            propertyset.putBitmap(100, bitmap);
        }
        propertyset.apply();
    }

    private RemoteControlClient createRemoteControlClient(Context context)
    {
        context = new RemoteControlClient(PendingIntent.getBroadcast(context, 0, (new Intent("android.intent.action.MEDIA_BUTTON")).setComponent(receiverComponent), 0x8000000));
        context.setTransportControlFlags(189);
        return context;
    }

    private void registerRemoteControlClient()
    {
        getAudioManager().registerRemoteControlClient(client);
    }

    private static int translateState(boolean flag)
    {
        return !flag ? 2 : 3;
    }

    private void unregisterRemoteControlClient()
    {
        client.editMetadata(false).clear();
        getAudioManager().unregisterRemoteControlClient(client);
    }

    public boolean isTrackChangeSupported()
    {
        return true;
    }

    public void onFocusAbandoned()
    {
        super.onFocusAbandoned();
        unregisterRemoteControlClient();
    }

    public void onFocusObtained()
    {
        super.onFocusObtained();
        registerRemoteControlClient();
    }

    public void onTrackChanged(PropertySet propertyset, Bitmap bitmap)
    {
        applyRemoteMetadata(propertyset, bitmap);
    }

    public void setPlaybackState(boolean flag)
    {
        int i = translateState(flag);
        client.setPlaybackState(i);
    }
}
