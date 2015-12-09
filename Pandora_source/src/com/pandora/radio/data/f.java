// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.pandora.radio.util.b;
import com.pandora.radio.util.i;
import com.pandora.radio.util.l;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.radio.data:
//            r

public class f
{
    public static class a extends b
    {

        private static String a;

        public static String a()
        {
            if (a == null)
            {
                return Build.DEVICE;
            } else
            {
                return a;
            }
        }
    }


    private static final String a[] = {
        "sapphire", "dream", "SPH-M900", "hero", "heroc", "morrison", "motus", "sholes", "magic", "umts_sholes", 
        "g7a", "desirec"
    };
    private boolean b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Hashtable g;
    private String h;
    private String i;
    private Map j;
    private String k;
    private c l;
    private String m;
    private boolean n;

    public f(c c1, String s, boolean flag, r r1)
    {
        String s2;
        b = false;
        l = c1;
        n = false;
        s2 = c1.x().b("DEVICE_ID");
        if (r1.g() != null) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = s2;
        if (s2 == null)
        {
            s1 = UUID.randomUUID().toString();
        }
_L7:
        c1.x().a("DEVICE_ID", s1);
        if (r1.f() != null)
        {
            f = r1.f();
        }
        d = c1.x().b("CASTING_DEVICE_ID");
        c = s1;
        k = s;
        if (flag)
        {
            r1 = "tablet";
        } else
        {
            r1 = "android";
        }
        m = r1;
        r1 = new Hashtable();
        r1.put("model", com.pandora.radio.util.i.b(c()));
        r1.put("code", com.pandora.radio.util.i.b(c()));
        r1.put("systemVersion", com.pandora.radio.util.i.b(j()));
        r1.put("applicationVersion", s);
        r1.put("deviceCategory", m);
        c1 = ((TelephonyManager)com.pandora.radio.util.l.a(c1.s(), "phone")).getNetworkOperatorName();
        if (c1 == null) goto _L4; else goto _L3
_L3:
        r1.put("carrierName", c1);
_L8:
        h = c1;
        if (m() != null)
        {
            r1.put("accessoryID", m());
        }
        c1 = p();
        if (c1 != null)
        {
            try
            {
                r1.put("h", Integer.toString(((DisplayMetrics) (c1)).heightPixels));
                r1.put("w", Integer.toString(((DisplayMetrics) (c1)).widthPixels));
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                p.df.a.b("DeviceInfo", "Unable to get screen dimensions", c1);
            }
        }
        g = r1;
        return;
_L2:
        if (s2 == null) goto _L6; else goto _L5
_L5:
        s1 = s2;
        if (s2.equals(r1.g())) goto _L7; else goto _L6
_L6:
        s1 = r1.g();
        n = true;
          goto _L7
_L4:
        p.df.a.a("DeviceInfo", "carrierName is not available");
          goto _L8
        s;
_L9:
        p.df.a.b("DeviceInfo", "Unable to get carrier name", s);
          goto _L8
        s;
        c1 = null;
          goto _L9
    }

    public static String j()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    private String o()
    {
        String s = com.pandora.radio.data.a.a();
        String as[] = a;
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s1 = as[i1];
            if (s1.equals(s))
            {
                return s1;
            }
        }

        return (new StringBuilder()).append("android-").append(s).toString();
    }

    private DisplayMetrics p()
    {
        return l.s().getResources().getDisplayMetrics();
    }

    public void a(String s)
    {
        d = s;
        l.x().a("CASTING_DEVICE_ID", s);
    }

    public void a(Map map)
    {
        Map map1;
label0:
        {
            if (map != null)
            {
                map1 = map;
                if (!map.isEmpty())
                {
                    break label0;
                }
            }
            map1 = null;
        }
        j = map1;
        if (g != null)
        {
            if (map1 == null)
            {
                map = p.dn.b.b.values();
                int j1 = map.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    map1 = map[i1];
                    g.remove(map1.toString());
                }

            } else
            {
                g.putAll(map1);
            }
        }
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a()
    {
        return n;
    }

    public String b()
    {
        return k;
    }

    public void b(String s)
    {
label0:
        {
            i = s;
            if (g != null)
            {
                if (i != null)
                {
                    break label0;
                }
                g.remove("accessoryID");
            }
            return;
        }
        g.put("accessoryID", i);
    }

    public String c()
    {
        if (f == null)
        {
            f = o();
        }
        return f;
    }

    public String d()
    {
        if (e == null)
        {
            e = android.provider.Settings.Secure.getString(l.s().getContentResolver(), "android_id");
        }
        return e;
    }

    public String e()
    {
        return c;
    }

    public String f()
    {
        return d;
    }

    public Hashtable g()
    {
        return g;
    }

    public boolean h()
    {
        return b;
    }

    public String i()
    {
        return h;
    }

    public boolean k()
    {
        return "Kindle Fire".equalsIgnoreCase(Build.MODEL);
    }

    public boolean l()
    {
        return "D01E".equalsIgnoreCase(Build.DEVICE) || "Amazon".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public String m()
    {
        return i;
    }

    public Map n()
    {
        return j;
    }

}
