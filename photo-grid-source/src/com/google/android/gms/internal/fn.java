// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, wg, ry, dl, 
//            dm

public final class fn
    implements fz
{

    public fn()
    {
    }

    public final void zza(ry ry1, Map map)
    {
        String s = (String)map.get("action");
        if (!"tick".equals(s)) goto _L2; else goto _L1
_L1:
        String s2;
        s2 = (String)map.get("label");
        s = (String)map.get("start_label");
        map = (String)map.get("timestamp");
        if (!TextUtils.isEmpty(s2)) goto _L4; else goto _L3
_L3:
        zzb.zzaH("No label given for CSI tick.");
_L6:
        return;
_L4:
        if (TextUtils.isEmpty(map))
        {
            zzb.zzaH("No timestamp given for CSI tick.");
            return;
        }
        long l;
        long l1;
        long l2;
        try
        {
            l = Long.parseLong(map);
            l1 = zzp.zzbz().a();
            l2 = zzp.zzbz().b();
        }
        // Misplaced declaration of an exception variable
        catch (ry ry1)
        {
            zzb.zzd("Malformed timestamp for CSI tick.", ry1);
            return;
        }
        map = s;
        if (TextUtils.isEmpty(s))
        {
            map = "native:view_load";
        }
        ry1.w().a(s2, map, (l - l1) + l2);
        return;
_L2:
        if ("experiment".equals(s))
        {
            map = (String)map.get("value");
            if (TextUtils.isEmpty(map))
            {
                zzb.zzaH("No value given for CSI experiment.");
                return;
            }
            ry1 = ry1.w().a();
            if (ry1 == null)
            {
                zzb.zzaH("No ticker for WebView, dropping experiment ID.");
                return;
            } else
            {
                ry1.a("e", map);
                return;
            }
        }
        if ("extra".equals(s))
        {
            String s1 = (String)map.get("name");
            map = (String)map.get("value");
            if (TextUtils.isEmpty(map))
            {
                zzb.zzaH("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(s1))
            {
                zzb.zzaH("No name given for CSI extra.");
                return;
            }
            ry1 = ry1.w().a();
            if (ry1 == null)
            {
                zzb.zzaH("No ticker for WebView, dropping extra parameter.");
                return;
            } else
            {
                ry1.a(s1, map);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
