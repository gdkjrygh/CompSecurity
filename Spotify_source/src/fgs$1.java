// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements fgl
{

    private fgs a;

    public final void a(int i, int j)
    {
        int k = j;
        if (i == 0)
        {
            k = j;
            if (j == fgs.a(a).b())
            {
                k = j + 1;
            }
        }
        a.b(i, k);
    }

    public final void b(int i, int j)
    {
        int k = j;
        if (fgs.a(a).b() == 0)
        {
            k = j + 1;
        }
        a.c(i, k);
    }

    (fgs fgs1)
    {
        a = fgs1;
        super();
    }
}
