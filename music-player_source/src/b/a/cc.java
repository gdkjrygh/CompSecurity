// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            gw, cb, gn, gm, 
//            ch, gk, gq, go, 
//            fm

final class cc extends gw
{

    private cc()
    {
    }

    cc(byte byte0)
    {
        this();
    }

    public final void a(gn gn1, fm fm)
    {
        fm = (cb)fm;
        fm.i();
        cb.j();
        gn1.a();
        if (((cb) (fm)).a != null)
        {
            gn1.a(cb.k());
            gn1.a(new gm((byte)11, (byte)12, ((cb) (fm)).a.size()));
            java.util.Map.Entry entry;
            for (Iterator iterator = ((cb) (fm)).a.entrySet().iterator(); iterator.hasNext(); ((ch)entry.getValue()).b(gn1))
            {
                entry = (java.util.Map.Entry)iterator.next();
                gn1.a((String)entry.getKey());
            }

        }
        gn1.a(cb.l());
        gn1.a(((cb) (fm)).b);
        if (((cb) (fm)).c != null)
        {
            gn1.a(cb.m());
            gn1.a(((cb) (fm)).c);
        }
        gn1.c();
        gn1.b();
    }

    public final void b(gn gn1, fm fm)
    {
        fm = (cb)fm;
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
                    if (((gk) (obj)).b == 13)
                    {
                        obj = gn1.g();
                        fm.a = new HashMap(((gm) (obj)).c * 2);
                        for (int i = 0; i < ((gm) (obj)).c; i++)
                        {
                            String s = gn1.p();
                            ch ch1 = new ch();
                            ch1.a(gn1);
                            ((cb) (fm)).a.put(s, ch1);
                        }

                        cb.c();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 2: // '\002'
                    if (((gk) (obj)).b == 8)
                    {
                        fm.b = gn1.m();
                        fm.f();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;

                case 3: // '\003'
                    if (((gk) (obj)).b == 11)
                    {
                        fm.c = gn1.p();
                        cb.h();
                    } else
                    {
                        gq.a(gn1, ((gk) (obj)).b);
                    }
                    break;
                }
                continue;
            }
            gn1.e();
            if (!fm.e())
            {
                throw new go((new StringBuilder("Required field 'version' was not found in serialized data! Struct: ")).append(toString()).toString());
            }
            fm.i();
            break;
        } while (true);
    }
}
