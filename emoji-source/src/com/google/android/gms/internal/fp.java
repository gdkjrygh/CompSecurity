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
//            fq, fm

public class fp
    implements SafeParcelable
{
    public static final class a
    {

        private final String mName;
        private String yi;
        private boolean yj;
        private int yk;
        private boolean yl;
        private String ym;
        private final List yn = new ArrayList();
        private BitSet yo;
        private String yp;

        public a I(int i)
        {
            if (yo == null)
            {
                yo = new BitSet();
            }
            yo.set(i);
            return this;
        }

        public a Z(String s)
        {
            yi = s;
            return this;
        }

        public a aa(String s)
        {
            yp = s;
            return this;
        }

        public fp dQ()
        {
            int i = 0;
            int ai[] = null;
            if (yo != null)
            {
                int ai1[] = new int[yo.cardinality()];
                int j = yo.nextSetBit(0);
                do
                {
                    ai = ai1;
                    if (j < 0)
                    {
                        break;
                    }
                    ai1[i] = j;
                    j = yo.nextSetBit(j + 1);
                    i++;
                } while (true);
            }
            return new fp(mName, yi, yj, yk, yl, ym, (fm[])yn.toArray(new fm[yn.size()]), ai, yp);
        }

        public a w(boolean flag)
        {
            yj = flag;
            return this;
        }

        public a x(boolean flag)
        {
            yl = flag;
            return this;
        }

        public a(String s)
        {
            mName = s;
            yk = 1;
        }
    }


    public static final fq CREATOR = new fq();
    public final String name;
    public final int weight;
    final int xM;
    public final String yb;
    public final boolean yc;
    public final boolean yd;
    public final String ye;
    public final fm yf[];
    final int yg[];
    public final String yh;

    fp(int i, String s, String s1, boolean flag, int j, boolean flag1, String s2, 
            fm afm[], int ai[], String s3)
    {
        xM = i;
        name = s;
        yb = s1;
        yc = flag;
        weight = j;
        yd = flag1;
        ye = s2;
        yf = afm;
        yg = ai;
        yh = s3;
    }

    fp(String s, String s1, boolean flag, int i, boolean flag1, String s2, fm afm[], 
            int ai[], String s3)
    {
        this(2, s, s1, flag, i, flag1, s2, afm, ai, s3);
    }

    public int describeContents()
    {
        fq fq1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof fp)
        {
            obj = (fp)obj;
            flag = flag1;
            if (name.equals(((fp) (obj)).name))
            {
                flag = flag1;
                if (yb.equals(((fp) (obj)).yb))
                {
                    flag = flag1;
                    if (yc == ((fp) (obj)).yc)
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
        fq fq1 = CREATOR;
        fq.a(this, parcel, i);
    }

}
