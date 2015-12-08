// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//            NotificationCompatSideChannelService

private class <init> extends <init>
{

    final NotificationCompatSideChannelService this$0;

    public void cancel(String s, int i, String s1)
        throws RemoteException
    {
        long l;
        NotificationCompatSideChannelService.access$100(NotificationCompatSideChannelService.this, getCallingUid(), s);
        l = clearCallingIdentity();
        NotificationCompatSideChannelService.this.cancel(s, i, s1);
        restoreCallingIdentity(l);
        return;
        s;
        restoreCallingIdentity(l);
        throw s;
    }

    public void cancelAll(String s)
    {
        long l;
        NotificationCompatSideChannelService.access$100(NotificationCompatSideChannelService.this, getCallingUid(), s);
        l = clearCallingIdentity();
        NotificationCompatSideChannelService.this.cancelAll(s);
        restoreCallingIdentity(l);
        return;
        s;
        restoreCallingIdentity(l);
        throw s;
    }

    public void notify(String s, int i, String s1, Notification notification)
        throws RemoteException
    {
        long l;
        NotificationCompatSideChannelService.access$100(NotificationCompatSideChannelService.this, getCallingUid(), s);
        l = clearCallingIdentity();
        NotificationCompatSideChannelService.this.notify(s, i, s1, notification);
        restoreCallingIdentity(l);
        return;
        s;
        restoreCallingIdentity(l);
        throw s;
    }

    private ()
    {
        this$0 = NotificationCompatSideChannelService.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
