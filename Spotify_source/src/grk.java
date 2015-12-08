// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class grk
{

    String a;
    String b;
    String c;
    String d;
    int e;
    final List f = new ArrayList();
    List g;
    String h;

    public grk()
    {
        b = "";
        c = "";
        e = -1;
        f.add("");
    }

    private static String a(String s)
    {
        boolean flag;
        try
        {
            s = IDN.toASCII(s).toLowerCase(Locale.US);
            flag = s.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (flag)
        {
            return null;
        } else
        {
            return s;
        }
    }

    static String a(String s, int i, int j)
    {
        boolean flag;
        flag = false;
        s = grj.a(s, i, j);
        if (!s.startsWith("[") || !s.endsWith("]")) goto _L2; else goto _L1
_L1:
        s = a(s, s.length() - 1);
        if (s != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        s = s.getAddress();
        if (s.length == 16)
        {
            j = 0;
            int k = -1;
            for (i = 0; i < s.length;)
            {
                int l;
                for (l = i; l < 16 && s[l] == 0 && s[l + 1] == 0; l += 2) { }
                int k1 = l - i;
                int j1 = j;
                if (k1 > j)
                {
                    j1 = k1;
                    k = i;
                }
                i = l + 2;
                j = j1;
            }

            hch hch1 = new hch();
            i = ((flag) ? 1 : 0);
            do
            {
                if (i >= s.length)
                {
                    break;
                }
                if (i == k)
                {
                    hch1.b(58);
                    int i1 = i + j;
                    i = i1;
                    if (i1 == 16)
                    {
                        hch1.b(58);
                        i = i1;
                    }
                } else
                {
                    if (i > 0)
                    {
                        hch1.b(58);
                    }
                    hch1.h((s[i] & 0xff) << 8 | s[i + 1] & 0xff);
                    i += 2;
                }
            } while (true);
            return hch1.p();
        } else
        {
            throw new AssertionError();
        }
_L2:
        s = a(s);
        if (s != null)
        {
            i = s.length();
            if (grj.b(s, 0, i, "\000\t\n\r #%/:?@[\\]") == i)
            {
                return s;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static InetAddress a(String s, int i)
    {
        byte abyte0[];
        int k;
        int l;
        int i1;
        int j1;
        abyte0 = new byte[16];
        k = 0;
        l = -1;
        i1 = -1;
        j1 = 1;
_L12:
        int j;
        int k1;
        k1 = l;
        j = k;
        if (j1 >= i) goto _L2; else goto _L1
_L1:
        if (k == 16)
        {
            return null;
        }
        if (j1 + 2 > i || !s.regionMatches(j1, "::", 0, 2)) goto _L4; else goto _L3
_L3:
        if (l != -1)
        {
            return null;
        }
        j = j1 + 2;
        k += 2;
        if (j != i)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        j = k;
        k1 = k;
          goto _L2
_L4:
        int l1;
        j = j1;
        k1 = l;
        l1 = k;
        if (k == 0) goto _L6; else goto _L5
_L5:
        if (!s.regionMatches(j1, ":", 0, 1)) goto _L8; else goto _L7
_L7:
        j = j1 + 1;
        l1 = k;
        k1 = l;
          goto _L6
_L8:
        if (!s.regionMatches(j1, ".", 0, 1))
        {
            break MISSING_BLOCK_LABEL_413;
        }
        l1 = k - 2;
        j1 = l1;
_L11:
        if (i1 >= i)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        if (j1 == 16)
        {
            i = 0;
        } else
        {
label0:
            {
                j = i1;
                if (j1 == l1)
                {
                    break MISSING_BLOCK_LABEL_269;
                }
                if (s.charAt(i1) == '.')
                {
                    break label0;
                }
                i = 0;
            }
        }
_L9:
        if (i == 0)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_401;
        j = i1 + 1;
        k1 = 0;
        i1 = j;
_L10:
        if (i1 >= i)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        char c1 = s.charAt(i1);
        if (c1 < '0' || c1 > '9')
        {
            break MISSING_BLOCK_LABEL_354;
        }
        if (k1 == 0 && j != i1)
        {
            i = 0;
        } else
        {
label1:
            {
                k1 = (k1 * 10 + c1) - 48;
                if (k1 <= 255)
                {
                    break label1;
                }
                i = 0;
            }
        }
          goto _L9
        i1++;
          goto _L10
label2:
        {
            if (i1 - j != 0)
            {
                break label2;
            }
            i = 0;
        }
          goto _L9
        abyte0[j1] = (byte)k1;
        j1++;
          goto _L11
        if (j1 != l1 + 4)
        {
            i = 0;
        } else
        {
            i = 1;
        }
          goto _L9
        j = k + 2;
        k1 = l;
          goto _L2
        return null;
_L6:
        l = 0;
        k = j;
        do
        {
            if (k >= i)
            {
                break;
            }
            i1 = grj.a(s.charAt(k));
            if (i1 == -1)
            {
                break;
            }
            l = (l << 4) + i1;
            k++;
        } while (true);
        i1 = k - j;
        if (i1 == 0 || i1 > 4)
        {
            return null;
        }
        j1 = l1 + 1;
        abyte0[l1] = (byte)(l >>> 8);
        i1 = j1 + 1;
        abyte0[j1] = (byte)l;
        j1 = k;
        l = k1;
        k = i1;
        i1 = j;
        if (true) goto _L12; else goto _L8
_L2:
        if (j != 16)
        {
            if (k1 == -1)
            {
                return null;
            }
            System.arraycopy(abyte0, k1, abyte0, 16 - (j - k1), j - k1);
            Arrays.fill(abyte0, k1, (16 - j) + k1, (byte)0);
        }
        try
        {
            s = InetAddress.getByAddress(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError();
        }
        return s;
        l1 = k;
        k1 = k;
          goto _L6
    }

    private void b(String s, int i, int j)
    {
        if (i != j)
        {
            char c1 = s.charAt(i);
            if (c1 == '/' || c1 == '\\')
            {
                f.clear();
                f.add("");
                i++;
            } else
            {
                f.set(f.size() - 1, "");
            }
            while (i < j) 
            {
                int k = grj.b(s, i, j, "/\\");
                String s1;
                boolean flag;
                if (k < j)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                s1 = grj.a(s, i, k, " \"<>^`{}|/\\?#", true, false);
                if (s1.equals(".") || s1.equalsIgnoreCase("%2e"))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0)
                {
                    if (s1.equals("..") || s1.equalsIgnoreCase("%2e.") || s1.equalsIgnoreCase(".%2e") || s1.equalsIgnoreCase("%2e%2e"))
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    if (i != 0)
                    {
                        if (((String)f.remove(f.size() - 1)).isEmpty() && !f.isEmpty())
                        {
                            f.set(f.size() - 1, "");
                        } else
                        {
                            f.add("");
                        }
                    } else
                    {
                        if (((String)f.get(f.size() - 1)).isEmpty())
                        {
                            f.set(f.size() - 1, s1);
                        } else
                        {
                            f.add(s1);
                        }
                        if (flag)
                        {
                            f.add("");
                        }
                    }
                }
                i = k;
                if (flag)
                {
                    i = k + 1;
                }
            }
        }
    }

    private static int c(String s, int i, int j)
    {
_L6:
        if (i >= j) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        k = i;
        l = i;
        s.charAt(i);
        JVM INSTR lookupswitch 2: default 40
    //                   58: 80
    //                   91: 49;
           goto _L3 _L4 _L5
_L3:
        k = i;
_L8:
        i = k + 1;
          goto _L6
_L5:
        i = k + 1;
        k = i;
        if (i >= j) goto _L8; else goto _L7
_L7:
        k = i;
        if (s.charAt(i) != ']') goto _L5; else goto _L9
_L9:
        k = i;
          goto _L8
_L2:
        l = j;
_L4:
        return l;
    }

    private static int d(String s, int i, int j)
    {
        try
        {
            i = Integer.parseInt(grj.a(s, i, j, "", false, false));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        if (i > 0 && i <= 65535)
        {
            return i;
        } else
        {
            return -1;
        }
    }

    final int a()
    {
        if (e != -1)
        {
            return e;
        } else
        {
            return grj.a(a);
        }
    }

    final grj a(grj grj1, String s)
    {
        int i;
        int j;
        j = s.length();
        i = 0;
_L26:
        if (i >= j) goto _L2; else goto _L1
_L1:
        s.charAt(i);
        JVM INSTR lookupswitch 5: default 72
    //                   9: 289
    //                   10: 289
    //                   12: 289
    //                   13: 289
    //                   32: 289;
           goto _L3 _L4 _L4 _L4 _L4 _L4
_L3:
        j = s.length() - 1;
_L14:
        if (j < i) goto _L6; else goto _L5
_L5:
        s.charAt(j);
        JVM INSTR lookupswitch 5: default 144
    //                   9: 305
    //                   10: 305
    //                   12: 305
    //                   13: 305
    //                   32: 305;
           goto _L7 _L8 _L8 _L8 _L8 _L8
_L7:
        int l = j + 1;
_L15:
        if (l - i < 2) goto _L10; else goto _L9
_L9:
        j = s.charAt(i);
        if (j >= 97 && j <= 122 || j >= 65 && j <= 90) goto _L12; else goto _L11
_L11:
        j = -1;
_L19:
        int i1;
        boolean flag;
        int l1;
        if (j != -1)
        {
            if (s.regionMatches(true, i, "https:", 0, 6))
            {
                a = "https";
                i += 6;
            } else
            if (s.regionMatches(true, i, "http:", 0, 5))
            {
                a = "http";
                i += 5;
            } else
            {
                return null;
            }
        } else
        if (grj1 != null)
        {
            a = grj.a(grj1);
        } else
        {
            return null;
        }
        l1 = 0;
        flag = false;
        i1 = 0;
        j = i;
        do
        {
            if (j >= l)
            {
                break;
            }
            char c1 = s.charAt(j);
            if (c1 != '\\' && c1 != '/')
            {
                break;
            }
            i1++;
            j++;
        } while (true);
          goto _L13
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        i = j;
          goto _L3
_L8:
        j--;
          goto _L14
_L6:
        l = i;
          goto _L15
_L12:
        j = i + 1;
_L20:
        if (j >= l) goto _L10; else goto _L16
_L16:
        i1 = s.charAt(j);
        if (i1 >= 97 && i1 <= 122 || i1 >= 65 && i1 <= 90 || i1 == 43 || i1 == 45 || i1 == 46) goto _L18; else goto _L17
_L17:
        if (i1 != 58)
        {
            j = -1;
        }
          goto _L19
_L18:
        j++;
          goto _L20
_L10:
        j = -1;
          goto _L19
_L13:
        if (i1 < 2 && grj1 != null && grj.a(grj1).equals(a)) goto _L22; else goto _L21
_L21:
        i1 = i + i1;
        j = l1;
        i = ((flag) ? 1 : 0);
label0:
        do
        {
            l1 = grj.b(s, i1, l, "@/\\?#");
            int k1;
            if (l1 != l)
            {
                k1 = s.charAt(l1);
            } else
            {
                k1 = -1;
            }
            switch (k1)
            {
            default:
                break;

            case -1: 
            case 35: // '#'
            case 47: // '/'
            case 63: // '?'
            case 92: // '\\'
                i = c(s, i1, l1);
                String s1;
                if (i + 1 < l1)
                {
                    d = a(s, i1, i);
                    e = d(s, i + 1, l1);
                    if (e == -1)
                    {
                        return null;
                    }
                } else
                {
                    d = a(s, i1, i);
                    e = grj.a(a);
                }
                break label0;

            case 64: // '@'
                if (i == 0)
                {
                    k1 = grj.b(s, i1, l1, ":");
                    s1 = grj.a(s, i1, k1, " \"':;<=>@[]^`{}|/\\?#", true, false);
                    grj1 = s1;
                    if (j != 0)
                    {
                        grj1 = (new StringBuilder()).append(b).append("%40").append(s1).toString();
                    }
                    b = grj1;
                    if (k1 != l1)
                    {
                        i = 1;
                        c = grj.a(s, k1 + 1, l1, " \"':;<=>@[]^`{}|/\\?#", true, false);
                    }
                    j = i;
                    i = 1;
                } else
                {
                    c = (new StringBuilder()).append(c).append("%40").append(grj.a(s, i1, l1, " \"':;<=>@[]^`{}|/\\?#", true, false)).toString();
                    i1 = j;
                    j = i;
                    i = i1;
                }
                k1 = i;
                i1 = l1 + 1;
                i = j;
                j = k1;
                break;
            }
        } while (true);
        if (d == null)
        {
            return null;
        }
        j = l1;
_L24:
        i = grj.b(s, j, l, "?#");
        b(s, j, i);
        if (i < l && s.charAt(i) == '?')
        {
            j = grj.b(s, i, l, "#");
            g = grj.b(grj.a(s, i + 1, j, " \"'<>#", true, true));
            i = j;
        }
        if (i < l && s.charAt(i) == '#')
        {
            h = grj.a(s, i + 1, l, "", true, false);
        }
        return b();
_L22:
        b = grj1.c();
        String s2;
        if (grj1.b.isEmpty())
        {
            s2 = "";
        } else
        {
            int k = grj1.f.indexOf(':', grj1.a.length() + 3);
            int j1 = grj1.f.indexOf('@');
            s2 = grj1.f.substring(k + 1, j1);
        }
        c = s2;
        d = grj.b(grj1);
        e = grj.c(grj1);
        f.clear();
        f.addAll(grj1.d());
        if (i != l)
        {
            j = i;
            if (s.charAt(i) != '#')
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        grj1 = grj1.e();
        if (grj1 != null)
        {
            grj1 = grj.b(grj.a(grj1, " \"'<>#"));
        } else
        {
            grj1 = null;
        }
        g = grj1;
        j = i;
        if (true) goto _L24; else goto _L23
_L23:
        if (true) goto _L26; else goto _L25
_L25:
    }

    public final grj b()
    {
        if (a == null)
        {
            throw new IllegalStateException("scheme == null");
        }
        if (d == null)
        {
            throw new IllegalStateException("host == null");
        } else
        {
            return new grj(this, (byte)0);
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a);
        stringbuilder.append("://");
        if (!b.isEmpty() || !c.isEmpty())
        {
            stringbuilder.append(b);
            if (!c.isEmpty())
            {
                stringbuilder.append(':');
                stringbuilder.append(c);
            }
            stringbuilder.append('@');
        }
        int i;
        if (d.indexOf(':') != -1)
        {
            stringbuilder.append('[');
            stringbuilder.append(d);
            stringbuilder.append(']');
        } else
        {
            stringbuilder.append(d);
        }
        i = a();
        if (i != grj.a(a))
        {
            stringbuilder.append(':');
            stringbuilder.append(i);
        }
        grj.a(stringbuilder, f);
        if (g != null)
        {
            stringbuilder.append('?');
            grj.b(stringbuilder, g);
        }
        if (h != null)
        {
            stringbuilder.append('#');
            stringbuilder.append(h);
        }
        return stringbuilder.toString();
    }
}
