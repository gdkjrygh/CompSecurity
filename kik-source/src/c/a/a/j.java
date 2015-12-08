// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a.a;

import java.io.IOException;

final class j
{
    private static final class a
        implements g
    {

        public final void a(String s, Appendable appendable)
        {
            int i = 0;
_L16:
            if (i >= s.length()) goto _L2; else goto _L1
_L1:
            char c1 = s.charAt(i);
            c1;
            JVM INSTR lookupswitch 8: default 301
        //                       8: 217
        //                       9: 265
        //                       10: 241
        //                       12: 229
        //                       13: 253
        //                       34: 182
        //                       47: 277
        //                       92: 205;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L13:
            try
            {
                appendable.append("\\u");
                appendable.append("0123456789ABCDEF".charAt(c1 >> 12 & 0xf));
                appendable.append("0123456789ABCDEF".charAt(c1 >> 8 & 0xf));
                appendable.append("0123456789ABCDEF".charAt(c1 >> 4 & 0xf));
                appendable.append("0123456789ABCDEF".charAt(c1 >> 0 & 0xf));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException("Impossible Error");
            }
              goto _L12
_L9:
            appendable.append("\\\"");
              goto _L12
_L11:
            appendable.append("\\\\");
              goto _L12
_L4:
            appendable.append("\\b");
              goto _L12
_L7:
            appendable.append("\\f");
              goto _L12
_L6:
            appendable.append("\\n");
              goto _L12
_L8:
            appendable.append("\\r");
              goto _L12
_L5:
            appendable.append("\\t");
              goto _L12
_L10:
            appendable.append("\\/");
              goto _L12
_L14:
            appendable.append(c1);
              goto _L12
_L2:
            return;
_L3:
            if ((c1 < 0 || c1 > '\037') && (c1 < '\177' || c1 > '\237') && (c1 < '\u2000' || c1 > '\u20FF')) goto _L14; else goto _L13
_L12:
            i++;
            if (true) goto _L16; else goto _L15
_L15:
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b
        implements g
    {

        public final void a(String s, Appendable appendable)
        {
            int i = 0;
_L15:
            if (i >= s.length()) goto _L2; else goto _L1
_L1:
            char c1 = s.charAt(i);
            c1;
            JVM INSTR lookupswitch 7: default 281
        //                       8: 209
        //                       9: 257
        //                       10: 233
        //                       12: 221
        //                       13: 245
        //                       34: 174
        //                       92: 197;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L12:
            try
            {
                appendable.append("\\u");
                appendable.append("0123456789ABCDEF".charAt(c1 >> 12 & 0xf));
                appendable.append("0123456789ABCDEF".charAt(c1 >> 8 & 0xf));
                appendable.append("0123456789ABCDEF".charAt(c1 >> 4 & 0xf));
                appendable.append("0123456789ABCDEF".charAt(c1 >> 0 & 0xf));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException("Impossible Exeption");
            }
              goto _L11
_L9:
            appendable.append("\\\"");
              goto _L11
_L10:
            appendable.append("\\\\");
              goto _L11
_L4:
            appendable.append("\\b");
              goto _L11
_L7:
            appendable.append("\\f");
              goto _L11
_L6:
            appendable.append("\\n");
              goto _L11
_L8:
            appendable.append("\\r");
              goto _L11
_L5:
            appendable.append("\\t");
              goto _L11
_L13:
            appendable.append(c1);
              goto _L11
_L2:
            return;
_L3:
            if ((c1 < 0 || c1 > '\037') && (c1 < '\177' || c1 > '\237') && (c1 < '\u2000' || c1 > '\u20FF')) goto _L13; else goto _L12
_L11:
            i++;
            if (true) goto _L15; else goto _L14
_L14:
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    private static final class c
        implements f
    {

        public final boolean a(String s)
        {
            boolean flag1 = true;
            if (s != null) goto _L2; else goto _L1
_L1:
            boolean flag = false;
_L4:
            return flag;
_L2:
            int k;
            int j1;
label0:
            {
                int l = s.length();
                flag = flag1;
                if (l == 0)
                {
                    continue; /* Loop/switch isn't completed */
                }
                flag = flag1;
                if (s.trim() != s)
                {
                    continue; /* Loop/switch isn't completed */
                }
                char c1 = s.charAt(0);
                flag = flag1;
                if (j.d(c1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                flag = flag1;
                if (j.e(c1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                for (int i = 1; i < l; i++)
                {
                    char c2 = s.charAt(i);
                    flag = flag1;
                    if (j.c(c2))
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    flag = flag1;
                    if (j.e(c2))
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                }

                flag = flag1;
                if (j.a(s))
                {
                    continue; /* Loop/switch isn't completed */
                }
                k = s.charAt(0);
                if ((k < '0' || k > '9') && k != '-')
                {
                    break; /* Loop/switch isn't completed */
                }
                l = 1;
                do
                {
                    if (l >= s.length())
                    {
                        break;
                    }
                    char c4 = s.charAt(l);
                    k = c4;
                    if (c4 < '0')
                    {
                        break;
                    }
                    k = c4;
                    if (c4 > '9')
                    {
                        break;
                    }
                    l++;
                    k = c4;
                } while (true);
                flag = flag1;
                if (l == s.length())
                {
                    continue; /* Loop/switch isn't completed */
                }
                int k1 = l;
                j1 = k;
                if (k == '.')
                {
                    l++;
                    j1 = k;
                    k = l;
                    do
                    {
                        k1 = k;
                        if (k >= s.length())
                        {
                            break;
                        }
                        l = s.charAt(k);
                        k1 = k;
                        j1 = l;
                        if (l < '0')
                        {
                            break;
                        }
                        k1 = k;
                        j1 = l;
                        if (l > '9')
                        {
                            break;
                        }
                        k++;
                        j1 = l;
                    } while (true);
                }
                flag = flag1;
                if (k1 == s.length())
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (j1 != 'E' || j1 != 'e')
                {
                    return false;
                }
                j1 = k1 + 1;
                if (j1 == s.length())
                {
                    return false;
                }
                l = s.charAt(j1);
                if (l != '+')
                {
                    k = l;
                    if (l != '-')
                    {
                        break label0;
                    }
                }
                if (j1 == s.length())
                {
                    return false;
                }
                k = s.charAt(j1);
            }
            int i1;
label1:
            {
                if (k != '+')
                {
                    i1 = j1;
                    if (k != '-')
                    {
                        break label1;
                    }
                }
                i1 = j1;
                if (j1 == s.length())
                {
                    return false;
                }
            }
            do
            {
                if (i1 >= s.length())
                {
                    break;
                }
                char c3 = s.charAt(i1);
                if (c3 < '0' || c3 > '9')
                {
                    break;
                }
                i1++;
            } while (true);
            flag = flag1;
            if (i1 != s.length())
            {
                return false;
            }
            if (true) goto _L4; else goto _L3
_L3:
            return false;
        }

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }

    private static final class d
        implements f
    {

        public final boolean a(String s)
        {
            if (s != null)
            {
                int k = s.length();
                if (k == 0)
                {
                    return true;
                }
                if (s.trim() != s)
                {
                    return true;
                }
                char c2 = s.charAt(0);
                if (c2 >= '0' && c2 <= '9' || c2 == '-')
                {
                    return true;
                }
                for (int i = 0; i < k; i++)
                {
                    char c1 = s.charAt(i);
                    if (j.a(c1))
                    {
                        return true;
                    }
                    if (j.d(c1))
                    {
                        return true;
                    }
                    if (j.b(c1))
                    {
                        return true;
                    }
                    if (j.e(c1))
                    {
                        return true;
                    }
                }

                if (j.a(s))
                {
                    return true;
                }
            }
            return false;
        }

        private d()
        {
        }

        d(byte byte0)
        {
            this();
        }
    }

    private static final class e
        implements f
    {

        public final boolean a(String s)
        {
            return true;
        }

        private e()
        {
        }

        e(byte byte0)
        {
            this();
        }
    }

    public static interface f
    {

        public abstract boolean a(String s);
    }

    public static interface g
    {

        public abstract void a(String s, Appendable appendable);
    }


    public static final d a = new d((byte)0);
    public static final e b = new e((byte)0);
    public static final c c = new c((byte)0);
    public static final b d = new b((byte)0);
    public static final a e = new a((byte)0);

    public static boolean a(char c1)
    {
        return c1 == '\r' || c1 == '\n' || c1 == '\t' || c1 == ' ';
    }

    public static boolean a(String s)
    {
        if (s.length() >= 3)
        {
            char c1 = s.charAt(0);
            if (c1 == 'n')
            {
                return s.equals("null");
            }
            if (c1 == 't')
            {
                return s.equals("true");
            }
            if (c1 == 'f')
            {
                return s.equals("false");
            }
            if (c1 == 'N')
            {
                return s.equals("NaN");
            }
        }
        return false;
    }

    public static boolean b(char c1)
    {
        return c1 == '\b' || c1 == '\f' || c1 == '\n';
    }

    public static boolean c(char c1)
    {
        return c1 == '}' || c1 == ']' || c1 == ',' || c1 == ':';
    }

    public static boolean d(char c1)
    {
        return c1 == '{' || c1 == '[' || c1 == ',' || c1 == '}' || c1 == ']' || c1 == ':' || c1 == '\'' || c1 == '"';
    }

    public static boolean e(char c1)
    {
        return c1 >= 0 && c1 <= '\037' || c1 >= '\177' && c1 <= '\237' || c1 >= '\u2000' && c1 <= '\u20FF';
    }

}
