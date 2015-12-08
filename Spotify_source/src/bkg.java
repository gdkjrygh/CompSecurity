// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bkg
{

    bkh a;
    boolean b;
    private boolean c;

    public bkg()
    {
        cax cax = cbb.e;
        c = ((Boolean)bkv.n().a(cax)).booleanValue();
    }

    public bkg(byte byte0)
    {
        c = false;
    }

    public final void a(String s)
    {
        bka.a("Action was blocked because no click was detected.");
        if (a != null)
        {
            a.a(s);
        }
    }

    public final boolean a()
    {
        return !c || b;
    }
}
