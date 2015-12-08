// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server:
//            FavaDiagnosticsEntityCreator

public class FavaDiagnosticsEntity
    implements SafeParcelable
{

    public static final FavaDiagnosticsEntityCreator CREATOR = new FavaDiagnosticsEntityCreator();
    final int mVersionCode;
    public final String namespace;
    public final int typeNum;

    public FavaDiagnosticsEntity(int i, String s, int j)
    {
        mVersionCode = i;
        namespace = s;
        typeNum = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FavaDiagnosticsEntityCreator.writeToParcel$1beddb7d(this, parcel);
    }

}
