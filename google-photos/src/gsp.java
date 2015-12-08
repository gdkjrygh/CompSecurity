// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class gsp
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new gsq();
    public final pzl a;

    gsp(Parcel parcel)
    {
        if (parcel.readInt() == -1)
        {
            a = null;
            return;
        }
        parcel = parcel.createByteArray();
        try
        {
            a = (pzl)pzl.a(new pzl(), parcel);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new IllegalStateException(parcel);
        }
    }

    public gsp(pzl pzl1)
    {
        a = pzl1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (a == null)
        {
            parcel.writeInt(-1);
            return;
        } else
        {
            byte abyte0[] = pzl.a(a);
            parcel.writeInt(abyte0.length);
            parcel.writeByteArray(abyte0);
            return;
        }
    }

}
