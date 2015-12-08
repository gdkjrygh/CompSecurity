// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mmd extends mkl
{

    private mmb a;

    mmd(mmb mmb1)
    {
        a = mmb1;
        super();
    }

    public final void a(double d)
    {
        mmb mmb1 = a;
        mmb1.a = (float)d;
        mmb1.invalidateSelf();
    }
}
