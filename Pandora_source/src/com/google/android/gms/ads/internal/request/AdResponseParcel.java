// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzh, StringParcel, LargeParcelTeleporter, AdRequestInfoParcel

public final class AdResponseParcel
    implements SafeParcelable
{

    public static final zzh CREATOR = new zzh();
    public final int errorCode;
    public final int orientation;
    public final int versionCode;
    public final boolean zzqa;
    public final List zzuC;
    public final List zzuD;
    public final long zzuG;
    private AdRequestInfoParcel zzul;
    public final String zzwB;
    public final String zzzA;
    public final String zzzB;
    public final boolean zzzC;
    public final boolean zzzD;
    public final boolean zzzE;
    public final int zzzF;
    public LargeParcelTeleporter zzzG;
    public final boolean zzze;
    public String zzzr;
    public final long zzzs;
    public final boolean zzzt;
    public final long zzzu;
    public final List zzzv;
    public final String zzzw;
    public final long zzzx;
    public final String zzzy;
    public final boolean zzzz;

    public AdResponseParcel(int i)
    {
        this(12, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null);
    }

    public AdResponseParcel(int i, long l)
    {
        this(12, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null);
    }

    AdResponseParcel(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, int i1, 
            LargeParcelTeleporter largeparcelteleporter)
    {
        versionCode = i;
        zzwB = s;
        zzzr = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        zzuC = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        zzuD = s;
        zzzs = l;
        zzzt = flag;
        zzzu = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        zzzv = s;
        zzuG = l2;
        orientation = k;
        zzzw = s2;
        zzzx = l3;
        zzzy = s3;
        zzzz = flag1;
        zzzA = s4;
        zzzB = s5;
        zzzC = flag2;
        zzqa = flag3;
        zzze = flag4;
        zzzD = flag5;
        zzzE = flag6;
        zzzF = i1;
        zzzG = largeparcelteleporter;
        if (zzzr == null && zzzG != null)
        {
            s = (StringParcel)zzzG.zza(StringParcel.CREATOR);
            if (s != null && !TextUtils.isEmpty(s.zzev()))
            {
                zzzr = s.zzev();
            }
        }
    }

    public AdResponseParcel(AdRequestInfoParcel adrequestinfoparcel, String s, String s1, List list, List list1, long l, 
            boolean flag, long l1, List list2, long l2, int i, 
            String s2, long l3, String s3, String s4, boolean flag1, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5, int j)
    {
        this(12, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4, flag1, flag2, flag3, flag4, flag5, j, null);
        zzul = adrequestinfoparcel;
    }

    public AdResponseParcel(AdRequestInfoParcel adrequestinfoparcel, String s, String s1, List list, List list1, long l, 
            boolean flag, long l1, List list2, long l2, int i, 
            String s2, long l3, String s3, boolean flag1, String s4, String s5, 
            boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, int j)
    {
        this(12, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, flag1, s4, s5, flag2, flag3, flag4, flag5, flag6, j, null);
        zzul = adrequestinfoparcel;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (zzul != null && zzul.versionCode >= 9)
        {
            zzzG = new LargeParcelTeleporter(new StringParcel(zzzr));
            zzzr = null;
        }
        zzh.zza(this, parcel, i);
    }

}
