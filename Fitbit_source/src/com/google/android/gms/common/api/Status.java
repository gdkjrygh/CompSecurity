// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ak;

// Referenced classes of package com.google.android.gms.common.api:
//            k, m, f

public final class Status
    implements k, SafeParcelable
{

    public static final m CREATOR = new m();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    private final int f;
    private final int g;
    private final String h;
    private final PendingIntent i;

    public Status(int i1)
    {
        this(i1, null);
    }

    Status(int i1, int j1, String s, PendingIntent pendingintent)
    {
        f = i1;
        g = j1;
        h = s;
        i = pendingintent;
    }

    public Status(int i1, String s)
    {
        this(1, i1, s, null);
    }

    public Status(int i1, String s, PendingIntent pendingintent)
    {
        this(1, i1, s, pendingintent);
    }

    private String l()
    {
        if (h != null)
        {
            return h;
        } else
        {
            return com.google.android.gms.common.api.f.a(g);
        }
    }

    public Status a()
    {
        return this;
    }

    public void a(Activity activity, int i1)
        throws android.content.IntentSender.SendIntentException
    {
        if (!e())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(i.getIntentSender(), i1, null, 0, 0, 0);
            return;
        }
    }

    PendingIntent b()
    {
        return i;
    }

    public String c()
    {
        return h;
    }

    int d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return i != null;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (f == ((Status) (obj = (Status)obj)).f && g == ((Status) (obj)).g && ak.a(h, ((Status) (obj)).h) && ak.a(i, ((Status) (obj)).i))
            {
                return true;
            }
        }
        return false;
    }

    public boolean f()
    {
        return g <= 0;
    }

    public boolean g()
    {
        return g == 16;
    }

    public boolean h()
    {
        return g == 14;
    }

    public int hashCode()
    {
        return ak.a(new Object[] {
            Integer.valueOf(f), Integer.valueOf(g), h, i
        });
    }

    public int i()
    {
        return g;
    }

    public PendingIntent j()
    {
        return i;
    }

    public b k()
    {
        return new b(g, i);
    }

    public String toString()
    {
        return ak.a(this).a("statusCode", l()).a("resolution", i).toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        m.a(this, parcel, i1);
    }

}
