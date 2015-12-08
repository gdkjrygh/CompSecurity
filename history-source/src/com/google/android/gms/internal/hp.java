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
//            hq, hj

public class hp
    implements SafeParcelable
{
    public static final class a
    {

        private String Do;
        private boolean Dp;
        private int Dq;
        private boolean Dr;
        private String Ds;
        private final List Dt = new ArrayList();
        private BitSet Du;
        private String Dv;
        private final String mName;

        public a G(boolean flag)
        {
            Dp = flag;
            return this;
        }

        public a H(boolean flag)
        {
            Dr = flag;
            return this;
        }

        public a Q(int i)
        {
            if (Du == null)
            {
                Du = new BitSet();
            }
            Du.set(i);
            return this;
        }

        public a at(String s)
        {
            Do = s;
            return this;
        }

        public a au(String s)
        {
            Dv = s;
            return this;
        }

        public hp fG()
        {
            int i = 0;
            int ai[] = null;
            if (Du != null)
            {
                int ai1[] = new int[Du.cardinality()];
                int j = Du.nextSetBit(0);
                do
                {
                    ai = ai1;
                    if (j < 0)
                    {
                        break;
                    }
                    ai1[i] = j;
                    j = Du.nextSetBit(j + 1);
                    i++;
                } while (true);
            }
            return new hp(mName, Do, Dp, Dq, Dr, Ds, (hj[])Dt.toArray(new hj[Dt.size()]), ai, Dv);
        }

        public a(String s)
        {
            mName = s;
            Dq = 1;
        }
    }


    public static final hq CREATOR = new hq();
    final int CK;
    public final String Dh;
    public final boolean Di;
    public final boolean Dj;
    public final String Dk;
    public final hj Dl[];
    final int Dm[];
    public final String Dn;
    public final String name;
    public final int weight;

    hp(int i, String s, String s1, boolean flag, int j, boolean flag1, String s2, 
            hj ahj[], int ai[], String s3)
    {
        CK = i;
        name = s;
        Dh = s1;
        Di = flag;
        weight = j;
        Dj = flag1;
        Dk = s2;
        Dl = ahj;
        Dm = ai;
        Dn = s3;
    }

    hp(String s, String s1, boolean flag, int i, boolean flag1, String s2, hj ahj[], 
            int ai[], String s3)
    {
        this(2, s, s1, flag, i, flag1, s2, ahj, ai, s3);
    }

    public int describeContents()
    {
        hq hq1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof hp)
        {
            obj = (hp)obj;
            flag = flag1;
            if (name.equals(((hp) (obj)).name))
            {
                flag = flag1;
                if (Dh.equals(((hp) (obj)).Dh))
                {
                    flag = flag1;
                    if (Di == ((hp) (obj)).Di)
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
        hq hq1 = CREATOR;
        hq.a(this, parcel, i);
    }

}
