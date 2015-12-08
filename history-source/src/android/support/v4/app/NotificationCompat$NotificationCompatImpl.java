// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

static interface 
{

    public abstract Notification build( );

    public abstract  getAction(Notification notification, int i);

    public abstract int getActionCount(Notification notification);

    public abstract [] getActionsFromParcelableArrayList(ArrayList arraylist);

    public abstract String getCategory(Notification notification);

    public abstract Bundle getExtras(Notification notification);

    public abstract String getGroup(Notification notification);

    public abstract boolean getLocalOnly(Notification notification);

    public abstract ArrayList getParcelableArrayListForActions( a[]);

    public abstract String getSortKey(Notification notification);

    public abstract boolean isGroupSummary(Notification notification);
}
