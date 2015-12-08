// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bpm extends bto
{

    final bpl a;

    bpm(bpl bpl, bmb bmb, Class class1)
    {
        a = bpl;
        super(bmb, class1);
    }

    protected final void a(Object obj)
    {
        obj = (bpq)obj;
        c();
        ((bpq) (obj)).a(null);
    }

    protected final void b(Object obj)
    {
        obj = (bpq)obj;
        c();
        ((bpq) (obj)).a(new bpn(this));
    }
}
