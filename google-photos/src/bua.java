// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bua extends dez
{

    private bty c;

    bua(bty bty1, int i)
    {
        c = bty1;
        super(30);
    }

    protected final String a(Object obj)
    {
        return ((cvj)obj).b;
    }

    protected final void a()
    {
        bty.d(c).b(bty.c(c));
    }

    protected final void a(Object obj, Object obj1)
    {
        obj = (cvj)obj;
        obj1 = (cvj)obj1;
        if (((cvj) (obj)).c != null && (obj1 == null || !((cvj) (obj)).c.equals(((cvj) (obj1)).c)))
        {
            bty.b(c);
            buc.a(((cvj) (obj)).c);
        }
    }

    protected final String b(Object obj)
    {
        return ((cvj)obj).a;
    }
}
