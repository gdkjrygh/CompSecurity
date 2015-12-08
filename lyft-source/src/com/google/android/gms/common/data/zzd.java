// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.data:
//            AbstractDataBuffer, DataHolder

public class zzd extends AbstractDataBuffer
{

    private static final String b[] = {
        "data"
    };
    private final android.os.Parcelable.Creator c;

    public zzd(DataHolder dataholder, android.os.Parcelable.Creator creator)
    {
        super(dataholder);
        c = creator;
    }

    public Object a(int i)
    {
        return b(i);
    }

    public SafeParcelable b(int i)
    {
        byte abyte0[] = a.e("data", i, a.a(i));
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        SafeParcelable safeparcelable = (SafeParcelable)c.createFromParcel(parcel);
        parcel.recycle();
        return safeparcelable;
    }

}
