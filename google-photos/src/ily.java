// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;

public class ily
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ilz();
    qgg a;
    final euv b;
    final long c;

    ily(Parcel parcel)
    {
        byte abyte0[] = new byte[parcel.readInt()];
        parcel.readByteArray(abyte0);
        try
        {
            a = (qgg)qlw.a(new qgg(), abyte0);
        }
        catch (qlv qlv1)
        {
            String s = String.valueOf(qlv1.getMessage());
            if (s.length() != 0)
            {
                s = "Error when deserializing media item nano proto: ".concat(s);
            } else
            {
                s = new String("Error when deserializing media item nano proto: ");
            }
            Log.e("SingleMediaItemState", s);
        }
        b = euv.a(parcel.readInt());
        c = parcel.readLong();
    }

    public ily(qgg qgg1, euv euv1, long l)
    {
        p.a(qgg1);
        p.a(euv1);
        a = qgg1;
        boolean flag;
        if (!TextUtils.isEmpty(a()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        b = euv1;
        c = l;
    }

    final String a()
    {
        qfb qfb1 = a.d;
        if (qfb1.a == 2)
        {
            return qfb1.c.e;
        } else
        {
            return qfb1.b.a.a;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof ily)
            {
                if (!qlw.a(a, ((ily) (obj = (ily)obj)).a) || !b.equals(((ily) (obj)).b) || c != ((ily) (obj)).c)
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

    public int hashCode()
    {
        return c.a(a(), c.a(b, 17));
    }

    public String toString()
    {
        String s = String.valueOf("SingleMediaItemState{mediaItem=");
        String s1 = String.valueOf(b.b(a));
        String s2 = String.valueOf(b);
        long l = c;
        return (new StringBuilder(String.valueOf(s).length() + 42 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", avType=").append(s2).append(", timeStamp=").append(l).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        byte abyte0[] = qlw.a(a);
        parcel.writeInt(abyte0.length);
        parcel.writeByteArray(abyte0);
        parcel.writeInt(b.f);
        parcel.writeLong(c);
    }

}
