// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.net.IDN;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okio.c;

public final class p
{
    public static final class a
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

        static String a(String s, int k, int l)
        {
            boolean flag;
            flag = false;
            s = p.a(s, k, l);
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
                l = 0;
                int i1 = -1;
                for (k = 0; k < s.length;)
                {
                    int j1;
                    for (j1 = k; j1 < 16 && s[j1] == 0 && s[j1 + 1] == 0; j1 += 2) { }
                    int i2 = j1 - k;
                    int l1 = l;
                    if (i2 > l)
                    {
                        l1 = i2;
                        i1 = k;
                    }
                    k = j1 + 2;
                    l = l1;
                }

                c c1 = new c();
                k = ((flag) ? 1 : 0);
                do
                {
                    if (k >= s.length)
                    {
                        break;
                    }
                    if (k == i1)
                    {
                        c1.b(58);
                        int k1 = k + l;
                        k = k1;
                        if (k1 == 16)
                        {
                            c1.b(58);
                            k = k1;
                        }
                    } else
                    {
                        if (k > 0)
                        {
                            c1.b(58);
                        }
                        c1.i((s[k] & 0xff) << 8 | s[k + 1] & 0xff);
                        k += 2;
                    }
                } while (true);
                return c1.o();
            } else
            {
                throw new AssertionError();
            }
_L2:
            s = a(s);
            if (s != null)
            {
                k = s.length();
                if (p.b(s, 0, k, "\000\t\n\r #%/:?@[\\]") == k)
                {
                    return s;
                }
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        private static InetAddress a(String s, int k)
        {
            byte abyte0[];
            int i1;
            int j1;
            int k1;
            int l1;
            abyte0 = new byte[16];
            i1 = 0;
            j1 = -1;
            k1 = -1;
            l1 = 1;
_L12:
            int l;
            int i2;
            i2 = j1;
            l = i1;
            if (l1 >= k) goto _L2; else goto _L1
_L1:
            if (i1 == 16)
            {
                return null;
            }
            if (l1 + 2 > k || !s.regionMatches(l1, "::", 0, 2)) goto _L4; else goto _L3
_L3:
            if (j1 != -1)
            {
                return null;
            }
            l = l1 + 2;
            i1 += 2;
            if (l != k)
            {
                break MISSING_BLOCK_LABEL_537;
            }
            l = i1;
            i2 = i1;
              goto _L2
_L4:
            int j2;
            l = l1;
            i2 = j1;
            j2 = i1;
            if (i1 == 0) goto _L6; else goto _L5
_L5:
            if (!s.regionMatches(l1, ":", 0, 1)) goto _L8; else goto _L7
_L7:
            l = l1 + 1;
            j2 = i1;
            i2 = j1;
              goto _L6
_L8:
            if (!s.regionMatches(l1, ".", 0, 1))
            {
                break MISSING_BLOCK_LABEL_413;
            }
            j2 = i1 - 2;
            l1 = j2;
_L11:
            if (k1 >= k)
            {
                break MISSING_BLOCK_LABEL_382;
            }
            if (l1 == 16)
            {
                k = 0;
            } else
            {
label0:
                {
                    l = k1;
                    if (l1 == j2)
                    {
                        break MISSING_BLOCK_LABEL_269;
                    }
                    if (s.charAt(k1) == '.')
                    {
                        break label0;
                    }
                    k = 0;
                }
            }
_L9:
            if (k == 0)
            {
                return null;
            }
            break MISSING_BLOCK_LABEL_401;
            l = k1 + 1;
            i2 = 0;
            k1 = l;
_L10:
            if (k1 >= k)
            {
                break MISSING_BLOCK_LABEL_354;
            }
            char c1 = s.charAt(k1);
            if (c1 < '0' || c1 > '9')
            {
                break MISSING_BLOCK_LABEL_354;
            }
            if (i2 == 0 && l != k1)
            {
                k = 0;
            } else
            {
label1:
                {
                    i2 = (i2 * 10 + c1) - 48;
                    if (i2 <= 255)
                    {
                        break label1;
                    }
                    k = 0;
                }
            }
              goto _L9
            k1++;
              goto _L10
label2:
            {
                if (k1 - l != 0)
                {
                    break label2;
                }
                k = 0;
            }
              goto _L9
            abyte0[l1] = (byte)i2;
            l1++;
              goto _L11
            if (l1 != j2 + 4)
            {
                k = 0;
            } else
            {
                k = 1;
            }
              goto _L9
            l = i1 + 2;
            i2 = j1;
              goto _L2
            return null;
_L6:
            j1 = 0;
            i1 = l;
            do
            {
                if (i1 >= k)
                {
                    break;
                }
                k1 = p.a(s.charAt(i1));
                if (k1 == -1)
                {
                    break;
                }
                j1 = (j1 << 4) + k1;
                i1++;
            } while (true);
            k1 = i1 - l;
            if (k1 == 0 || k1 > 4)
            {
                return null;
            }
            l1 = j2 + 1;
            abyte0[j2] = (byte)(j1 >>> 8 & 0xff);
            k1 = l1 + 1;
            abyte0[l1] = (byte)(j1 & 0xff);
            l1 = i1;
            j1 = i2;
            i1 = k1;
            k1 = l;
            if (true) goto _L12; else goto _L8
_L2:
            if (l != 16)
            {
                if (i2 == -1)
                {
                    return null;
                }
                System.arraycopy(abyte0, i2, abyte0, 16 - (l - i2), l - i2);
                Arrays.fill(abyte0, i2, (16 - l) + i2, (byte)0);
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
            j2 = i1;
            i2 = i1;
              goto _L6
        }

        private void b(String s, int k, int l)
        {
            if (k != l)
            {
                char c1 = s.charAt(k);
                if (c1 == '/' || c1 == '\\')
                {
                    f.clear();
                    f.add("");
                    k++;
                } else
                {
                    f.set(f.size() - 1, "");
                }
                while (k < l) 
                {
                    int i1 = p.b(s, k, l, "/\\");
                    String s1;
                    boolean flag;
                    if (i1 < l)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    s1 = p.a(s, k, i1, " \"<>^`{}|/\\?#", true, false);
                    if (s1.equals(".") || s1.equalsIgnoreCase("%2e"))
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                    if (k == 0)
                    {
                        if (s1.equals("..") || s1.equalsIgnoreCase("%2e.") || s1.equalsIgnoreCase(".%2e") || s1.equalsIgnoreCase("%2e%2e"))
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        if (k != 0)
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
                    k = i1;
                    if (flag)
                    {
                        k = i1 + 1;
                    }
                }
            }
        }

        private static int c(String s, int k, int l)
        {
_L6:
            if (k >= l) goto _L2; else goto _L1
_L1:
            int i1;
            int j1;
            i1 = k;
            j1 = k;
            s.charAt(k);
            JVM INSTR lookupswitch 2: default 40
        //                       58: 80
        //                       91: 49;
               goto _L3 _L4 _L5
_L3:
            i1 = k;
_L8:
            k = i1 + 1;
              goto _L6
_L5:
            k = i1 + 1;
            i1 = k;
            if (k >= l) goto _L8; else goto _L7
_L7:
            i1 = k;
            if (s.charAt(k) != ']') goto _L5; else goto _L9
_L9:
            i1 = k;
              goto _L8
_L2:
            j1 = l;
_L4:
            return j1;
        }

        private static int d(String s, int k, int l)
        {
            try
            {
                k = Integer.parseInt(p.a(s, k, l, "", false, false));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return -1;
            }
            if (k > 0 && k <= 65535)
            {
                return k;
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
                return p.a(a);
            }
        }

        final p a(p p1, String s)
        {
            int k;
            int l;
            l = s.length();
            k = 0;
_L26:
            if (k >= l) goto _L2; else goto _L1
_L1:
            s.charAt(k);
            JVM INSTR lookupswitch 5: default 72
        //                       9: 289
        //                       10: 289
        //                       12: 289
        //                       13: 289
        //                       32: 289;
               goto _L3 _L4 _L4 _L4 _L4 _L4
_L3:
            l = s.length() - 1;
_L14:
            if (l < k) goto _L6; else goto _L5
_L5:
            s.charAt(l);
            JVM INSTR lookupswitch 5: default 144
        //                       9: 305
        //                       10: 305
        //                       12: 305
        //                       13: 305
        //                       32: 305;
               goto _L7 _L8 _L8 _L8 _L8 _L8
_L7:
            int j1 = l + 1;
_L15:
            if (j1 - k < 2) goto _L10; else goto _L9
_L9:
            l = s.charAt(k);
            if (l >= 97 && l <= 122 || l >= 65 && l <= 90) goto _L12; else goto _L11
_L11:
            l = -1;
_L19:
            int k1;
            boolean flag;
            int j2;
            if (l != -1)
            {
                if (s.regionMatches(true, k, "https:", 0, 6))
                {
                    a = "https";
                    k += 6;
                } else
                if (s.regionMatches(true, k, "http:", 0, 5))
                {
                    a = "http";
                    k += 5;
                } else
                {
                    return null;
                }
            } else
            if (p1 != null)
            {
                a = p.a(p1);
            } else
            {
                return null;
            }
            j2 = 0;
            flag = false;
            k1 = 0;
            l = k;
            do
            {
                if (l >= j1)
                {
                    break;
                }
                char c1 = s.charAt(l);
                if (c1 != '\\' && c1 != '/')
                {
                    break;
                }
                k1++;
                l++;
            } while (true);
              goto _L13
_L4:
            k++;
            continue; /* Loop/switch isn't completed */
_L2:
            k = l;
              goto _L3
_L8:
            l--;
              goto _L14
_L6:
            j1 = k;
              goto _L15
_L12:
            l = k + 1;
_L20:
            if (l >= j1) goto _L10; else goto _L16
_L16:
            k1 = s.charAt(l);
            if (k1 >= 97 && k1 <= 122 || k1 >= 65 && k1 <= 90 || k1 == 43 || k1 == 45 || k1 == 46) goto _L18; else goto _L17
_L17:
            if (k1 != 58)
            {
                l = -1;
            }
              goto _L19
_L18:
            l++;
              goto _L20
_L10:
            l = -1;
              goto _L19
_L13:
            if (k1 < 2 && p1 != null && p.a(p1).equals(a)) goto _L22; else goto _L21
_L21:
            k1 = k + k1;
            l = j2;
            k = ((flag) ? 1 : 0);
label0:
            do
            {
                j2 = p.b(s, k1, j1, "@/\\?#");
                int i2;
                if (j2 != j1)
                {
                    i2 = s.charAt(j2);
                } else
                {
                    i2 = -1;
                }
                switch (i2)
                {
                default:
                    break;

                case -1: 
                case 35: // '#'
                case 47: // '/'
                case 63: // '?'
                case 92: // '\\'
                    k = c(s, k1, j2);
                    String s1;
                    if (k + 1 < j2)
                    {
                        d = a(s, k1, k);
                        e = d(s, k + 1, j2);
                        if (e == -1)
                        {
                            return null;
                        }
                    } else
                    {
                        d = a(s, k1, k);
                        e = p.a(a);
                    }
                    break label0;

                case 64: // '@'
                    if (k == 0)
                    {
                        i2 = p.b(s, k1, j2, ":");
                        s1 = p.a(s, k1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false);
                        p1 = s1;
                        if (l != 0)
                        {
                            p1 = (new StringBuilder()).append(b).append("%40").append(s1).toString();
                        }
                        b = p1;
                        if (i2 != j2)
                        {
                            k = 1;
                            c = p.a(s, i2 + 1, j2, " \"':;<=>@[]^`{}|/\\?#", true, false);
                        }
                        l = k;
                        k = 1;
                    } else
                    {
                        c = (new StringBuilder()).append(c).append("%40").append(p.a(s, k1, j2, " \"':;<=>@[]^`{}|/\\?#", true, false)).toString();
                        k1 = l;
                        l = k;
                        k = k1;
                    }
                    i2 = k;
                    k1 = j2 + 1;
                    k = l;
                    l = i2;
                    break;
                }
            } while (true);
            if (d == null)
            {
                return null;
            }
            l = j2;
_L24:
            k = p.b(s, l, j1, "?#");
            b(s, l, k);
            if (k < j1 && s.charAt(k) == '?')
            {
                l = p.b(s, k, j1, "#");
                g = p.b(p.a(s, k + 1, l, " \"'<>#", true, true));
                k = l;
            }
            if (k < j1 && s.charAt(k) == '#')
            {
                h = p.a(s, k + 1, j1, "", true, false);
            }
            return b();
_L22:
            b = p1.c();
            String s2;
            if (p1.b.isEmpty())
            {
                s2 = "";
            } else
            {
                int i1 = p1.f.indexOf(':', p1.a.length() + 3);
                int l1 = p1.f.indexOf('@');
                s2 = p1.f.substring(i1 + 1, l1);
            }
            c = s2;
            d = p.b(p1);
            e = com.squareup.okhttp.p.c(p1);
            f.clear();
            f.addAll(p1.d());
            if (k != j1)
            {
                l = k;
                if (s.charAt(k) != '#')
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            p1 = p1.e();
            if (p1 != null)
            {
                p1 = p.b(p.a(p1, " \"'<>#"));
            } else
            {
                p1 = null;
            }
            g = p1;
            l = k;
            if (true) goto _L24; else goto _L23
_L23:
            if (true) goto _L26; else goto _L25
_L25:
        }

        public final p b()
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
                return new p(this, (byte)0);
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
            int k;
            if (d.indexOf(':') != -1)
            {
                stringbuilder.append('[');
                stringbuilder.append(d);
                stringbuilder.append(']');
            } else
            {
                stringbuilder.append(d);
            }
            k = a();
            if (k != p.a(a))
            {
                stringbuilder.append(':');
                stringbuilder.append(k);
            }
            p.a(stringbuilder, f);
            if (g != null)
            {
                stringbuilder.append('?');
                p.b(stringbuilder, g);
            }
            if (h != null)
            {
                stringbuilder.append('#');
                stringbuilder.append(h);
            }
            return stringbuilder.toString();
        }

        public a()
        {
            b = "";
            c = "";
            e = -1;
            f.add("");
        }
    }


    private static final char g[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    public final String a;
    final String b;
    public final String c;
    public final int d;
    public final List e;
    public final String f;
    private final String h;
    private final List i;
    private final String j;

    private p(a a1)
    {
        Object obj1 = null;
        super();
        a = a1.a;
        h = e(a1.b);
        b = e(a1.c);
        c = a1.d;
        d = a1.a();
        i = a(a1.f);
        Object obj;
        if (a1.g != null)
        {
            obj = a(a1.g);
        } else
        {
            obj = null;
        }
        e = ((List) (obj));
        obj = obj1;
        if (a1.h != null)
        {
            obj = e(a1.h);
        }
        j = ((String) (obj));
        f = a1.toString();
    }

    p(a a1, byte byte0)
    {
        this(a1);
    }

    static int a(char c1)
    {
        if (c1 >= '0' && c1 <= '9')
        {
            return c1 - 48;
        }
        if (c1 >= 'a' && c1 <= 'f')
        {
            return (c1 - 97) + 10;
        }
        if (c1 >= 'A' && c1 <= 'F')
        {
            return (c1 - 65) + 10;
        } else
        {
            return -1;
        }
    }

    public static int a(String s)
    {
        if (s.equals("http"))
        {
            return 80;
        }
        return !s.equals("https") ? -1 : 443;
    }

    public static int a(String s, int k, int l, String s1)
    {
        do
        {
label0:
            {
                int i1 = l;
                if (k < l)
                {
                    if (s1.indexOf(s.charAt(k)) == -1)
                    {
                        break label0;
                    }
                    i1 = k;
                }
                return i1;
            }
            k++;
        } while (true);
    }

    static String a(p p1)
    {
        return p1.a;
    }

    static String a(String s, int k, int l)
    {
        int i1 = k;
_L11:
        if (i1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.charAt(i1) != '%') goto _L2; else goto _L1
_L1:
        c c1;
        c1 = new c();
        c1.a(s, k, i1);
        k = i1;
_L9:
        if (k >= l) goto _L4; else goto _L3
_L3:
        i1 = s.codePointAt(k);
        if (i1 != 37 || k + 2 >= l) goto _L6; else goto _L5
_L5:
        int j1;
        int k1;
        j1 = a(s.charAt(k + 1));
        k1 = a(s.charAt(k + 2));
        if (j1 == -1 || k1 == -1) goto _L6; else goto _L7
_L7:
        c1.b((j1 << 4) + k1);
        k += 2;
_L8:
        k += Character.charCount(i1);
        continue; /* Loop/switch isn't completed */
_L6:
        c1.a(i1);
        if (true) goto _L8; else goto _L4
_L4:
        return c1.o();
        if (true) goto _L9; else goto _L2
_L2:
        i1++;
        if (true) goto _L11; else goto _L10
_L10:
        return s.substring(k, l);
    }

    static String a(String s, int k, int l, String s1, boolean flag, boolean flag1)
    {
        int i1 = k;
_L7:
        Object obj;
        c c3;
        int j1;
        if (i1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = s.codePointAt(i1);
        if (j1 >= 32 && j1 < 127 && s1.indexOf(j1) == -1 && (j1 != 37 || flag) && (!flag1 || j1 != 43))
        {
            break MISSING_BLOCK_LABEL_355;
        }
        c3 = new c();
        c3.a(s, k, i1);
        k = i1;
        obj = null;
_L2:
        c c2;
label0:
        {
            if (k >= l)
            {
                break MISSING_BLOCK_LABEL_349;
            }
            i1 = s.codePointAt(k);
            if (flag)
            {
                c2 = obj;
                if (i1 == 9)
                {
                    break label0;
                }
                c2 = obj;
                if (i1 == 10)
                {
                    break label0;
                }
                c2 = obj;
                if (i1 == 12)
                {
                    break label0;
                }
                c2 = obj;
                if (i1 == 13)
                {
                    break label0;
                }
            }
            if (!flag1 || i1 != 43)
            {
                break; /* Loop/switch isn't completed */
            }
            String s2;
            if (flag)
            {
                s2 = "%20";
            } else
            {
                s2 = "%2B";
            }
            c3.a(s2);
            c2 = obj;
        }
_L4:
        k = Character.charCount(i1) + k;
        obj = c2;
        if (true) goto _L2; else goto _L1
_L1:
        c c1;
        if (i1 >= 32 && i1 < 127 && s1.indexOf(i1) == -1 && (i1 != 37 || flag))
        {
            break MISSING_BLOCK_LABEL_334;
        }
        c1 = obj;
        if (obj == null)
        {
            c1 = new c();
        }
        c1.a(i1);
_L5:
        c2 = c1;
        if (c1.d()) goto _L4; else goto _L3
_L3:
        j1 = c1.f() & 0xff;
        c3.b(37);
        c3.b(g[j1 >> 4 & 0xf]);
        c3.b(g[j1 & 0xf]);
          goto _L5
        c3.a(i1);
        c2 = obj;
          goto _L4
        return c3.o();
        i1 += Character.charCount(j1);
        if (true) goto _L7; else goto _L6
_L6:
        return s.substring(k, l);
    }

    static String a(String s, String s1)
    {
        return a(s, 0, s.length(), s1, true, true);
    }

    private static List a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            list = (String)iterator.next();
            if (list != null)
            {
                list = e(list);
            } else
            {
                list = null;
            }
            arraylist.add(list);
        }
        return Collections.unmodifiableList(arraylist);
    }

    static void a(StringBuilder stringbuilder, List list)
    {
        int l = list.size();
        for (int k = 0; k < l; k++)
        {
            stringbuilder.append('/');
            stringbuilder.append((String)list.get(k));
        }

    }

    static int b(String s, int k, int l, String s1)
    {
        return a(s, k, l, s1);
    }

    static String b(p p1)
    {
        return p1.c;
    }

    static List b(String s)
    {
        ArrayList arraylist = new ArrayList();
        int k = 0;
        while (k <= s.length()) 
        {
            int i1 = s.indexOf('&', k);
            int l = i1;
            if (i1 == -1)
            {
                l = s.length();
            }
            i1 = s.indexOf('=', k);
            if (i1 == -1 || i1 > l)
            {
                arraylist.add(s.substring(k, l));
                arraylist.add(null);
            } else
            {
                arraylist.add(s.substring(k, i1));
                arraylist.add(s.substring(i1 + 1, l));
            }
            k = l + 1;
        }
        return arraylist;
    }

    public static void b(StringBuilder stringbuilder, List list)
    {
        int l = list.size();
        for (int k = 0; k < l; k += 2)
        {
            String s = (String)list.get(k);
            String s1 = (String)list.get(k + 1);
            if (k > 0)
            {
                stringbuilder.append('&');
            }
            stringbuilder.append(s);
            if (s1 != null)
            {
                stringbuilder.append('=');
                stringbuilder.append(s1);
            }
        }

    }

    static int c(p p1)
    {
        return p1.d;
    }

    public static p d(String s)
    {
        return (new a()).a(null, s);
    }

    private static String e(String s)
    {
        return a(s, 0, s.length());
    }

    public final URL a()
    {
        URL url;
        try
        {
            url = new URL(f);
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException(malformedurlexception);
        }
        return url;
    }

    public final URI b()
    {
        URI uri;
        try
        {
            uri = new URI(f);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new IllegalStateException((new StringBuilder("not valid as a java.net.URI: ")).append(f).toString());
        }
        return uri;
    }

    public final p c(String s)
    {
        return (new a()).a(this, s);
    }

    public final String c()
    {
        if (h.isEmpty())
        {
            return "";
        } else
        {
            int k = a.length() + 3;
            int l = a(f, k, f.length(), ":@");
            return f.substring(k, l);
        }
    }

    public final List d()
    {
        int k = f.indexOf('/', a.length() + 3);
        int l = a(f, k, f.length(), "?#");
        ArrayList arraylist = new ArrayList();
        while (k < l) 
        {
            int i1 = k + 1;
            k = a(f, i1, l, "/");
            arraylist.add(f.substring(i1, k));
        }
        return arraylist;
    }

    public final String e()
    {
        if (e == null)
        {
            return null;
        } else
        {
            int k = f.indexOf('?') + 1;
            int l = a(f, k + 1, f.length(), "#");
            return f.substring(k, l);
        }
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof p) && ((p)obj).f.equals(f);
    }

    public final int hashCode()
    {
        return f.hashCode();
    }

    public final String toString()
    {
        return f;
    }

}
