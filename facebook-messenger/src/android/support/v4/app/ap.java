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
//            al, ar, aw

public class ap
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
    aw l;
    CharSequence m;
    int n;
    int o;
    boolean p;
    ArrayList q;
    Notification r;

    public ap(Context context)
    {
        q = new ArrayList();
        r = new Notification();
        a = context;
        r.when = System.currentTimeMillis();
        r.audioStreamType = -1;
        j = 0;
    }

    private void a(int i1, boolean flag)
    {
        if (flag)
        {
            Notification notification = r;
            notification.flags = notification.flags | i1;
            return;
        } else
        {
            Notification notification1 = r;
            notification1.flags = notification1.flags & ~i1;
            return;
        }
    }

    public Notification a()
    {
        return al.a().a(this);
    }

    public ap a(int i1)
    {
        r.icon = i1;
        return this;
    }

    public ap a(long l1)
    {
        r.when = l1;
        return this;
    }

    public ap a(PendingIntent pendingintent)
    {
        d = pendingintent;
        return this;
    }

    public ap a(Bitmap bitmap)
    {
        g = bitmap;
        return this;
    }

    public ap a(CharSequence charsequence)
    {
        b = charsequence;
        return this;
    }

    public ap a(boolean flag)
    {
        a(2, flag);
        return this;
    }

    public Notification b()
    {
        return al.a().a(this);
    }

    public ap b(int i1)
    {
        j = i1;
        return this;
    }

    public ap b(CharSequence charsequence)
    {
        c = charsequence;
        return this;
    }

    public ap b(boolean flag)
    {
        a(16, flag);
        return this;
    }

    public ap c(CharSequence charsequence)
    {
        r.tickerText = charsequence;
        return this;
    }
}
