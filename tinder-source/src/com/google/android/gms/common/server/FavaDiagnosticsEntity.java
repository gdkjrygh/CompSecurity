// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server:
//            a

public class FavaDiagnosticsEntity
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final int a;
    public final String b;
    public final int c;

    public FavaDiagnosticsEntity(int i, String s, int j)
    {
        a = i;
        b = s;
        c = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.server.a.a(this, parcel);
    }

}
