// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.hs;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh

class zzwk
    implements ch
{

    final zzh zzwk;

    public void zza(hs hs, Map map)
    {
        hs = new JSONObject();
        try
        {
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); hs.put(s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (hs hs)
        {
            zzb.zzb("Unable to dispatch sendMessageToNativeJs event", hs);
            return;
        }
        hs.put("id", zzh.zzc(zzwk));
        zzh.zzd(zzwk).b("sendMessageToNativeJs", hs);
        return;
    }

    b(zzh zzh1)
    {
        zzwk = zzh1;
        super();
    }
}
