// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class msi
    implements mso
{

    private msm a;

    public msi(msm msm1)
    {
        a = msm1;
    }

    public msi(msp msp)
    {
        a = new msm(msp);
    }

    public final msi a(olm olm1)
    {
        olm1.a(mso, this);
        return this;
    }

    public final msm r()
    {
        return a;
    }
}
