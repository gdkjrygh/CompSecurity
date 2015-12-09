// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

public class BluetoothAddress
    implements Parcelable
{

    public static android.os.Parcelable.Creator a = new _cls1();
    private String b;

    public BluetoothAddress(String s)
    {
        b = s;
    }

    public String a()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
    }


    /* member class not found */
    class _cls1 {}

}
