// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            aj, ak, ai, cn, 
//            cq, i, h, cl, 
//            co, bf, d

public final class ah
{

    public static final ai eA = new ai() {

        public void a(cq cq1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                cn.q("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = cq1.ax();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            if (!((h) (obj)).a(map))
            {
                break MISSING_BLOCK_LABEL_59;
            }
            obj = ((h) (obj)).a(map, cq1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new cl(cq1.getContext(), cq1.ay().hP, map)).start();
            return;
            i j;
            j;
            cn.q((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final ai eB = new ai() {

        public void a(cq cq1, Map map)
        {
            cq1 = cq1.au();
            if (cq1 == null)
            {
                cn.q("A GMSG tried to close something that wasn't an overlay.");
                return;
            } else
            {
                cq1.close();
                return;
            }
        }

    };
    public static final ai eC = new ai() {

        public void a(cq cq1, Map map)
        {
            cq1 = cq1.au();
            if (cq1 == null)
            {
                cn.q("A GMSG tried to use a custom close button on something that wasn't an overlay.");
                return;
            } else
            {
                cq1.d("1".equals(map.get("custom_close")));
                return;
            }
        }

    };
    public static final ai eD = new ai() {

        public void a(cq cq1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                cn.q("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new cl(cq1.getContext(), cq1.ay().hP, map)).start();
                return;
            }
        }

    };
    public static final ai eE = new ai() {

        public void a(cq cq, Map map)
        {
            cn.o((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final ai eF = new aj();
    public static final ai eG = new ai() {

        public void a(cq cq1, Map map)
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
                cq1 = cq1.ax();
            }
            // Misplaced declaration of an exception variable
            catch (cq cq1)
            {
                cn.q("Could not parse touch parameters from gmsg.");
                return;
            }
            if (cq1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            cq1.g().a(i, j, k);
        }

    };
    public static final ai eH = new ak();
    public static final ai ez = new ai() {

        public void a(cq cq1, Map map)
        {
            map = (String)map.get("urls");
            if (map == null)
            {
                cn.q("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = cq1.getContext().getPackageManager();
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
            cq1.a("openableURLs", hashmap);
        }

    };

}
