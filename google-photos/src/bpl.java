// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bpl extends bmb
{

    private static final bpo b = (bpo)ddz.a(bpo);
    public final bto a = new bpm(this, this, bpq);
    private bpo e;

    bpl(bmb bmb1, bpp bpp, bpo bpo1)
    {
        super(bmb1);
        e = b;
        b.a(bpp, "display", null);
        e = (bpo)b.a(bpo1, "connectCallbacks", null);
    }

    static void a(bpl bpl1)
    {
        bpl1.e.a(true);
    }

    static void b(bpl bpl1)
    {
        bpl1.e.a(false);
    }

}
