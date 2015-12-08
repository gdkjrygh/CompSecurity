// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            z, af, al

public final class ad
{

    Context a;
    CharSequence b;
    CharSequence c;
    PendingIntent d;
    PendingIntent e;
    RemoteViews f;
    Bitmap g;
    CharSequence h;
    int i;
    int j;
    boolean k;
    al l;
    CharSequence m;
    int n;
    int o;
    boolean p;
    ArrayList q;
    Notification r;

    public ad(Context context)
    {
        q = new ArrayList();
        r = new Notification();
        a = context;
        r.when = System.currentTimeMillis();
        r.audioStreamType = -1;
        j = 0;
    }

    public final ad a()
    {
        r.icon = 0x7f020006;
        return this;
    }

    public final ad a(long l1)
    {
        r.when = l1;
        return this;
    }

    public final ad a(PendingIntent pendingintent)
    {
        d = pendingintent;
        return this;
    }

    public final ad a(RemoteViews remoteviews)
    {
        r.contentView = remoteviews;
        return this;
    }

    public final ad a(CharSequence charsequence)
    {
        r.tickerText = charsequence;
        return this;
    }

    public final ad b()
    {
        Notification notification = r;
        notification.flags = notification.flags | 2;
        return this;
    }

    public final ad c()
    {
        j = 0;
        return this;
    }

    public final Notification d()
    {
        return z.a().a(this);
    }
}
