// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            c, CredentialPickerConfig

public final class CredentialRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    final boolean b;
    final String c[];
    final CredentialPickerConfig d;
    final CredentialPickerConfig e;

    CredentialRequest(int i, boolean flag, String as[], CredentialPickerConfig credentialpickerconfig, CredentialPickerConfig credentialpickerconfig1)
    {
        a = i;
        b = flag;
        c = (String[])u.a(as);
        as = credentialpickerconfig;
        if (credentialpickerconfig == null)
        {
            as = (new CredentialPickerConfig.a()).a();
        }
        d = as;
        as = credentialpickerconfig1;
        if (credentialpickerconfig1 == null)
        {
            as = (new CredentialPickerConfig.a()).a();
        }
        e = as;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.credentials.c.a(this, parcel, i);
    }

}
