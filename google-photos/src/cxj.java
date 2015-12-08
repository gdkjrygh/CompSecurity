// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cxj
{

    public final cnq a;
    public final cof b;
    public final cqh c;

    public cxj(cnq cnq1, cof cof1, cqh cqh1)
    {
        a = (cnq)b.a(cnq1, "clip", null);
        b = (cof)b.a(cof1, "metric", null);
        c = (cqh)b.a(cqh1, "media", null);
    }

    public cxj(cof cof1, cqh cqh1, long l)
    {
        b = (cof)b.a(cof1, "metric", null);
        c = (cqh)b.a(cqh1, "media", null);
        if (cqh1.b == coj.a)
        {
            a = cre.a(cqh1, cof1.b);
            return;
        }
        if (cqh1.b == coj.b)
        {
            a = cre.a(cqh1, l);
            return;
        } else
        {
            throw b.a("Only Video and Photo media are supported.");
        }
    }
}
