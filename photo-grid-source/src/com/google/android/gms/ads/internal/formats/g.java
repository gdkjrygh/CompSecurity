// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.bg;
import com.google.android.gms.internal.fz;
import com.google.android.gms.internal.ry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh

final class g
    implements fz
{

    final zzh a;

    g(zzh zzh1)
    {
        a = zzh1;
        super();
    }

    public final void zza(ry ry, Map map)
    {
        ry = new JSONObject();
        try
        {
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ry.put(s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (ry ry)
        {
            zzb.zzb("Unable to dispatch sendMessageToNativeJs event", ry);
            return;
        }
        ry.put("id", zzh.a(a));
        zzh.b(a).b("sendMessageToNativeJs", ry);
        return;
    }
}
