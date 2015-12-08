// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            c, RegisterSectionInfo, Feature, g

public class DocumentSection
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public static final int a = Integer.parseInt("-1");
    private static final RegisterSectionInfo g;
    final int b;
    public final String c;
    final RegisterSectionInfo d;
    public final int e;
    public final byte f[];

    DocumentSection(int i, String s, RegisterSectionInfo registersectioninfo, int j, byte abyte0[])
    {
        boolean flag;
        if (j == a || com.google.android.gms.appdatasearch.g.a(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag, (new StringBuilder("Invalid section type ")).append(j).toString());
        b = i;
        c = s;
        d = registersectioninfo;
        e = j;
        f = abyte0;
        if (e != a && com.google.android.gms.appdatasearch.g.a(e) == null)
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
        com.google.android.gms.appdatasearch.c.a(this, parcel, i);
    }

    static 
    {
        int i = 0;
        RegisterSectionInfo.a a1 = new RegisterSectionInfo.a("SsbContext");
        a1.c = true;
        a1.b = "blob";
        int ai[] = null;
        if (a1.h != null)
        {
            int ai1[] = new int[a1.h.cardinality()];
            int j = a1.h.nextSetBit(0);
            do
            {
                ai = ai1;
                if (j < 0)
                {
                    break;
                }
                ai1[i] = j;
                j = a1.h.nextSetBit(j + 1);
                i++;
            } while (true);
        }
        g = new RegisterSectionInfo(a1.a, a1.b, a1.c, a1.d, a1.e, a1.f, (Feature[])a1.g.toArray(new Feature[a1.g.size()]), ai, a1.i);
    }
}
