// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.fitbit.dncs:
//            DncsPairingManager

public static final class _cls1 extends Enum
    implements Parcelable
{

    public static final android.os.Type._cls1 CREATOR = new _cls1();
    public static final _cls1 a;
    public static final _cls1 b;
    public static final _cls1 c;
    private static final _cls1 d[];

    public static _cls1 valueOf(String s)
    {
        return (_cls1)Enum.valueOf(com/fitbit/dncs/DncsPairingManager$DncsPairingType, s);
    }

    public static _cls1[] values()
    {
        return (_cls1[])d.clone();
    }

    public boolean a()
    {
        return this == a || this == b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(name());
    }

    static 
    {
        a = new <init>("AUTO_PAIRING", 0);
        b = new <init>("PAIRING", 1);
        c = new <init>("UNPAIRING", 2);
        d = (new d[] {
            a, b, c
        });
    /* block-local class not found */
    class _cls1 {}

    }

    private _cls1(String s, int i)
    {
        super(s, i);
    }
}
