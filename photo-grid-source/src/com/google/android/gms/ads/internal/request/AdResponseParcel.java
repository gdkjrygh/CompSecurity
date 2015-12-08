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
    private AdRequestInfoParcel a;
    public String body;
    public final int errorCode;
    public final int orientation;
    public final int versionCode;
    public final String zzBF;
    public final long zzEJ;
    public final boolean zzEK;
    public final long zzEL;
    public final List zzEM;
    public final String zzEN;
    public final long zzEO;
    public final String zzEP;
    public final boolean zzEQ;
    public final String zzER;
    public final String zzES;
    public final boolean zzET;
    public final boolean zzEU;
    public final boolean zzEV;
    public final int zzEW;
    public LargeParcelTeleporter zzEX;
    public String zzEY;
    public String zzEZ;
    public final boolean zzEv;
    public final boolean zzth;
    public boolean zzti;
    public final List zzyY;
    public final List zzyZ;
    public final long zzzc;

    public AdResponseParcel(int i)
    {
        this(14, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null, null, null, false);
    }

    public AdResponseParcel(int i, long l)
    {
        this(14, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null, null, null, false);
    }

    AdResponseParcel(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, int i1, 
            LargeParcelTeleporter largeparcelteleporter, String s6, String s7, boolean flag7)
    {
        versionCode = i;
        zzBF = s;
        body = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        zzyY = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        zzyZ = s;
        zzEJ = l;
        zzEK = flag;
        zzEL = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        zzEM = s;
        zzzc = l2;
        orientation = k;
        zzEN = s2;
        zzEO = l3;
        zzEP = s3;
        zzEQ = flag1;
        zzER = s4;
        zzES = s5;
        zzET = flag2;
        zzth = flag3;
        zzEv = flag4;
        zzEU = flag5;
        zzEV = flag6;
        zzEW = i1;
        zzEX = largeparcelteleporter;
        zzEY = s6;
        zzEZ = s7;
        if (body == null && zzEX != null)
        {
            s = (StringParcel)zzEX.zza(StringParcel.CREATOR);
            if (s != null && !TextUtils.isEmpty(s.zzfP()))
            {
                body = s.zzfP();
            }
        }
        zzti = flag7;
    }

    public AdResponseParcel(AdRequestInfoParcel adrequestinfoparcel, String s, String s1, List list, List list1, long l, 
            boolean flag, long l1, List list2, long l2, int i, 
            String s2, long l3, String s3, String s4, boolean flag1, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5, int j, String s5, boolean flag6)
    {
        this(14, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4, flag1, flag2, flag3, flag4, flag5, j, null, null, s5, flag6);
        a = adrequestinfoparcel;
    }

    public AdResponseParcel(AdRequestInfoParcel adrequestinfoparcel, String s, String s1, List list, List list1, long l, 
            boolean flag, long l1, List list2, long l2, int i, 
            String s2, long l3, String s3, boolean flag1, String s4, String s5, 
            boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, int j, String s6, 
            boolean flag7)
    {
        this(14, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, flag1, s4, s5, flag2, flag3, flag4, flag5, flag6, j, null, null, s6, flag7);
        a = adrequestinfoparcel;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (a != null && a.versionCode >= 9 && !TextUtils.isEmpty(body))
        {
            zzEX = new LargeParcelTeleporter(new StringParcel(body));
            body = null;
        }
        zzh.a(this, parcel, i);
    }

}
