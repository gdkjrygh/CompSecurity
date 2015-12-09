// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import bqt;
import brc;
import brf;
import btj;
import btk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class Status
    implements brc, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new brf();
    public static final Status a = new Status(14);
    public static final Status b = new Status(8);
    public static final Status c = new Status(15);
    public static final Status d = new Status(16);
    public final int e;
    public final int f;
    public final String g;
    public final PendingIntent h;

    public Status(int i)
    {
        this(i, null);
    }

    public Status(int i, int j, String s, PendingIntent pendingintent)
    {
        e = i;
        f = j;
        g = s;
        h = pendingintent;
    }

    public Status(int i, String s)
    {
        this(1, i, s, null);
    }

    public Status(String s)
    {
        this(1, 8, s, null);
    }

    public final String a()
    {
        return g;
    }

    public final boolean b()
    {
        return f <= 0;
    }

    public final Status c()
    {
        return this;
    }

    public final int d()
    {
        return f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (e == ((Status) (obj = (Status)obj)).e && f == ((Status) (obj)).f && btj.a(g, ((Status) (obj)).g) && btj.a(h, ((Status) (obj)).h))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(e), Integer.valueOf(f), g, h
        });
    }

    public final String toString()
    {
        btk btk1 = btj.a(this);
        String s;
        if (g != null)
        {
            s = g;
        } else
        {
            s = bqt.a(f);
        }
        return btk1.a("statusCode", s).a("resolution", h).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        brf.a(this, parcel, i);
    }

    static 
    {
        new Status(0);
    }
}
