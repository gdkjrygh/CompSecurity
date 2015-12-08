// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.notification.GameNotificationBuffer;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesBridgeService, PlayGamesNotificationManager

private static final class mContext extends mContext
{

    private final Context mContext;

    private void checkPermissions()
        throws SecurityException
    {
        if (!GooglePlayServicesUtil.uidHasPackageName(mContext, Binder.getCallingUid(), "com.google.android.gms"))
        {
            throw new SecurityException("Permission check failed");
        } else
        {
            return;
        }
    }

    public final void logDisplayedNotificationAction(String s, String s1, int i)
    {
        checkPermissions();
        PlayGamesNotificationManager.logDisplayedNotificationAction(mContext, s, s1, i);
    }

    public final void showLevelUpNotification(String s, String s1, String s2, DataHolder dataholder, BitmapTeleporter bitmapteleporter)
    {
        GameNotificationBuffer gamenotificationbuffer;
        boolean flag;
        flag = true;
        checkPermissions();
        gamenotificationbuffer = new GameNotificationBuffer(dataholder);
        if (gamenotificationbuffer.getCount() != 1)
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Trying to show more than one level notification!");
        if (bitmapteleporter != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        bitmapteleporter = null;
_L1:
        PlayGamesNotificationManager.showLevelUpNotification(mContext, s, s1, s2, gamenotificationbuffer.get(0), bitmapteleporter);
        dataholder.close();
        return;
        bitmapteleporter = bitmapteleporter.get();
          goto _L1
        s;
        dataholder.close();
        throw s;
    }

    public final void updateNotifications(String s, String s1, String s2, boolean flag, DataHolder dataholder, BitmapTeleporter bitmapteleporter)
    {
        GameNotificationBuffer gamenotificationbuffer;
        checkPermissions();
        gamenotificationbuffer = new GameNotificationBuffer(dataholder);
        if (bitmapteleporter != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        bitmapteleporter = null;
_L1:
        PlayGamesNotificationManager.updateNotifications(mContext, s, s1, s2, flag, gamenotificationbuffer, bitmapteleporter);
        dataholder.close();
        return;
        bitmapteleporter = bitmapteleporter.get();
          goto _L1
        s;
        dataholder.close();
        throw s;
    }

    Q(Context context)
    {
        mContext = context;
    }
}
