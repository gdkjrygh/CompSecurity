// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.api:
//            u, w, k

public final class Status
    implements u, SafeParcelable
{

    public static final w CREATOR = new w();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    private final int f;
    private final int g;
    private final String h;
    private final PendingIntent i;

    public Status(int j)
    {
        this(j, null);
    }

    Status(int j, int l, String s, PendingIntent pendingintent)
    {
        f = j;
        g = l;
        h = s;
        i = pendingintent;
    }

    public Status(int j, String s)
    {
        this(1, j, s, null);
    }

    public Status(String s)
    {
        this(1, 8, s, null);
    }

    final PendingIntent a()
    {
        return i;
    }

    public final Status b()
    {
        return this;
    }

    public final String c()
    {
        return h;
    }

    final int d()
    {
        return f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return g <= 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (f == ((Status) (obj = (Status)obj)).f && g == ((Status) (obj)).g && an.a(h, ((Status) (obj)).h) && an.a(i, ((Status) (obj)).i))
            {
                return true;
            }
        }
        return false;
    }

    public final int f()
    {
        return g;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(f), Integer.valueOf(g), h, i
        });
    }

    public final String toString()
    {
        ao ao1 = an.a(this);
        String s;
        if (h != null)
        {
            s = h;
        } else
        {
            s = k.a(g);
        }
        return ao1.a("statusCode", s).a("resolution", i).toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        w.a(this, parcel, j);
    }

}
