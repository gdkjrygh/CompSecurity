// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            x

public static final class k
    implements k
{

    private ArrayList a;
    private int b;
    private PendingIntent c;
    private ArrayList d;
    private Bitmap e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public final k a(k k1)
    {
        Bundle bundle = new Bundle();
        if (!a.isEmpty())
        {
            bundle.putParcelableArrayList("actions", x.a().a((a[])a.toArray(new [a.size()])));
        }
        if (b != 1)
        {
            bundle.putInt("flags", b);
        }
        if (c != null)
        {
            bundle.putParcelable("displayIntent", c);
        }
        if (!d.isEmpty())
        {
            bundle.putParcelableArray("pages", (android.os.Parcelable[])d.toArray(new Notification[d.size()]));
        }
        if (e != null)
        {
            bundle.putParcelable("background", e);
        }
        if (f != 0)
        {
            bundle.putInt("contentIcon", f);
        }
        if (g != 0x800005)
        {
            bundle.putInt("contentIconGravity", g);
        }
        if (h != -1)
        {
            bundle.putInt("contentActionIndex", h);
        }
        if (i != 0)
        {
            bundle.putInt("customSizePreset", i);
        }
        if (j != 0)
        {
            bundle.putInt("customContentHeight", j);
        }
        if (k != 80)
        {
            bundle.putInt("gravity", k);
        }
        if (l != 0)
        {
            bundle.putInt("hintScreenTimeout", l);
        }
        k1.d().putBundle("android.wearable.EXTENSIONS", bundle);
        return k1;
    }

    public final  a()
    {
        b = b | 8;
        return this;
    }

    public final b a(Notification notification)
    {
        d.add(notification);
        return this;
    }

    public final d a(d d1)
    {
        a.add(d1);
        return this;
    }

    public final Object clone()
        throws CloneNotSupportedException
    {
        a a1 = new <init>();
        a1.a = new ArrayList(a);
        a1.b = b;
        a1.c = c;
        a1.d = new ArrayList(d);
        a1.e = e;
        a1.f = f;
        a1.g = g;
        a1.h = h;
        a1.i = i;
        a1.j = j;
        a1.k = k;
        a1.l = l;
        return a1;
    }

    public Exception()
    {
        a = new ArrayList();
        b = 1;
        d = new ArrayList();
        g = 0x800005;
        h = -1;
        i = 0;
        k = 80;
    }
}
