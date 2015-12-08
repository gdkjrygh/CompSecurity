// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.NotificationIDGenerator;
import com.urbanairship.util.UAStringUtil;

// Referenced classes of package com.urbanairship.push.notifications:
//            NotificationFactory

public class DefaultNotificationFactory extends NotificationFactory
{

    private int constantNotificationId;
    private int largeIcon;
    private int smallIconId;
    private Uri sound;
    private int titleId;

    public DefaultNotificationFactory(Context context)
    {
        super(context);
        sound = null;
        constantNotificationId = -1;
        titleId = context.getApplicationInfo().labelRes;
        smallIconId = context.getApplicationInfo().icon;
    }

    public Notification createNotification(PushMessage pushmessage, int i)
    {
        if (UAStringUtil.isEmpty(pushmessage.getAlert()))
        {
            return null;
        } else
        {
            return createNotificationBuilder(pushmessage, i).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(pushmessage.getAlert())).build();
        }
    }

    protected android.support.v4.app.NotificationCompat.Builder createNotificationBuilder(PushMessage pushmessage, int i)
    {
        android.support.v4.app.NotificationCompat.Builder builder = (new android.support.v4.app.NotificationCompat.Builder(getContext())).setContentTitle(getDefaultTitle()).setContentText(pushmessage.getAlert()).setAutoCancel(true).setSmallIcon(smallIconId);
        if (sound != null)
        {
            builder.setSound(sound);
        }
        if (largeIcon > 0)
        {
            builder.setLargeIcon(BitmapFactory.decodeResource(getContext().getResources(), largeIcon));
        }
        builder.extend(createNotificationActionsExtender(pushmessage, i));
        return builder;
    }

    public int getConstantNotificationId()
    {
        return constantNotificationId;
    }

    protected String getDefaultTitle()
    {
        if (getTitleId() == 0)
        {
            return getContext().getPackageManager().getApplicationLabel(getContext().getApplicationInfo()).toString();
        }
        if (getTitleId() > 0)
        {
            return getContext().getString(getTitleId());
        } else
        {
            return "";
        }
    }

    public int getLargeIcon()
    {
        return largeIcon;
    }

    public int getNextId(PushMessage pushmessage)
    {
        if (constantNotificationId > 0)
        {
            return constantNotificationId;
        } else
        {
            return NotificationIDGenerator.nextID();
        }
    }

    public int getSmallIconId()
    {
        return smallIconId;
    }

    public Uri getSound()
    {
        return sound;
    }

    public int getTitleId()
    {
        return titleId;
    }

    public void setConstantNotificationId(int i)
    {
        constantNotificationId = i;
    }

    public void setLargeIcon(int i)
    {
        largeIcon = i;
    }

    public void setSmallIconId(int i)
    {
        smallIconId = i;
    }

    public void setSound(Uri uri)
    {
        sound = uri;
    }

    public void setTitleId(int i)
    {
        titleId = i;
    }
}
