// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.c.b:
//            f, bv, bw, cd, 
//            by, bg, bd

public final class bu
{
    private static interface a
    {

        public abstract byte a(int i);

        public abstract int a();
    }

    public static final class b extends IOException
    {

        b(String s)
        {
            super(s);
        }
    }

    public static final class c
    {

        private final boolean a;
        private final int b;

        private c(boolean flag, int i)
        {
            a = flag;
            b = i;
        }

        c(boolean flag, int i, byte byte0)
        {
            this(flag, i);
        }
    }

    public static final class c.a
    {

        private boolean a;
        private int b;

        public final c a()
        {
            return new c(a, b, (byte)0);
        }

        public c.a()
        {
            a = false;
            b = c.b.a;
        }
    }

    public static final class c.b extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }

    private static final class d
    {

        boolean a;
        boolean b;

        private void a(int i, int j, List list, e e1)
        {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                list = ((List) (iterator.next()));
                e1.a(String.valueOf(i));
                e1.a(": ");
                bu.a(j, list, e1);
                if (a)
                {
                    list = " ";
                } else
                {
                    list = "\n";
                }
                e1.a(list);
            }
        }

        private void a(ak.f f1, Object obj, e e1)
        {
            if (f1.s())
            {
                e1.a("[");
                static final class _cls1
                {

                    static final int a[];

                    static 
                    {
                        a = new int[ak.f.b.values().length];
                        try
                        {
                            a[ak.f.b.e.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror17) { }
                        try
                        {
                            a[ak.f.b.q.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror16) { }
                        try
                        {
                            a[ak.f.b.o.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror15) { }
                        try
                        {
                            a[ak.f.b.c.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror14) { }
                        try
                        {
                            a[ak.f.b.r.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror13) { }
                        try
                        {
                            a[ak.f.b.p.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror12) { }
                        try
                        {
                            a[ak.f.b.h.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror11) { }
                        try
                        {
                            a[ak.f.b.b.ordinal()] = 8;
                        }
                        catch (NoSuchFieldError nosuchfielderror10) { }
                        try
                        {
                            a[ak.f.b.a.ordinal()] = 9;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            a[ak.f.b.m.ordinal()] = 10;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            a[ak.f.b.g.ordinal()] = 11;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            a[ak.f.b.d.ordinal()] = 12;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            a[ak.f.b.f.ordinal()] = 13;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            a[ak.f.b.i.ordinal()] = 14;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[ak.f.b.l.ordinal()] = 15;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[ak.f.b.n.ordinal()] = 16;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[ak.f.b.k.ordinal()] = 17;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[ak.f.b.j.ordinal()] = 18;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                if (f1.t().e().i() && f1.h() == ak.f.b.k && f1.n() && f1.v() == f1.w())
                {
                    e1.a(f1.w().c());
                } else
                {
                    e1.a(f1.c());
                }
                e1.a("]");
            } else
            if (f1.h() == ak.f.b.j)
            {
                e1.a(f1.w().b());
            } else
            {
                e1.a(f1.b());
            }
            if (f1.f() == ak.f.a.i)
            {
                if (a)
                {
                    e1.a(" { ");
                } else
                {
                    e1.a(" {\n");
                    e1.a();
                }
            } else
            {
                e1.a(": ");
            }
            _cls1.a[f1.h().ordinal()];
            JVM INSTR tableswitch 1 18: default 192
        //                       1 284
        //                       2 284
        //                       3 284
        //                       4 298
        //                       5 298
        //                       6 298
        //                       7 312
        //                       8 326
        //                       9 340
        //                       10 354
        //                       11 354
        //                       12 371
        //                       13 371
        //                       14 388
        //                       15 441
        //                       16 488
        //                       17 502
        //                       18 502;
               goto _L1 _L2 _L2 _L2 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L7 _L8 _L8 _L9 _L10 _L11 _L12 _L12
_L1:
            break; /* Loop/switch isn't completed */
_L12:
            break MISSING_BLOCK_LABEL_502;
_L13:
            if (f1.f() == ak.f.a.i)
            {
                if (a)
                {
                    e1.a("} ");
                    return;
                } else
                {
                    e1.b();
                    e1.a("}\n");
                    return;
                }
            }
            break MISSING_BLOCK_LABEL_525;
_L2:
            e1.a(((Integer)obj).toString());
              goto _L13
_L3:
            e1.a(((Long)obj).toString());
              goto _L13
_L4:
            e1.a(((Boolean)obj).toString());
              goto _L13
_L5:
            e1.a(((Float)obj).toString());
              goto _L13
_L6:
            e1.a(((Double)obj).toString());
              goto _L13
_L7:
            e1.a(bu.a(((Integer)obj).intValue()));
              goto _L13
_L8:
            e1.a(bu.a(((Long)obj).longValue()));
              goto _L13
_L9:
            e1.a("\"");
            if (b)
            {
                obj = bu.a((String)obj);
            } else
            {
                obj = bu.b((String)obj).replace("\n", "\\n");
            }
            e1.a(((CharSequence) (obj)));
            e1.a("\"");
              goto _L13
_L10:
            e1.a("\"");
            if (obj instanceof f)
            {
                e1.a(bu.a((f)obj));
            } else
            {
                e1.a(bu.a((byte[])obj));
            }
            e1.a("\"");
              goto _L13
_L11:
            e1.a(((ak.e)obj).b());
              goto _L13
            a(((bg) ((bd)obj)), e1);
              goto _L13
            if (a)
            {
                e1.a(" ");
                return;
            } else
            {
                e1.a("\n");
                return;
            }
        }

        private void a(bg bg1, e e1)
        {
            for (Iterator iterator = bg1.d_().entrySet().iterator(); iterator.hasNext();)
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                ak.f f1 = (ak.f)((java.util.Map.Entry) (obj)).getKey();
                obj = ((java.util.Map.Entry) (obj)).getValue();
                if (f1.o())
                {
                    obj = ((List)obj).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        a(f1, ((Iterator) (obj)).next(), e1);
                    }
                } else
                {
                    a(f1, obj, e1);
                }
            }

            a(bg1.f(), e1);
        }

        static void a(d d1, bg bg1, e e1)
        {
            d1.a(bg1, e1);
        }

        static void a(d d1, by by1, e e1)
        {
            d1.a(by1, e1);
        }

        private void a(by by1, e e1)
        {
            for (by1 = by1.f().entrySet().iterator(); by1.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)by1.next();
                int i = ((Integer)entry.getKey()).intValue();
                Object obj = (by.b)entry.getValue();
                a(i, 0, ((by.b) (obj)).b(), e1);
                a(i, 5, ((by.b) (obj)).c(), e1);
                a(i, 1, ((by.b) (obj)).d(), e1);
                a(i, 2, ((by.b) (obj)).e(), e1);
                obj = ((by.b) (obj)).f().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    by by2 = (by)((Iterator) (obj)).next();
                    e1.a(((Integer)entry.getKey()).toString());
                    if (a)
                    {
                        e1.a(" { ");
                    } else
                    {
                        e1.a(" {\n");
                        e1.a();
                    }
                    a(by2, e1);
                    if (a)
                    {
                        e1.a("} ");
                    } else
                    {
                        e1.b();
                        e1.a("}\n");
                    }
                }
            }

        }

        private d()
        {
            a = false;
            b = true;
        }

        d(byte byte0)
        {
            this();
        }
    }

    private static final class e
    {

        private final Appendable a;
        private final StringBuilder b;
        private boolean c;

        private void b(CharSequence charsequence)
        {
            if (charsequence.length() == 0)
            {
                return;
            }
            if (c)
            {
                c = false;
                a.append(b);
            }
            a.append(charsequence);
        }

        public final void a()
        {
            b.append("  ");
        }

        public final void a(CharSequence charsequence)
        {
            int j = 0;
            int l = charsequence.length();
            for (int i = 0; i < l;)
            {
                int k = j;
                if (charsequence.charAt(i) == '\n')
                {
                    b(charsequence.subSequence(j, i + 1));
                    k = i + 1;
                    c = true;
                }
                i++;
                j = k;
            }

            b(charsequence.subSequence(j, l));
        }

        public final void b()
        {
            int i = b.length();
            if (i == 0)
            {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            } else
            {
                b.delete(i - 2, i);
                return;
            }
        }

        private e(Appendable appendable)
        {
            b = new StringBuilder();
            c = true;
            a = appendable;
        }

        e(Appendable appendable, byte byte0)
        {
            this(appendable);
        }
    }


    private static final Logger a = Logger.getLogger(com/c/b/bu.getName());
    private static final d b = new d((byte)0);
    private static final d c;
    private static final d d;
    private static final c e = (new c.a()).a();

    private bu()
    {
    }

    private static long a(String s, boolean flag, boolean flag1)
    {
label0:
        {
            boolean flag2 = true;
            int i = 0;
            Object obj;
            int j;
            long l1;
            if (s.startsWith("-", 0))
            {
                if (!flag)
                {
                    throw new NumberFormatException((new StringBuilder("Number must be positive: ")).append(s).toString());
                }
                i = 1;
            } else
            {
                flag2 = false;
            }
            if (s.startsWith("0x", i))
            {
                j = i + 2;
                i = 16;
            } else
            if (s.startsWith("0", i))
            {
                j = i;
                i = 8;
            } else
            {
                j = i;
                i = 10;
            }
            obj = s.substring(j);
            if (((String) (obj)).length() < 16)
            {
                long l = Long.parseLong(((String) (obj)), i);
                if (flag2)
                {
                    l = -l;
                }
                l1 = l;
                if (flag1)
                {
                    break label0;
                }
                if (flag)
                {
                    if (l <= 0x7fffffffL)
                    {
                        l1 = l;
                        if (l >= 0xffffffff80000000L)
                        {
                            break label0;
                        }
                    }
                    throw new NumberFormatException((new StringBuilder("Number out of range for 32-bit signed integer: ")).append(s).toString());
                }
                if (l < 0x100000000L)
                {
                    l1 = l;
                    if (l >= 0L)
                    {
                        break label0;
                    }
                }
                throw new NumberFormatException((new StringBuilder("Number out of range for 32-bit unsigned integer: ")).append(s).toString());
            }
            obj = new BigInteger(((String) (obj)), i);
            if (flag2)
            {
                obj = ((BigInteger) (obj)).negate();
            }
            if (!flag1)
            {
                if (flag)
                {
                    if (((BigInteger) (obj)).bitLength() > 31)
                    {
                        throw new NumberFormatException((new StringBuilder("Number out of range for 32-bit signed integer: ")).append(s).toString());
                    }
                } else
                if (((BigInteger) (obj)).bitLength() > 32)
                {
                    throw new NumberFormatException((new StringBuilder("Number out of range for 32-bit unsigned integer: ")).append(s).toString());
                }
            } else
            if (flag)
            {
                if (((BigInteger) (obj)).bitLength() > 63)
                {
                    throw new NumberFormatException((new StringBuilder("Number out of range for 64-bit signed integer: ")).append(s).toString());
                }
            } else
            if (((BigInteger) (obj)).bitLength() > 64)
            {
                throw new NumberFormatException((new StringBuilder("Number out of range for 64-bit unsigned integer: ")).append(s).toString());
            }
            l1 = ((BigInteger) (obj)).longValue();
        }
        return l1;
    }

    public static f a(CharSequence charsequence)
    {
        byte abyte0[];
        int j;
        int l;
        charsequence = com.c.b.f.a(charsequence.toString());
        abyte0 = new byte[charsequence.a()];
        j = 0;
        l = 0;
_L9:
        if (j >= charsequence.a()) goto _L2; else goto _L1
_L1:
        byte byte0 = charsequence.a(j);
        if (byte0 != 92) goto _L4; else goto _L3
_L3:
        if (j + 1 >= charsequence.a()) goto _L6; else goto _L5
_L5:
        int k;
        k = j + 1;
        byte0 = charsequence.a(k);
        if (!a(byte0)) goto _L8; else goto _L7
_L7:
        int i;
        int i1 = c(byte0);
        i = i1;
        j = k;
        if (k + 1 < charsequence.a())
        {
            i = i1;
            j = k;
            if (a(charsequence.a(k + 1)))
            {
                j = k + 1;
                i = i1 * 8 + c(charsequence.a(j));
            }
        }
        i1 = i;
        k = j;
        if (j + 1 < charsequence.a())
        {
            i1 = i;
            k = j;
            if (a(charsequence.a(j + 1)))
            {
                k = j + 1;
                i1 = i * 8 + c(charsequence.a(k));
            }
        }
        abyte0[l] = (byte)i1;
        i = l + 1;
        j = k;
_L11:
        j++;
        l = i;
          goto _L9
_L8:
        switch (byte0)
        {
        default:
            throw new b((new StringBuilder("Invalid escape sequence: '\\")).append((char)byte0).append('\'').toString());

        case 97: // 'a'
            abyte0[l] = 7;
            i = l + 1;
            j = k;
            break;

        case 98: // 'b'
            abyte0[l] = 8;
            i = l + 1;
            j = k;
            break;

        case 102: // 'f'
            abyte0[l] = 12;
            i = l + 1;
            j = k;
            break;

        case 110: // 'n'
            abyte0[l] = 10;
            i = l + 1;
            j = k;
            break;

        case 114: // 'r'
            abyte0[l] = 13;
            i = l + 1;
            j = k;
            break;

        case 116: // 't'
            abyte0[l] = 9;
            i = l + 1;
            j = k;
            break;

        case 118: // 'v'
            abyte0[l] = 11;
            i = l + 1;
            j = k;
            break;

        case 92: // '\\'
            abyte0[l] = 92;
            i = l + 1;
            j = k;
            break;

        case 39: // '\''
            abyte0[l] = 39;
            i = l + 1;
            j = k;
            break;

        case 34: // '"'
            abyte0[l] = 34;
            i = l + 1;
            j = k;
            break;

        case 120: // 'x'
            if (k + 1 < charsequence.a() && b(charsequence.a(k + 1)))
            {
                int j1 = k + 1;
                k = c(charsequence.a(j1));
                i = k;
                j = j1;
                if (j1 + 1 < charsequence.a())
                {
                    i = k;
                    j = j1;
                    if (b(charsequence.a(j1 + 1)))
                    {
                        j = j1 + 1;
                        i = k * 16 + c(charsequence.a(j));
                    }
                }
                abyte0[l] = (byte)i;
                i = l + 1;
            } else
            {
                throw new b("Invalid escape sequence: '\\x' with no digits");
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        throw new b("Invalid escape sequence: '\\' at end of string.");
_L4:
        abyte0[l] = byte0;
        i = l + 1;
        continue; /* Loop/switch isn't completed */
_L2:
        return com.c.b.f.a(abyte0, 0, l);
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static String a(int i)
    {
        if (i >= 0)
        {
            return Integer.toString(i);
        } else
        {
            return Long.toString((long)i & 0xffffffffL);
        }
    }

    public static String a(long l)
    {
        if (l >= 0L)
        {
            return Long.toString(l);
        } else
        {
            return BigInteger.valueOf(0x7fffffffffffffffL & l).setBit(63).toString();
        }
    }

    public static String a(bg bg)
    {
        try
        {
            StringBuilder stringbuilder = new StringBuilder();
            d.a(b, bg, new e(stringbuilder, (byte)0));
            bg = stringbuilder.toString();
        }
        // Misplaced declaration of an exception variable
        catch (bg bg)
        {
            throw new IllegalStateException(bg);
        }
        return bg;
    }

    private static String a(a a1)
    {
        StringBuilder stringbuilder;
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
label6:
                                {
label7:
                                    {
label8:
                                        {
label9:
                                            {
                                                stringbuilder = new StringBuilder(a1.a());
                                                int i = 0;
label10:
                                                do
                                                {
                                                    {
                                                        if (i >= a1.a())
                                                        {
                                                            break label0;
                                                        }
                                                        byte byte0 = a1.a(i);
                                                        switch (byte0)
                                                        {
                                                        default:
                                                            if (byte0 >= 32 && byte0 <= 126)
                                                            {
                                                                stringbuilder.append((char)byte0);
                                                            } else
                                                            {
                                                                stringbuilder.append('\\');
                                                                stringbuilder.append((char)((byte0 >>> 6 & 3) + 48));
                                                                stringbuilder.append((char)((byte0 >>> 3 & 7) + 48));
                                                                stringbuilder.append((char)((byte0 & 7) + 48));
                                                            }
                                                            break;

                                                        case 7: // '\007'
                                                            break label10;

                                                        case 8: // '\b'
                                                            break label9;

                                                        case 9: // '\t'
                                                            break label5;

                                                        case 10: // '\n'
                                                            break label7;

                                                        case 11: // '\013'
                                                            break label4;

                                                        case 12: // '\f'
                                                            break label8;

                                                        case 13: // '\r'
                                                            break label6;

                                                        case 34: // '"'
                                                            break label1;

                                                        case 39: // '\''
                                                            break label2;

                                                        case 92: // '\\'
                                                            break label3;
                                                        }
                                                    }
                                                    i++;
                                                } while (true);
                                                stringbuilder.append("\\a");
                                                break MISSING_BLOCK_LABEL_143;
                                            }
                                            stringbuilder.append("\\b");
                                            break MISSING_BLOCK_LABEL_143;
                                        }
                                        stringbuilder.append("\\f");
                                        break MISSING_BLOCK_LABEL_143;
                                    }
                                    stringbuilder.append("\\n");
                                    break MISSING_BLOCK_LABEL_143;
                                }
                                stringbuilder.append("\\r");
                                break MISSING_BLOCK_LABEL_143;
                            }
                            stringbuilder.append("\\t");
                            break MISSING_BLOCK_LABEL_143;
                        }
                        stringbuilder.append("\\v");
                        break MISSING_BLOCK_LABEL_143;
                    }
                    stringbuilder.append("\\\\");
                    break MISSING_BLOCK_LABEL_143;
                }
                stringbuilder.append("\\'");
                break MISSING_BLOCK_LABEL_143;
            }
            stringbuilder.append("\\\"");
            break MISSING_BLOCK_LABEL_143;
        }
        return stringbuilder.toString();
    }

    public static String a(by by1)
    {
        try
        {
            StringBuilder stringbuilder = new StringBuilder();
            d.a(b, by1, new e(stringbuilder, (byte)0));
            by1 = stringbuilder.toString();
        }
        // Misplaced declaration of an exception variable
        catch (by by1)
        {
            throw new IllegalStateException(by1);
        }
        return by1;
    }

    public static String a(f f1)
    {
        return a(((a) (new bv(f1))));
    }

    static String a(String s)
    {
        return a(com.c.b.f.a(s));
    }

    public static String a(byte abyte0[])
    {
        return a(((a) (new bw(abyte0))));
    }

    static void a(int i, Object obj, e e1)
    {
        switch (cd.a(i))
        {
        case 4: // '\004'
        default:
            throw new IllegalArgumentException((new StringBuilder("Bad tag: ")).append(i).toString());

        case 0: // '\0'
            e1.a(a(((Long)obj).longValue()));
            return;

        case 5: // '\005'
            e1.a(String.format(null, "0x%08x", new Object[] {
                (Integer)obj
            }));
            return;

        case 1: // '\001'
            e1.a(String.format(null, "0x%016x", new Object[] {
                (Long)obj
            }));
            return;

        case 2: // '\002'
            e1.a("\"");
            e1.a(a((f)obj));
            e1.a("\"");
            return;

        case 3: // '\003'
            d.a(b, (by)obj, e1);
            return;
        }
    }

    private static boolean a(byte byte0)
    {
        return 48 <= byte0 && byte0 <= 55;
    }

    public static String b(String s)
    {
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private static boolean b(byte byte0)
    {
        return 48 <= byte0 && byte0 <= 57 || 97 <= byte0 && byte0 <= 102 || 65 <= byte0 && byte0 <= 70;
    }

    private static int c(byte byte0)
    {
        if (48 <= byte0 && byte0 <= 57)
        {
            return byte0 - 48;
        }
        if (97 <= byte0 && byte0 <= 122)
        {
            return (byte0 - 97) + 10;
        } else
        {
            return (byte0 - 65) + 10;
        }
    }

    static int c(String s)
    {
        return (int)a(s, true, false);
    }

    static int d(String s)
    {
        return (int)a(s, false, false);
    }

    static long e(String s)
    {
        return a(s, true, true);
    }

    static long f(String s)
    {
        return a(s, false, true);
    }

    static 
    {
        d d1 = new d((byte)0);
        d1.a = true;
        c = d1;
        d1 = new d((byte)0);
        d1.b = false;
        d = d1;
    }
}
