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
//            u

public static class C
{

    Notification A;
    Notification B;
    public ArrayList C;
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
    boolean l;
    e m;
    CharSequence n;
    int o;
    int p;
    boolean q;
    String r;
    boolean s;
    String t;
    ArrayList u;
    boolean v;
    String w;
    Bundle x;
    int y;
    int z;

    private void a(int i1, boolean flag)
    {
        if (flag)
        {
            Notification notification = B;
            notification.flags = notification.flags | i1;
            return;
        } else
        {
            Notification notification1 = B;
            notification1.flags = notification1.flags & ~i1;
            return;
        }
    }

    protected static CharSequence e(CharSequence charsequence)
    {
        while (charsequence == null || charsequence.length() <= 5120) 
        {
            return charsequence;
        }
        return charsequence.subSequence(0, 5120);
    }

    public Notification a()
    {
        return android.support.v4.app.u.a().a(this);
    }

    public a a(int i1)
    {
        B.icon = i1;
        return this;
    }

    public on a(long l1)
    {
        B.when = l1;
        return this;
    }

    public en a(PendingIntent pendingintent)
    {
        d = pendingintent;
        return this;
    }

    public d a(Bitmap bitmap)
    {
        g = bitmap;
        return this;
    }

    public g a(g g1)
    {
        if (m != g1)
        {
            m = g1;
            if (m != null)
            {
                m.a(this);
            }
        }
        return this;
    }

    public a a(CharSequence charsequence)
    {
        b = e(charsequence);
        return this;
    }

    public e a(boolean flag)
    {
        a(8, flag);
        return this;
    }

    public a b(PendingIntent pendingintent)
    {
        B.deleteIntent = pendingintent;
        return this;
    }

    public leteIntent b(CharSequence charsequence)
    {
        c = e(charsequence);
        return this;
    }

    public e b(boolean flag)
    {
        a(16, flag);
        return this;
    }

    public a c(CharSequence charsequence)
    {
        n = e(charsequence);
        return this;
    }

    public e d(CharSequence charsequence)
    {
        B.tickerText = e(charsequence);
        return this;
    }

    public (Context context)
    {
        k = true;
        u = new ArrayList();
        v = false;
        y = 0;
        z = 0;
        B = new Notification();
        a = context;
        B.when = System.currentTimeMillis();
        B.audioStreamType = -1;
        j = 0;
        C = new ArrayList();
    }
}
