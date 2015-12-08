// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzt, zzah, zzhx

public class zzcn
{
    public static interface zza
    {

        public abstract void zza(zzcn zzcn1);
    }


    private zzt zzrv;
    private zzah zzrw;
    private JSONObject zzrx;

    public zzcn(zzt zzt1, zzah zzah1, JSONObject jsonobject)
    {
        zzrv = zzt1;
        zzrw = zzah1;
        zzrx = jsonobject;
    }

    public void recordImpression()
    {
        zzrv.zzan();
    }

    public void zzb(String s, int i)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("asset", i);
            jsonobject.put("template", s);
            s = new JSONObject();
            s.put("ad", zzrx);
            s.put("click", jsonobject);
            zzrw.zza("google.afma.nativeAds.handleClick", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzhx.zzb("Unable to create click JSON.", s);
        }
    }
}
