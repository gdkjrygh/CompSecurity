// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput, NotificationCompatJellybean

class  extends 
{

    public Notification build( ,  1)
    {
         2 = new (., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., ., .);
        NotificationCompat.access$000(2, .);
        NotificationCompat.access$100(2, .);
        return 1.(, 2);
    }

    public  getAction(Notification notification, int i)
    {
        return ()NotificationCompatJellybean.getAction(notification, i, , RemoteInput.FACTORY);
    }

    public int getActionCount(Notification notification)
    {
        return NotificationCompatJellybean.getActionCount(notification);
    }

    public [] getActionsFromParcelableArrayList(ArrayList arraylist)
    {
        return ([])NotificationCompatJellybean.getActionsFromParcelableArrayList(arraylist, eArrayList, RemoteInput.FACTORY);
    }

    public Bundle getExtras(Notification notification)
    {
        return NotificationCompatJellybean.getExtras(notification);
    }

    public String getGroup(Notification notification)
    {
        return NotificationCompatJellybean.getGroup(notification);
    }

    public boolean getLocalOnly(Notification notification)
    {
        return NotificationCompatJellybean.getLocalOnly(notification);
    }

    public ArrayList getParcelableArrayListForActions(eArrayList aearraylist[])
    {
        return NotificationCompatJellybean.getParcelableArrayListForActions(aearraylist);
    }

    public String getSortKey(Notification notification)
    {
        return NotificationCompatJellybean.getSortKey(notification);
    }

    public boolean isGroupSummary(Notification notification)
    {
        return NotificationCompatJellybean.isGroupSummary(notification);
    }

    ()
    {
    }
}
