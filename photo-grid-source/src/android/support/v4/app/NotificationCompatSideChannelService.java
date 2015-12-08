// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;

public abstract class NotificationCompatSideChannelService extends Service
{

    public NotificationCompatSideChannelService()
    {
    }

    private void checkPermission(int i, String s)
    {
        String as[] = getPackageManager().getPackagesForUid(i);
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            if (as[j].equals(s))
            {
                return;
            }
        }

        throw new SecurityException((new StringBuilder("NotificationSideChannelService: Uid ")).append(i).append(" is not authorized for package ").append(s).toString());
    }

    public abstract void cancel(String s, int i, String s1);

    public abstract void cancelAll(String s);

    public abstract void notify(String s, int i, String s1, Notification notification);

    public IBinder onBind(Intent intent)
    {
        if (!intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL") || android.os.Build.VERSION.SDK_INT > 19)
        {
            return null;
        } else
        {
            return new NotificationSideChannelStub(null);
        }
    }


    private class NotificationSideChannelStub extends INotificationSideChannel.Stub
    {

        final NotificationCompatSideChannelService this$0;

        public void cancel(String s, int i, String s1)
        {
            long l;
            checkPermission(getCallingUid(), s);
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
            checkPermission(getCallingUid(), s);
            l = clearCallingIdentity();
            NotificationCompatSideChannelService.this.cancelAll(s);
            restoreCallingIdentity(l);
            return;
            s;
            restoreCallingIdentity(l);
            throw s;
        }

        public void notify(String s, int i, String s1, Notification notification)
        {
            long l;
            checkPermission(getCallingUid(), s);
            l = clearCallingIdentity();
            NotificationCompatSideChannelService.this.notify(s, i, s1, notification);
            restoreCallingIdentity(l);
            return;
            s;
            restoreCallingIdentity(l);
            throw s;
        }

        private NotificationSideChannelStub()
        {
            this$0 = NotificationCompatSideChannelService.this;
            super();
        }

        NotificationSideChannelStub(_cls1 _pcls1)
        {
            this();
        }
    }

}
