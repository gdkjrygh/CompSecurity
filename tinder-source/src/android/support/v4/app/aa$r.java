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
//            aa

public static final class k
    implements k
{

    public int a;
    public ArrayList b;
    public Bitmap c;
    private ArrayList d;
    private PendingIntent e;
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
        if (!d.isEmpty())
        {
            bundle.putParcelableArrayList("actions", aa.access$200().a((a[])d.toArray(new d[d.size()])));
        }
        if (a != 1)
        {
            bundle.putInt("flags", a);
        }
        if (e != null)
        {
            bundle.putParcelable("displayIntent", e);
        }
        if (!b.isEmpty())
        {
            bundle.putParcelableArray("pages", (android.os.Parcelable[])b.toArray(new Notification[b.size()]));
        }
        if (c != null)
        {
            bundle.putParcelable("background", c);
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
        k1.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
        return k1;
    }

    public final getExtras a(getExtras getextras)
    {
        d.add(getextras);
        return this;
    }

    public final Object clone()
        throws CloneNotSupportedException
    {
        d d1 = new <init>();
        d1.d = new ArrayList(d);
        d1.a = a;
        d1.e = e;
        d1.b = new ArrayList(b);
        d1.c = c;
        d1.f = f;
        d1.g = g;
        d1.h = h;
        d1.i = i;
        d1.j = j;
        d1.k = k;
        d1.l = l;
        return d1;
    }

    public xception()
    {
        d = new ArrayList();
        a = 1;
        b = new ArrayList();
        g = 0x800005;
        h = -1;
        i = 0;
        k = 80;
    }
}
