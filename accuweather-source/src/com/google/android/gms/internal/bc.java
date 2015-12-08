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
//            bi, bd, ey, ev, 
//            m, l, et, ew, 
//            cg, h

public final class bc
{

    public static final bd mR = new bd() {

        public void b(ey ey, Map map)
        {
        }

    };
    public static final bd mS = new bd() {

        public void b(ey ey1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                ev.D("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = ey1.getContext().getPackageManager();
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
            ey1.a("openableURLs", hashmap);
        }

    };
    public static final bd mT = new bd() {

        public void b(ey ey1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                ev.D("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = ey1.bX();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            if (!((l) (obj)).a(map))
            {
                break MISSING_BLOCK_LABEL_59;
            }
            obj = ((l) (obj)).a(map, ey1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new et(ey1.getContext(), ey1.bY().st, map)).start();
            return;
            m m1;
            m1;
            ev.D((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final bd mU = new bd() {

        public void b(ey ey1, Map map)
        {
            ey1 = ey1.bV();
            if (ey1 == null)
            {
                ev.D("A GMSG tried to close something that wasn't an overlay.");
                return;
            } else
            {
                ey1.close();
                return;
            }
        }

    };
    public static final bd mV = new bd() {

        public void b(ey ey1, Map map)
        {
            ey1 = ey1.bV();
            if (ey1 == null)
            {
                ev.D("A GMSG tried to use a custom close button on something that wasn't an overlay.");
                return;
            } else
            {
                ey1.j("1".equals(map.get("custom_close")));
                return;
            }
        }

    };
    public static final bd mW = new bd() {

        public void b(ey ey1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                ev.D("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new et(ey1.getContext(), ey1.bY().st, map)).start();
                return;
            }
        }

    };
    public static final bd mX = new bd() {

        public void b(ey ey, Map map)
        {
            ev.B((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final bd mY = new bd() {

        public void b(ey ey1, Map map)
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
                ey1 = ey1.bX();
            }
            // Misplaced declaration of an exception variable
            catch (ey ey1)
            {
                ev.D("Could not parse touch parameters from gmsg.");
                return;
            }
            if (ey1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            ey1.y().a(i, j, k);
        }

    };
    public static final bd mZ = new bi();

}
