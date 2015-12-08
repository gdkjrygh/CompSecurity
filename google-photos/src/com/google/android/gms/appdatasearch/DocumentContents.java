// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import jtn;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentSection

public class DocumentContents
    implements SafeParcelable
{

    public static final jtn CREATOR = new jtn();
    public final int a;
    public final DocumentSection b[];
    public final String c;
    public final boolean d;
    public final Account e;

    public DocumentContents(int i, DocumentSection adocumentsection[], String s, boolean flag, Account account)
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
        jtn.a(this, parcel, i);
    }

}
