// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ldj extends ldx
{

    private String g;

    public ldj(lns lns, jyn jyn, String s)
    {
        g = s;
        super(jyn);
    }

    protected final void a(jyl jyl)
    {
        jyl = (lej)jyl;
        ldk ldk1 = new ldk(this);
        String s = g;
        ((len)jyl.o()).b(ldk1, s);
    }
}
