// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.notification;

import android.app.PendingIntent;

// Referenced classes of package com.netflix.mediaclient.service.mdx.notification:
//            MdxNotificationManager

public static interface 
{

    public abstract PendingIntent getNoActionIntent();

    public abstract PendingIntent getPauseIntent();

    public abstract PendingIntent getPlayNextIntent();

    public abstract PendingIntent getResumeIntent();

    public abstract PendingIntent getSkipbackIntent(int i);

    public abstract PendingIntent getStopIntent();
}
