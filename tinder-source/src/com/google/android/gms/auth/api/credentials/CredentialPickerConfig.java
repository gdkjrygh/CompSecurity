// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            b

public final class CredentialPickerConfig
    implements SafeParcelable
{
    public static final class a
    {

        boolean a;
        boolean b;

        public final CredentialPickerConfig a()
        {
            return new CredentialPickerConfig(this, (byte)0);
        }

        public a()
        {
            a = false;
            b = true;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int a;
    final boolean b;
    final boolean c;

    CredentialPickerConfig(int i, boolean flag, boolean flag1)
    {
        a = i;
        b = flag;
        c = flag1;
    }

    private CredentialPickerConfig(a a1)
    {
        this(1, a1.a, a1.b);
    }

    CredentialPickerConfig(a a1, byte byte0)
    {
        this(a1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.credentials.b.a(this, parcel);
    }

}
