// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c;

import java.io.InputStream;
import java.io.PrintStream;

// Referenced classes of package com.a.c:
//            d

public final class b
{

    private static String i = "CPUInfo";
    private static b j = null;
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    boolean g;
    String h;

    public b()
    {
    }

    private static int a(String s)
    {
        if (s == null || s.length() <= 0)
        {
            return -1;
        }
        if (s.startsWith("0x"))
        {
            return Integer.parseInt(s.substring(2), 16);
        } else
        {
            return Integer.parseInt(s);
        }
    }

    private static boolean a(char c1)
    {
        return c1 == ' ' || c1 == '\r' || c1 == '\n' || c1 == '\t';
    }

    public static int[] a()
    {
        int ai[] = new int[2];
        if (b().f == 8195 || b().f == 8196)
        {
            ai[0] = 800;
            ai[1] = 480;
            return ai;
        }
        if (b().f == 0x20005 || b().f == 0x20006)
        {
            ai[0] = 854;
            ai[1] = 480;
            return ai;
        }
        if (b().f == 8199 || b().f == 8200 || b().f == 8202 || b().f == 8201)
        {
            ai[0] = 640;
            ai[1] = 480;
            return ai;
        } else
        {
            return null;
        }
    }

    private static b b()
    {
        char c1 = '\u2000';
        if (j != null) goto _L2; else goto _L1
_L1:
        b b1;
        b1 = new b();
        j = b1;
        Object obj = c();
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            com.a.c.d.a(i, "Invalid param for parse cpu info");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.a.c.d.a(i, "CPU Info Parse failed");
        }
_L2:
        return j;
_L4:
        obj = ((String) (obj)).toLowerCase().split("\\n");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (obj.length != 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        com.a.c.d.a(i, "Invalid param for parse cpu info");
          goto _L2
        int k = 0;
_L52:
        if (k < obj.length) goto _L6; else goto _L5
_L5:
        if (81 != b1.a) goto _L8; else goto _L7
_L7:
        k = 8192;
_L32:
        if (k != 8192) goto _L10; else goto _L9
_L9:
        obj = null;
        if (b1.h != null) goto _L12; else goto _L11
_L11:
        k = c1;
_L10:
        b1.f = k;
          goto _L2
_L6:
        if (obj[k] == null) goto _L14; else goto _L13
_L13:
        if (obj[k].length() <= 0) goto _L14; else goto _L15
_L15:
        if (!obj[k].contains("features")) goto _L17; else goto _L16
_L16:
        if (!obj[k].contains("neon")) goto _L19; else goto _L18
_L18:
        b1.g = true;
          goto _L14
_L19:
        b1.g = false;
          goto _L14
_L17:
        if (!obj[k].contains("cpu implementer")) goto _L21; else goto _L20
_L20:
        b1.a = a(b(obj[k].substring(obj[k].indexOf(':') + 1)));
          goto _L14
_L21:
        if (!obj[k].contains("cpu architecture")) goto _L23; else goto _L22
_L22:
        b1.b = a(b(obj[k].substring(obj[k].indexOf(':') + 1)));
          goto _L14
_L23:
        if (!obj[k].contains("cpu variant")) goto _L25; else goto _L24
_L24:
        b1.c = a(b(obj[k].substring(obj[k].indexOf(':') + 1)));
          goto _L14
_L25:
        if (!obj[k].contains("cpu part")) goto _L27; else goto _L26
_L26:
        b1.d = a(b(obj[k].substring(obj[k].indexOf(':') + 1)));
          goto _L14
_L27:
        if (!obj[k].contains("cpu revision")) goto _L29; else goto _L28
_L28:
        b1.e = a(b(obj[k].substring(obj[k].indexOf(':') + 1)));
          goto _L14
_L29:
        if (!obj[k].contains("hardware")) goto _L31; else goto _L30
_L30:
        b1.h = b(obj[k].substring(obj[k].indexOf(':') + 1));
          goto _L14
_L31:
        if (!obj[k].contains("revision"))
        {
            obj[k].contains("serial");
        }
          goto _L14
_L8:
        if (65 != b1.a)
        {
            break MISSING_BLOCK_LABEL_501;
        }
        int l;
        if (b1.h != null && (b1.h.contains("msm") || b1.h.contains("qualcomm") || b1.h.contains("qual")))
        {
            k = 8192;
        } else
        {
            k = 4096;
        }
          goto _L32
        if (105 == b1.a)
        {
            k = 12288;
        } else
        {
            k = 0;
        }
          goto _L32
_L12:
        if (!b1.h.contains("msm")) goto _L34; else goto _L33
_L33:
        obj = "msm";
_L47:
        k = c1;
        if (obj == null) goto _L10; else goto _L35
_L35:
        obj = b(b1.h.substring(b1.h.indexOf(((String) (obj)))));
        k = 0;
_L53:
        if (k < ((String) (obj)).length()) goto _L37; else goto _L36
_L36:
        l = -1;
_L50:
        k = c1;
        if (l == -1) goto _L10; else goto _L38
_L38:
        obj = ((String) (obj)).substring(l);
        k = c1;
        if (obj == null) goto _L10; else goto _L39
_L39:
        k = c1;
        if (((String) (obj)).length() < 4) goto _L10; else goto _L40
_L40:
        if (((String) (obj)).charAt(0) != '7') goto _L42; else goto _L41
_L41:
        if (((String) (obj)).charAt(3) != '5') goto _L44; else goto _L43
_L43:
        k = 8199;
          goto _L10
_L34:
        if (!b1.h.contains("qualcomm")) goto _L46; else goto _L45
_L45:
        obj = "qualcomm";
          goto _L47
_L46:
        if (!b1.h.contains("qual")) goto _L47; else goto _L48
_L48:
        obj = "qual";
          goto _L47
_L37:
        if ('0' > ((String) (obj)).charAt(k))
        {
            break; /* Loop/switch isn't completed */
        }
        l = k;
        if ('9' >= ((String) (obj)).charAt(k)) goto _L50; else goto _L49
_L44:
        k = c1;
        if (((String) (obj)).charAt(3) != '7') goto _L10; else goto _L51
_L51:
        if (((String) (obj)).length() > 4 && ((String) (obj)).charAt(4) == 'a')
        {
            k = 0x20005;
        } else
        {
            k = 8195;
        }
          goto _L10
_L42:
        ((String) (obj)).charAt(0);
        k = c1;
          goto _L10
_L14:
        k++;
          goto _L52
_L49:
        k++;
          goto _L53
    }

    private static String b(String s)
    {
        int k = 0;
        if (s != null && s.length() > 0) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        s1 = s;
        if (s.length() == 1) goto _L4; else goto _L3
_L3:
        int l;
        int i1;
        i1 = s.length();
        l = 0;
        break MISSING_BLOCK_LABEL_35;
        while (k < s.length() && a(s.charAt(k))) 
        {
            l = k + 1;
            k++;
        }
        k = s.length() - 1;
        break MISSING_BLOCK_LABEL_50;
        while (k >= 0 && a(s.charAt(k))) 
        {
            i1 = k;
            k--;
        }
        if (l <= i1)
        {
            return null;
        } else
        {
            return s.substring(l, i1);
        }
    }

    private static String c()
    {
        InputStream inputstream;
        byte abyte0[];
        inputstream = (new ProcessBuilder(new String[] {
            "/system/bin/cat", "/proc/cpuinfo"
        })).start().getInputStream();
        abyte0 = new byte[1024];
        String s = null;
_L2:
        if (inputstream.read(abyte0) != -1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        inputstream.close();
        return s;
        String s1;
        System.out.println(new String(abyte0));
        s1 = (new StringBuilder(String.valueOf(s))).append(new String(abyte0)).toString();
        s = s1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        s = null;
_L4:
        exception.printStackTrace();
        return s;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
