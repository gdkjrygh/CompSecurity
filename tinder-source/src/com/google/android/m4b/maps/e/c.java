// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.e;

import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.t.a;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.e:
//            d

public final class c
    implements com.google.android.m4b.maps.k.c
{

    public static final d CREATOR = new d();
    public final int a;
    public a b;
    public byte c[];
    public final com.google.android.m4b.maps.cp.a.d d;
    public final a.b e;

    c(int i, a a1, byte abyte0[])
    {
        a = i;
        b = a1;
        c = abyte0;
        d = null;
        e = null;
    }

    public c(a a1, com.google.android.m4b.maps.cp.a.d d1, a.b b1)
    {
        a = 1;
        b = a1;
        d = d1;
        e = b1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof c)
            {
                if (a != ((c) (obj = (c)obj)).a || !v.a(b, ((c) (obj)).b) || !Arrays.equals(c, ((c) (obj)).c) || !v.a(d, ((c) (obj)).d) || !v.a(e, ((c) (obj)).e))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c, d, e
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("LogEventParcelable[");
        stringbuilder.append(a);
        stringbuilder.append(", ");
        stringbuilder.append(b);
        stringbuilder.append(", ");
        String s;
        if (c == null)
        {
            s = null;
        } else
        {
            s = new String(c);
        }
        stringbuilder.append(s);
        stringbuilder.append(", ");
        stringbuilder.append(d);
        stringbuilder.append(", ");
        stringbuilder.append(e);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.e.d.a(this, parcel, i);
    }

}
