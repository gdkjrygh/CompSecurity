// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput

public static class _cls1 extends ion
{

    public static final ion.Factory FACTORY = new NotificationCompatBase.Action.Factory() {

    };
    public PendingIntent actionIntent;
    public int icon;
    private final Bundle mExtras;
    private final RemoteInput mRemoteInputs[];
    public CharSequence title;

    public PendingIntent getActionIntent()
    {
        return actionIntent;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public int getIcon()
    {
        return icon;
    }

    public RemoteInput[] getRemoteInputs()
    {
        return mRemoteInputs;
    }

    public volatile teInput[] getRemoteInputs()
    {
        return getRemoteInputs();
    }

    public CharSequence getTitle()
    {
        return title;
    }

}
