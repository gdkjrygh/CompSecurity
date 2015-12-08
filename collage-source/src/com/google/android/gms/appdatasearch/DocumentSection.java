// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.z;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            d, h, RegisterSectionInfo

public class DocumentSection
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    public static final int a = Integer.parseInt("-1");
    private static final RegisterSectionInfo g = (new RegisterSectionInfo.a("SsbContext")).a(true).a("blob").a();
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
        z.b(flag, (new StringBuilder()).append("Invalid section type ").append(j).toString());
        b = i;
        c = s;
        d = registersectioninfo;
        e = j;
        f = abyte0;
        s = b();
        if (s != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public RegisterSectionInfo a()
    {
        return d;
    }

    public String b()
    {
        if (e != a && h.a(e) == null)
        {
            return (new StringBuilder()).append("Invalid section type ").append(e).toString();
        }
        if (c != null && f != null)
        {
            return "Both content and blobContent set";
        } else
        {
            return null;
        }
    }

    public int describeContents()
    {
        d d1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d d1 = CREATOR;
        com.google.android.gms.appdatasearch.d.a(this, parcel, i);
    }

}
