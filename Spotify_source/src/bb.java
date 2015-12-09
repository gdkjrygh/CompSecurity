// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;

public final class bb
{

    public Context a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    public Bitmap e;
    boolean f;
    public bn g;
    public ArrayList h;
    String i;
    int j;
    public Notification k;
    public ArrayList l;

    public bb(Context context)
    {
        f = true;
        h = new ArrayList();
        j = 0;
        k = new Notification();
        a = context;
        k.when = System.currentTimeMillis();
        k.audioStreamType = -1;
        l = new ArrayList();
    }

    protected static CharSequence d(CharSequence charsequence)
    {
        while (charsequence == null || charsequence.length() <= 5120) 
        {
            return charsequence;
        }
        return charsequence.subSequence(0, 5120);
    }

    public final bb a()
    {
        f = false;
        return this;
    }

    public final bb a(int i1)
    {
        k.icon = i1;
        return this;
    }

    public final bb a(int i1, int j1, int k1)
    {
        boolean flag = true;
        k.ledARGB = i1;
        k.ledOnMS = j1;
        k.ledOffMS = k1;
        Notification notification;
        if (k.ledOnMS != 0 && k.ledOffMS != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        notification = k;
        j1 = k.flags;
        if (i1 != 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        notification.flags = j1 & -2 | i1;
        return this;
    }

    public final bb a(long l1)
    {
        k.when = l1;
        return this;
    }

    public final bb a(PendingIntent pendingintent)
    {
        d = pendingintent;
        return this;
    }

    public final bb a(Bitmap bitmap)
    {
        e = bitmap;
        return this;
    }

    public final bb a(bn bn1)
    {
        if (g != bn1)
        {
            g = bn1;
            if (g != null)
            {
                bn1 = g;
                if (bn1.b != this)
                {
                    bn1.b = this;
                    if (bn1.b != null)
                    {
                        bn1.b.a(bn1);
                    }
                }
            }
        }
        return this;
    }

    public final bb a(CharSequence charsequence)
    {
        b = d(charsequence);
        return this;
    }

    public final bb a(String s)
    {
        i = s;
        return this;
    }

    public final bb b()
    {
        b(2);
        return this;
    }

    public final bb b(PendingIntent pendingintent)
    {
        k.deleteIntent = pendingintent;
        return this;
    }

    public final bb b(CharSequence charsequence)
    {
        c = d(charsequence);
        return this;
    }

    public final void b(int i1)
    {
        Notification notification = k;
        notification.flags = notification.flags | i1;
    }

    public final bb c()
    {
        b(8);
        return this;
    }

    public final bb c(CharSequence charsequence)
    {
        k.tickerText = d(charsequence);
        return this;
    }

    public final bb d()
    {
        b(16);
        return this;
    }

    public final bb e()
    {
        return this;
    }

    public final bb f()
    {
        j = 1;
        return this;
    }

    public final Notification g()
    {
        be be1 = ax.a();
        new bc();
        return be1.a(this);
    }
}
