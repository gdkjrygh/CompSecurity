// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.fitbit.dncs:
//            DncsPairingManager

public static class <init>
    implements Parcelable
{

    public static final android.os.Info.c CREATOR = new android.os.Parcelable.Creator() {

        public DncsPairingManager.DncsPairingTaskInfo a(Parcel parcel)
        {
            String s = parcel.readString();
            DncsPairingManager.DncsPairingType dncspairingtype = (DncsPairingManager.DncsPairingType)parcel.readParcelable(com/fitbit/dncs/DncsPairingManager$DncsPairingType.getClassLoader());
            int i = parcel.readInt();
            if (s != null && dncspairingtype != null)
            {
                return new DncsPairingManager.DncsPairingTaskInfo(s, dncspairingtype, i, null);
            } else
            {
                return null;
            }
        }

        public DncsPairingManager.DncsPairingTaskInfo[] a(int i)
        {
            return new DncsPairingManager.DncsPairingTaskInfo[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public final String a;
    public final _cls1.a b;
    public final int c;

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append("(").append(b).append(", ").append(c).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
        parcel.writeInt(c);
    }


    private _cls1(String s, _cls1 _pcls1)
    {
        this(s, _pcls1, 0);
    }

    private <init>(String s, <init> <init>1, int i)
    {
        a = s;
        b = <init>1;
        c = i;
    }

    c(String s, c c1, int i, c c2)
    {
        this(s, c1, i);
    }

    <init>(String s, <init> <init>1, <init> <init>2)
    {
        this(s, <init>1);
    }
}
