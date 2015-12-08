// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            o, DocumentId, DocumentContents

public class UsageInfo
    implements SafeParcelable
{

    public static final o CREATOR = new o();
    final int a;
    final DocumentId b;
    final long c;
    int d;
    public final String e;
    final DocumentContents f;
    final boolean g;
    int h;
    int i;

    UsageInfo(int j, DocumentId documentid, long l, int k, String s, DocumentContents documentcontents, 
            boolean flag, int i1, int j1)
    {
        a = j;
        b = documentid;
        c = l;
        d = k;
        e = s;
        f = documentcontents;
        g = flag;
        h = i1;
        i = j1;
    }

    public final DocumentContents a()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[] {
            b, Long.valueOf(c), Integer.valueOf(d), Integer.valueOf(i)
        });
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        o.a(this, parcel, j);
    }

}
