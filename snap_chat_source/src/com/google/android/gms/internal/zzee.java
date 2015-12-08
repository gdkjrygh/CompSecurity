// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx

public class zzee
{
    public static final class zza
    {

        private boolean zztA;
        private boolean zztB;
        private boolean zztC;
        private boolean zztD;
        private boolean zztE;

        static boolean zza(zza zza1)
        {
            return zza1.zztA;
        }

        static boolean zzb(zza zza1)
        {
            return zza1.zztB;
        }

        static boolean zzc(zza zza1)
        {
            return zza1.zztC;
        }

        static boolean zzd(zza zza1)
        {
            return zza1.zztD;
        }

        static boolean zze(zza zza1)
        {
            return zza1.zztE;
        }

        public final zzee zzcR()
        {
            return new zzee(this);
        }

        public final zza zzn(boolean flag)
        {
            zztA = flag;
            return this;
        }

        public final zza zzo(boolean flag)
        {
            zztB = flag;
            return this;
        }

        public final zza zzp(boolean flag)
        {
            zztC = flag;
            return this;
        }

        public final zza zzq(boolean flag)
        {
            zztD = flag;
            return this;
        }

        public final zza zzr(boolean flag)
        {
            zztE = flag;
            return this;
        }

        public zza()
        {
        }
    }


    private final boolean zztA;
    private final boolean zztB;
    private final boolean zztC;
    private final boolean zztD;
    private final boolean zztE;

    private zzee(zza zza1)
    {
        zztA = zza.zza(zza1);
        zztB = zza.zzb(zza1);
        zztC = zza.zzc(zza1);
        zztD = zza.zzd(zza1);
        zztE = zza.zze(zza1);
    }


    public JSONObject toJson()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject()).put("sms", zztA).put("tel", zztB).put("calendar", zztC).put("storePicture", zztD).put("inlineVideo", zztE);
        }
        catch (JSONException jsonexception)
        {
            zzhx.zzb("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
