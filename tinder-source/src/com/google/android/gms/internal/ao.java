// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            aq, ef, cw, ac, 
//            ab, ad

public final class ao
    implements aq
{

    public ao()
    {
    }

    public final void a(cw cw1, Map map)
    {
        Object obj = (String)map.get("action");
        if (!"tick".equals(obj)) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = (String)map.get("label");
        obj = (String)map.get("start_label");
        map = (String)map.get("timestamp");
        if (!TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        b.e("No label given for CSI tick.");
_L6:
        return;
_L4:
        if (TextUtils.isEmpty(map))
        {
            b.e("No timestamp given for CSI tick.");
            return;
        }
        long l;
        long l1;
        long l2;
        try
        {
            l = Long.parseLong(map);
            l1 = d.g().a();
            l2 = d.g().b();
        }
        // Misplaced declaration of an exception variable
        catch (cw cw1)
        {
            b.c("Malformed timestamp for CSI tick.", cw1);
            return;
        }
        l = (l - l1) + l2;
        map = ((Map) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            map = "native:view_load";
        }
        cw1 = cw1.s();
        obj = ((ac) (cw1)).b;
        map = (ab)((ac) (cw1)).a.get(map);
        if (obj != null && map != null)
        {
            ((ad) (obj)).a(map, l, new String[] {
                s1
            });
        }
        map = ((ac) (cw1)).a;
        cw1 = ((ac) (cw1)).b;
        if (cw1 == null)
        {
            cw1 = null;
        } else
        {
            cw1 = cw1.a(l);
        }
        map.put(s1, cw1);
        return;
_L2:
        if ("experiment".equals(obj))
        {
            map = (String)map.get("value");
            if (TextUtils.isEmpty(map))
            {
                b.e("No value given for CSI experiment.");
                return;
            }
            cw1 = cw1.s().b;
            if (cw1 == null)
            {
                b.e("No ticker for WebView, dropping experiment ID.");
                return;
            } else
            {
                cw1.a("e", map);
                return;
            }
        }
        if ("extra".equals(obj))
        {
            String s = (String)map.get("name");
            map = (String)map.get("value");
            if (TextUtils.isEmpty(map))
            {
                b.e("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(s))
            {
                b.e("No name given for CSI extra.");
                return;
            }
            cw1 = cw1.s().b;
            if (cw1 == null)
            {
                b.e("No ticker for WebView, dropping extra parameter.");
                return;
            } else
            {
                cw1.a(s, map);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
