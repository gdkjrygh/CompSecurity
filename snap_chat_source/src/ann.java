// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class ann
{
    static final class a
        implements ano, anq
    {

        private final char a;

        public final int a()
        {
            return 1;
        }

        public final int a(anp anp, String s, int i1)
        {
            if (i1 >= s.length())
            {
                return ~i1;
            }
            char c2 = s.charAt(i1);
            char c1 = a;
            if (c2 != c1)
            {
                c2 = Character.toUpperCase(c2);
                c1 = Character.toUpperCase(c1);
                if (c2 != c1 && Character.toLowerCase(c2) != Character.toLowerCase(c1))
                {
                    return ~i1;
                }
            }
            return i1 + 1;
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw, Locale locale)
        {
            stringbuffer.append(a);
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
            stringbuffer.append(a);
        }

        public final int b()
        {
            return 1;
        }

        a(char c1)
        {
            a = c1;
        }
    }

    static final class b
        implements ano, anq
    {

        final anq a[];
        final ano b[];
        private final int c;
        private final int d;

        private static void a(List list, List list1, List list2)
        {
            int j1 = list.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                Object obj = list.get(i1);
                if (obj instanceof b)
                {
                    a(list1, ((Object []) (((b)obj).a)));
                } else
                {
                    list1.add(obj);
                }
                obj = list.get(i1 + 1);
                if (obj instanceof b)
                {
                    a(list2, ((Object []) (((b)obj).b)));
                } else
                {
                    list2.add(obj);
                }
                i1 += 2;
            }
        }

        private static void a(List list, Object aobj[])
        {
            if (aobj != null)
            {
                for (int i1 = 0; i1 < aobj.length; i1++)
                {
                    list.add(aobj[i1]);
                }

            }
        }

        public final int a()
        {
            return c;
        }

        public final int a(anp anp, String s, int i1)
        {
            ano aano[] = b;
            if (aano == null)
            {
                throw new UnsupportedOperationException();
            }
            int k1 = aano.length;
            boolean flag = false;
            int j1 = i1;
            for (i1 = ((flag) ? 1 : 0); i1 < k1 && j1 >= 0; i1++)
            {
                j1 = aano[i1].a(anp, s, j1);
            }

            return j1;
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw, Locale locale)
        {
            anq aanq[] = a;
            if (aanq == null)
            {
                throw new UnsupportedOperationException();
            }
            if (locale == null)
            {
                locale = Locale.getDefault();
            }
            int k1 = aanq.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                aanq[j1].a(stringbuffer, l1, alr, i1, alw, locale);
            }

        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
            anq aanq[] = a;
            if (aanq == null)
            {
                throw new UnsupportedOperationException();
            }
            Locale locale1 = locale;
            if (locale == null)
            {
                locale1 = Locale.getDefault();
            }
            int j1 = aanq.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                aanq[i1].a(stringbuffer, alo, locale1);
            }

        }

        public final int b()
        {
            return d;
        }

        b(List list)
        {
            boolean flag = false;
            super();
            ArrayList arraylist1 = new ArrayList();
            ArrayList arraylist = new ArrayList();
            a(list, arraylist1, arraylist);
            if (arraylist1.contains(null) || arraylist1.isEmpty())
            {
                a = null;
                c = 0;
            } else
            {
                int i2 = arraylist1.size();
                a = new anq[i2];
                int i1 = 0;
                int k1 = 0;
                for (; i1 < i2; i1++)
                {
                    list = (anq)arraylist1.get(i1);
                    k1 += list.a();
                    a[i1] = list;
                }

                c = k1;
            }
            if (arraylist.contains(null) || arraylist.isEmpty())
            {
                b = null;
                d = 0;
                return;
            }
            int j2 = arraylist.size();
            b = new ano[j2];
            int l1 = 0;
            for (int j1 = ((flag) ? 1 : 0); j1 < j2; j1++)
            {
                list = (ano)arraylist.get(j1);
                l1 += list.b();
                b[j1] = list;
            }

            d = l1;
        }
    }

    static final class c extends g
    {

        public final int a(anp anp, String s, int i1)
        {
            int l1 = super.a(anp, s, i1);
            if (l1 >= 0) goto _L2; else goto _L1
_L1:
            int k1;
            return l1;
_L2:
            int j1;
label0:
            {
                if (l1 == (k1 = b + i1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                j1 = k1;
                if (!c)
                {
                    break label0;
                }
                i1 = s.charAt(i1);
                if (i1 != 45)
                {
                    j1 = k1;
                    if (i1 != 43)
                    {
                        break label0;
                    }
                }
                j1 = k1 + 1;
            }
            if (l1 > j1)
            {
                return ~(j1 + 1);
            }
            if (l1 < j1)
            {
                return ~l1;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        protected c(alu alu1, int i1)
        {
            super(alu1, i1, false, i1);
        }
    }

    static final class d
        implements ano, anq
    {

        private final alu a;
        private int b;
        private int c;

        private void a(StringBuffer stringbuffer, long l1, alr alr1)
        {
            int i1;
            alr1 = a.a(alr1);
            i1 = b;
            long l3 = alr1.f(l1);
            if (l3 != 0L) goto _L2; else goto _L1
_L1:
            int j1 = i1;
            if (stringbuffer == null) goto _L4; else goto _L3
_L3:
            do
            {
                i1--;
                if (i1 < 0)
                {
                    break;
                }
                stringbuffer.append('0');
            } while (true);
              goto _L5
            alr1;
            j1 = i1;
            if (stringbuffer == null) goto _L7; else goto _L6
_L6:
            ann.a(stringbuffer, i1);
_L5:
            return;
_L7:
            i1 = j1 - 1;
            if (i1 < 0) goto _L5; else goto _L8
_L8:
            throw new NullPointerException();
_L4:
            i1 = j1 - 1;
            if (i1 < 0) goto _L5; else goto _L9
_L9:
            throw new NullPointerException();
_L2:
            long l2;
            l2 = alr1.d().d();
            j1 = c;
_L31:
            j1;
            JVM INSTR tableswitch 1 18: default 220
        //                       1 243
        //                       2 250
        //                       3 257
        //                       4 264
        //                       5 271
        //                       6 278
        //                       7 285
        //                       8 292
        //                       9 299
        //                       10 306
        //                       11 313
        //                       12 320
        //                       13 327
        //                       14 334
        //                       15 341
        //                       16 348
        //                       17 355
        //                       18 362;
               goto _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L10:
            l1 = 1L;
_L32:
            if ((l2 * l1) / l1 == l2) goto _L30; else goto _L29
_L29:
            j1--;
              goto _L31
_L11:
            l1 = 10L;
              goto _L32
_L12:
            l1 = 100L;
              goto _L32
_L13:
            l1 = 1000L;
              goto _L32
_L14:
            l1 = 10000L;
              goto _L32
_L15:
            l1 = 0x186a0L;
              goto _L32
_L16:
            l1 = 0xf4240L;
              goto _L32
_L17:
            l1 = 0x989680L;
              goto _L32
_L18:
            l1 = 0x5f5e100L;
              goto _L32
_L19:
            l1 = 0x3b9aca00L;
              goto _L32
_L20:
            l1 = 0x2540be400L;
              goto _L32
_L21:
            l1 = 0x174876e800L;
              goto _L32
_L22:
            l1 = 0xe8d4a51000L;
              goto _L32
_L23:
            l1 = 0x9184e72a000L;
              goto _L32
_L24:
            l1 = 0x5af3107a4000L;
              goto _L32
_L25:
            l1 = 0x38d7ea4c68000L;
              goto _L32
_L26:
            l1 = 0x2386f26fc10000L;
              goto _L32
_L27:
            l1 = 0x16345785d8a0000L;
              goto _L32
_L28:
            l1 = 0xde0b6b3a7640000L;
              goto _L32
_L30:
            int k2;
            alr1 = new long[2];
            alr1[0] = (l1 * l3) / l2;
            alr1[1] = j1;
            l1 = alr1[0];
            int i2 = (int)alr1[1];
            if ((0x7fffffffL & l1) == l1)
            {
                alr1 = Integer.toString((int)l1);
            } else
            {
                alr1 = Long.toString(l1);
            }
            k2 = alr1.length();
            j1 = i1;
            for (i1 = i2; k2 < i1;)
            {
                if (stringbuffer != null)
                {
                    stringbuffer.append('0');
                    i1--;
                    j1--;
                } else
                {
                    throw new NullPointerException();
                }
            }

            if (j1 >= i1) goto _L34; else goto _L33
_L33:
            int j2 = i1;
            for (i1 = k2; j1 < j2 && i1 > 1 && alr1.charAt(i1 - 1) == '0'; j2--)
            {
                i1--;
            }

            if (i1 >= alr1.length()) goto _L34; else goto _L35
_L35:
            if (stringbuffer == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            int k1 = 0;
            while (k1 < i1) 
            {
                stringbuffer.append(alr1.charAt(k1));
                k1++;
            }
              goto _L5
            if (i1 >= 0) goto _L5; else goto _L36
_L36:
            alr1.charAt(0);
            throw new NullPointerException();
_L34:
            if (stringbuffer != null)
            {
                stringbuffer.append(alr1);
                return;
            } else
            {
                throw new NullPointerException();
            }
        }

        public final int a()
        {
            return c;
        }

        public final int a(anp anp1, String s, int i1)
        {
            alt alt1 = a.a(anp1.a);
            int k1 = Math.min(c, s.length() - i1);
            long l1 = 0L;
            long l2 = alt1.d().d() * 10L;
            int j1 = 0;
            do
            {
                if (j1 >= k1)
                {
                    break;
                }
                char c1 = s.charAt(i1 + j1);
                if (c1 < '0' || c1 > '9')
                {
                    break;
                }
                j1++;
                l2 /= 10L;
                l1 += (long)(c1 - 48) * l2;
            } while (true);
            l1 /= 10L;
            if (j1 == 0)
            {
                return ~i1;
            }
            if (l1 > 0x7fffffffL)
            {
                return ~i1;
            } else
            {
                anp1.a(new anp.a(new anb(alu.a(), amZ.a, alt1.d()), (int)l1));
                return j1 + i1;
            }
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr1, int i1, alw alw, Locale locale)
        {
            try
            {
                a(stringbuffer, l1, alr1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (StringBuffer stringbuffer)
            {
                return;
            }
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
            long l1 = alo.b().a(alo, 0L);
            try
            {
                a(stringbuffer, l1, alo.b());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (StringBuffer stringbuffer)
            {
                return;
            }
        }

        public final int b()
        {
            return c;
        }

        protected d(alu alu1, int i1, int j1)
        {
            a = alu1;
            int k1 = j1;
            if (j1 > 18)
            {
                k1 = 18;
            }
            b = i1;
            c = k1;
        }
    }

    static final class e
        implements ano
    {

        private final ano a[];
        private final int b;

        public final int a(anp anp1, String s, int i1)
        {
            Object obj;
            ano aano[];
            Object obj1;
            int j1;
            int k1;
            int l1;
            int j2;
            aano = a;
            j2 = aano.length;
            obj1 = anp1.a();
            obj = null;
            l1 = 0;
            k1 = i1;
            j1 = i1;
_L3:
            ano ano1;
            if (l1 >= j2)
            {
                break MISSING_BLOCK_LABEL_206;
            }
            ano1 = aano[l1];
            if (ano1 != null) goto _L2; else goto _L1
_L1:
            if (j1 <= i1)
            {
                return i1;
            }
            l1 = 1;
_L4:
            int i2;
            if (j1 > i1 || j1 == i1 && l1 != 0)
            {
                if (obj != null)
                {
                    anp1.a(obj);
                }
                return j1;
            } else
            {
                return ~k1;
            }
_L2:
            i2 = ano1.a(anp1, s, i1);
            if (i2 >= i1)
            {
                if (i2 > j1)
                {
                    if (i2 >= s.length() || l1 + 1 >= j2 || aano[l1 + 1] == null)
                    {
                        return i2;
                    }
                    obj = anp1.a();
                    j1 = i2;
                }
            } else
            if (i2 < 0)
            {
                i2 = ~i2;
                if (i2 > k1)
                {
                    k1 = i2;
                }
            }
            anp1.a(obj1);
            l1++;
              goto _L3
            l1 = 0;
              goto _L4
        }

        public final int b()
        {
            return b;
        }

        e(ano aano[])
        {
            a = aano;
            int i1 = 0;
            int j1 = aano.length;
            do
            {
                j1--;
                if (j1 < 0)
                {
                    break;
                }
                ano ano1 = aano[j1];
                if (ano1 != null)
                {
                    int k1 = ano1.b();
                    if (k1 > i1)
                    {
                        i1 = k1;
                    }
                }
            } while (true);
            b = i1;
        }
    }

    static abstract class f
        implements ano, anq
    {

        protected final alu a;
        protected final int b;
        protected final boolean c;

        public int a(anp anp1, String s, int i1)
        {
            int j1;
            int k1;
            int l1;
            int i2 = Math.min(b, s.length() - i1);
            k1 = 0;
            j1 = i1;
            l1 = 0;
            i1 = k1;
            k1 = l1;
            do
            {
                l1 = i1;
                if (k1 >= i2)
                {
                    break;
                }
                char c1 = s.charAt(j1 + k1);
                if (k1 == 0 && (c1 == '-' || c1 == '+') && c)
                {
                    if (c1 == '-')
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    l1 = i1;
                    if (k1 + 1 >= i2)
                    {
                        break;
                    }
                    c1 = s.charAt(j1 + k1 + 1);
                    l1 = i1;
                    if (c1 < '0')
                    {
                        break;
                    }
                    l1 = i1;
                    if (c1 > '9')
                    {
                        break;
                    }
                    if (i1 != 0)
                    {
                        k1++;
                    } else
                    {
                        j1++;
                    }
                    i2 = Math.min(i2 + 1, s.length() - j1);
                    continue;
                }
                l1 = i1;
                if (c1 < '0')
                {
                    break;
                }
                l1 = i1;
                if (c1 > '9')
                {
                    break;
                }
                k1++;
            } while (true);
            if (k1 == 0)
            {
                return ~j1;
            }
            if (k1 < 9) goto _L2; else goto _L1
_L1:
            k1 = j1 + k1;
            j1 = Integer.parseInt(s.substring(j1, k1));
_L4:
            anp1.a(a, j1);
            return k1;
_L2:
            int j2;
            char c2;
            if (l1 != 0)
            {
                i1 = j1 + 1;
            } else
            {
                i1 = j1;
            }
            try
            {
                c2 = s.charAt(i1);
            }
            // Misplaced declaration of an exception variable
            catch (anp anp1)
            {
                return ~j1;
            }
            j2 = j1 + k1;
            k1 = c2 - 48;
            j1 = i1 + 1;
            i1 = k1;
            for (; j1 < j2; j1++)
            {
                i1 = ((i1 << 1) + (i1 << 3) + s.charAt(j1)) - 48;
            }

            j1 = i1;
            k1 = j2;
            if (l1 != 0)
            {
                j1 = -i1;
                k1 = j2;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final int b()
        {
            return b;
        }

        f(alu alu1, int i1, boolean flag)
        {
            a = alu1;
            b = i1;
            c = flag;
        }
    }

    static class g extends f
    {

        private int d;

        public final int a()
        {
            return b;
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw, Locale locale)
        {
            try
            {
                anr.a(stringbuffer, a.a(alr).a(l1), d);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (alr alr)
            {
                ann.a(stringbuffer, d);
            }
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
            if (alo.b(a))
            {
                try
                {
                    anr.a(stringbuffer, alo.a(a), d);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (alO alo) { }
            }
            ann.a(stringbuffer, d);
        }

        protected g(alu alu1, int i1, boolean flag, int j1)
        {
            super(alu1, i1, flag);
            d = j1;
        }
    }

    static final class h
        implements ano, anq
    {

        private final String a;

        public final int a()
        {
            return a.length();
        }

        public final int a(anp anp, String s, int i1)
        {
            if (s.regionMatches(true, i1, a, 0, a.length()))
            {
                return a.length() + i1;
            } else
            {
                return ~i1;
            }
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw, Locale locale)
        {
            stringbuffer.append(a);
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
            stringbuffer.append(a);
        }

        public final int b()
        {
            return a.length();
        }

        h(String s)
        {
            a = s;
        }
    }

    static final class i
        implements ano, anq
    {

        private static Map a = new HashMap();
        private final alu b;
        private final boolean c;

        public final int a()
        {
            return !c ? 20 : 6;
        }

        public final int a(anp anp1, String s, int i1)
        {
            Locale locale = anp1.d;
            Map map = a;
            map;
            JVM INSTR monitorenter ;
            Object obj = (Map)a.get(locale);
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            obj = new HashMap();
            a.put(locale, obj);
            Object obj1 = ((Object) ((Object[])((Map) (obj)).get(b)));
            if (obj1 != null) goto _L2; else goto _L1
_L1:
            Object obj2;
            alu alu1;
            obj1 = new HashSet(32);
            obj2 = new alG(0L, alw.a);
            alu1 = b;
            if (alu1 != null)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
            anp1;
            map;
            JVM INSTR monitorexit ;
            throw anp1;
            int j1;
            int l1;
            alt alt1 = alu1.a(((alV) (obj2)).b);
            if (!alt1.c())
            {
                throw new IllegalArgumentException((new StringBuilder("Field '")).append(alu1).append("' is not supported").toString());
            }
            obj2 = new alG.a(((alG) (obj2)), alt1);
            j1 = ((amQ) (obj2)).a().g();
            l1 = ((amQ) (obj2)).a().h();
            if (l1 - j1 <= 32)
            {
                break MISSING_BLOCK_LABEL_228;
            }
            map;
            JVM INSTR monitorexit ;
            return ~i1;
            int k1 = ((amQ) (obj2)).a().a(locale);
_L4:
            if (j1 > l1)
            {
                break; /* Loop/switch isn't completed */
            }
            ((alG.a) (obj2)).a.a(((alG.a) (obj2)).b.b(((alV) (((alG.a) (obj2)).a)).a, j1));
            ((Set) (obj1)).add(((alG.a) (obj2)).b(locale));
            ((Set) (obj1)).add(((alG.a) (obj2)).b(locale).toLowerCase(locale));
            ((Set) (obj1)).add(((alG.a) (obj2)).b(locale).toUpperCase(locale));
            ((Set) (obj1)).add(((alG.a) (obj2)).a(locale));
            ((Set) (obj1)).add(((alG.a) (obj2)).a(locale).toLowerCase(locale));
            ((Set) (obj1)).add(((alG.a) (obj2)).a(locale).toUpperCase(locale));
            j1++;
            if (true) goto _L4; else goto _L3
_L3:
            j1 = k1;
            if (!"en".equals(locale.getLanguage()))
            {
                break MISSING_BLOCK_LABEL_466;
            }
            j1 = k1;
            if (b != alu.w())
            {
                break MISSING_BLOCK_LABEL_466;
            }
            ((Set) (obj1)).add("BCE");
            ((Set) (obj1)).add("bce");
            ((Set) (obj1)).add("CE");
            ((Set) (obj1)).add("ce");
            j1 = 3;
            ((Map) (obj)).put(b, ((Object) (new Object[] {
                obj1, Integer.valueOf(j1)
            })));
            obj = obj1;
_L8:
            map;
            JVM INSTR monitorexit ;
            j1 = Math.min(s.length(), j1 + i1);
_L6:
            if (j1 <= i1)
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = s.substring(i1, j1);
            if (((Set) (obj)).contains(obj1))
            {
                anp1.a(new anp.a(b.a(anp1.a), ((String) (obj1)), locale));
                return j1;
            }
            j1--;
            continue; /* Loop/switch isn't completed */
_L2:
            obj = (Set)obj1[0];
            j1 = ((Integer)obj1[1]).intValue();
            continue; /* Loop/switch isn't completed */
            if (true) goto _L6; else goto _L5
_L5:
            return ~i1;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw1, Locale locale)
        {
            alr = b.a(alr);
            if (!c)
            {
                break MISSING_BLOCK_LABEL_36;
            }
            alr = alr.b(l1, locale);
_L1:
            stringbuffer.append(alr);
            return;
            try
            {
                alr = alr.a(l1, locale);
            }
            // Misplaced declaration of an exception variable
            catch (alr alr)
            {
                stringbuffer.append('\uFFFD');
                return;
            }
              goto _L1
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
            alt alt1;
            if (!alo.b(b))
            {
                break MISSING_BLOCK_LABEL_61;
            }
            alt1 = b.a(alo.b());
            if (!c) goto _L2; else goto _L1
_L1:
            alo = alt1.b(alo, locale);
_L3:
            stringbuffer.append(alo);
            return;
_L2:
            try
            {
                alo = alt1.a(alo, locale);
            }
            // Misplaced declaration of an exception variable
            catch (alO alo)
            {
                stringbuffer.append('\uFFFD');
                return;
            }
              goto _L3
            alo = "\uFFFD";
              goto _L3
        }

        public final int b()
        {
            return a();
        }


        i(alu alu1, boolean flag)
        {
            b = alu1;
            c = flag;
        }
    }

    static final class j extends Enum
        implements ano, anq
    {

        public static final j a;
        private static Set b;
        private static int c;
        private static final j d[];

        public static j valueOf(String s)
        {
            return (j)Enum.valueOf(ann$j, s);
        }

        public static final j[] values()
        {
            return (j[])d.clone();
        }

        public final int a()
        {
            return c;
        }

        public final int a(anp anp1, String s, int i1)
        {
            String s3;
            Iterator iterator;
            s3 = s.substring(i1);
            s = null;
            iterator = b.iterator();
_L2:
            String s1;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            String s2 = (String)iterator.next();
            if (!s3.startsWith(s2))
            {
                break MISSING_BLOCK_LABEL_104;
            }
            s1 = s2;
            if (s != null)
            {
                if (s2.length() <= s.length())
                {
                    break MISSING_BLOCK_LABEL_104;
                }
                s1 = s2;
            }
_L3:
            s = s1;
            if (true) goto _L2; else goto _L1
_L1:
            if (s != null)
            {
                anp1.a(alw.a(s));
                return s.length() + i1;
            } else
            {
                return ~i1;
            }
            s1 = s;
              goto _L3
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw1, Locale locale)
        {
            if (alw1 != null)
            {
                alr = alw1.c;
            } else
            {
                alr = "";
            }
            stringbuffer.append(alr);
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
        }

        public final int b()
        {
            return c;
        }

        static 
        {
            a = new j("INSTANCE");
            d = (new j[] {
                a
            });
            b = alw.b();
            Iterator iterator = b.iterator();
            int i1;
            for (i1 = 0; iterator.hasNext(); i1 = Math.max(i1, ((String)iterator.next()).length())) { }
            c = i1;
        }

        private j(String s)
        {
            super(s, 0);
        }
    }

    static final class k
        implements ano, anq
    {

        private final int a;

        public final int a()
        {
            return a != 1 ? 20 : 4;
        }

        public final int a(anp anp1, String s, int i1)
        {
            Map map;
            String s3;
            Iterator iterator;
            map = alv.b();
            s3 = s.substring(i1);
            s = null;
            iterator = map.keySet().iterator();
_L2:
            String s1;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            String s2 = (String)iterator.next();
            if (!s3.startsWith(s2))
            {
                break MISSING_BLOCK_LABEL_120;
            }
            s1 = s2;
            if (s != null)
            {
                if (s2.length() <= s.length())
                {
                    break MISSING_BLOCK_LABEL_120;
                }
                s1 = s2;
            }
_L3:
            s = s1;
            if (true) goto _L2; else goto _L1
_L1:
            if (s != null)
            {
                anp1.a((alw)map.get(s));
                return s.length() + i1;
            } else
            {
                return ~i1;
            }
            s1 = s;
              goto _L3
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw1, Locale locale)
        {
            l1 -= i1;
            if (alw1 == null) goto _L2; else goto _L1
_L1:
            a;
            JVM INSTR tableswitch 0 1: default 36
        //                       0 48
        //                       1 127;
               goto _L2 _L3 _L4
_L2:
            alr = "";
_L6:
            stringbuffer.append(alr);
            return;
_L3:
            alr = locale;
            if (locale == null)
            {
                alr = Locale.getDefault();
            }
            locale = alw1.a(l1);
            if (locale == null)
            {
                alr = alw1.c;
            } else
            {
                locale = alw.b.b(alr, alw1.c, locale);
                alr = locale;
                if (locale == null)
                {
                    alr = alw.b(alw1.b(l1));
                }
            }
            continue; /* Loop/switch isn't completed */
_L4:
            alr = locale;
            if (locale == null)
            {
                alr = Locale.getDefault();
            }
            locale = alw1.a(l1);
            if (locale == null)
            {
                alr = alw1.c;
            } else
            {
                locale = alw.b.a(alr, alw1.c, locale);
                alr = locale;
                if (locale == null)
                {
                    alr = alw.b(alw1.b(l1));
                }
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
        }

        public final int b()
        {
            return a != 1 ? 20 : 4;
        }

        k(int i1)
        {
            a = i1;
        }
    }

    static final class l
        implements ano, anq
    {

        private final String a;
        private final String b;
        private final boolean c;
        private final int d;

        private static int a(String s, int i1, int j1)
        {
            j1 = Math.min(s.length() - i1, j1);
            int k1 = 0;
            do
            {
                if (j1 <= 0)
                {
                    break;
                }
                char c1 = s.charAt(i1 + k1);
                if (c1 < '0' || c1 > '9')
                {
                    break;
                }
                k1++;
                j1--;
            } while (true);
            return k1;
        }

        public final int a()
        {
            byte byte0 = 6;
            if (c)
            {
                byte0 = 7;
            }
            int i1 = byte0;
            if (a != null)
            {
                i1 = byte0;
                if (a.length() > byte0)
                {
                    i1 = a.length();
                }
            }
            return i1;
        }

        public final int a(anp anp1, String s, int i1)
        {
            int j1;
            boolean flag;
            boolean flag1;
            int l2;
            int i3;
            int j3;
label0:
            {
                flag1 = false;
                j1 = s.length() - i1;
                if (b == null)
                {
                    break label0;
                }
                if (b.length() == 0)
                {
                    if (j1 > 0)
                    {
                        char c1 = s.charAt(i1);
                        if (c1 == '-' || c1 == '+')
                        {
                            break label0;
                        }
                    }
                    anp1.a(Integer.valueOf(0));
                    return i1;
                }
                if (s.regionMatches(true, i1, b, 0, b.length()))
                {
                    anp1.a(Integer.valueOf(0));
                    return i1 + b.length();
                }
            }
            if (j1 <= 1)
            {
                return ~i1;
            }
            int k1 = s.charAt(i1);
            if (k1 == '-')
            {
                flag = true;
            } else
            if (k1 == '+')
            {
                flag = false;
            } else
            {
                return ~i1;
            }
            i1++;
            if (a(s, i1, 2) < 2)
            {
                return ~i1;
            }
            k1 = anr.a(s, i1);
            if (k1 > 23)
            {
                return ~i1;
            }
            j3 = k1 * 0x36ee80;
            l2 = j1 - 1 - 2;
            i3 = i1 + 2;
            i1 = i3;
            j1 = j3;
            if (l2 <= 0) goto _L2; else goto _L1
_L1:
            int k3 = s.charAt(i3);
            if (k3 != ':') goto _L4; else goto _L3
_L3:
            int l1;
            l2--;
            l1 = i3 + 1;
            flag1 = true;
_L10:
            i3 = a(s, l1, 2);
            if (i3 != 0) goto _L6; else goto _L5
_L5:
            i1 = l1;
            j1 = j3;
            if (!flag1) goto _L2; else goto _L6
_L6:
            if (i3 < 2)
            {
                return ~l1;
            }
            i1 = anr.a(s, l1);
            if (i1 > 59)
            {
                return ~l1;
            }
            j3 += i1 * 60000;
            k3 = l2 - 2;
            i3 = l1 + 2;
            i1 = i3;
            j1 = j3;
              goto _L7
_L4:
            i1 = i3;
            j1 = j3;
            if (k3 < '0') goto _L2; else goto _L8
_L8:
            l1 = i3;
            if (k3 <= '9') goto _L10; else goto _L9
_L9:
            j1 = j3;
            i1 = i3;
_L2:
            l1 = j1;
            j1 = i1;
            i1 = l1;
_L14:
            if (flag)
            {
                i1 = -i1;
            }
            anp1.a(Integer.valueOf(i1));
            return j1;
_L7:
            if (k3 <= 0) goto _L2; else goto _L11
_L11:
            l2 = k3;
            l1 = i3;
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_437;
            }
            i1 = i3;
            j1 = j3;
            if (s.charAt(i3) != ':') goto _L2; else goto _L12
_L12:
            l2 = k3 - 1;
            l1 = i3 + 1;
            i3 = a(s, l1, 2);
            if (i3 != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            i1 = l1;
            j1 = j3;
            if (!flag1) goto _L2; else goto _L13
_L13:
label1:
            {
                if (i3 < 2)
                {
                    return ~l1;
                }
                i1 = anr.a(s, l1);
                if (i1 > 59)
                {
                    return ~l1;
                }
                i3 = j3 + i1 * 1000;
                l1 += 2;
                i1 = l1;
                if (l2 - 2 <= 0)
                {
                    break label1;
                }
                j1 = l1;
                if (flag1)
                {
                    if (s.charAt(l1) != '.')
                    {
                        i1 = l1;
                        if (s.charAt(l1) != ',')
                        {
                            break label1;
                        }
                    }
                    j1 = l1 + 1;
                }
                l2 = a(s, j1, 3);
                if (l2 == 0)
                {
                    i1 = j1;
                    if (!flag1)
                    {
                        break label1;
                    }
                }
                if (l2 <= 0)
                {
                    return ~j1;
                }
                int k2 = j1 + 1;
                i1 = (s.charAt(j1) - 48) * 100 + i3;
                if (l2 > 1)
                {
                    int i2 = k2 + 1;
                    k2 = (s.charAt(k2) - 48) * 10 + i1;
                    i1 = k2;
                    j1 = i2;
                    if (l2 > 2)
                    {
                        i1 = k2 + (s.charAt(i2) - 48);
                        j1 = i2 + 1;
                    }
                } else
                {
                    j1 = k2;
                }
            }
              goto _L14
            j1 = i3;
            int j2 = i1;
            i1 = j1;
            j1 = j2;
              goto _L14
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw, Locale locale)
        {
            if (alw != null)
            {
                if (i1 == 0 && a != null)
                {
                    stringbuffer.append(a);
                    return;
                }
                int j1;
                if (i1 >= 0)
                {
                    stringbuffer.append('+');
                } else
                {
                    stringbuffer.append('-');
                    i1 = -i1;
                }
                j1 = i1 / 0x36ee80;
                anr.a(stringbuffer, j1, 2);
                if (d != 1)
                {
                    i1 -= j1 * 0x36ee80;
                    j1 = i1 / 60000;
                    if (c)
                    {
                        stringbuffer.append(':');
                    }
                    anr.a(stringbuffer, j1, 2);
                    if (d != 2)
                    {
                        i1 -= j1 * 60000;
                        if (i1 != 0)
                        {
                            int k1 = i1 / 1000;
                            if (c)
                            {
                                stringbuffer.append(':');
                            }
                            anr.a(stringbuffer, k1, 2);
                            if (d != 3)
                            {
                                i1 -= k1 * 1000;
                                if (i1 != 0)
                                {
                                    if (c)
                                    {
                                        stringbuffer.append('.');
                                    }
                                    anr.a(stringbuffer, i1, 3);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
        }

        public final int b()
        {
            return a();
        }

        l(String s, String s1, boolean flag, int i1)
        {
            a = s;
            b = s1;
            c = flag;
            if (i1 < 2)
            {
                throw new IllegalArgumentException();
            } else
            {
                d = i1;
                return;
            }
        }
    }

    static final class m
        implements ano, anq
    {

        private final alu a;
        private final int b;
        private final boolean c;

        private int a(long l1, alr alr)
        {
            int i1;
            int j1;
            try
            {
                j1 = a.a(alr).a(l1);
            }
            // Misplaced declaration of an exception variable
            catch (alr alr)
            {
                return -1;
            }
            i1 = j1;
            if (j1 < 0)
            {
                i1 = -j1;
            }
            return i1 % 100;
        }

        private int a(alO alo)
        {
            if (!alo.b(a))
            {
                break MISSING_BLOCK_LABEL_39;
            }
            int j1 = alo.a(a);
            int i1 = j1;
            if (j1 < 0)
            {
                i1 = -j1;
            }
            return i1 % 100;
            alo;
            return -1;
        }

        public final int a()
        {
            return 2;
        }

        public final int a(anp anp1, String s, int i1)
        {
            int i2;
            int k2;
            k2 = 0;
            i2 = s.length() - i1;
            if (c) goto _L2; else goto _L1
_L1:
            int l1;
            l1 = i1;
            if (Math.min(2, i2) < 2)
            {
                return ~i1;
            }
              goto _L3
_L2:
            boolean flag;
            int k1;
            k1 = 0;
            flag = false;
            l1 = 0;
            do
            {
                if (k1 >= i2)
                {
                    break;
                }
                char c1 = s.charAt(i1 + k1);
                if (k1 == 0 && (c1 == '-' || c1 == '+'))
                {
                    if (c1 == '-')
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        k1++;
                        l1 = 1;
                    } else
                    {
                        i1++;
                        l1 = 1;
                        i2--;
                    }
                    continue;
                }
                if (c1 < '0' || c1 > '9')
                {
                    break;
                }
                k1++;
            } while (true);
            if (k1 == 0)
            {
                return ~i1;
            }
            if (l1 != 0) goto _L5; else goto _L4
_L4:
            l1 = i1;
            if (k1 == 2) goto _L3; else goto _L5
_L5:
            if (k1 < 9) goto _L7; else goto _L6
_L6:
            l1 = i1 + k1;
            k1 = Integer.parseInt(s.substring(i1, l1));
_L8:
            anp1.a(a, k1);
            return l1;
_L7:
            int j1;
            int j2;
            if (flag)
            {
                l1 = i1 + 1;
            } else
            {
                l1 = i1;
            }
            k2 = l1 + 1;
            try
            {
                l1 = s.charAt(l1);
            }
            // Misplaced declaration of an exception variable
            catch (anp anp1)
            {
                return ~i1;
            }
            l1 -= 48;
            j2 = i1 + k1;
            k1 = k2;
            i1 = l1;
            for (; k1 < j2; k1++)
            {
                i1 = ((i1 << 1) + (i1 << 3) + s.charAt(k1)) - 48;
            }

            k1 = i1;
            l1 = j2;
            if (flag)
            {
                k1 = -i1;
                l1 = j2;
            }
            if (true) goto _L8; else goto _L3
_L3:
            i1 = s.charAt(l1);
            if (i1 < 48 || i1 > 57)
            {
                return ~l1;
            }
            i1 -= 48;
            j1 = s.charAt(l1 + 1);
            if (j1 < '0' || j1 > '9')
            {
                return ~l1;
            }
            k1 = ((i1 << 1) + (i1 << 3) + j1) - 48;
            i1 = b;
            if (anp1.e != null)
            {
                i1 = anp1.e.intValue();
            }
            j2 = i1 - 50;
            if (j2 >= 0)
            {
                i1 = j2 % 100;
            } else
            {
                i1 = (j2 + 1) % 100 + 99;
            }
            j1 = k2;
            if (k1 < i1)
            {
                j1 = 100;
            }
            anp1.a(a, ((j1 + j2) - i1) + k1);
            return l1 + 2;
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw, Locale locale)
        {
            i1 = a(l1, alr);
            if (i1 < 0)
            {
                stringbuffer.append('\uFFFD');
                stringbuffer.append('\uFFFD');
                return;
            } else
            {
                anr.a(stringbuffer, i1, 2);
                return;
            }
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
            int i1 = a(alo);
            if (i1 < 0)
            {
                stringbuffer.append('\uFFFD');
                stringbuffer.append('\uFFFD');
                return;
            } else
            {
                anr.a(stringbuffer, i1, 2);
                return;
            }
        }

        public final int b()
        {
            return !c ? 2 : 4;
        }

        m(alu alu1, int i1, boolean flag)
        {
            a = alu1;
            b = i1;
            c = flag;
        }
    }

    static final class n extends f
    {

        public final int a()
        {
            return b;
        }

        public final void a(StringBuffer stringbuffer, long l1, alr alr, int i1, alw alw, Locale locale)
        {
            try
            {
                anr.a(stringbuffer, a.a(alr).a(l1));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (alr alr)
            {
                stringbuffer.append('\uFFFD');
            }
        }

        public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
        {
            if (alo.b(a))
            {
                try
                {
                    anr.a(stringbuffer, alo.a(a));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (alO alo)
                {
                    stringbuffer.append('\uFFFD');
                }
                return;
            } else
            {
                stringbuffer.append('\uFFFD');
                return;
            }
        }

        protected n(alu alu1, int i1, boolean flag)
        {
            super(alu1, i1, flag);
        }
    }


    private ArrayList a;
    private Object b;

    public ann()
    {
        a = new ArrayList();
    }

    static void a(StringBuffer stringbuffer, int i1)
    {
        do
        {
            i1--;
            if (i1 >= 0)
            {
                stringbuffer.append('\uFFFD');
            } else
            {
                return;
            }
        } while (true);
    }

    private static boolean b(Object obj)
    {
        if (obj instanceof ano)
        {
            return !(obj instanceof b) || ((b)obj).b != null;
        } else
        {
            return false;
        }
    }

    private ann c(alu alu1, int i1, int j1)
    {
        if (alu1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int k1 = j1;
        if (j1 < i1)
        {
            k1 = i1;
        }
        if (i1 < 0 || k1 <= 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return a(new d(alu1, i1, k1));
        }
    }

    private static void c(ano ano1)
    {
        if (ano1 == null)
        {
            throw new IllegalArgumentException("No parser supplied");
        } else
        {
            return;
        }
    }

    private Object e()
    {
        Object obj;
        Object obj1;
        obj1 = b;
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (a.size() != 2) goto _L4; else goto _L3
_L3:
        Object obj3;
        Object obj4;
        obj3 = a.get(0);
        obj4 = a.get(1);
        if (obj3 == null) goto _L6; else goto _L5
_L5:
        if (obj3 == obj4) goto _L8; else goto _L7
_L7:
        obj = obj1;
        if (obj4 != null) goto _L4; else goto _L8
_L8:
        obj = obj3;
_L4:
        Object obj2 = obj;
        if (obj == null)
        {
            obj2 = new b(a);
        }
        b = obj2;
        obj = obj2;
_L2:
        return obj;
_L6:
        obj = obj4;
        if (true) goto _L4; else goto _L9
_L9:
    }

    public final anm a()
    {
        Object obj = e();
        anq anq1;
        boolean flag;
        if (obj instanceof anq)
        {
            if (obj instanceof b)
            {
                if (((b)obj).a != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = true;
            }
        } else
        {
            flag = false;
        }
        if (flag)
        {
            anq1 = (anq)obj;
        } else
        {
            anq1 = null;
        }
        if (b(obj))
        {
            obj = (ano)obj;
        } else
        {
            obj = null;
        }
        if (anq1 != null || obj != null)
        {
            return new anm(anq1, ((ano) (obj)));
        } else
        {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
    }

    public final ann a(char c1)
    {
        return a(new a(c1));
    }

    public final ann a(int i1)
    {
        return a(alu.c(), i1, 2);
    }

    public final ann a(int i1, int j1)
    {
        return c(alu.d(), i1, j1);
    }

    public final ann a(alu alu1)
    {
        if (alu1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        } else
        {
            return a(new i(alu1, false));
        }
    }

    public final ann a(alu alu1, int i1)
    {
        if (alu1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i1 <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal number of digits: ")).append(i1).toString());
        } else
        {
            return a(new c(alu1, i1));
        }
    }

    public final ann a(alu alu1, int i1, int j1)
    {
        if (alu1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int k1 = j1;
        if (j1 < i1)
        {
            k1 = i1;
        }
        if (i1 < 0 || k1 <= 0)
        {
            throw new IllegalArgumentException();
        }
        if (i1 <= 1)
        {
            return a(new n(alu1, k1, false));
        } else
        {
            return a(new g(alu1, k1, false, i1));
        }
    }

    public final ann a(anm anm1)
    {
        if (anm1 == null)
        {
            throw new IllegalArgumentException("No formatter supplied");
        } else
        {
            return a(anm1.a, anm1.b);
        }
    }

    public final ann a(ano ano1)
    {
        c(ano1);
        return a(((anq) (null)), ano1);
    }

    final ann a(anq anq1, ano ano1)
    {
        b = null;
        a.add(anq1);
        a.add(ano1);
        return this;
    }

    final ann a(Object obj)
    {
        b = null;
        a.add(obj);
        a.add(obj);
        return this;
    }

    public final ann a(String s)
    {
        ann ann1 = this;
        switch (s.length())
        {
        default:
            ann1 = a(new h(s));
            // fall through

        case 0: // '\0'
            return ann1;

        case 1: // '\001'
            return a(new a(s.charAt(0)));
        }
    }

    public final ann a(String s, boolean flag)
    {
        return a(new l(null, s, flag, 2));
    }

    public final ann a(String s, boolean flag, int i1)
    {
        return a(new l(s, s, flag, i1));
    }

    public final ann a(ano aano[])
    {
        int i1 = 0;
        int j1 = aano.length;
        if (j1 == 1)
        {
            if (aano[0] == null)
            {
                throw new IllegalArgumentException("No parser supplied");
            } else
            {
                return a(((anq) (null)), aano[0]);
            }
        }
        ano aano1[] = new ano[j1];
        for (; i1 < j1 - 1; i1++)
        {
            ano ano1 = aano[i1];
            aano1[i1] = ano1;
            if (ano1 == null)
            {
                throw new IllegalArgumentException("Incomplete parser array");
            }
        }

        aano1[i1] = aano[i1];
        return a(((anq) (null)), ((ano) (new e(aano1))));
    }

    public final ann b(int i1)
    {
        return a(alu.e(), i1, 2);
    }

    public final ann b(int i1, int j1)
    {
        return b(alu.p(), i1, j1);
    }

    public final ann b(alu alu1)
    {
        if (alu1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        } else
        {
            return a(new i(alu1, true));
        }
    }

    public final ann b(alu alu1, int i1, int j1)
    {
        if (alu1 == null)
        {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int k1 = j1;
        if (j1 < i1)
        {
            k1 = i1;
        }
        if (i1 < 0 || k1 <= 0)
        {
            throw new IllegalArgumentException();
        }
        if (i1 <= 1)
        {
            return a(new n(alu1, k1, true));
        } else
        {
            return a(new g(alu1, k1, true, i1));
        }
    }

    public final ann b(ano ano1)
    {
        c(ano1);
        return a(((anq) (null)), new e(new ano[] {
            ano1, null
        }));
    }

    public final ano b()
    {
        Object obj = e();
        if (b(obj))
        {
            return (ano)obj;
        } else
        {
            throw new UnsupportedOperationException("Parsing is not supported");
        }
    }

    public final ann c()
    {
        return c(alu.f(), 1, 9);
    }

    public final ann c(int i1)
    {
        return a(alu.g(), i1, 2);
    }

    public final ann c(int i1, int j1)
    {
        return b(alu.s(), i1, j1);
    }

    public final ann d()
    {
        return c(alu.g(), 1, 9);
    }

    public final ann d(int i1)
    {
        return a(alu.l(), i1, 1);
    }

    public final ann e(int i1)
    {
        return a(alu.m(), i1, 2);
    }

    public final ann f(int i1)
    {
        return a(alu.n(), i1, 3);
    }

    public final ann g(int i1)
    {
        return a(alu.o(), i1, 2);
    }

    public final ann h(int i1)
    {
        return a(alu.r(), i1, 2);
    }
}
