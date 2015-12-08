// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzgo, zzgq, zzic, zzid, 
//            zzdj, zzds, zzdm, zzax, 
//            zzdk, zzba

public class zzhe
{
    public static final class zza
    {

        public final int errorCode;
        public final zzba zzlV;
        public final JSONObject zzys;
        public final zzdk zzyt;
        public final long zzyv;
        public final long zzyw;
        public final zzgo zzyy;
        public final zzgq zzyz;

        public zza(zzgo zzgo1, zzgq zzgq1, zzdk zzdk, zzba zzba1, int i, long l, 
                long l1, JSONObject jsonobject)
        {
            zzyy = zzgo1;
            zzyz = zzgq1;
            zzyt = zzdk;
            zzlV = zzba1;
            errorCode = i;
            zzyv = l;
            zzyw = l1;
            zzys = jsonobject;
        }
    }


    public final int errorCode;
    public final int orientation;
    public final zzdj zzsL;
    public final zzds zzsM;
    public final String zzsN;
    public final zzdm zzsO;
    public final List zzst;
    public final List zzsu;
    public final long zzsx;
    public final zzic zzuq;
    public final String zzwD;
    public final long zzwH;
    public final boolean zzwI;
    public final long zzwJ;
    public final List zzwK;
    public final String zzwN;
    public final zzax zzwn;
    public final String zzwq;
    public final JSONObject zzys;
    public final zzdk zzyt;
    public final zzba zzyu;
    public final long zzyv;
    public final long zzyw;
    public final zzcn.zza zzyx;

    public zzhe(zzax zzax, zzic zzic1, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, zzdj zzdj, zzds zzds, String s1, 
            zzdk zzdk, zzdm zzdm, long l1, zzba zzba1, long l2, 
            long l3, long l4, String s2, JSONObject jsonobject, zzcn.zza zza1, 
            String s3)
    {
        zzwn = zzax;
        zzuq = zzic1;
        if (list != null)
        {
            zzax = Collections.unmodifiableList(list);
        } else
        {
            zzax = null;
        }
        zzst = zzax;
        errorCode = i;
        if (list1 != null)
        {
            zzax = Collections.unmodifiableList(list1);
        } else
        {
            zzax = null;
        }
        zzsu = zzax;
        if (list2 != null)
        {
            zzax = Collections.unmodifiableList(list2);
        } else
        {
            zzax = null;
        }
        zzwK = zzax;
        orientation = j;
        zzsx = l;
        zzwq = s;
        zzwI = flag;
        zzsL = zzdj;
        zzsM = zzds;
        zzsN = s1;
        zzyt = zzdk;
        zzsO = zzdm;
        zzwJ = l1;
        zzyu = zzba1;
        zzwH = l2;
        zzyv = l3;
        zzyw = l4;
        zzwN = s2;
        zzys = jsonobject;
        zzyx = zza1;
        zzwD = s3;
    }

    public zzhe(zza zza1, zzic zzic1, zzdj zzdj, zzds zzds, String s, zzdm zzdm, zzcn.zza zza2)
    {
        this(zza1.zzyy.zzwn, zzic1, zza1.zzyz.zzst, zza1.errorCode, zza1.zzyz.zzsu, zza1.zzyz.zzwK, zza1.zzyz.orientation, zza1.zzyz.zzsx, zza1.zzyy.zzwq, zza1.zzyz.zzwI, zzdj, zzds, s, zza1.zzyt, zzdm, zza1.zzyz.zzwJ, zza1.zzlV, zza1.zzyz.zzwH, zza1.zzyv, zza1.zzyw, zza1.zzyz.zzwN, zza1.zzys, zza2, zza1.zzyy.zzwD);
    }

    public boolean zzba()
    {
        if (zzuq == null || zzuq.zzeG() == null)
        {
            return false;
        } else
        {
            return zzuq.zzeG().zzba();
        }
    }
}
