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
    public String body;
    public final int errorCode;
    public final int orientation;
    public final int versionCode;
    public final String zzAT;
    public final boolean zzDG;
    public final long zzDW;
    public final boolean zzDX;
    public final long zzDY;
    public final List zzDZ;
    public final String zzEa;
    public final long zzEb;
    public final String zzEc;
    public final boolean zzEd;
    public final String zzEe;
    public final String zzEf;
    public final boolean zzEg;
    public final boolean zzEh;
    public final boolean zzEi;
    public final int zzEj;
    public LargeParcelTeleporter zzEk;
    public String zzEl;
    public final boolean zzsJ;
    public final long zzyA;
    private AdRequestInfoParcel zzyd;
    public final List zzyw;
    public final List zzyx;

    public AdResponseParcel(int i)
    {
        this(13, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null, null);
    }

    public AdResponseParcel(int i, long l)
    {
        this(13, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null, null);
    }

    AdResponseParcel(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, int i1, 
            LargeParcelTeleporter largeparcelteleporter, String s6)
    {
        versionCode = i;
        zzAT = s;
        body = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        zzyw = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        zzyx = s;
        zzDW = l;
        zzDX = flag;
        zzDY = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        zzDZ = s;
        zzyA = l2;
        orientation = k;
        zzEa = s2;
        zzEb = l3;
        zzEc = s3;
        zzEd = flag1;
        zzEe = s4;
        zzEf = s5;
        zzEg = flag2;
        zzsJ = flag3;
        zzDG = flag4;
        zzEh = flag5;
        zzEi = flag6;
        zzEj = i1;
        zzEk = largeparcelteleporter;
        zzEl = s6;
        if (body == null && zzEk != null)
        {
            s = (StringParcel)zzEk.zza(StringParcel.CREATOR);
            if (s != null && !TextUtils.isEmpty(s.zzfF()))
            {
                body = s.zzfF();
            }
        }
    }

    public AdResponseParcel(AdRequestInfoParcel adrequestinfoparcel, String s, String s1, List list, List list1, long l, 
            boolean flag, long l1, List list2, long l2, int i, 
            String s2, long l3, String s3, String s4, boolean flag1, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5, int j)
    {
        this(13, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4, flag1, flag2, flag3, flag4, flag5, j, null, null);
        zzyd = adrequestinfoparcel;
    }

    public AdResponseParcel(AdRequestInfoParcel adrequestinfoparcel, String s, String s1, List list, List list1, long l, 
            boolean flag, long l1, List list2, long l2, int i, 
            String s2, long l3, String s3, boolean flag1, String s4, String s5, 
            boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, int j)
    {
        this(13, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, flag1, s4, s5, flag2, flag3, flag4, flag5, flag6, j, null, null);
        zzyd = adrequestinfoparcel;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (zzyd != null && zzyd.versionCode >= 9 && !TextUtils.isEmpty(body))
        {
            zzEk = new LargeParcelTeleporter(new StringParcel(body));
            body = null;
        }
        zzh.zza(this, parcel, i);
    }

}
