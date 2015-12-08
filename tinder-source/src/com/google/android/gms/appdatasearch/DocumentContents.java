// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            a, DocumentSection

public class DocumentContents
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final int a;
    final DocumentSection b[];
    public final String c;
    public final boolean d;
    public final Account e;

    DocumentContents(int i, DocumentSection adocumentsection[], String s, boolean flag, Account account)
    {
        a = i;
        b = adocumentsection;
        c = s;
        d = flag;
        e = account;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.appdatasearch.a.a(this, parcel, i);
    }

}
