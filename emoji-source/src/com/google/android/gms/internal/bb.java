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
//            bh, bc, ex, eu, 
//            l, k, es, ev, 
//            cf, g

public final class bb
{

    public static final bc mT = new bc() {

        public void b(ex ex, Map map)
        {
        }

    };
    public static final bc mU = new bc() {

        public void b(ex ex1, Map map)
        {
            map = (String)map.get("urls");
            if (TextUtils.isEmpty(map))
            {
                eu.D("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String as[] = map.split(",");
            HashMap hashmap = new HashMap();
            PackageManager packagemanager = ex1.getContext().getPackageManager();
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
            ex1.a("openableURLs", hashmap);
        }

    };
    public static final bc mV = new bc() {

        public void b(ex ex1, Map map)
        {
            String s;
            s = (String)map.get("u");
            if (s == null)
            {
                eu.D("URL missing from click GMSG.");
                return;
            }
            map = Uri.parse(s);
            Object obj = ex1.cc();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            if (!((k) (obj)).b(map))
            {
                break MISSING_BLOCK_LABEL_59;
            }
            obj = ((k) (obj)).a(map, ex1.getContext());
            map = ((Map) (obj));
_L2:
            map = map.toString();
            (new es(ex1.getContext(), ex1.cd().sw, map)).start();
            return;
            l l1;
            l1;
            eu.D((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
            if (true) goto _L2; else goto _L1
_L1:
        }

    };
    public static final bc mW = new bc() {

        public void b(ex ex1, Map map)
        {
            ex1 = ex1.ca();
            if (ex1 == null)
            {
                eu.D("A GMSG tried to close something that wasn't an overlay.");
                return;
            } else
            {
                ex1.close();
                return;
            }
        }

    };
    public static final bc mX = new bc() {

        public void b(ex ex1, Map map)
        {
            ex1 = ex1.ca();
            if (ex1 == null)
            {
                eu.D("A GMSG tried to use a custom close button on something that wasn't an overlay.");
                return;
            } else
            {
                ex1.j("1".equals(map.get("custom_close")));
                return;
            }
        }

    };
    public static final bc mY = new bc() {

        public void b(ex ex1, Map map)
        {
            map = (String)map.get("u");
            if (map == null)
            {
                eu.D("URL missing from httpTrack GMSG.");
                return;
            } else
            {
                (new es(ex1.getContext(), ex1.cd().sw, map)).start();
                return;
            }
        }

    };
    public static final bc mZ = new bc() {

        public void b(ex ex, Map map)
        {
            eu.B((new StringBuilder()).append("Received log message: ").append((String)map.get("string")).toString());
        }

    };
    public static final bc na = new bc() {

        public void b(ex ex1, Map map)
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
                ex1 = ex1.cc();
            }
            // Misplaced declaration of an exception variable
            catch (ex ex1)
            {
                eu.D("Could not parse touch parameters from gmsg.");
                return;
            }
            if (ex1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            ex1.z().a(i, j, l);
        }

    };
    public static final bc nb = new bh();

}
