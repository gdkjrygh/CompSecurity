// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.os.Parcel;

// Referenced classes of package com.fitbit.dncs:
//            DncsPairingManager

static final class 
    implements android.os.fo._cls1
{

    public  a(Parcel parcel)
    {
        String s = parcel.readString();
          = ()parcel.readParcelable(com/fitbit/dncs/DncsPairingManager$DncsPairingType.getClassLoader());
        int i = parcel.readInt();
        if (s != null &&  != null)
        {
            return new nit>(s, , i, null);
        } else
        {
            return null;
        }
    }

    public nit>[] a(int i)
    {
        return new nit>[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
