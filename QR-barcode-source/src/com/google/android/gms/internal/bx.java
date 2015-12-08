// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ce, by, gv, gs, 
//            l, k, gq, gt, 
//            dk, g

public final class bx
{

    public static final by pA = new by() {

        public void a(gv gv, Map map)
        {
        }

    };
    public static final by pB = new by() {

        public void a(gv gv1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                gs.W("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = gv1.getContext().getPackageManager();
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
                map = s.split(";", 2);
                String s1 = map[0].trim();
                boolean flag;
                if (map.length > 1)
                {
                    map = map[1].trim();
                } else
                {
                    map = "android.intent.action.VIEW";
                }
                if (packagemanager.resolveActivity(new Intent(map, Uri.parse(s1)), 0x10000) != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                hashmap.put(s, Boolean.valueOf(flag));
                i++;
            }
            gv1.a("openableURLs", hashmap);
        }

    };
    public static final by pC = new by() {

        public void a(gv gv1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                gs.W("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = gv1.dw();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            if (!((k) (obj)).b(map))
            {
                break MISSING_BLOCK_LABEL_59;
            }
            obj = ((k) (obj)).a(map, gv1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new gq(gv1.getContext(), gv1.dx().wD, map)).start();
            return;
            l l1;
            l1;
            gs.W((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final by pD = new by() {

        public void a(gv gv1, Map map)
        {
            gv1 = gv1.dt();
            if (gv1 == null)
            {
                gs.W("A GMSG tried to close something that wasn't an overlay.");
                return;
            } else
            {
                gv1.close();
                return;
            }
        }

    };
    public static final by pE = new by() {

        public void a(gv gv1, Map map)
        {
            gv1.o("1".equals(map.get("custom_close")));
        }

    };
    public static final by pF = new by() {

        public void a(gv gv1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                gs.W("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new gq(gv1.getContext(), gv1.dx().wD, map)).start();
                return;
            }
        }

    };
    public static final by pG = new by() {

        public void a(gv gv, Map map)
        {
            gs.U((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final by pH = new by() {

        public void a(gv gv1, Map map)
        {
            String s = (String)map.get("tx");
            String s1 = (String)map.get("ty");
            map = (String)map.get("td");
            int i;
            int j;
            int l;
            try
            {
                i = Integer.parseInt(s);
                j = Integer.parseInt(s1);
                l = Integer.parseInt(map);
                gv1 = gv1.dw();
            }
            // Misplaced declaration of an exception variable
            catch (gv gv1)
            {
                gs.W("Could not parse touch parameters from gmsg.");
                return;
            }
            if (gv1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            gv1.z().a(i, j, l);
        }

    };
    public static final by pI = new ce();

}
