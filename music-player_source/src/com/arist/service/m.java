// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.app.Notification;
import android.content.Context;
import android.media.session.MediaSession;
import com.arist.activity.MyApplication;
import com.arist.b.b;
import com.arist.c.a.a;

// Referenced classes of package com.arist.service:
//            o, n

public final class m extends o
{

    private MediaSession c;

    public m(Context context)
    {
        super(context);
        c = new MediaSession(context, "NotifyManager2");
        c.setActive(true);
        c.setCallback(new n(this));
        c.setFlags(3);
    }

    public final Notification a(b b1, boolean flag)
    {
        Object obj = com.arist.c.a.a.a(MyApplication.q, b1);
        c.setMetadata((new android.media.MediaMetadata.Builder()).putBitmap("android.media.metadata.ALBUM_ART", ((android.graphics.Bitmap) (obj))).putString("android.media.metadata.ARTIST", b1.j()).putString("android.media.metadata.ALBUM", b1.h()).putString("android.media.metadata.TITLE", b1.d()).build());
        obj = (new android.app.Notification.Builder(b)).setShowWhen(false).setStyle((new android.app.Notification.MediaStyle()).setMediaSession(c.getSessionToken()).setShowActionsInCompactView(new int[] {
            0, 1, 2
        })).setLargeIcon(((android.graphics.Bitmap) (obj))).setSmallIcon(0x7f020006).setTicker(b1.d()).setContentText(b1.j()).setContentInfo(b1.h()).setContentTitle(b1.d());
        int i;
        if (flag)
        {
            i = 0x7f0200c9;
        } else
        {
            i = 0x7f0200cc;
        }
        if (flag)
        {
            b1 = "pause";
        } else
        {
            b1 = "play";
        }
        return ((android.app.Notification.Builder) (obj)).addAction(i, b1, a(com.arist.c.a.b)).addAction(0x7f0200c6, "next", a(com.arist.c.a.g)).addAction(0x7f0200d0, "stop", a(com.arist.c.a.q)).setContentIntent(a()).build();
    }
}
