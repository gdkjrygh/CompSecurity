// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.BitSet;

// Referenced classes of package com.google.android.gms.internal:
//            fh, fo, fk

public class fg
    implements SafeParcelable
{

    public static final fh CREATOR = new fh();
    final int xM;
    final fk xN[];
    public final String xO;
    public final boolean xP;

    fg(int i, fk afk[], String s, boolean flag)
    {
        xM = i;
        xN = afk;
        xO = s;
        xP = flag;
    }

    public transient fg(String s, boolean flag, fk afk[])
    {
        this(1, afk, s, flag);
        s = new BitSet(fo.dP());
        for (int i = 0; i < afk.length; i++)
        {
            int j = afk[i].xW;
            if (j == -1)
            {
                continue;
            }
            if (s.get(j))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Duplicate global search section type ").append(fo.H(j)).toString());
            }
            s.set(j);
        }

    }

    public int describeContents()
    {
        fh fh1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fh fh1 = CREATOR;
        fh.a(this, parcel, i);
    }

}
