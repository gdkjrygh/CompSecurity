// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class njr
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new njs();
    final njy a;
    final String b;
    final Uri c;
    public final njx d;
    final int e;
    final String f;
    private final String g;

    njr(Parcel parcel)
    {
        g = parcel.readString();
        b = parcel.readString();
        String s = parcel.readString();
        if (s != null)
        {
            c = Uri.parse(s);
        } else
        {
            c = null;
        }
        d = njx.a(parcel.readInt());
        f = parcel.readString();
        a = (njy)njy.CREATOR.createFromParcel(parcel);
        e = parcel.readInt();
    }

    private njr(String s, String s1, int i, long l, String s2, Uri uri, 
            njx njx1, String s3)
    {
        a = new njy(s1, l);
        e = i;
        g = s;
        b = s2;
        c = uri;
        d = njx1;
        f = s3;
        if (!b() && !c())
        {
            throw new IllegalArgumentException("MediaRef has neither url nor local uri!");
        } else
        {
            return;
        }
    }

    public static njr a(Context context, String s, njx njx1)
    {
        int i = -1;
        context = (mmr)olm.b(context, mmr);
        if (context != null)
        {
            i = context.d();
        }
        return new njr(null, null, i, 0L, s, null, njx1, null);
    }

    public final long a()
    {
        return a.a;
    }

    public final boolean b()
    {
        return b != null;
    }

    public final boolean c()
    {
        return c != null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof njr)
            {
                obj = (njr)obj;
                if (a.a != ((njr) (obj)).a())
                {
                    return false;
                }
                if (!TextUtils.equals(b, ((njr) (obj)).b))
                {
                    return false;
                }
                if (!TextUtils.equals(f, ((njr) (obj)).f))
                {
                    return false;
                }
                Uri uri = c;
                Uri uri1 = ((njr) (obj)).c;
                boolean flag;
                if (uri != null && uri1 != null)
                {
                    flag = uri.equals(uri1);
                } else
                if (uri == null && uri1 == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    return false;
                }
                if (d != ((njr) (obj)).d)
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
        int l = 0;
        int i1 = (int)(a.a ^ a.a >>> 32);
        int i;
        int j;
        int k;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (f == null)
        {
            j = 0;
        } else
        {
            j = f.hashCode();
        }
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.hashCode();
        }
        if (d != null)
        {
            l = d.hashCode();
        }
        return (k + (j + (i + (i1 + 31) * 31) * 31) * 31) * 31 + l;
    }

    public final String toString()
    {
        String s1 = String.valueOf(getClass().getSimpleName());
        String s2 = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
        String s3 = String.valueOf(a);
        String s4 = g;
        String s5 = b;
        String s;
        String s6;
        String s7;
        if (c != null)
        {
            s = String.valueOf(c);
        } else
        {
            s = null;
        }
        s = String.valueOf(s);
        s6 = String.valueOf(d);
        s7 = f;
        return (new StringBuilder(String.valueOf(s1).length() + 25 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s).length() + String.valueOf(s6).length() + String.valueOf(s7).length())).append(s1).append("@").append(s2).append("[").append(s3).append(", ti-").append(s4).append(", u-").append(s5).append(", l-").append(s).append(", ty-").append(s6).append(", s-").append(s7).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(g);
        parcel.writeString(b);
        if (c != null)
        {
            parcel.writeString(c.toString());
        } else
        {
            parcel.writeString(null);
        }
        parcel.writeInt(d.e);
        parcel.writeString(f);
        a.writeToParcel(parcel, i);
        parcel.writeInt(e);
    }

}
