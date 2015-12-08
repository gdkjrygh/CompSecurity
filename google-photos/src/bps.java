// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bps extends bmb
{

    public final bto a = new bpu(this, this, bpx);
    final bpy b = new bpw(this);
    final blw e;

    public bps(bmb bmb1, blw blw1)
    {
        super(bmb1);
        new bpt(this, this, new bxg[] {
            bxg.o, bxg.e, bxg.q
        });
        e = (blw)b.a(blw1, "movieMakerDisplay", null);
    }

    static void a(bps bps1, bpx bpx1)
    {
label0:
        {
            boolean flag1 = true;
            bps1.c();
            boolean flag;
            if (bps1.c.c.A || bps1.c.c.o)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && !bpx1.H_())
            {
                if (bps1.c.b.b == bwy.c)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                bps1.e.r();
            }
            return;
        }
        bps1.e.q();
    }
}
