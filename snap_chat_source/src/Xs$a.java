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

public static final class lang.Object
{

    String a;
    String b;
    String c;
    String d;
    int e;
    final List f = new ArrayList();
    List g;
    String h;

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
            i1 = Xs.a(s.charAt(k));
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

    static int b(String s, int i, int j)
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

    static String c(String s, int i, int j)
    {
        Object obj = null;
        s = Xs.a(s, i, j);
        if (s.startsWith("[") && s.endsWith("]"))
        {
            InetAddress inetaddress = a(s, s.length() - 1);
            s = obj;
            if (inetaddress != null)
            {
                s = inetaddress.getHostAddress();
            }
        } else
        {
            String s1 = a(s);
            s = obj;
            if (s1 != null)
            {
                i = s1.length();
                s = obj;
                if (Xs.a(s1, 0, i, "\000\t\n\r #%/:?@[\\]") == i)
                {
                    return s1;
                }
            }
        }
        return s;
    }

    static int d(String s, int i, int j)
    {
        try
        {
            i = Integer.parseInt(Xs.a(s, i, j, "", false, false));
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
            return Xs.a(a);
        }
    }

    final void a(String s, int i, int j)
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
                int k = Xs.a(s, i, j, "/\\");
                String s1;
                boolean flag;
                if (k < j)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                s1 = Xs.a(s, i, k, " \"<>^`{}|/\\?#", true, false);
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
        if (i != Xs.a(a))
        {
            stringbuilder.append(':');
            stringbuilder.append(i);
        }
        Xs.a(stringbuilder, f);
        if (g != null)
        {
            stringbuilder.append('?');
            Xs.b(stringbuilder, g);
        }
        if (h != null)
        {
            stringbuilder.append('#');
            stringbuilder.append(h);
        }
        return stringbuilder.toString();
    }

    public >()
    {
        b = "";
        c = "";
        e = -1;
        f.add("");
    }
}
