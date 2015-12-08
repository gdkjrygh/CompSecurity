// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            aa

static final class  extends 
{

    public final Notification a( ,  1)
    {
        1 = .mNotification;
        1.setLatestEventInfo(.mContext, .mContentTitle, .mContentText, .mContentIntent);
        android.content.Context context = .mContext;
        CharSequence charsequence = .mContentTitle;
        CharSequence charsequence1 = .mContentText;
        android.app.PendingIntent pendingintent = .mContentIntent;
        android.app.PendingIntent pendingintent1 = .mFullScreenIntent;
        1.setLatestEventInfo(context, charsequence, charsequence1, pendingintent);
        1.fullScreenIntent = pendingintent1;
        if (.mPriority > 0)
        {
            1.flags = ((Notification) (1)).flags | 0x80;
        }
        return 1;
    }

    ()
    {
    }
}
