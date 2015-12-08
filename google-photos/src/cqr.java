// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class cqr
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cqs();
    public final cnq a;

    cqr(Parcel parcel)
    {
        a = (cnq)parcel.readParcelable(getClass().getClassLoader());
    }

    static boolean a(cnq cnq1, cnq cnq2)
    {
        if (b.e(cnq1.e, cnq2.e))
        {
            cnq1 = cnq1.f;
            cnq2 = cnq2.f;
            boolean flag;
            if (((cod) (cnq1)).c >= ((cod) (cnq2)).b && ((cod) (cnq1)).b <= ((cod) (cnq2)).c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof cqr)
        {
            return ((cqr)obj).a.equals(a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return b.h(a, 17);
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 11)).append("Exclusion(").append(s).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
    }

}
