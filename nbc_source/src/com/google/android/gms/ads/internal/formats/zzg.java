// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbb;
import org.json.JSONException;
import org.json.JSONObject;

public class zzg
{
    public static interface zza
    {

        public abstract String getCustomTemplateId();

        public abstract void zza(zzg zzg1);

        public abstract String zzdE();
    }


    private final Context mContext;
    private final Object zzqt = new Object();
    private final zzan zzvA;
    private boolean zzvB;
    private final zzm zzvw;
    private final JSONObject zzvx;
    private final zzbb zzvy;
    private final zza zzvz;

    public zzg(Context context, zzm zzm1, zzbb zzbb1, zzan zzan, JSONObject jsonobject, zza zza1)
    {
        mContext = context;
        zzvw = zzm1;
        zzvy = zzbb1;
        zzvA = zzan;
        zzvx = jsonobject;
        zzvz = zza1;
    }

    public void performClick(String s)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("asset", s);
        jsonobject.put("template", zzvz.zzdE());
        s = new JSONObject();
        s.put("ad", zzvx);
        s.put("click", jsonobject);
        boolean flag;
        if (zzvw.zzq(zzvz.getCustomTemplateId()) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            s.put("has_custom_click_handler", flag);
            zzvy.zza("google.afma.nativeAds.handleClickGmsg", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzb("Unable to create click JSON.", s);
        }
        return;
    }

    public void recordImpression()
    {
        zzvB = true;
        zzvw.zzaP();
    }
}
