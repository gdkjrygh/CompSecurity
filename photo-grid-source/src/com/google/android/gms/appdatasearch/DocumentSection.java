// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            i, d, m, RegisterSectionInfo

public class DocumentSection
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    public static final int a = Integer.parseInt("-1");
    private static final RegisterSectionInfo g = (new d("SsbContext")).a().a("blob").b();
    final int b;
    public final String c;
    final RegisterSectionInfo d;
    public final int e;
    public final byte f[];

    DocumentSection(int j, String s, RegisterSectionInfo registersectioninfo, int k, byte abyte0[])
    {
        boolean flag;
        if (k == a || m.a(k) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.b(flag, (new StringBuilder("Invalid section type ")).append(k).toString());
        b = j;
        c = s;
        d = registersectioninfo;
        e = k;
        f = abyte0;
        if (e != a && m.a(e) == null)
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

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
