// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.vvm.a;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.facebook.common.w.n;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.vvm.a:
//            b

public class a
    implements Serializable
{

    private static final String b[] = {
        "d", "f", "v", "m", "s", "S", "p", "P", "t"
    };
    private String a;
    private String c;
    private int d;
    private String e;
    private int f;
    private boolean g;
    private String h;
    private String i;
    private int j;
    private b k;
    private String l;
    private String m;

    private a(String s)
    {
        d = -1;
        f = -1;
        j = -1;
        a = s;
    }

    public static a a(String s)
    {
        a a1 = new a(s);
        Uri uri = Uri.parse((new StringBuilder()).append("sms://").append(s).toString());
        a1.c = uri.getHost();
        a1.d = uri.getPort();
        if (a1.c == null || a1.d < 0)
        {
            Log.e("ApplicationDirectedString", (new StringBuilder()).append("Invalid server info (message: ").append(s).append(").").toString());
            return null;
        }
        s = b;
        int j1 = s.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s1 = s[i1];
            String s2 = uri.getQueryParameter(s1);
            if (s2 != null && !a1.a(s1, s2))
            {
                Log.e("ApplicationDirectedString", (new StringBuilder()).append("Invalid key-value pair (key: ").append(s1).append(", value: ").append(s2).append(").").toString());
                return null;
            }
        }

        a1.a();
        return a1;
    }

    private void a()
    {
        if (!n.a(l))
        {
            a = Pattern.compile(l).matcher(a).replaceAll("XXXXXXXXX");
            if (i != null)
            {
                l = b(l, i);
            }
        }
    }

    private boolean a(String s, String s1)
    {
        if (s.compareTo("d") != 0) goto _L2; else goto _L1
_L1:
        s = s1;
        if (!s1.contains(":"))
        {
            s = (new StringBuilder()).append(c).append(":").append(s1).toString();
        }
        s1 = Uri.parse((new StringBuilder()).append("smtp://").append(s).toString());
        e = s1.getHost();
        f = s1.getPort();
        if (e == null || f < 0)
        {
            Log.e("ApplicationDirectedString", (new StringBuilder()).append("Invalid SMTP server info (").append(s).append(").").toString());
            return false;
        }
          goto _L3
_L2:
        if (s.compareTo("f") != 0) goto _L5; else goto _L4
_L4:
        if (s1.compareTo("0") == 0)
        {
            g = false;
        } else
        {
            g = true;
        }
_L3:
        return true;
_L5:
        if (s.compareTo("v") == 0)
        {
            h = s1;
        } else
        if (s.compareTo("m") == 0)
        {
            i = s1;
        } else
        if (s.compareTo("s") == 0)
        {
            j = Integer.parseInt(s1);
        } else
        if (s.compareTo("S") == 0)
        {
            k = com.facebook.vvm.a.b.parse(s1);
            if (k == null)
            {
                return false;
            }
        } else
        if (s.compareTo("P") == 0)
        {
            l = s1;
        } else
        if (s.compareTo("p") == 0)
        {
            if (l == null)
            {
                l = s1;
            }
        } else
        if (s.compareTo("t") == 0)
        {
            m = s1;
        } else
        {
            Log.w("ApplicationDirectedString", (new StringBuilder()).append("Uknown key \"").append(s).append("\".").toString());
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    private static String b(String s, String s1)
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        for (int i1 = 0; i1 < Math.min("luckytechnologycompany".length(), s1.length()); i1++)
        {
            char c2 = s1.charAt(i1);
            int k1 = c2;
            if (c2 != "luckytechnologycompany".charAt(i1))
            {
                k1 = (c2 ^ "luckytechnologycompany".charAt(i1) | 0x60) & 0x6f;
            }
            stringbuilder.append((char)k1);
        }

        s1 = stringbuilder.toString();
        s = new String(Base64.decode(s, 0));
        stringbuilder = new StringBuilder();
        for (int j1 = ((flag) ? 1 : 0); j1 < Math.min(s.length(), s1.length()); j1++)
        {
            char c1 = s.charAt(j1);
            int l1 = c1;
            if (c1 != s1.charAt(j1))
            {
                l1 = c1 ^ s1.charAt(j1);
            }
            stringbuilder.append((char)l1);
        }

        return stringbuilder.toString();
    }

    public String toString()
    {
        return a;
    }

}
