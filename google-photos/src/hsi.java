// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;

public final class hsi
    implements hrr
{

    public static final android.os.Parcelable.Creator CREATOR = new hsk();
    private static final SparseArray c = new hsj();
    public final qav a;
    private final String b;
    private boolean d;

    hsi(Parcel parcel)
    {
        d = false;
        b = parcel.readString();
        byte abyte0[] = new byte[parcel.readInt()];
        parcel.readByteArray(abyte0);
        try
        {
            parcel = (qav)qlw.a(new qav(), abyte0);
        }
        catch (qlv qlv1)
        {
            parcel = String.valueOf(qlv1.getMessage());
            if (parcel.length() != 0)
            {
                parcel = "Error when deserializing auto complete proto: ".concat(parcel);
            } else
            {
                parcel = new String("Error when deserializing auto complete proto: ");
            }
            Log.e("RemoteSuggestion", parcel);
            qlv1.printStackTrace();
            parcel = null;
        }
        a = parcel;
    }

    public hsi(String s, qav qav1)
    {
        d = false;
        a = qav1;
        b = s;
    }

    public hsi(qav qav1)
    {
        this("", qav1);
    }

    public final hsw a()
    {
        return (hsw)c.get(a.a, hsw.i);
    }

    public final void a(int i)
    {
        if (i != -1)
        {
            a.d = Integer.valueOf(i);
        }
    }

    public final void a(long l)
    {
        if (l != ar_())
        {
            a.f = new qin();
            a.f.a = new qio();
            a.f.a.a = Long.valueOf(l);
        }
    }

    public final void a(String s)
    {
        a.c = s;
    }

    public final void a(boolean flag)
    {
        d = true;
    }

    public final String aq_()
    {
        return b;
    }

    public final long ar_()
    {
        if (a.f == null || a.f.a == null)
        {
            return -1L;
        } else
        {
            return a.f.a.a.longValue();
        }
    }

    public final String as_()
    {
        return a.c;
    }

    public final boolean at_()
    {
        return a.e != 1;
    }

    public final int b()
    {
        if (a.d == null)
        {
            return -1;
        } else
        {
            return a.d.intValue();
        }
    }

    public final void b(String s)
    {
        a.b = s;
    }

    public final String c()
    {
        return a.b;
    }

    public final String d()
    {
        return a.h;
    }

    public final ekq d_(int i)
    {
        dki dki1 = new dki();
        dki1.c = i;
        if (a.d != null)
        {
            dki1.b = a.d.intValue();
        }
        if (a.g != null)
        {
            dki1.d = a.g;
        }
        if (a.i != null)
        {
            dki1.e = a.i;
        }
        dki1.a = a.b;
        return dki1.a();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return d;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof hsi)
        {
            if (qlw.a(((hsi) (obj = (hsi)obj)).a, a) && c.c(((hsi) (obj)).b, b))
            {
                return true;
            }
        }
        return false;
    }

    public final void h_(boolean flag)
    {
        qav qav1 = a;
        int i;
        if (flag)
        {
            i = 2;
        } else
        {
            i = 1;
        }
        qav1.e = i;
    }

    public final int hashCode()
    {
        return c.a(a, c.a(b, 17));
    }

    public final String toString()
    {
        String s = String.valueOf("AutoCompleteSuggestion{ prefix='");
        String s1 = b;
        String s2 = String.valueOf(super.toString());
        return (new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append("',").append(s2).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        byte abyte0[] = qlw.a(a);
        parcel.writeInt(abyte0.length);
        parcel.writeByteArray(abyte0);
    }

}
