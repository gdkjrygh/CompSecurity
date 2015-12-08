// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class mqm
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mqn();
    public final int a;
    public final String b;
    public final long c;

    private mqm(int i, String s, long l)
    {
        a = i;
        b = s;
        c = l;
    }

    mqm(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readLong();
    }

    public static mqm a(int i, String s, long l)
    {
        boolean flag1 = true;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "accountId must be valid");
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "albumId must be non-empty");
        if (l > -1L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "batchId must be valid");
        return new mqm(i, s, l);
    }

    public final mqo a()
    {
        if (c != -1L)
        {
            return mqo.c;
        }
        if (b != null)
        {
            return mqo.b;
        } else
        {
            return mqo.a;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (mqm)obj;
            if (a != ((mqm) (obj)).a)
            {
                return false;
            }
            if (c != ((mqm) (obj)).c)
            {
                return false;
            }
            if (b == null ? ((mqm) (obj)).b != null : !b.equals(((mqm) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = a;
        int i;
        if (b != null)
        {
            i = b.hashCode();
        } else
        {
            i = 0;
        }
        return (i + j * 31) * 31 + (int)(c ^ c >>> 32);
    }

    public final String toString()
    {
        int i = a;
        String s = b;
        long l = c;
        String s1 = String.valueOf(a());
        return (new StringBuilder(String.valueOf(s).length() + 86 + String.valueOf(s1).length())).append("UploadGroup {accountId: ").append(i).append(", albumId: ").append(s).append(", batchId: ").append(l).append(", type: ").append(s1).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeLong(c);
    }

}
