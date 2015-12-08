// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

static class 
    implements 
{

    public Notification build( )
    {
        Notification notification = .;
        notification.setLatestEventInfo(., ., ., .);
        if (. > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }

    public  getAction(Notification notification, int i)
    {
        return null;
    }

    public int getActionCount(Notification notification)
    {
        return 0;
    }

    public [] getActionsFromParcelableArrayList(ArrayList arraylist)
    {
        return null;
    }

    public String getCategory(Notification notification)
    {
        return null;
    }

    public Bundle getExtras(Notification notification)
    {
        return null;
    }

    public String getGroup(Notification notification)
    {
        return null;
    }

    public boolean getLocalOnly(Notification notification)
    {
        return false;
    }

    public ArrayList getParcelableArrayListForActions( a[])
    {
        return null;
    }

    public String getSortKey(Notification notification)
    {
        return null;
    }

    public boolean isGroupSummary(Notification notification)
    {
        return false;
    }

    ()
    {
    }
}
