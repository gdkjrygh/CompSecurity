// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.net.Uri;
import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lpa;

public class GoogleSignInAccount
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lpa();
    public final int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;

    public GoogleSignInAccount(int i, String s, String s1, String s2, String s3, Uri uri)
    {
        a = i;
        b = b.o(s);
        c = s1;
        d = s2;
        e = s3;
        f = uri;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lpa.a(this, parcel, i);
    }

}
