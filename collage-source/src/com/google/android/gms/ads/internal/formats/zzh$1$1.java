// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ht;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh

class zzwl
    implements com.google.android.gms.internal.ats.zzh._cls1._cls1
{

    final Map zzwl;
    final zzb zzwm;

    public void zza(hs hs, boolean flag)
    {
        zzh.zza(zzwm.wk, (String)zzwl.get("id"));
        hs = new JSONObject();
        try
        {
            hs.put("messageType", "htmlLoaded");
            hs.put("id", zzh.zzc(zzwm.wk));
            zzh.zzd(zzwm.wk).b("sendMessageToNativeJs", hs);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (hs hs)
        {
            zzb.zzb("Unable to dispatch sendMessageToNativeJsevent", hs);
        }
    }

    wk(wk wk, Map map)
    {
        zzwm = wk;
        zzwl = map;
        super();
    }

    // Unreferenced inner class com/google/android/gms/ads/internal/formats/zzh$1

/* anonymous class */
    class zzh._cls1
        implements ch
    {

        final zzh zzwk;

        public void zza(hs hs1, Map map)
        {
            zzh.zze(zzwk).i().a(new zzh._cls1._cls1(this, map));
            hs1 = (String)map.get("overlayHtml");
            zzh.zze(zzwk).loadData(hs1, "text/html", "UTF-8");
        }

            
            {
                zzwk = zzh1;
                super();
            }
    }

}
