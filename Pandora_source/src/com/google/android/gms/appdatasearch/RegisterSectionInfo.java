// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzi, Feature

public class RegisterSectionInfo
    implements SafeParcelable
{
    public static final class zza
    {

        private final String mName;
        private String zzJD;
        private boolean zzJE;
        private int zzJF;
        private boolean zzJG;
        private String zzJH;
        private final List zzJI = new ArrayList();
        private BitSet zzJJ;
        private String zzJK;

        public zza zzJ(boolean flag)
        {
            zzJE = flag;
            return this;
        }

        public zza zzK(boolean flag)
        {
            zzJG = flag;
            return this;
        }

        public zza zzaa(int i)
        {
            if (zzJJ == null)
            {
                zzJJ = new BitSet();
            }
            zzJJ.set(i);
            return this;
        }

        public zza zzbd(String s)
        {
            zzJD = s;
            return this;
        }

        public zza zzbe(String s)
        {
            zzJK = s;
            return this;
        }

        public RegisterSectionInfo zzjG()
        {
            int i = 0;
            int ai[] = null;
            if (zzJJ != null)
            {
                int ai1[] = new int[zzJJ.cardinality()];
                int j = zzJJ.nextSetBit(0);
                do
                {
                    ai = ai1;
                    if (j < 0)
                    {
                        break;
                    }
                    ai1[i] = j;
                    j = zzJJ.nextSetBit(j + 1);
                    i++;
                } while (true);
            }
            return new RegisterSectionInfo(mName, zzJD, zzJE, zzJF, zzJG, zzJH, (Feature[])zzJI.toArray(new Feature[zzJI.size()]), ai, zzJK);
        }

        public zza(String s)
        {
            mName = s;
            zzJF = 1;
        }
    }


    public static final zzi CREATOR = new zzi();
    public final String name;
    public final int weight;
    public final Feature zzJA[];
    final int zzJB[];
    public final String zzJC;
    public final String zzJw;
    public final boolean zzJx;
    public final boolean zzJy;
    public final String zzJz;
    final int zzzH;

    RegisterSectionInfo(int i, String s, String s1, boolean flag, int j, boolean flag1, String s2, 
            Feature afeature[], int ai[], String s3)
    {
        zzzH = i;
        name = s;
        zzJw = s1;
        zzJx = flag;
        weight = j;
        zzJy = flag1;
        zzJz = s2;
        zzJA = afeature;
        zzJB = ai;
        zzJC = s3;
    }

    RegisterSectionInfo(String s, String s1, boolean flag, int i, boolean flag1, String s2, Feature afeature[], 
            int ai[], String s3)
    {
        this(2, s, s1, flag, i, flag1, s2, afeature, ai, s3);
    }

    public int describeContents()
    {
        zzi zzi1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi zzi1 = CREATOR;
        zzi.zza(this, parcel, i);
    }

}
