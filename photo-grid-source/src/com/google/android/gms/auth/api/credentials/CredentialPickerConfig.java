// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            e, a

public final class CredentialPickerConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    private final boolean b;
    private final boolean c;

    CredentialPickerConfig(int i, boolean flag, boolean flag1)
    {
        a = i;
        b = flag;
        c = flag1;
    }

    private CredentialPickerConfig(a a1)
    {
        this(1, com.google.android.gms.auth.api.credentials.a.a(a1), com.google.android.gms.auth.api.credentials.a.b(a1));
    }

    CredentialPickerConfig(a a1, byte byte0)
    {
        this(a1);
    }

    public final boolean a()
    {
        return b;
    }

    public final boolean b()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel);
    }

}
