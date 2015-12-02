// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            q

public static class j
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
    j l;
    CharSequence m;
    int n;
    int o;
    boolean p;
    String q;
    boolean r;
    String s;
    ArrayList t;
    boolean u;
    Bundle v;
    Notification w;

    private void a(int i1, boolean flag)
    {
        if (flag)
        {
            Notification notification = w;
            notification.flags = notification.flags | i1;
            return;
        } else
        {
            Notification notification1 = w;
            notification1.flags = notification1.flags & ~i1;
            return;
        }
    }

    public Notification a()
    {
        return android.support.v4.app.q.a().a(this);
    }

    public a a(int i1)
    {
        w.icon = i1;
        return this;
    }

    public on a(long l1)
    {
        w.when = l1;
        return this;
    }

    public en a(CharSequence charsequence)
    {
        w.tickerText = charsequence;
        return this;
    }

    public ckerText a(String s1)
    {
        s = s1;
        return this;
    }

    public s a(boolean flag)
    {
        a(2, flag);
        return this;
    }

    public a b(int i1)
    {
        j = i1;
        return this;
    }

    public (Context context)
    {
        t = new ArrayList();
        u = false;
        w = new Notification();
        a = context;
        w.when = System.currentTimeMillis();
        w.audioStreamType = -1;
        j = 0;
    }
}
