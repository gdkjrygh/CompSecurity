// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Map;

public final class cdg
    implements cdi
{

    public cdg()
    {
    }

    public final void a(ckw ckw1, Map map)
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
        bka.e("No label given for CSI tick.");
_L6:
        return;
_L4:
        if (TextUtils.isEmpty(map))
        {
            bka.e("No timestamp given for CSI tick.");
            return;
        }
        long l;
        long l1;
        long l2;
        try
        {
            l = Long.parseLong(map);
            l1 = bkv.i().a();
            l2 = bkv.i().b();
        }
        // Misplaced declaration of an exception variable
        catch (ckw ckw1)
        {
            bka.c("Malformed timestamp for CSI tick.", ckw1);
            return;
        }
        l = (l - l1) + l2;
        map = ((Map) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            map = "native:view_load";
        }
        ckw1 = ckw1.w();
        obj = ((cbj) (ckw1)).b;
        map = (cbi)((cbj) (ckw1)).a.get(map);
        if (obj != null && map != null)
        {
            ((cbk) (obj)).a(map, l, new String[] {
                s1
            });
        }
        map = ((cbj) (ckw1)).a;
        ckw1 = ((cbj) (ckw1)).b;
        if (ckw1 == null)
        {
            ckw1 = null;
        } else
        {
            ckw1 = ckw1.a(l);
        }
        map.put(s1, ckw1);
        return;
_L2:
        if ("experiment".equals(obj))
        {
            map = (String)map.get("value");
            if (TextUtils.isEmpty(map))
            {
                bka.e("No value given for CSI experiment.");
                return;
            }
            ckw1 = ckw1.w().b;
            if (ckw1 == null)
            {
                bka.e("No ticker for WebView, dropping experiment ID.");
                return;
            } else
            {
                ckw1.a("e", map);
                return;
            }
        }
        if ("extra".equals(obj))
        {
            String s = (String)map.get("name");
            map = (String)map.get("value");
            if (TextUtils.isEmpty(map))
            {
                bka.e("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(s))
            {
                bka.e("No name given for CSI extra.");
                return;
            }
            ckw1 = ckw1.w().b;
            if (ckw1 == null)
            {
                bka.e("No ticker for WebView, dropping extra parameter.");
                return;
            } else
            {
                ckw1.a(s, map);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
