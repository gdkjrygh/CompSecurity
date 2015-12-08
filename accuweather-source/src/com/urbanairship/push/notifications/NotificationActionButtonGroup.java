// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import android.content.Context;
import com.urbanairship.Logger;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.UAStringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.push.notifications:
//            NotificationActionButton

public class NotificationActionButtonGroup
{
    public static class Builder
    {

        private final List actionButtons = new ArrayList();

        public Builder addNotificationActionButton(NotificationActionButton notificationactionbutton)
        {
            actionButtons.add(notificationactionbutton);
            return this;
        }

        public NotificationActionButtonGroup build()
        {
            return new NotificationActionButtonGroup(actionButtons);
        }

        public Builder()
        {
        }
    }


    private final List actionButtons;

    private NotificationActionButtonGroup(List list)
    {
        actionButtons = new ArrayList(list);
    }


    List createAndroidActions(Context context, PushMessage pushmessage, int i, String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = null;
        Object obj = iterator;
        if (!UAStringUtil.isEmpty(s))
        {
            try
            {
                obj = new JSONObject(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.error((new StringBuilder()).append("Failed to parse notification actions payload: ").append(s).toString(), ((Throwable) (obj)));
                obj = iterator;
            }
        }
        iterator = getNotificationActionButtons().iterator();
        while (iterator.hasNext()) 
        {
            NotificationActionButton notificationactionbutton = (NotificationActionButton)iterator.next();
            if (obj == null)
            {
                s = null;
            } else
            {
                s = ((JSONObject) (obj)).optString(notificationactionbutton.getId());
            }
            arraylist.add(notificationactionbutton.createAndroidNotificationAction(context, s, pushmessage, i));
        }
        return arraylist;
    }

    public List getNotificationActionButtons()
    {
        return new ArrayList(actionButtons);
    }
}
