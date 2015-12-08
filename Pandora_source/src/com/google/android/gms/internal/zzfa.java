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
//            zzgd, zzge, zzck, zzcj, 
//            zzcs, zzcm

public class zzfa
{
    public static final class zza
    {

        public final int errorCode;
        public final JSONObject zzBs;
        public final zzck zzBt;
        public final long zzBv;
        public final long zzBw;
        public final AdRequestInfoParcel zzBy;
        public final AdResponseParcel zzBz;
        public final AdSizeParcel zzmP;

        public zza(AdRequestInfoParcel adrequestinfoparcel, AdResponseParcel adresponseparcel, zzck zzck, AdSizeParcel adsizeparcel, int i, long l, 
                long l1, JSONObject jsonobject)
        {
            zzBy = adrequestinfoparcel;
            zzBz = adresponseparcel;
            zzBt = zzck;
            zzmP = adsizeparcel;
            errorCode = i;
            zzBv = l;
            zzBw = l1;
            zzBs = jsonobject;
        }
    }


    public final int errorCode;
    public final int orientation;
    public final JSONObject zzBs;
    public final zzck zzBt;
    public final AdSizeParcel zzBu;
    public final long zzBv;
    public final long zzBw;
    public final zzbi.zza zzBx;
    public final List zzuC;
    public final List zzuD;
    public final long zzuG;
    public final zzcj zzuU;
    public final zzcs zzuV;
    public final String zzuW;
    public final zzcm zzuX;
    public final zzgd zzwz;
    public final AdRequestParcel zzyW;
    public final String zzyZ;
    public final String zzzm;
    public final long zzzs;
    public final boolean zzzt;
    public final long zzzu;
    public final List zzzv;
    public final String zzzy;

    public zzfa(AdRequestParcel adrequestparcel, zzgd zzgd1, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, zzcj zzcj, zzcs zzcs, String s1, 
            zzck zzck, zzcm zzcm, long l1, AdSizeParcel adsizeparcel, long l2, 
            long l3, long l4, String s2, JSONObject jsonobject, zzbi.zza zza1, 
            String s3)
    {
        zzyW = adrequestparcel;
        zzwz = zzgd1;
        if (list != null)
        {
            adrequestparcel = Collections.unmodifiableList(list);
        } else
        {
            adrequestparcel = null;
        }
        zzuC = adrequestparcel;
        errorCode = i;
        if (list1 != null)
        {
            adrequestparcel = Collections.unmodifiableList(list1);
        } else
        {
            adrequestparcel = null;
        }
        zzuD = adrequestparcel;
        if (list2 != null)
        {
            adrequestparcel = Collections.unmodifiableList(list2);
        } else
        {
            adrequestparcel = null;
        }
        zzzv = adrequestparcel;
        orientation = j;
        zzuG = l;
        zzyZ = s;
        zzzt = flag;
        zzuU = zzcj;
        zzuV = zzcs;
        zzuW = s1;
        zzBt = zzck;
        zzuX = zzcm;
        zzzu = l1;
        zzBu = adsizeparcel;
        zzzs = l2;
        zzBv = l3;
        zzBw = l4;
        zzzy = s2;
        zzBs = jsonobject;
        zzBx = zza1;
        zzzm = s3;
    }

    public zzfa(zza zza1, zzgd zzgd1, zzcj zzcj, zzcs zzcs, String s, zzcm zzcm, zzbi.zza zza2)
    {
        this(zza1.zzBy.zzyW, zzgd1, zza1.zzBz.zzuC, zza1.errorCode, zza1.zzBz.zzuD, zza1.zzBz.zzzv, zza1.zzBz.orientation, zza1.zzBz.zzuG, zza1.zzBy.zzyZ, zza1.zzBz.zzzt, zzcj, zzcs, s, zza1.zzBt, zzcm, zza1.zzBz.zzzu, zza1.zzmP, zza1.zzBz.zzzs, zza1.zzBv, zza1.zzBw, zza1.zzBz.zzzy, zza1.zzBs, zza2, zza1.zzBy.zzzm);
    }

    public boolean zzbg()
    {
        if (zzwz == null || zzwz.zzft() == null)
        {
            return false;
        } else
        {
            return zzwz.zzft().zzbg();
        }
    }
}
