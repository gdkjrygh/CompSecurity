// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;

public abstract class bxh extends bmb
{

    private static final bxg a[] = new bxg[0];
    private final bxg b[];

    public transient bxh(bmb bmb1, bxg abxg[])
    {
        super(bmb1);
        b = (bxg[])b.a(abxg, "events", null);
    }

    public bxh(bww bww1)
    {
        super(bww1);
        b = a;
    }

    public final void C_()
    {
        bxg abxg[] = b;
        int j = abxg.length;
        for (int i = 0; i < j; i++)
        {
            b(abxg[i]);
        }

        super.C_();
    }

    public final bxh a(bxg bxg1)
    {
        ((List)c.e.get(bxg1)).add(b.a(this, "listener", null));
        return this;
    }

    public final bxh b(bxg bxg1)
    {
        b.a(((List)c.e.get(bxg1)).remove(this), "Can't remove listener that wasn't added");
        return this;
    }

    public abstract void b();

    public final void e()
    {
        super.e();
        bxg abxg[] = b;
        int j = abxg.length;
        for (int i = 0; i < j; i++)
        {
            a(abxg[i]);
        }

    }

}
