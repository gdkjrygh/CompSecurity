// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ncj
{

    String a;
    public long b;
    public long c;
    float d;
    float e;

    public ncj()
    {
    }

    public ncj(nci nci1)
    {
        a = nci1.a;
        b = nci1.b;
        c = nci1.c;
        d = nci1.d;
        e = nci1.e;
    }

    public final nci a()
    {
        return new nci(this);
    }
}
