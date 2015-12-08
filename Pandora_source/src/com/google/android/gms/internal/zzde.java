// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

public class zzde
{
    public static final class zza
    {

        private boolean zzvJ;
        private boolean zzvK;
        private boolean zzvL;
        private boolean zzvM;
        private boolean zzvN;

        static boolean zza(zza zza1)
        {
            return zza1.zzvJ;
        }

        static boolean zzb(zza zza1)
        {
            return zza1.zzvK;
        }

        static boolean zzc(zza zza1)
        {
            return zza1.zzvL;
        }

        static boolean zzd(zza zza1)
        {
            return zza1.zzvM;
        }

        static boolean zze(zza zza1)
        {
            return zza1.zzvN;
        }

        public zzde zzdi()
        {
            return new zzde(this);
        }

        public zza zzo(boolean flag)
        {
            zzvJ = flag;
            return this;
        }

        public zza zzp(boolean flag)
        {
            zzvK = flag;
            return this;
        }

        public zza zzq(boolean flag)
        {
            zzvL = flag;
            return this;
        }

        public zza zzr(boolean flag)
        {
            zzvM = flag;
            return this;
        }

        public zza zzs(boolean flag)
        {
            zzvN = flag;
            return this;
        }

        public zza()
        {
        }
    }


    private final boolean zzvJ;
    private final boolean zzvK;
    private final boolean zzvL;
    private final boolean zzvM;
    private final boolean zzvN;

    private zzde(zza zza1)
    {
        zzvJ = zza.zza(zza1);
        zzvK = com.google.android.gms.internal.zza.zzb(zza1);
        zzvL = zza.zzc(zza1);
        zzvM = zza.zzd(zza1);
        zzvN = zza.zze(zza1);
    }


    public JSONObject toJson()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject()).put("sms", zzvJ).put("tel", zzvK).put("calendar", zzvL).put("storePicture", zzvM).put("inlineVideo", zzvN);
        }
        catch (JSONException jsonexception)
        {
            zzb.zzb("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
