// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            as

public class zze
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new as();
    final int a;
    private int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private String h;
    private byte i;
    private byte j;
    private byte k;
    private byte l;

    zze(int i1, int j1, String s, String s1, String s2, String s3, String s4, 
            String s5, byte byte0, byte byte1, byte byte2, byte byte3)
    {
        b = j1;
        a = i1;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
        i = byte0;
        j = byte1;
        k = byte2;
        l = byte3;
    }

    public final int a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (zze)obj;
            if (l != ((zze) (obj)).l)
            {
                return false;
            }
            if (k != ((zze) (obj)).k)
            {
                return false;
            }
            if (j != ((zze) (obj)).j)
            {
                return false;
            }
            if (i != ((zze) (obj)).i)
            {
                return false;
            }
            if (b != ((zze) (obj)).b)
            {
                return false;
            }
            if (a != ((zze) (obj)).a)
            {
                return false;
            }
            if (!c.equals(((zze) (obj)).c))
            {
                return false;
            }
            if (d == null ? ((zze) (obj)).d != null : !d.equals(((zze) (obj)).d))
            {
                return false;
            }
            if (!h.equals(((zze) (obj)).h))
            {
                return false;
            }
            if (!e.equals(((zze) (obj)).e))
            {
                return false;
            }
            if (!g.equals(((zze) (obj)).g))
            {
                return false;
            }
            if (!f.equals(((zze) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public final String f()
    {
        return g;
    }

    public final String g()
    {
        if (h == null)
        {
            return c;
        } else
        {
            return h;
        }
    }

    public final byte h()
    {
        return i;
    }

    public int hashCode()
    {
        int j1 = a;
        int k1 = b;
        int l1 = c.hashCode();
        int i1;
        if (d != null)
        {
            i1 = d.hashCode();
        } else
        {
            i1 = 0;
        }
        return ((((((((i1 + ((j1 * 31 + k1) * 31 + l1) * 31) * 31 + e.hashCode()) * 31 + f.hashCode()) * 31 + g.hashCode()) * 31 + h.hashCode()) * 31 + i) * 31 + j) * 31 + k) * 31 + l;
    }

    public final byte i()
    {
        return j;
    }

    public final byte j()
    {
        return k;
    }

    public final byte k()
    {
        return l;
    }

    public String toString()
    {
        return (new StringBuilder("AncsNotificationParcelable{mVersionCode=")).append(a).append(", mId=").append(b).append(", mAppId='").append(c).append('\'').append(", mDateTime='").append(d).append('\'').append(", mNotificationText='").append(e).append('\'').append(", mTitle='").append(f).append('\'').append(", mSubtitle='").append(g).append('\'').append(", mDisplayName='").append(h).append('\'').append(", mEventId=").append(i).append(", mEventFlags=").append(j).append(", mCategoryId=").append(k).append(", mCategoryCount=").append(l).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        as.a(this, parcel);
    }

}
