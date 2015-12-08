// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import jto;

public class DocumentId
    implements SafeParcelable
{

    public static final jto CREATOR = new jto();
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public DocumentId(int i, String s, String s1, String s2)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[] {
            b, c, d
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jto.a(this, parcel);
    }

}
