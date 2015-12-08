// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class byp
    implements dcf
{

    private byh a;

    byp(byh byh1)
    {
        a = byh1;
        super();
    }

    public final long a(int i)
    {
label0:
        {
            if (byh.a(a).a(i))
            {
                i = byh.a(a).d(i).c;
                if (i != -1)
                {
                    break label0;
                }
            }
            return -1L;
        }
        return (long)i;
    }
}
