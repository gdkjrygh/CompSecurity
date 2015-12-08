// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            hr, hk

public class hq
    implements SafeParcelable
{
    public static final class a
    {

        private final List CA = new ArrayList();
        private BitSet CB;
        private String CC;
        private String Cv;
        private boolean Cw;
        private int Cx;
        private boolean Cy;
        private String Cz;
        private final String mName;

        public a E(boolean flag)
        {
            Cw = flag;
            return this;
        }

        public a F(boolean flag)
        {
            Cy = flag;
            return this;
        }

        public a P(int i)
        {
            if (CB == null)
            {
                CB = new BitSet();
            }
            CB.set(i);
            return this;
        }

        public a at(String s)
        {
            Cv = s;
            return this;
        }

        public a au(String s)
        {
            CC = s;
            return this;
        }

        public hq fm()
        {
            int i = 0;
            int ai[] = null;
            if (CB != null)
            {
                int ai1[] = new int[CB.cardinality()];
                int j = CB.nextSetBit(0);
                do
                {
                    ai = ai1;
                    if (j < 0)
                    {
                        break;
                    }
                    ai1[i] = j;
                    j = CB.nextSetBit(j + 1);
                    i++;
                } while (true);
            }
            return new hq(mName, Cv, Cw, Cx, Cy, Cz, (hk[])CA.toArray(new hk[CA.size()]), ai, CC);
        }

        public a(String s)
        {
            mName = s;
            Cx = 1;
        }
    }


    public static final hr CREATOR = new hr();
    final int BR;
    public final String Co;
    public final boolean Cp;
    public final boolean Cq;
    public final String Cr;
    public final hk Cs[];
    final int Ct[];
    public final String Cu;
    public final String name;
    public final int weight;

    hq(int i, String s, String s1, boolean flag, int j, boolean flag1, String s2, 
            hk ahk[], int ai[], String s3)
    {
        BR = i;
        name = s;
        Co = s1;
        Cp = flag;
        weight = j;
        Cq = flag1;
        Cr = s2;
        Cs = ahk;
        Ct = ai;
        Cu = s3;
    }

    hq(String s, String s1, boolean flag, int i, boolean flag1, String s2, hk ahk[], 
            int ai[], String s3)
    {
        this(2, s, s1, flag, i, flag1, s2, ahk, ai, s3);
    }

    public int describeContents()
    {
        hr hr1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof hq)
        {
            obj = (hq)obj;
            flag = flag1;
            if (name.equals(((hq) (obj)).name))
            {
                flag = flag1;
                if (Co.equals(((hq) (obj)).Co))
                {
                    flag = flag1;
                    if (Cp == ((hq) (obj)).Cp)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hr hr1 = CREATOR;
        hr.a(this, parcel, i);
    }

}
