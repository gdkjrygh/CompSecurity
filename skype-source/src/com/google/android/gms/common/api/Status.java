// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.api:
//            g, t, b

public final class Status
    implements g, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
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

    Status(int j, int k, String s, PendingIntent pendingintent)
    {
        f = j;
        g = k;
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

    public final void a(Activity activity)
        throws android.content.IntentSender.SendIntentException
    {
        boolean flag;
        if (i != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(i.getIntentSender(), 1, null, 0, 0, 0);
            return;
        }
    }

    public final String b()
    {
        return h;
    }

    final int c()
    {
        return f;
    }

    public final boolean d()
    {
        return g <= 0;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return g;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (f == ((Status) (obj = (Status)obj)).f && g == ((Status) (obj)).g && x.a(h, ((Status) (obj)).h) && x.a(i, ((Status) (obj)).i))
            {
                return true;
            }
        }
        return false;
    }

    public final Status getStatus()
    {
        return this;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(f), Integer.valueOf(g), h, i
        });
    }

    public final String toString()
    {
        com.google.android.gms.common.internal.x.a a1 = x.a(this);
        String s;
        if (h != null)
        {
            s = h;
        } else
        {
            s = com.google.android.gms.common.api.b.a(g);
        }
        return a1.a("statusCode", s).a("resolution", i).toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        t.a(this, parcel, j);
    }

}
