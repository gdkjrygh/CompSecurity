// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.text.TextUtils;

public final class ecj
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new eck();
    final qgg a;
    final ekq b;
    final ekw c;
    final String d;
    final int e;

    public ecj(int i, qgg qgg1, ekq ekq1, ekw ekw1, String s)
    {
        e = i;
        a = qgg1;
        b = ekq1;
        c = ekw1;
        d = s;
    }

    ecj(Parcel parcel)
    {
        e = parcel.readInt();
        if (b.c(parcel))
        {
            byte abyte0[] = parcel.createByteArray();
            try
            {
                a = qgg.a(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new IllegalArgumentException(parcel);
            }
        } else
        {
            a = null;
        }
        b = (ekq)parcel.readParcelable(ekq.getClassLoader());
        c = (ekw)parcel.readParcelable(ekw.getClassLoader());
        d = parcel.readString();
    }

    private String b()
    {
        while (a == null || a.b == null) 
        {
            return null;
        }
        return a.b.a;
    }

    public final ekf a(Class class1)
    {
        throw new UnsupportedOperationException();
    }

    public final String a()
    {
        return "com.google.android.apps.photos.assistant.remote.provider";
    }

    public final ekf b(Class class1)
    {
        throw new UnsupportedOperationException();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return null;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ecj)
        {
            obj = (ecj)obj;
            flag = flag1;
            if (TextUtils.equals(b(), ((ecj) (obj)).b()))
            {
                flag = flag1;
                if (e == ((ecj) (obj)).e)
                {
                    flag = flag1;
                    if (b.equals(((ecj) (obj)).b))
                    {
                        flag = flag1;
                        if (c.equals(((ecj) (obj)).c))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(b(), c.a(b, c.a(c, 17)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(e);
        if (a != null)
        {
            b.a(parcel, true);
            parcel.writeByteArray(qgg.a(a));
        } else
        {
            b.a(parcel, false);
        }
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
        parcel.writeString(d);
    }

}
