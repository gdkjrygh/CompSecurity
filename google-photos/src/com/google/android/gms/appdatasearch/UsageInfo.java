// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import jtw;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentId, DocumentContents

public class UsageInfo
    implements SafeParcelable
{

    public static final jtw CREATOR = new jtw();
    public final int a;
    public final DocumentId b;
    public final long c;
    public int d;
    public final String e;
    public final DocumentContents f;
    public final boolean g;
    public int h;
    public int i;

    public UsageInfo(int j, DocumentId documentid, long l, int k, String s, DocumentContents documentcontents, 
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
        jtw.a(this, parcel, j);
    }

}
