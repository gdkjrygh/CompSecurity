// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ldr extends ldz
{

    private String g;
    private String h[];

    public ldr(lns lns, jyn jyn, String s, String as[])
    {
        g = s;
        h = as;
        super(jyn);
    }

    protected final void a(jyl jyl)
    {
        jyl = (lej)jyl;
        lds lds1 = new lds(this);
        String s = g;
        String as[] = h;
        ((len)jyl.o()).a(lds1, s, as);
    }
}
