// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.ComponentName;
import java.util.LinkedList;

// Referenced classes of package android.support.v4.app:
//            INotificationSideChannel

class componentName
{

    public boolean bound;
    public final ComponentName componentName;
    public int retryCount;
    public INotificationSideChannel service;
    public LinkedList taskQueue;

    public (ComponentName componentname)
    {
        bound = false;
        taskQueue = new LinkedList();
        retryCount = 0;
        componentName = componentname;
    }
}
