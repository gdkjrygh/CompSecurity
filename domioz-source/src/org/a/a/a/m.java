// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package org.a.a.a:
//            a

public final class m
{

    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final float R;
    public static final int S;
    public static final boolean T;
    public static final boolean U;
    public static final boolean V;
    public static final boolean W;
    public static final boolean X;
    public static final boolean Y;
    public static final boolean Z;
    public static final String a;
    public static final boolean aa;
    public static final boolean ab;
    public static final boolean ac;
    public static final boolean ad;
    public static final boolean ae;
    public static final boolean af;
    public static final boolean ag;
    public static final boolean ah;
    public static final boolean ai;
    public static final boolean aj;
    public static final boolean ak;
    public static final boolean al;
    public static final boolean am;
    public static final boolean an;
    public static final boolean ao;
    public static final boolean ap;
    public static final boolean aq;
    public static final boolean ar;
    public static final boolean as;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;

    private static float a(int ai1[])
    {
        int i1 = 1;
        if (ai1 == null || ai1.length == 0)
        {
            return 0.0F;
        }
        if (ai1.length == 1)
        {
            return (float)ai1[0];
        }
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(ai1[0]);
        stringbuffer.append('.');
        for (; i1 < ai1.length; i1++)
        {
            stringbuffer.append(ai1[i1]);
        }

        float f1;
        try
        {
            f1 = Float.parseFloat(stringbuffer.toString());
        }
        // Misplaced declaration of an exception variable
        catch (int ai1[])
        {
            return 0.0F;
        }
        return f1;
    }

    private static boolean a(String s1)
    {
        String s2 = Q;
        if (s2 == null)
        {
            return false;
        } else
        {
            return s2.startsWith(s1);
        }
    }

    private static boolean a(String s1, String s2)
    {
        String s3 = H;
        for (String s4 = I; s3 == null || s4 == null || !s3.startsWith(s1) || !s4.startsWith(s2);)
        {
            return false;
        }

        return true;
    }

    private static boolean b(String s1)
    {
        String s2 = H;
        if (s2 == null)
        {
            return false;
        } else
        {
            return s2.startsWith(s1);
        }
    }

    private static String c(String s1)
    {
        String s2;
        try
        {
            s2 = System.getProperty(s1);
        }
        catch (SecurityException securityexception)
        {
            System.err.println("Caught a SecurityException reading the system property '" + s1 + "'; the SystemUtils property value will default to null.");
            return null;
        }
        return s2;
    }

    private static int[] d(String s1)
    {
        int ai1[];
        int k1;
        int l1;
        int i2;
        if (s1 == null)
        {
            return a.f;
        }
        String s2;
        int i1;
        if (s1 == null)
        {
            s1 = null;
        } else
        {
label0:
            {
                i2 = s1.length();
                if (i2 != 0)
                {
                    break label0;
                }
                s1 = a.c;
            }
        }
_L3:
        ai1 = new int[Math.min(3, s1.length)];
        i1 = 0;
        k1 = 0;
_L2:
        if (i1 >= s1.length || k1 >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s1[i1];
        l1 = k1;
        if (s2.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        ai1[k1] = Integer.parseInt(s2);
        l1 = k1 + 1;
_L4:
        i1++;
        k1 = l1;
        if (true) goto _L2; else goto _L1
        int j1;
        ai1 = new ArrayList();
        if ("._- ".length() != 1)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        char c1 = "._- ".charAt(0);
        k1 = 0;
        l1 = 0;
        j1 = 0;
        int j2 = 1;
        while (j1 < i2) 
        {
            if (s1.charAt(j1) == c1)
            {
                Exception exception;
                if (k1 != 0)
                {
                    if (j2 == -1)
                    {
                        j1 = i2;
                    }
                    ai1.add(s1.substring(l1, j1));
                    j2++;
                    l1 = 0;
                    k1 = j1;
                    j1 = l1;
                } else
                {
                    l1 = j1;
                    j1 = k1;
                    k1 = l1;
                }
                l1 = k1 + 1;
                k1 = j1;
                j1 = l1;
            } else
            {
                j1++;
                k1 = 1;
            }
        }
        if (k1 != 0)
        {
            ai1.add(s1.substring(l1, j1));
        }
        s1 = (String[])ai1.toArray(new String[ai1.size()]);
          goto _L3
        k1 = 0;
        l1 = 0;
        j1 = 0;
        k2 = 1;
        while (j1 < i2) 
        {
            if ("._- ".indexOf(s1.charAt(j1)) >= 0)
            {
                if (k1 != 0)
                {
                    if (k2 == -1)
                    {
                        j1 = i2;
                    }
                    ai1.add(s1.substring(l1, j1));
                    k2++;
                    l1 = 0;
                    k1 = j1;
                    j1 = l1;
                } else
                {
                    l1 = j1;
                    j1 = k1;
                    k1 = l1;
                }
                l1 = k1 + 1;
                k1 = j1;
                j1 = l1;
            } else
            {
                j1++;
                k1 = 1;
            }
        }
        break MISSING_BLOCK_LABEL_220;
_L1:
        if (ai1.length > k1)
        {
            s1 = new int[k1];
            System.arraycopy(ai1, 0, s1, 0, k1);
            return s1;
        } else
        {
            return ai1;
        }
          goto _L3
        exception;
        l1 = k1;
          goto _L4
    }

    static 
    {
        Object obj;
        int i1;
        boolean flag1 = false;
        a = c("awt.toolkit");
        b = c("file.encoding");
        c = c("file.separator");
        d = c("java.awt.fonts");
        e = c("java.awt.graphicsenv");
        f = c("java.awt.headless");
        g = c("java.awt.printerjob");
        h = c("java.class.path");
        i = c("java.class.version");
        j = c("java.compiler");
        k = c("java.endorsed.dirs");
        l = c("java.ext.dirs");
        m = c("java.home");
        n = c("java.io.tmpdir");
        o = c("java.library.path");
        p = c("java.runtime.name");
        q = c("java.runtime.version");
        r = c("java.specification.name");
        s = c("java.specification.vendor");
        t = c("java.specification.version");
        u = c("java.util.prefs.PreferencesFactory");
        v = c("java.vendor");
        w = c("java.vendor.url");
        x = c("java.version");
        y = c("java.vm.info");
        z = c("java.vm.name");
        A = c("java.vm.specification.name");
        B = c("java.vm.specification.vendor");
        C = c("java.vm.specification.version");
        D = c("java.vm.vendor");
        E = c("java.vm.version");
        F = c("line.separator");
        G = c("os.arch");
        H = c("os.name");
        I = c("os.version");
        J = c("path.separator");
        char c1;
        if (c("user.country") == null)
        {
            obj = c("user.region");
        } else
        {
            obj = c("user.country");
        }
        K = ((String) (obj));
        L = c("user.dir");
        M = c("user.home");
        N = c("user.language");
        O = c("user.name");
        P = c("user.timezone");
        if (x == null)
        {
            break MISSING_BLOCK_LABEL_762;
        }
        i1 = 0;
_L3:
        if (i1 >= x.length())
        {
            break MISSING_BLOCK_LABEL_762;
        }
        c1 = x.charAt(i1);
        if (c1 < '0' || c1 > '9') goto _L2; else goto _L1
_L1:
        obj = x.substring(i1);
_L4:
label0:
        {
            Q = ((String) (obj));
            R = a(d(x));
            obj = d(x);
            int k1;
            boolean flag;
            if (obj == null)
            {
                k1 = 0;
            } else
            {
                int l1 = obj.length;
                int j1;
                if (l1 > 0)
                {
                    k1 = obj[0] * 100;
                } else
                {
                    k1 = 0;
                }
                j1 = k1;
                if (l1 >= 2)
                {
                    j1 = k1 + obj[1] * 10;
                }
                k1 = j1;
                if (l1 >= 3)
                {
                    k1 = j1 + obj[2];
                }
            }
            S = k1;
            T = a("1.1");
            U = a("1.2");
            V = a("1.3");
            W = a("1.4");
            X = a("1.5");
            Y = a("1.6");
            Z = a("1.7");
            aa = b("AIX");
            ab = b("HP-UX");
            ac = b("Irix");
            if (b("Linux") || b("LINUX"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ad = flag;
            ae = b("Mac");
            af = b("Mac OS X");
            ag = b("OS/2");
            ah = b("Solaris");
            ai = b("SunOS");
            if (!aa && !ab && !ac && !ad && !af && !ah)
            {
                flag = flag1;
                if (!ai)
                {
                    break label0;
                }
            }
            flag = true;
        }
        aj = flag;
        ak = b("Windows");
        al = a("Windows", "5.0");
        am = a("Windows 9", "4.0");
        an = a("Windows 9", "4.1");
        ao = a("Windows", "4.9");
        ap = b("Windows NT");
        aq = a("Windows", "5.1");
        ar = a("Windows", "6.0");
        as = a("Windows", "6.1");
        return;
_L2:
        i1++;
          goto _L3
        obj = null;
          goto _L4
    }
}
