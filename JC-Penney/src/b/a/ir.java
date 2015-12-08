// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package b.a:
//            kg, it, mo, jv, 
//            ji, kq, ku, oz, 
//            kk, mp, ow, op, 
//            mr, oo, is, kp

public final class ir extends kg
{

    private static final it a = new it((byte)0);
    private final mo c;
    private kp d;
    private byte e[];

    static kp a(ir ir1)
    {
        return ir1.d;
    }

    public static void a(ir air[])
    {
        Arrays.sort(air, a);
    }

    protected final int a(kg kg1)
    {
        kg1 = (ir)kg1;
        return c.a(((ir) (kg1)).c);
    }

    public final jv a()
    {
        return jv.p;
    }

    public final void a(ji ji1)
    {
        d = ji1.g.a(c.a);
        ku.a(ji1, c);
    }

    protected final void a(kk kk1, int i)
    {
        oz oz1 = new oz();
        (new ku(kk1.a, oz1)).a(c, false);
        e = oz1.e();
        a(e.length + 1);
    }

    public final void a(ow ow1, String s)
    {
        ow1.a(0, (new StringBuilder()).append(s).append("visibility: ").append(c.b.h_()).toString());
        ow1.a(0, (new StringBuilder()).append(s).append("type: ").append(c.a.h_()).toString());
        oo oo1;
        Object obj;
        for (Iterator iterator = c.c().iterator(); iterator.hasNext(); ow1.a(0, (new StringBuilder()).append(s).append(oo1.h_()).append(": ").append(ku.a(((nr) (obj)))).toString()))
        {
            obj = (mr)iterator.next();
            oo1 = ((mr) (obj)).a;
            obj = ((mr) (obj)).b;
        }

    }

    protected final void a_(ji ji1, ow ow1)
    {
        mp mp1;
        boolean flag;
        flag = ow1.a();
        mp1 = c.b;
        if (flag)
        {
            ow1.a(0, (new StringBuilder()).append(f()).append(" annotation").toString());
            ow1.a(1, (new StringBuilder("  visibility: VISBILITY_")).append(mp1).toString());
        }
        is.a[mp1.ordinal()];
        JVM INSTR tableswitch 1 3: default 108
    //                   1 118
    //                   2 148
    //                   3 158;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_158;
_L1:
        throw new RuntimeException("shouldn't happen");
_L2:
        ow1.b(0);
_L5:
        if (flag)
        {
            (new ku(ji1, ow1)).a(c, true);
            return;
        } else
        {
            ow1.a(e);
            return;
        }
_L3:
        ow1.b(1);
          goto _L5
        ow1.b(2);
          goto _L5
    }

    public final int hashCode()
    {
        return c.hashCode();
    }

}
