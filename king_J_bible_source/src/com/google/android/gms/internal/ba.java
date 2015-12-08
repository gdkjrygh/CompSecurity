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
//            be, bb, dz, dw, 
//            m, l, du, dx, 
//            cc, h

public final class ba
{

    public static final bb mG = new bb() {

        public void b(dz dz, Map map)
        {
        }

    };
    public static final bb mH = new bb() {

        public void b(dz dz1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                dw.z("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = dz1.getContext().getPackageManager();
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
            dz1.a("openableURLs", hashmap);
        }

    };
    public static final bb mI = new bb() {

        public void b(dz dz1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                dw.z("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = dz1.bJ();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            if (!((l) (obj)).a(map))
            {
                break MISSING_BLOCK_LABEL_59;
            }
            obj = ((l) (obj)).a(map, dz1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new du(dz1.getContext(), dz1.bK().rq, map)).start();
            return;
            m m1;
            m1;
            dw.z((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final bb mJ = new bb() {

        public void b(dz dz1, Map map)
        {
            dz1 = dz1.bH();
            if (dz1 == null)
            {
                dw.z("A GMSG tried to close something that wasn't an overlay.");
                return;
            } else
            {
                dz1.close();
                return;
            }
        }

    };
    public static final bb mK = new bb() {

        public void b(dz dz1, Map map)
        {
            dz1 = dz1.bH();
            if (dz1 == null)
            {
                dw.z("A GMSG tried to use a custom close button on something that wasn't an overlay.");
                return;
            } else
            {
                dz1.i("1".equals(map.get("custom_close")));
                return;
            }
        }

    };
    public static final bb mL = new bb() {

        public void b(dz dz1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                dw.z("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new du(dz1.getContext(), dz1.bK().rq, map)).start();
                return;
            }
        }

    };
    public static final bb mM = new bb() {

        public void b(dz dz, Map map)
        {
            dw.x((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final bb mN = new bb() {

        public void b(dz dz1, Map map)
        {
            String s = (String)map.get("tx");
            String s1 = (String)map.get("ty");
            map = (String)map.get("td");
            int i;
            int j;
            int k;
            try
            {
                i = Integer.parseInt(s);
                j = Integer.parseInt(s1);
                k = Integer.parseInt(map);
                dz1 = dz1.bJ();
            }
            // Misplaced declaration of an exception variable
            catch (dz dz1)
            {
                dw.z("Could not parse touch parameters from gmsg.");
                return;
            }
            if (dz1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            dz1.y().a(i, j, k);
        }

    };
    public static final bb mO = new be();

}
