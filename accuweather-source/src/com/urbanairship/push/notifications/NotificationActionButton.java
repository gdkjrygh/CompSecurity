// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.urbanairship.CoreActivity;
import com.urbanairship.CoreReceiver;
import com.urbanairship.push.PushMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.urbanairship.push.notifications:
//            LocalizableRemoteInput

public class NotificationActionButton
{
    public static class Builder
    {

        private String buttonId;
        private String description;
        private List extenders;
        private int iconId;
        private boolean isForegroundAction;
        private int labelId;
        private List remoteInputs;

        public Builder addRemoteInput(LocalizableRemoteInput localizableremoteinput)
        {
            if (remoteInputs == null)
            {
                remoteInputs = new ArrayList();
            }
            remoteInputs.add(localizableremoteinput);
            return this;
        }

        public NotificationActionButton build()
        {
            Object obj = new android.support.v4.app.NotificationCompat.Action.Builder(iconId, null, null);
            if (extenders != null)
            {
                for (Iterator iterator = extenders.iterator(); iterator.hasNext(); ((android.support.v4.app.NotificationCompat.Action.Builder) (obj)).extend((android.support.v4.app.NotificationCompat.Action.Extender)iterator.next())) { }
            }
            obj = ((android.support.v4.app.NotificationCompat.Action.Builder) (obj)).build();
            return new NotificationActionButton(buttonId, ((android.support.v4.app.NotificationCompat.Action) (obj)).icon, labelId, description, ((android.support.v4.app.NotificationCompat.Action) (obj)).getExtras(), isForegroundAction, remoteInputs);
        }

        public Builder extend(android.support.v4.app.NotificationCompat.Action.Extender extender)
        {
            if (extenders == null)
            {
                extenders = new ArrayList();
            }
            extenders.add(extender);
            return this;
        }

        public Builder setDescription(String s)
        {
            description = s;
            return this;
        }

        public Builder setIcon(int i)
        {
            iconId = i;
            return this;
        }

        public Builder setLabel(int i)
        {
            labelId = i;
            return this;
        }

        public Builder setPerformsInForeground(boolean flag)
        {
            isForegroundAction = flag;
            return this;
        }

        public Builder(String s)
        {
            labelId = 0;
            iconId = 0;
            isForegroundAction = true;
            buttonId = s;
        }
    }


    private final String description;
    private final Bundle extras;
    private final int iconId;
    private final String id;
    private final boolean isForegroundAction;
    private final int labelId;
    private List remoteInputs;

    private NotificationActionButton(String s, int i, int j, String s1, Bundle bundle, boolean flag, List list)
    {
        id = s;
        labelId = j;
        iconId = i;
        extras = bundle;
        description = s1;
        isForegroundAction = flag;
        remoteInputs = list;
    }


    android.support.v4.app.NotificationCompat.Action createAndroidNotificationAction(Context context, String s, PushMessage pushmessage, int i)
    {
        String s1;
        String s2;
        if (labelId > 0)
        {
            s1 = context.getString(labelId);
        } else
        {
            s1 = null;
        }
        if (description == null)
        {
            s2 = s1;
        } else
        {
            s2 = description;
        }
        s = (new Intent("com.urbanairship.ACTION_NOTIFICATION_BUTTON_OPENED_PROXY")).addCategory(UUID.randomUUID().toString()).putExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE", pushmessage.getPushBundle()).putExtra("com.urbanairship.push.NOTIFICATION_ID", i).putExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ID", id).putExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ACTIONS_PAYLOAD", s).putExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_FOREGROUND", isForegroundAction).putExtra("com.urbanairship.push.EXTRA_NOTIFICATION_ACTION_BUTTON_DESCRIPTION", s2);
        if (isForegroundAction)
        {
            s.setClass(context, com/urbanairship/CoreActivity);
            s = PendingIntent.getActivity(context, 0, s, 0);
        } else
        {
            s.setClass(context, com/urbanairship/CoreReceiver);
            s = PendingIntent.getBroadcast(context, 0, s, 0);
        }
        s = (new android.support.v4.app.NotificationCompat.Action.Builder(iconId, s1, s)).addExtras(extras);
        if (remoteInputs != null)
        {
            for (pushmessage = remoteInputs.iterator(); pushmessage.hasNext(); s.addRemoteInput(((LocalizableRemoteInput)pushmessage.next()).createRemoteInput(context))) { }
        }
        return s.build();
    }

    public Bundle getExtras()
    {
        return new Bundle(extras);
    }

    public int getIcon()
    {
        return iconId;
    }

    public String getId()
    {
        return id;
    }

    public int getLabel()
    {
        return labelId;
    }

    public List getRemoteInputs()
    {
        if (remoteInputs == null)
        {
            return null;
        } else
        {
            return new ArrayList(remoteInputs);
        }
    }

    public boolean isForegroundAction()
    {
        return isForegroundAction;
    }
}
