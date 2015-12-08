// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            aa

static class 
    implements 
{

    public Notification a( ,  1)
    {
        1 = .mNotification;
        1.setLatestEventInfo(.mContext, .mContentTitle, .mContentText, .mContentIntent);
        if (.mPriority > 0)
        {
            1.flags = ((Notification) (1)).flags | 0x80;
        }
        return 1;
    }

    public Bundle a(Notification notification)
    {
        return null;
    }

    public gs a(Notification notification, int i)
    {
        return null;
    }

    public ArrayList a(gs ags[])
    {
        return null;
    }

    public int b(Notification notification)
    {
        return 0;
    }

    public String c(Notification notification)
    {
        return null;
    }

    public boolean d(Notification notification)
    {
        return false;
    }

    public String e(Notification notification)
    {
        return null;
    }

    public boolean f(Notification notification)
    {
        return false;
    }

    public String g(Notification notification)
    {
        return null;
    }

    ()
    {
    }
}
