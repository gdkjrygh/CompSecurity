// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gk, oo, ji, ko, 
//            op, kq, nv, kb, 
//            ob, jp, jt, jb, 
//            nr

final class jc
    implements gk
{

    final ji a;
    final jb b;

    jc(jb jb, ji ji1)
    {
        b = jb;
        a = ji1;
        super();
    }

    public final int a(nr nr)
    {
        ji ji1 = a;
        if (nr instanceof oo)
        {
            nr = ji1.f.a(nr);
        } else
        if (nr instanceof op)
        {
            nr = ji1.g.a(nr);
        } else
        if (nr instanceof nv)
        {
            nr = ji1.j.a(nr);
        } else
        if (nr instanceof ob)
        {
            nr = ji1.i.a(nr);
        } else
        {
            nr = null;
        }
        if (nr == null)
        {
            return -1;
        } else
        {
            return nr.d();
        }
    }
}
