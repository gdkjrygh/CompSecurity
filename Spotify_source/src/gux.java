// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.security.auth.x500.X500Principal;

final class gux
{

    final String a;
    final int b;
    int c;
    int d;
    int e;
    int f;
    char g[];

    public gux(X500Principal x500principal)
    {
        a = x500principal.getName("RFC2253");
        b = a.length();
    }

    private int a(int i)
    {
        if (i + 1 >= b)
        {
            throw new IllegalStateException((new StringBuilder("Malformed DN: ")).append(a).toString());
        }
        int j = g[i];
        if (j >= 48 && j <= 57)
        {
            j -= 48;
        } else
        if (j >= 97 && j <= 102)
        {
            j -= 87;
        } else
        if (j >= 65 && j <= 70)
        {
            j -= 55;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Malformed DN: ")).append(a).toString());
        }
_L6:
        i = g[i + 1];
        if (i < 48 || i > 57) goto _L2; else goto _L1
_L1:
        i -= 48;
_L4:
        return (j << 4) + i;
_L2:
        if (i >= 97 && i <= 102)
        {
            i -= 87;
            continue; /* Loop/switch isn't completed */
        }
        if (i < 65 || i > 70)
        {
            break; /* Loop/switch isn't completed */
        }
        i -= 55;
        if (true) goto _L4; else goto _L3
_L3:
        throw new IllegalStateException((new StringBuilder("Malformed DN: ")).append(a).toString());
        if (true) goto _L6; else goto _L5
_L5:
    }

    private char e()
    {
        int i = a(c);
        c = c + 1;
        if (i < 128)
        {
            return (char)i;
        }
        if (i >= 192 && i <= 247)
        {
            int j;
            int k;
            boolean flag;
            if (i <= 223)
            {
                j = 1;
                i &= 0x1f;
            } else
            if (i <= 239)
            {
                j = 2;
                i &= 0xf;
            } else
            {
                j = 3;
                i &= 7;
            }
            flag = false;
            k = i;
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                c = c + 1;
                if (c == b || g[c] != '\\')
                {
                    return '?';
                }
                c = c + 1;
                int l = a(c);
                c = c + 1;
                if ((l & 0xc0) != 128)
                {
                    return '?';
                }
                k = (k << 6) + (l & 0x3f);
            }

            return (char)k;
        } else
        {
            return '?';
        }
    }

    final String a()
    {
        for (; c < b && g[c] == ' '; c = c + 1) { }
        if (c == b)
        {
            return null;
        }
        d = c;
        for (c = c + 1; c < b && g[c] != '=' && g[c] != ' '; c = c + 1) { }
        if (c >= b)
        {
            throw new IllegalStateException((new StringBuilder("Unexpected end of DN: ")).append(a).toString());
        }
        e = c;
        if (g[c] == ' ')
        {
            for (; c < b && g[c] != '=' && g[c] == ' '; c = c + 1) { }
            if (g[c] != '=' || c == b)
            {
                throw new IllegalStateException((new StringBuilder("Unexpected end of DN: ")).append(a).toString());
            }
        }
        do
        {
            c = c + 1;
        } while (c < b && g[c] == ' ');
        if (e - d > 4 && g[d + 3] == '.' && (g[d] == 'O' || g[d] == 'o') && (g[d + 1] == 'I' || g[d + 1] == 'i') && (g[d + 2] == 'D' || g[d + 2] == 'd'))
        {
            d = d + 4;
        }
        return new String(g, d, e - d);
    }

    final String b()
    {
        if (c + 4 >= b)
        {
            throw new IllegalStateException((new StringBuilder("Unexpected end of DN: ")).append(a).toString());
        }
        d = c;
        c = c + 1;
_L6:
        if (c != b && g[c] != '+' && g[c] != ',' && g[c] != ';') goto _L2; else goto _L1
_L1:
        e = c;
_L4:
        int l;
        l = e - d;
        if (l < 5 || (l & 1) == 0)
        {
            throw new IllegalStateException((new StringBuilder("Unexpected end of DN: ")).append(a).toString());
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (g[c] != ' ')
        {
            break; /* Loop/switch isn't completed */
        }
        e = c;
        c = c + 1;
        while (c < b && g[c] == ' ') 
        {
            c = c + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (g[c] >= 'A' && g[c] <= 'F')
        {
            char ac[] = g;
            int i = c;
            ac[i] = (char)(ac[i] + 32);
        }
        c = c + 1;
        if (true) goto _L6; else goto _L5
_L5:
        byte abyte0[] = new byte[l / 2];
        int j = 0;
        int k = d + 1;
        for (; j < abyte0.length; j++)
        {
            abyte0[j] = (byte)a(k);
            k += 2;
        }

        return new String(g, d, l);
    }

    final String c()
    {
        d = c;
        e = c;
        do
        {
label0:
            do
            {
                if (c >= b)
                {
                    return new String(g, d, e - d);
                }
                switch (g[c])
                {
                default:
                    char ac[] = g;
                    int i = e;
                    e = i + 1;
                    ac[i] = g[c];
                    c = c + 1;
                    break;

                case 43: // '+'
                case 44: // ','
                case 59: // ';'
                    return new String(g, d, e - d);

                case 92: // '\\'
                    char ac1[] = g;
                    int j = e;
                    e = j + 1;
                    ac1[j] = d();
                    c = c + 1;
                    break;

                case 32: // ' '
                    f = e;
                    c = c + 1;
                    char ac2[] = g;
                    int k = e;
                    e = k + 1;
                    ac2[k] = ' ';
                    break label0;
                }
            } while (true);
            for (; c < b && g[c] == ' '; c = c + 1)
            {
                char ac3[] = g;
                int l = e;
                e = l + 1;
                ac3[l] = ' ';
            }

        } while (c != b && g[c] != ',' && g[c] != '+' && g[c] != ';');
        return new String(g, d, f - d);
    }

    final char d()
    {
        c = c + 1;
        if (c == b)
        {
            throw new IllegalStateException((new StringBuilder("Unexpected end of DN: ")).append(a).toString());
        }
        switch (g[c])
        {
        default:
            return e();

        case 32: // ' '
        case 34: // '"'
        case 35: // '#'
        case 37: // '%'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 59: // ';'
        case 60: // '<'
        case 61: // '='
        case 62: // '>'
        case 92: // '\\'
        case 95: // '_'
            return g[c];
        }
    }
}
