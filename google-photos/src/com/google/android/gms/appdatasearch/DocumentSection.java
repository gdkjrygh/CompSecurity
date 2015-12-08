// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import jtp;
import jtt;
import jtu;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisterSectionInfo, Feature

public class DocumentSection
    implements SafeParcelable
{

    public static final jtp CREATOR = new jtp();
    private static int f = Integer.parseInt("-1");
    public final int a;
    public final String b;
    public final RegisterSectionInfo c;
    public final int d;
    public final byte e[];

    public DocumentSection(int i, String s, RegisterSectionInfo registersectioninfo, int j, byte abyte0[])
    {
        boolean flag;
        if (j == f || jtt.a(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag, (new StringBuilder("Invalid section type ")).append(j).toString());
        a = i;
        b = s;
        c = registersectioninfo;
        d = j;
        e = abyte0;
        if (d != f && jtt.a(d) == null)
        {
            s = (new StringBuilder("Invalid section type ")).append(d).toString();
        } else
        if (b != null && e != null)
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
        jtp.a(this, parcel, i);
    }

    static 
    {
        jtu jtu1 = new jtu("SsbContext");
        jtu1.c = true;
        jtu1.b = "blob";
        new RegisterSectionInfo(jtu1.a, jtu1.b, jtu1.c, jtu1.d, false, null, (Feature[])jtu1.e.toArray(new Feature[jtu1.e.size()]), null, null);
    }
}
