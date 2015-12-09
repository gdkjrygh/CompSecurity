// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            j, DocumentId, DocumentContents

public class UsageInfo
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    final int a;
    final DocumentId b;
    final long c;
    int d;
    public final String e;
    final DocumentContents f;
    final boolean g;
    int h;
    int i;

    UsageInfo(int k, DocumentId documentid, long l, int i1, String s, DocumentContents documentcontents, 
            boolean flag, int j1, int k1)
    {
        a = k;
        b = documentid;
        c = l;
        d = i1;
        e = s;
        f = documentcontents;
        g = flag;
        h = j1;
        i = k1;
    }

    public DocumentContents a()
    {
        return f;
    }

    public int describeContents()
    {
        j j1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[] {
            b, Long.valueOf(c), Integer.valueOf(d), Integer.valueOf(i)
        });
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        j j1 = CREATOR;
        j.a(this, parcel, k);
    }

}
