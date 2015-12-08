// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            kg, mq, jv, ji, 
//            kc, ir, ow, pf, 
//            kk

public final class iu extends kg
{

    final mq a;
    private final ir c[];

    protected final int a(kg kg1)
    {
        kg1 = (iu)kg1;
        return a.a(((iu) (kg1)).a);
    }

    public final jv a()
    {
        return jv.k;
    }

    public final void a(ji ji1)
    {
        ji1 = ji1.m;
        int j = c.length;
        for (int i = 0; i < j; i++)
        {
            c[i] = (ir)ji1.b(c[i]);
        }

    }

    protected final void a(kk kk, int i)
    {
        ir.a(c);
    }

    protected final void a_(ji ji1, ow ow1)
    {
        int i = 0;
        boolean flag = ow1.a();
        int j = c.length;
        if (flag)
        {
            ow1.a(0, (new StringBuilder()).append(f()).append(" annotation set").toString());
            ow1.a(4, (new StringBuilder("  size: ")).append(pf.a(j)).toString());
        }
        ow1.d(j);
        for (; i < j; i++)
        {
            int k = c[i].d();
            if (flag)
            {
                ow1.a(4, (new StringBuilder("  entries[")).append(Integer.toHexString(i)).append("]: ").append(pf.a(k)).toString());
                c[i].a(ow1, "    ");
            }
            ow1.d(k);
        }

    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
