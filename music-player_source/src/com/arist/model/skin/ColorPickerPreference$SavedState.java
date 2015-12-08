// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.arist.model.skin:
//            j

class a extends android.preference.e
{

    public static final android.os.avedState.a CREATOR = new j();
    Bundle a;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.Parcel(parcel, i);
        parcel.writeBundle(a);
    }


    public (Parcel parcel)
    {
        super(parcel);
        a = parcel.readBundle();
    }

    public a(Parcelable parcelable)
    {
        super(parcelable);
    }
}
