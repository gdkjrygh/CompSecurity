// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;

final class biu
    implements bio
{

    private final NotificationManager a;

    public biu(NotificationManager notificationmanager)
    {
        a = (NotificationManager)b.a(notificationmanager, "notificationManager", null);
    }

    private void a(int i, Uri uri, bim bim1, Context context, boolean flag)
    {
        Object obj = uri.toString();
        String s = ((String) (obj));
        if (((String) (obj)).startsWith("content://media/external/video/media/"))
        {
            s = ((String) (obj)).replace("content://media/external/video/media/", "external:");
        }
        obj = new android.app.Notification.Builder(context);
        ((android.app.Notification.Builder) (obj)).setSmallIcon(b.hF);
        ((android.app.Notification.Builder) (obj)).setContentTitle(context.getString(c.bb));
        ((android.app.Notification.Builder) (obj)).setContentText(context.getString(i, new Object[] {
            s, bim1.a.toString()
        }));
        ((android.app.Notification.Builder) (obj)).setOngoing(flag);
        context = a;
        uri = String.valueOf(uri.toString());
        bim1 = String.valueOf(bim1.a.toString());
        context.notify((new StringBuilder(String.valueOf(uri).length() + 1 + String.valueOf(bim1).length())).append(uri).append(":").append(bim1).toString(), b.gq, ((android.app.Notification.Builder) (obj)).build());
    }

    public final void a(Context context, Uri uri, bim bim1)
    {
        a(c.ba, uri, bim1, context, true);
    }

    public final void b(Context context, Uri uri, bim bim1)
    {
        a(c.aX, uri, bim1, context, false);
    }

    public final void c(Context context, Uri uri, bim bim1)
    {
        a(c.aZ, uri, bim1, context, false);
    }

    public final void d(Context context, Uri uri, bim bim1)
    {
        a(c.aY, uri, bim1, context, false);
    }
}
