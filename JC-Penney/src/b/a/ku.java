// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package b.a:
//            nr, ow, ji, mo, 
//            kq, mr, ko, ns, 
//            nt, pe, nu, oi, 
//            oc, nz, oo, op, 
//            ob, jp, ol, kb, 
//            oa, nw, nx, on, 
//            ny, od, oj, oe, 
//            pf

public final class ku
{

    private final ji a;
    private final ow b;

    public ku(ji ji1, ow ow1)
    {
        if (ji1 == null)
        {
            throw new NullPointerException("file == null");
        }
        if (ow1 == null)
        {
            throw new NullPointerException("out == null");
        } else
        {
            a = ji1;
            b = ow1;
            return;
        }
    }

    public static String a(nr nr1)
    {
        if (c(nr1) == 30)
        {
            return "null";
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(nr1.e());
            stringbuilder.append(' ');
            stringbuilder.append(nr1.h_());
            return stringbuilder.toString();
        }
    }

    private void a(int i, long l)
    {
        int k = 64 - Long.numberOfLeadingZeros(l);
        int j = k;
        if (k == 0)
        {
            j = 1;
        }
        j = j + 7 >> 3;
        b.b(j - 1 << 5 | i);
        for (i = j; i > 0; i--)
        {
            b.b((byte)(int)l);
            l >>= 8;
        }

    }

    public static void a(ji ji1, mo mo1)
    {
        kq kq1 = ji1.g;
        ko ko1 = ji1.f;
        kq1.a(mo1.b());
        mr mr1;
        for (mo1 = mo1.c().iterator(); mo1.hasNext(); a(ji1, mr1.b()))
        {
            mr1 = (mr)mo1.next();
            ko1.a(mr1.a());
        }

    }

    public static void a(ji ji1, nr nr1)
    {
        if (nr1 instanceof ns)
        {
            a(ji1, ((ns)nr1).b());
        } else
        if (nr1 instanceof nt)
        {
            nr1 = ((nt)nr1).b();
            int j = ((pe) (nr1)).K.length;
            int i = 0;
            while (i < j) 
            {
                a(ji1, nr1.a(i));
                i++;
            }
        } else
        {
            ji1.a(nr1);
            return;
        }
    }

    private void b(int i, long l)
    {
        int k = 64 - Long.numberOfTrailingZeros(l);
        int j = k;
        if (k == 0)
        {
            j = 1;
        }
        j = j + 7 >> 3;
        l >>= 64 - j * 8;
        b.b(j - 1 << 5 | i);
        for (i = j; i > 0; i--)
        {
            b.b((byte)(int)l);
            l >>= 8;
        }

    }

    private void b(nr nr1)
    {
        int k;
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
label10:
                                                {
                                                    k = c(nr1);
                                                    switch (k)
                                                    {
                                                    case 1: // '\001'
                                                    case 5: // '\005'
                                                    case 7: // '\007'
                                                    case 8: // '\b'
                                                    case 9: // '\t'
                                                    case 10: // '\n'
                                                    case 11: // '\013'
                                                    case 12: // '\f'
                                                    case 13: // '\r'
                                                    case 14: // '\016'
                                                    case 15: // '\017'
                                                    case 18: // '\022'
                                                    case 19: // '\023'
                                                    case 20: // '\024'
                                                    case 21: // '\025'
                                                    case 22: // '\026'
                                                    default:
                                                        throw new RuntimeException("Shouldn't happen");

                                                    case 16: // '\020'
                                                        break label10;

                                                    case 17: // '\021'
                                                        break label9;

                                                    case 23: // '\027'
                                                        break label8;

                                                    case 24: // '\030'
                                                        break label7;

                                                    case 25: // '\031'
                                                        break label6;

                                                    case 26: // '\032'
                                                        break label5;

                                                    case 27: // '\033'
                                                        break label4;

                                                    case 28: // '\034'
                                                        break label3;

                                                    case 29: // '\035'
                                                        break label2;

                                                    case 30: // '\036'
                                                        break label1;

                                                    case 31: // '\037'
                                                        break label0;

                                                    case 0: // '\0'
                                                    case 2: // '\002'
                                                    case 4: // '\004'
                                                    case 6: // '\006'
                                                        long l = ((oi)nr1).h();
                                                        int i = (65 - Long.numberOfLeadingZeros(l >> 63 ^ l)) + 7 >> 3;
                                                        b.b(k | i - 1 << 5);
                                                        for (; i > 0; i--)
                                                        {
                                                            b.b((byte)(int)l);
                                                            l >>= 8;
                                                        }

                                                        break;

                                                    case 3: // '\003'
                                                        a(k, ((oi)nr1).h());
                                                        break;
                                                    }
                                                    return;
                                                }
                                                b(k, ((oc)nr1).h() << 32);
                                                return;
                                            }
                                            b(k, ((nz)nr1).h());
                                            return;
                                        }
                                        a(k, a.f.b((oo)nr1));
                                        return;
                                    }
                                    a(k, a.g.b((op)nr1));
                                    return;
                                }
                                a(k, a.i.b((ob)nr1));
                                return;
                            }
                            a(k, a.j.b((ol)nr1));
                            return;
                        }
                        nr1 = ((oa)nr1).f();
                        a(k, a.i.b(nr1));
                        return;
                    }
                    b.b(k);
                    a((nt)nr1, false);
                    return;
                }
                b.b(k);
                a(((ns)nr1).b(), false);
                return;
            }
            b.b(k);
            return;
        }
        int j = ((nw)nr1).g();
        b.b(j << 5 | k);
    }

    private static int c(nr nr1)
    {
        if (nr1 instanceof nx)
        {
            return 0;
        }
        if (nr1 instanceof on)
        {
            return 2;
        }
        if (nr1 instanceof ny)
        {
            return 3;
        }
        if (nr1 instanceof od)
        {
            return 4;
        }
        if (nr1 instanceof oj)
        {
            return 6;
        }
        if (nr1 instanceof oc)
        {
            return 16;
        }
        if (nr1 instanceof nz)
        {
            return 17;
        }
        if (nr1 instanceof oo)
        {
            return 23;
        }
        if (nr1 instanceof op)
        {
            return 24;
        }
        if (nr1 instanceof ob)
        {
            return 25;
        }
        if (nr1 instanceof ol)
        {
            return 26;
        }
        if (nr1 instanceof oa)
        {
            return 27;
        }
        if (nr1 instanceof nt)
        {
            return 28;
        }
        if (nr1 instanceof ns)
        {
            return 29;
        }
        if (nr1 instanceof oe)
        {
            return 30;
        }
        if (nr1 instanceof nw)
        {
            return 31;
        } else
        {
            throw new RuntimeException("Shouldn't happen");
        }
    }

    public final void a(mo mo1, boolean flag)
    {
        ko ko1;
        kq kq1;
        op op1;
        int i;
        boolean flag1;
        if (flag && b.a())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ko1 = a.f;
        kq1 = a.g;
        op1 = mo1.b();
        i = kq1.b(op1);
        if (flag1)
        {
            b.a((new StringBuilder("  type_idx: ")).append(pf.a(i)).append(" // ").append(op1.h_()).toString());
        }
        b.e(kq1.b(mo1.b()));
        mo1 = mo1.c();
        i = mo1.size();
        if (flag1)
        {
            b.a((new StringBuilder("  size: ")).append(pf.a(i)).toString());
        }
        b.e(i);
        mo1 = mo1.iterator();
        i = 0;
        Object obj;
        for (; mo1.hasNext(); b(((nr) (obj))))
        {
            obj = (mr)mo1.next();
            oo oo1 = ((mr) (obj)).a();
            int j = ko1.b(oo1);
            obj = ((mr) (obj)).b();
            if (flag1)
            {
                b.a(0, (new StringBuilder("  elements[")).append(i).append("]:").toString());
                i++;
                b.a((new StringBuilder("    name_idx: ")).append(pf.a(j)).append(" // ").append(oo1.h_()).toString());
            }
            b.e(j);
            if (flag1)
            {
                b.a((new StringBuilder("    value: ")).append(a(((nr) (obj)))).toString());
            }
        }

        if (flag1)
        {
            b.c();
        }
    }

    public final void a(nt nt1, boolean flag)
    {
        int i = 0;
        boolean flag1;
        int j;
        if (flag && b.a())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        nt1 = nt1.b();
        j = ((pe) (nt1)).K.length;
        if (flag1)
        {
            b.a((new StringBuilder("  size: ")).append(pf.a(j)).toString());
        }
        b.e(j);
        for (; i < j; i++)
        {
            nr nr1 = nt1.a(i);
            if (flag1)
            {
                b.a((new StringBuilder("  [")).append(Integer.toHexString(i)).append("] ").append(a(nr1)).toString());
            }
            b(nr1);
        }

        if (flag1)
        {
            b.c();
        }
    }
}
