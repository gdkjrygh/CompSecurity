// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Random;

// Referenced classes of package com.paypal.android.sdk:
//            cw, eg

public final class cz extends cw
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new eg();

    public cz()
    {
        long l = System.currentTimeMillis();
        if (a == null)
        {
            b = l;
        }
        if (b + 0x1b7740L > l)
        {
            b = l + 0x1b7740L;
            Random random = new Random(b);
            StringBuilder stringbuilder = new StringBuilder();
            for (int i = 0; i < 8; i++)
            {
                stringbuilder.append((char)(Math.abs(random.nextInt()) % 10 + 48));
            }

            a = stringbuilder.toString();
        }
    }

    public cz(Parcel parcel)
    {
        super(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeLong(b);
    }

}
