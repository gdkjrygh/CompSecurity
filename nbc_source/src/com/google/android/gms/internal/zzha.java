// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzid, zzie, zzdy, zzdx, 
//            zzeg, zzea

public class zzha
{
    public static final class zza
    {

        public final int errorCode;
        public final JSONObject zzFl;
        public final zzdy zzFm;
        public final long zzFo;
        public final long zzFp;
        public final AdRequestInfoParcel zzFr;
        public final AdResponseParcel zzFs;
        public final AdSizeParcel zzpN;

        public zza(AdRequestInfoParcel adrequestinfoparcel, AdResponseParcel adresponseparcel, zzdy zzdy, AdSizeParcel adsizeparcel, int i, long l, 
                long l1, JSONObject jsonobject)
        {
            zzFr = adrequestinfoparcel;
            zzFs = adresponseparcel;
            zzFm = zzdy;
            zzpN = adsizeparcel;
            errorCode = i;
            zzFo = l;
            zzFp = l1;
            zzFl = jsonobject;
        }
    }


    public final int errorCode;
    public final int orientation;
    public final String zzCC;
    public final long zzCJ;
    public final boolean zzCK;
    public final long zzCL;
    public final List zzCM;
    public final String zzCP;
    public final AdRequestParcel zzCm;
    public final String zzCp;
    public final JSONObject zzFl;
    public final zzdy zzFm;
    public final AdSizeParcel zzFn;
    public final long zzFo;
    public final long zzFp;
    public final com.google.android.gms.ads.internal.formats.zzg.zza zzFq;
    public final List zzxF;
    public final List zzxG;
    public final long zzxJ;
    public final zzdx zzxZ;
    public final zzeg zzya;
    public final String zzyb;
    public final zzea zzyc;
    public final zzid zzzE;

    public zzha(AdRequestParcel adrequestparcel, zzid zzid1, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, zzdx zzdx, zzeg zzeg, String s1, 
            zzdy zzdy, zzea zzea, long l1, AdSizeParcel adsizeparcel, long l2, 
            long l3, long l4, String s2, JSONObject jsonobject, com.google.android.gms.ads.internal.formats.zzg.zza zza1, 
            String s3)
    {
        zzCm = adrequestparcel;
        zzzE = zzid1;
        if (list != null)
        {
            adrequestparcel = Collections.unmodifiableList(list);
        } else
        {
            adrequestparcel = null;
        }
        zzxF = adrequestparcel;
        errorCode = i;
        if (list1 != null)
        {
            adrequestparcel = Collections.unmodifiableList(list1);
        } else
        {
            adrequestparcel = null;
        }
        zzxG = adrequestparcel;
        if (list2 != null)
        {
            adrequestparcel = Collections.unmodifiableList(list2);
        } else
        {
            adrequestparcel = null;
        }
        zzCM = adrequestparcel;
        orientation = j;
        zzxJ = l;
        zzCp = s;
        zzCK = flag;
        zzxZ = zzdx;
        zzya = zzeg;
        zzyb = s1;
        zzFm = zzdy;
        zzyc = zzea;
        zzCL = l1;
        zzFn = adsizeparcel;
        zzCJ = l2;
        zzFo = l3;
        zzFp = l4;
        zzCP = s2;
        zzFl = jsonobject;
        zzFq = zza1;
        zzCC = s3;
    }

    public zzha(zza zza1, zzid zzid1, zzdx zzdx, zzeg zzeg, String s, zzea zzea, com.google.android.gms.ads.internal.formats.zzg.zza zza2)
    {
        this(zza1.zzFr.zzCm, zzid1, zza1.zzFs.zzxF, zza1.errorCode, zza1.zzFs.zzxG, zza1.zzFs.zzCM, zza1.zzFs.orientation, zza1.zzFs.zzxJ, zza1.zzFr.zzCp, zza1.zzFs.zzCK, zzdx, zzeg, s, zza1.zzFm, zzea, zza1.zzFs.zzCL, zza1.zzpN, zza1.zzFs.zzCJ, zza1.zzFo, zza1.zzFp, zza1.zzFs.zzCP, zza1.zzFl, zza2, zza1.zzFr.zzCC);
    }

    public boolean zzbU()
    {
        if (zzzE == null || zzzE.zzgF() == null)
        {
            return false;
        } else
        {
            return zzzE.zzgF().zzbU();
        }
    }
}
