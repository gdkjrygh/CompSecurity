// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigInteger;

public final class cqc
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cqd();
    public static final cqc a = new cqc();
    public final long b;
    public final String c;

    private cqc()
    {
        b = 0L;
        c = "";
    }

    public cqc(long l)
    {
        if (l == 0L)
        {
            b.a((new StringBuilder()).append("cloudId").append(" must not be equal to ").append(0L), null);
        }
        b = l;
        c = "";
    }

    cqc(Parcel parcel)
    {
        if (parcel.readByte() == 1)
        {
            b = parcel.readLong();
            c = "";
            return;
        } else
        {
            c = parcel.readString();
            b = 0L;
            return;
        }
    }

    public cqc(String s)
    {
        b.a(s, "localId", null);
        if (b.e(s, ""))
        {
            b.a((new StringBuilder()).append("localId").append(" must not be equal to ").append(""), null);
        }
        c = s;
        b = 0L;
    }

    public static cqc a(String s, boolean flag)
    {
        s = s.split("\\|", 2);
        if (s.length != 1 && !s[1].equals(""))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        long l;
        try
        {
            l = (new BigInteger(s[0], 16)).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a;
        }
        if (l != 0L)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        return a;
        l = Long.parseLong(s[0]);
        break MISSING_BLOCK_LABEL_45;
        s = new cqc(l);
        return s;
        return new cqc(s[1]);
    }

    public static cqc a(pyb pyb1)
    {
        b.a(pyb1, "idFromStoryboard", null);
        long l = pyb1.a.longValue();
        pyb1 = pyb1.b;
        if (TextUtils.isEmpty(pyb1))
        {
            if (l == 0L)
            {
                return a;
            } else
            {
                return new cqc(l);
            }
        } else
        {
            return new cqc(pyb1);
        }
    }

    public final String a()
    {
        String s = String.valueOf(Long.toHexString(b));
        String s1 = c;
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("|").append(s1).toString();
    }

    public final boolean b()
    {
        return this != a;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof cqc))
            {
                return false;
            }
            obj = (cqc)obj;
            if (!b.e(c, ((cqc) (obj)).c) || b != ((cqc) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        if (TextUtils.isEmpty(c))
        {
            return (int)b;
        } else
        {
            return c.hashCode();
        }
    }

    public final String toString()
    {
        long l = b;
        String s = c;
        return (new StringBuilder(String.valueOf(s).length() + 21)).append(l).append("|").append(s).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (TextUtils.isEmpty(c))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (TextUtils.isEmpty(c))
        {
            parcel.writeLong(b);
            return;
        } else
        {
            parcel.writeString(c);
            return;
        }
    }

}
