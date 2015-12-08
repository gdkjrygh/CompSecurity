// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class aef extends aet
{

    final aeB a;
    private aeB d;

    aef(aez aez1, aew aew1)
    {
        super(aez1, aew1);
        a = aeB.a(super.c.b.a);
        d = null;
    }

    public final int a(boolean flag)
    {
        aeB aeb;
        if (flag)
        {
            aeb = a;
        } else
        {
            if (d == null)
            {
                Object obj = super.b.b;
                aeb = a;
                String s = (new StringBuilder("(")).append(((aeD) (obj)).H).append(aeb.a.substring(1)).toString();
                obj = aeb.c.b(((aeD) (obj)));
                obj.L = false;
                d = aeB.b(new aeB(s, aeb.b, ((aeC) (obj))));
            }
            aeb = d;
        }
        return aeb.c.b();
    }

    protected final int b(aec aec)
    {
        int i = super.b(aec);
        if (i != 0)
        {
            return i;
        } else
        {
            aec = (aef)aec;
            return a.a(((aef) (aec)).a);
        }
    }

    public final aeD b()
    {
        return a.b;
    }
}
