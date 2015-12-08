// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.y;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            d, h, RegisterSectionInfo

public class DocumentSection
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    public static final int a = Integer.parseInt("-1");
    private static final RegisterSectionInfo g = (new RegisterSectionInfo.a("SsbContext")).a().a("blob").b();
    final int b;
    public final String c;
    final RegisterSectionInfo d;
    public final int e;
    public final byte f[];

    DocumentSection(int i, String s, RegisterSectionInfo registersectioninfo, int j, byte abyte0[])
    {
        boolean flag;
        if (j == a || h.a(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.b(flag, (new StringBuilder("Invalid section type ")).append(j).toString());
        b = i;
        c = s;
        d = registersectioninfo;
        e = j;
        f = abyte0;
        if (e != a && h.a(e) == null)
        {
            s = (new StringBuilder("Invalid section type ")).append(e).toString();
        } else
        if (c != null && f != null)
        {
            s = "Both content and blobContent set";
        } else
        {
            s = null;
        }
        if (s != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.appdatasearch.d.a(this, parcel, i);
    }

}
