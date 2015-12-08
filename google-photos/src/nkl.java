// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;

final class nkl
{

    private static final char a[] = "http://".toCharArray();
    private static final char b[] = "https://".toCharArray();
    private static final char c[] = "lh".toCharArray();
    private static final char d[] = "ap".toCharArray();
    private static final char e[] = "sp".toCharArray();
    private static final char f[] = "bp".toCharArray();
    private static final char g[] = ".googleusercontent.com/".toCharArray();
    private static final char h[] = "www.google.com/visualsearch/lh/".toCharArray();
    private static final char i[] = ".google.com/".toCharArray();
    private static final char j[] = ".blogger.com/".toCharArray();
    private static final char k[] = ".ggpht.com/".toCharArray();
    private static final char l[] = "public".toCharArray();
    private static final char m[] = "proxy".toCharArray();
    private static final char n[] = "image".toCharArray();
    private static final char o[] = "%3D".toCharArray();
    private static final char p[] = "%3d".toCharArray();
    private static final char q[][] = {
        {
            'O'
        }, {
            'J'
        }, {
            'U', 't'
        }, {
            'U'
        }, {
            'I'
        }
    };
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private int G[];
    private int H[];
    private char r[];
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    nkl()
    {
        r = new char[2000];
        C = true;
        G = new int[8];
        H = new int[8];
    }

    private static String a(float f1)
    {
        if (f1 < 0.0F || f1 > 1.0F)
        {
            throw new IllegalArgumentException("Cropping requires values between 0 and 1");
        }
        String s1 = String.valueOf(Integer.toHexString((int)Math.floor(65535F * f1)));
        if (s1.length() != 0)
        {
            s1 = "0000".concat(s1);
        } else
        {
            s1 = new String("0000");
        }
        return s1.substring(s1.length() - 4, s1.length());
    }

    private void a(StringBuilder stringbuilder)
    {
        int i1;
        int k2;
        i1 = v;
        k2 = v + D;
_L10:
        if (i1 >= k2) goto _L2; else goto _L1
_L1:
        int l1 = 0;
_L9:
        int j1 = i1;
        if (l1 >= q.length) goto _L4; else goto _L3
_L3:
        char ac[];
        int k1;
        ac = q[l1];
        k1 = 0;
        j1 = i1;
_L11:
        char ac1[];
        int i2;
        int j2;
        if (k1 >= ac.length || j1 >= k2)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        i2 = k1 + 1;
        j2 = ac[k1];
        ac1 = r;
        k1 = j1 + 1;
        if (j2 == ac1[j1]) goto _L6; else goto _L5
_L5:
        j1 = k1;
        k1 = 0;
_L12:
label0:
        {
            j2 = k1;
            if (k1 == 0)
            {
                break label0;
            }
            if (i2 == ac.length)
            {
                j2 = k1;
                if (j1 == k2)
                {
                    break label0;
                }
                j2 = k1;
                if (r[j1] == '-')
                {
                    break label0;
                }
            }
            j2 = 0;
        }
        if (j2 == 0) goto _L8; else goto _L7
_L7:
        stringbuilder.append(q[l1]).append('-');
          goto _L4
_L8:
        l1++;
          goto _L9
_L4:
        for (j1 = i1; j1 < k2 && r[j1] != '-'; j1++) { }
        i1 = j1 + 1;
          goto _L10
_L2:
        return;
_L6:
        j1 = k1;
        k1 = i2;
          goto _L11
        i2 = k1;
        k1 = 1;
          goto _L12
    }

    private boolean a(int i1, char ac[])
    {
        int k1 = ac.length;
        if (i1 + k1 <= s) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = 0;
label0:
        do
        {
label1:
            {
                if (j1 >= k1)
                {
                    break label1;
                }
                if (r[i1 + j1] != ac[j1])
                {
                    break label0;
                }
                j1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private boolean a(char ac[])
    {
        int i1;
        int k1;
        i1 = t;
        k1 = ac.length;
        if (i1 + k1 <= s) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = 0;
label0:
        do
        {
label1:
            {
                if (j1 >= k1)
                {
                    break label1;
                }
                if (r[i1] != ac[j1])
                {
                    break label0;
                }
                j1++;
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        t = i1;
        return true;
    }

    private int b(int i1, char ac[])
    {
        int k1;
label0:
        {
            int l1 = ac.length;
label1:
            for (int i2 = s; i1 <= i2 - l1; i1++)
            {
                int j1 = 0;
                do
                {
                    k1 = i1;
                    if (j1 >= l1)
                    {
                        break label0;
                    }
                    if (r[i1 + j1] != ac[j1])
                    {
                        continue label1;
                    }
                    j1++;
                } while (true);
            }

            k1 = -1;
        }
        return k1;
    }

    private void b(String s1)
    {
        s = s1.length();
        if (s >= 2000)
        {
            C = false;
            return;
        }
        s1.getChars(0, s, r, 0);
        t = 0;
        z = false;
        A = false;
        B = false;
        if (a(a) || a(b)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L19:
        x = flag;
        if (!x)
        {
            C = false;
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        u = t;
        if (!a(c)) goto _L4; else goto _L3
_L3:
        z = true;
        if (r[t] < '3' || r[t] > '6') goto _L6; else goto _L5
_L5:
        t = t + 1;
        if (r[t] != '-' || r[t + 1] != 'd') goto _L8; else goto _L7
_L7:
        y = true;
        t = t + 2;
        if (r[t] >= 'a' && r[t] <= 'g' || r[t] == 'z')
        {
            t = t + 1;
            if (!a(g))
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
          goto _L9
_L8:
        if (r[t] != '-' || r[t + 1] != 't' || r[t + 2] != 't') goto _L11; else goto _L10
_L10:
        y = true;
        t = t + 3;
        if (!a(g))
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
          goto _L9
_L11:
        if (!a(i)) goto _L13; else goto _L12
_L12:
        A = true;
_L9:
        E = t - 1;
        flag = true;
        continue; /* Loop/switch isn't completed */
_L13:
        if (!a(g) && !a(k))
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
_L6:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!a(e))
        {
            break; /* Loop/switch isn't completed */
        }
        z = true;
        if (r[t] >= '1' && r[t] <= '3')
        {
            t = t + 1;
            if (!a(g) && !a(k))
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (!a(d))
        {
            break; /* Loop/switch isn't completed */
        }
        z = true;
        if (r[t] == '2')
        {
            t = t + 1;
            if (!a(g) && !a(k))
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L9; else goto _L15
_L15:
        z = false;
        if (!a(f))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (r[t] >= '0' && r[t] <= '3')
        {
            t = t + 1;
            if (!a(j))
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L9; else goto _L16
_L16:
        if (a(h)) goto _L9; else goto _L17
_L17:
        flag = false;
        if (true) goto _L19; else goto _L18
_L18:
        int k1 = t;
        int l1 = t;
        F = 0;
        do
        {
label0:
            {
                int i1;
                if (k1 != s)
                {
                    i1 = l1;
                    if (r[k1] != '/')
                    {
                        break label0;
                    }
                }
                if (k1 == l1 && k1 != s)
                {
                    i1 = k1 + 1;
                } else
                {
                    if (F >= 8)
                    {
                        C = false;
                        return;
                    }
                    G[F] = l1;
                    H[F] = k1 - l1;
                    i1 = k1 + 1;
                    F = F + 1;
                }
            }
            if (k1 == s)
            {
                break;
            }
            k1++;
            l1 = i1;
        } while (true);
        int j1;
        if (F > 1 && H[0] == n.length && a(G[0], n))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0 || F != 5) goto _L21; else goto _L20
_L20:
        v = G[4];
        D = 0;
_L28:
        j1 = 1;
_L23:
        if (j1 != 0)
        {
            B = true;
            C = true;
            return;
        }
        break; /* Loop/switch isn't completed */
_L21:
        if (j1 != 0 && F == 6)
        {
            v = G[5];
            D = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 0 && F == 6)
        {
            v = G[4];
            D = H[4];
            continue; /* Loop/switch isn't completed */
        }
        if (j1 != 0 && F == 7)
        {
            v = G[5];
            D = H[5];
            continue; /* Loop/switch isn't completed */
        }
        j1 = 0;
        if (true) goto _L23; else goto _L22
_L22:
        if (F > 1 && (H[0] == l.length && a(G[0], l) || H[0] == m.length && a(G[0], m)))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0 && F == 1)
        {
            j1 = G[0];
            l1 = H[0];
        } else
        {
label1:
            {
                if (j1 == 0 || F != 2)
                {
                    break label1;
                }
                j1 = G[1];
                l1 = H[1];
            }
        }
        k1 = j1;
        if (k1 >= s)
        {
            break MISSING_BLOCK_LABEL_1207;
        }
        if (r[k1] != '=') goto _L25; else goto _L24
_L24:
        w = k1;
        if (w != -1)
        {
            v = w + 1;
        } else
        {
            w = b(j1, o);
            if (w == -1)
            {
                w = b(j1, p);
            }
            if (w != -1)
            {
                v = w + 3;
            }
        }
        if (w != -1)
        {
            D = l1 - (v - j1);
        } else
        {
            w = l1 + j1;
            v = w;
            D = 0;
        }
        j1 = 1;
_L26:
        if (j1 != 0)
        {
            B = false;
            C = true;
            return;
        }
        break MISSING_BLOCK_LABEL_1289;
        j1 = 0;
        if (true) goto _L26; else goto _L25
_L25:
        k1++;
        break MISSING_BLOCK_LABEL_1085;
        k1 = -1;
          goto _L24
        C = false;
        return;
        if (true) goto _L28; else goto _L27
_L27:
    }

    private void b(StringBuilder stringbuilder)
    {
        int i1 = v;
        int j1 = v;
        for (int k1 = D + j1; i1 < k1; i1++)
        {
            boolean flag;
            if (r[i1] == 'f')
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for (; i1 < k1 && r[i1] != '-'; i1++)
            {
                if (flag)
                {
                    stringbuilder.append(r[i1]);
                }
            }

            if (flag)
            {
                stringbuilder.append('-');
            }
        }

    }

    final String a(String s1, int i1, int j1, int k1, int l1, int i2, int j2, 
            RectF rectf, int k2, int l2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag3;
        b(s1);
        flag3 = C;
        if (flag3) goto _L2; else goto _L1
_L1:
        s1 = null;
_L14:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        s1 = new StringBuilder(s + 50);
        boolean flag2 = false;
        boolean flag;
        boolean flag1;
        int i3;
        if ((i1 & 0x2000) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i1 & 0x80) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i3 = ((flag2) ? 1 : 0);
        if (!z) goto _L4; else goto _L3
_L3:
        if (k2 > 0 || flag) goto _L6; else goto _L5
_L5:
        i3 = ((flag2) ? 1 : 0);
        if (!flag1) goto _L4; else goto _L6
_L6:
        s1.append(r, 0, u);
        if (A || !flag1) goto _L8; else goto _L7
_L7:
        if (y) goto _L8; else goto _L9
_L9:
        s1.append(e);
        s1.append((char)(k2 % 3 + 49));
_L15:
        k2 = u + 3;
        s1.append(r, k2, E - k2);
        i3 = E;
_L4:
        if (!B) goto _L11; else goto _L10
_L10:
        s1.append(r, i3, v - i3);
_L16:
        k2 = s1.length();
        if (j1 == 0 && (k1 != 0 || l1 != 0))
        {
            break MISSING_BLOCK_LABEL_233;
        }
        s1.append('s').append(j1).append('-');
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        s1.append('w').append(k1).append('-');
        if (l1 == 0)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        s1.append('h').append(l1).append('-');
        if ((i1 & 0x20) == 0)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        s1.append("rw-");
        if ((i1 & 0x4000) == 0)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        s1.append("rwa-");
        if ((i1 & 1) == 0)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        s1.append("c-");
        if ((i1 & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        s1.append("d-");
        if ((i1 & 0x10) == 0)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        s1.append("k-");
        if ((i1 & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        s1.append("no-");
        if ((i1 & 0x40) == 0)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        s1.append("nu-");
        if ((i1 & 8) == 0)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        s1.append("p-");
        if ((i1 & 0x1000) == 0)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        s1.append("lf-");
        if ((i1 & 0x100) == 0)
        {
            break MISSING_BLOCK_LABEL_418;
        }
        s1.append("fSoften=0,25,0-");
        if ((i1 & 0x200) == 0)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        s1.append("ip-");
        if ((i1 & 0x800) == 0)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        s1.append("rj-");
        if ((0x8000 & i1) == 0)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        s1.append("fBoxBlur=2,24,24-");
        if ((0x10000 & i1) == 0)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        s1.append("al-");
        if ((0x20000 & i1) == 0) goto _L13; else goto _L12
_L12:
        s1.append("rh-");
          goto _L13
_L17:
        s1.append(j2).append('-');
_L19:
        if ((i1 & 0x400) == 0 || rectf == null)
        {
            break MISSING_BLOCK_LABEL_593;
        }
        s1.append("fcrop64=1,");
        s1.append(a(rectf.left));
        s1.append(a(rectf.top));
        s1.append(a(rectf.right));
        s1.append(a(rectf.bottom));
        s1.append('-');
        if (l2 < 0)
        {
            break MISSING_BLOCK_LABEL_615;
        }
        s1.append('a').append(l2).append('-');
        a(((StringBuilder) (s1)));
        b(s1);
        if (s1.length() > k2)
        {
            s1.setLength(s1.length() - 1);
        }
        if (B && D == 0)
        {
            s1.append('/');
        }
        s1.append(r, v + D, s - (v + D));
        s1 = s1.toString();
          goto _L14
_L8:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_738;
        }
        if (y)
        {
            break MISSING_BLOCK_LABEL_738;
        }
        s1.append(d).append('2');
          goto _L15
        s1;
        throw s1;
        s1.append(c);
        s1.append((char)(k2 % 4 + 51));
          goto _L15
_L11:
        s1.append(r, i3, w - i3);
        s1.append('=');
          goto _L16
_L20:
        s1.append('v');
          goto _L17
_L21:
        s1.append('l');
          goto _L17
_L13:
        if (i2 == -1 || j2 == -1) goto _L19; else goto _L18
_L18:
        i2;
        JVM INSTR tableswitch 0 1: default 860
    //                   0 790
    //                   1 800;
           goto _L17 _L20 _L21
    }

    final boolean a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        b(s1);
        flag = x;
        this;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        throw s1;
    }

}
