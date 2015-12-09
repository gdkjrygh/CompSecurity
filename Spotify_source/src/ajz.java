// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ajz
{

    private static StringBuilder a;
    private static int b = -1;
    private static int c = -1;
    private static final String d[] = {
        "c12", "c1", "ns_ap_an", "ns_ap_pn", "ns_ap_device", "ns_ak"
    };
    private static final String e[] = {
        "c12", "c1", "ns_ap_an", "ns_ap_pn", "ns_ap_device", "ns_ts", "ns_ak"
    };

    public static String a(String s, String s1)
    {
        ajz;
        JVM INSTR monitorenter ;
        b(s, s1);
        if (b == -1 || c <= b) goto _L2; else goto _L1
_L1:
        s = s.substring(b, c);
_L4:
        ajz;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public static String a(String as[], String s)
    {
        ajz;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
        a(stringbuilder, as[0], s);
        a(as, stringbuilder);
        as = ajy.a(a.toString()).toLowerCase();
        int i = stringbuilder.indexOf("md5=\"");
        stringbuilder.insert("md5=\"".length() + i, as);
        stringbuilder.append("</events>");
        as = stringbuilder.toString();
        ajz;
        JVM INSTR monitorexit ;
        return as;
        as;
        throw as;
    }

    private static void a(String s, StringBuilder stringbuilder)
    {
        long l1;
        l1 = 0L;
        b(s, "ns_ts");
        if (b == -1 || c <= b) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        stringbuilder.append("<event t=\"").append(s, b, c).append("\">");
        j = 0;
        i = 0;
_L15:
        if (j >= s.length()) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        long l3;
        k = s.indexOf('&', j);
        if (k == -1)
        {
            k = s.length();
        }
        l = i;
        l3 = l1;
        if (k <= j) goto _L6; else goto _L5
_L5:
        l = i;
        l3 = l1;
        if (s.indexOf('=', j) <= j) goto _L6; else goto _L7
_L7:
        boolean flag;
        boolean flag1;
        long l2;
        flag1 = true;
        l2 = l1;
        flag = flag1;
        if (l1 == 127L) goto _L9; else goto _L8
_L8:
        l = 0;
_L13:
        l2 = l1;
        flag = flag1;
        if (l >= 7) goto _L9; else goto _L10
_L10:
        l2 = 1 << l;
        if ((l1 & l2) != 0L || !e[l].regionMatches(0, s, j, e[l].length())) goto _L12; else goto _L11
_L11:
        flag = false;
        l2 = l1 | l2;
_L9:
        l = i;
        l3 = l2;
        if (flag)
        {
            if (i > 0)
            {
                a.append('&');
                stringbuilder.append('&');
            }
            a.append(s, j, k);
            stringbuilder.append(s, j, k);
            l = i + 1;
            l3 = l2;
        }
_L6:
        j = k + 1;
        i = l;
        l1 = l3;
        continue; /* Loop/switch isn't completed */
_L12:
        l++;
        if (true) goto _L13; else goto _L4
_L4:
        stringbuilder.append("</event>");
_L2:
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private static void a(StringBuilder stringbuilder, String s, String s1)
    {
        long l = System.currentTimeMillis();
        stringbuilder.append("<events t=\"").append(String.valueOf(l)).append("\" ");
        for (int i = 0; i < 6; i++)
        {
            String s2 = d[i];
            b(s, s2);
            if (b != -1 && c > b)
            {
                stringbuilder.append(s2).append("=\"").append(s, b, c).append("\" ");
            }
        }

        stringbuilder.append("dropped=\"").append(s1).append("\" md5=\"\">");
    }

    private static void a(String as[], StringBuilder stringbuilder)
    {
        a = new StringBuilder();
        for (int i = 0; i < as.length; i++)
        {
            if (ajy.f(as[i]))
            {
                a(as[i], stringbuilder);
            }
        }

    }

    private static void b(String s, String s1)
    {
        int j;
        c = -1;
        b = -1;
        j = 0;
_L8:
        int i;
        j = s.indexOf(s1, j);
        i = j;
        if (j < 0) goto _L2; else goto _L1
_L1:
        i = s1.length() + j;
        if (j != 0 && s.charAt(j - 1) != '&' || i >= s.length() || s.charAt(i) != '=') goto _L4; else goto _L3
_L3:
        b = i + 1;
        i = s.indexOf('&', b);
        c = i;
        if (i == -1)
        {
            c = s.length();
        }
_L6:
        return;
_L4:
        i++;
_L2:
        if (i < 0) goto _L6; else goto _L5
_L5:
        j = i;
        if (i >= s.length())
        {
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

}
