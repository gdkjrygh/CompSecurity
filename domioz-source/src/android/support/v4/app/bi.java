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
//            bu, bd, bj, bl

public final class bi
{

    Notification A;
    public Notification B;
    public ArrayList C;
    public Context a;
    public CharSequence b;
    public CharSequence c;
    PendingIntent d;
    PendingIntent e;
    RemoteViews f;
    public Bitmap g;
    public CharSequence h;
    public int i;
    int j;
    boolean k;
    public boolean l;
    public bu m;
    public CharSequence n;
    int o;
    int p;
    boolean q;
    String r;
    boolean s;
    String t;
    public ArrayList u;
    boolean v;
    String w;
    Bundle x;
    int y;
    int z;

    public bi(Context context)
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

    protected static CharSequence e(CharSequence charsequence)
    {
        while (charsequence == null || charsequence.length() <= 5120) 
        {
            return charsequence;
        }
        return charsequence.subSequence(0, 5120);
    }

    public final bi a()
    {
        v = true;
        return this;
    }

    public final bi a(int i1)
    {
        B.icon = i1;
        return this;
    }

    public final bi a(Notification notification)
    {
        A = notification;
        return this;
    }

    public final bi a(PendingIntent pendingintent)
    {
        d = pendingintent;
        return this;
    }

    public final bi a(bu bu1)
    {
        if (m != bu1)
        {
            m = bu1;
            if (m != null)
            {
                bu1 = m;
                if (bu1.d != this)
                {
                    bu1.d = this;
                    if (bu1.d != null)
                    {
                        bu1.d.a(bu1);
                    }
                }
            }
        }
        return this;
    }

    public final bi a(RemoteViews remoteviews)
    {
        B.contentView = remoteviews;
        return this;
    }

    public final bi a(CharSequence charsequence)
    {
        b = e(charsequence);
        return this;
    }

    public final bi a(String s1)
    {
        w = s1;
        return this;
    }

    public final Notification b()
    {
        bl bl1 = bd.a();
        new bj();
        return bl1.a(this);
    }

    public final bi b(int i1)
    {
        B.defaults = i1;
        if ((i1 & 4) != 0)
        {
            Notification notification = B;
            notification.flags = notification.flags | 1;
        }
        return this;
    }

    public final bi b(PendingIntent pendingintent)
    {
        B.deleteIntent = pendingintent;
        return this;
    }

    public final bi b(CharSequence charsequence)
    {
        c = e(charsequence);
        return this;
    }

    public final bi c(int i1)
    {
        j = i1;
        return this;
    }

    public final bi c(CharSequence charsequence)
    {
        n = e(charsequence);
        return this;
    }

    public final bi d(int i1)
    {
        y = i1;
        return this;
    }

    public final bi d(CharSequence charsequence)
    {
        B.tickerText = e(charsequence);
        return this;
    }

    public final bi e(int i1)
    {
        z = i1;
        return this;
    }
}
