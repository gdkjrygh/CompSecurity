// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            NotificationBuilder

public class MediaStyleNotificationBuilder
    implements NotificationBuilder
{

    private static final int NEXT_ACTION_INDEX = 2;
    private static final int PENDING_INTENT_REQUEST_CODE = com/soundcloud/android/playback/notification/MediaStyleNotificationBuilder.hashCode();
    private static final int PREVIOUS_ACTION_INDEX = 0;
    private static final int TOGGLE_PLAY_ACTION_INDEX = 1;
    private android.app.Notification.Builder builder;
    private final Context context;
    private String creatorName;
    private Bitmap largeIcon;
    private PendingIntent pendingIntent;
    private final Resources resources;
    private int smallIcon;
    private String trackTitle;

    public MediaStyleNotificationBuilder(Context context1, ImageOperations imageoperations)
    {
        context = context1;
        resources = context1.getResources();
        smallIcon = 0x7f0201f0;
        largeIcon = imageoperations.decodeResource(resources, 0x7f0201f0);
        builder = createBuilder();
        builder.addAction(createAction(context1, "com.soundcloud.android.playback.external.previous"));
        builder.addAction(createAction(context1, "com.soundcloud.android.playback.external.toggleplayback"));
        builder.addAction(createAction(context1, "com.soundcloud.android.playback.external.next"));
    }

    private android.app.Notification.Action createAction(Context context1, String s)
    {
        int i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 56
    //                   -1756810435: 176
    //                   -1756744834: 161
    //                   -64475583: 116
    //                   1375176428: 146
    //                   1644777785: 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        i;
        JVM INSTR tableswitch 0 4: default 92
    //                   0 191
    //                   1 222
    //                   2 222
    //                   3 242
    //                   4 262;
           goto _L7 _L8 _L9 _L9 _L10 _L11
_L7:
        throw new IllegalArgumentException((new StringBuilder("Unknown action : ")).append(s).toString());
_L4:
        if (s.equals("com.soundcloud.android.playback.external.previous"))
        {
            i = 0;
        }
          goto _L1
_L6:
        if (s.equals("com.soundcloud.android.playback.external.toggleplayback"))
        {
            i = 1;
        }
          goto _L1
_L5:
        if (s.equals("com.soundcloud.android.playback.external.pause"))
        {
            i = 2;
        }
          goto _L1
_L3:
        if (s.equals("com.soundcloud.android.playback.external.play"))
        {
            i = 3;
        }
          goto _L1
_L2:
        if (s.equals("com.soundcloud.android.playback.external.next"))
        {
            i = 4;
        }
          goto _L1
_L8:
        String s1;
        i = 0x7f0201f4;
        s1 = resources.getString(0x7f0701a8);
_L13:
        return new android.app.Notification.Action(i, s1, createPendingIntent(context1, s));
_L9:
        i = 0x7f0201f3;
        s1 = resources.getString(0x7f07017b);
        s = "com.soundcloud.android.playback.external.toggleplayback";
        continue; /* Loop/switch isn't completed */
_L10:
        i = 0x7f0201f2;
        s1 = resources.getString(0x7f07017a);
        s = "com.soundcloud.android.playback.external.toggleplayback";
        continue; /* Loop/switch isn't completed */
_L11:
        i = 0x7f0201f1;
        s1 = resources.getString(0x7f070166);
        if (true) goto _L13; else goto _L12
_L12:
    }

    private android.app.Notification.Builder createBuilder()
    {
        android.app.Notification.Builder builder1 = new android.app.Notification.Builder(context);
        builder1.setStyle((new android.app.Notification.MediaStyle()).setShowActionsInCompactView(new int[] {
            0, 1, 2
        }));
        builder1.setVisibility(1);
        builder1.setUsesChronometer(false);
        builder1.setShowWhen(false);
        builder1.setSmallIcon(smallIcon);
        builder1.setLargeIcon(largeIcon);
        builder1.setContentTitle(creatorName);
        builder1.setContentText(trackTitle);
        builder1.setContentIntent(pendingIntent);
        return builder1;
    }

    private Intent createIntent(String s)
    {
        return (new Intent(s)).putExtra("play_event_source", "notification").addFlags(32);
    }

    private PendingIntent createPendingIntent(Context context1, String s)
    {
        return PendingIntent.getBroadcast(context1, PENDING_INTENT_REQUEST_CODE, createIntent(s), 0);
    }

    public Notification build()
    {
        return builder.build();
    }

    public void clearIcon()
    {
        largeIcon = null;
        builder.setLargeIcon(null);
    }

    public ApiImageSize getImageSize()
    {
        return ApiImageSize.getNotificationLargeIconImageSize(resources);
    }

    public int getTargetImageSize()
    {
        return resources.getDimensionPixelSize(0x7f0b00cf);
    }

    public boolean hasArtworkSupport()
    {
        return true;
    }

    public boolean hasPlayStateSupport()
    {
        return true;
    }

    public void setContentIntent(PendingIntent pendingintent)
    {
        pendingIntent = pendingintent;
        builder.setContentIntent(pendingintent);
    }

    public void setCreatorName(String s)
    {
        creatorName = s;
        builder.setContentTitle(s);
    }

    public void setIcon(Bitmap bitmap)
    {
        largeIcon = bitmap;
        builder.setLargeIcon(bitmap);
    }

    public void setPlayingStatus(boolean flag)
    {
        builder = createBuilder();
        builder.addAction(createAction(context, "com.soundcloud.android.playback.external.previous"));
        if (flag)
        {
            builder.addAction(createAction(context, "com.soundcloud.android.playback.external.play"));
        } else
        {
            builder.addAction(createAction(context, "com.soundcloud.android.playback.external.pause"));
        }
        builder.addAction(createAction(context, "com.soundcloud.android.playback.external.next"));
        builder.setOngoing(flag);
    }

    public void setSmallIcon(int i)
    {
        smallIcon = i;
        builder.setSmallIcon(i);
    }

    public void setTrackTitle(String s)
    {
        trackTitle = s;
        builder.setContentText(s);
    }

}
