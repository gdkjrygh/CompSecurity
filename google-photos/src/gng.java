// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gng
    implements gqc
{

    private ehr a;
    private gnf b;

    gng(gnf gnf1, ehr ehr)
    {
        b = gnf1;
        a = ehr;
        super();
    }

    public final int a()
    {
        return b.b.a(a).a();
    }

    public final int a(ekp ekp)
    {
        int i = b.b.a(a).b(ekp);
        if (i == -1)
        {
            return -1;
        } else
        {
            return i;
        }
    }

    public final ekp a(int i)
    {
        return b.b.a(a).a(i);
    }
}
