// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            gw, eh, gn, gl, 
//            dl, cz, en, gk, 
//            gq, go, fm

final class ei extends gw
{

    private ei()
    {
    }

    ei(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (eh)fm;
        fm.o();
        eh.p();
        gn1.a();
        if (((eh) (fm)).a != null)
        {
            gn1.a(eh.q());
            gn1.a(((eh) (fm)).a);
        }
        gn1.a(eh.r());
        gn1.a(((eh) (fm)).b);
        gn1.a(eh.s());
        gn1.a(((eh) (fm)).c);
        gn1.a(eh.t());
        gn1.a(((eh) (fm)).d);
        if (((eh) (fm)).e != null && fm.i())
        {
            gn1.a(eh.u());
            gn1.a(new gl((byte)12, ((eh) (fm)).e.size()));
            for (Iterator iterator = ((eh) (fm)).e.iterator(); iterator.hasNext(); ((dl)iterator.next()).b(gn1)) { }
        }
        if (((eh) (fm)).f != null && fm.k())
        {
            gn1.a(eh.v());
            gn1.a(new gl((byte)12, ((eh) (fm)).f.size()));
            for (Iterator iterator1 = ((eh) (fm)).f.iterator(); iterator1.hasNext(); ((cz)iterator1.next()).b(gn1)) { }
        }
        if (((eh) (fm)).g != null && fm.m())
        {
            gn1.a(eh.w());
            ((eh) (fm)).g.b(gn1);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (eh)fm;
        gn1.d();
        do
        {
            Object obj = gn1.f();
            if (((gk) (obj)).b != 0)
            {
                switch (((gk) (obj)).c)
                {
                default:
                    gq.a(gn1, ((gk) (obj)).b);
                    break;

                case 1: // '\001'
                    if (((gk) (obj)).b == 11)
                    {
                        fm.a = gn1.p();
                        eh.a();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 2: // '\002'
                    if (((gk) (obj)).b == 10)
                    {
                        fm.b = gn1.n();
                        fm.c();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 3: // '\003'
                    if (((gk) (obj)).b == 10)
                    {
                        fm.c = gn1.n();
                        fm.e();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 4: // '\004'
                    if (((gk) (obj)).b == 10)
                    {
                        fm.d = gn1.n();
                        fm.g();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 5: // '\005'
                    if (((gk) (obj)).b == 15)
                    {
                        obj = gn1.h();
                        fm.e = new ArrayList(((gl) (obj)).b);
                        for (int i = 0; i < ((gl) (obj)).b; i++)
                        {
                            dl dl1 = new dl();
                            dl1.a(gn1);
                            ((eh) (fm)).e.add(dl1);
                        }

                        eh.j();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 6: // '\006'
                    if (((gk) (obj)).b == 15)
                    {
                        obj = gn1.h();
                        fm.f = new ArrayList(((gl) (obj)).b);
                        for (int j = 0; j < ((gl) (obj)).b; j++)
                        {
                            cz cz1 = new cz();
                            cz1.a(gn1);
                            ((eh) (fm)).f.add(cz1);
                        }

                        eh.l();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 7: // '\007'
                    if (((gk) (obj)).b == 12)
                    {
                        fm.g = new en();
                        ((eh) (fm)).g.a(gn1);
                        eh.n();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;
                }
                continue;
            }
            gn1.e();
            if (!fm.b())
            {
                throw new go((new StringBuilder("Required field 'start_time' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            if (!fm.d())
            {
                throw new go((new StringBuilder("Required field 'end_time' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            if (!fm.f())
            {
                throw new go((new StringBuilder("Required field 'duration' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            fm.o();
            break;
        } while (true);
    }
}
