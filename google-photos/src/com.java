// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class com
{

    final int a;
    final int b;
    final long c;

    com(cnq cnq1, coi coi1)
    {
        char c1 = '\u02D0';
        super();
        c = cnq1.f.c - cnq1.f.b;
        int i;
        int j;
        if (coi1.a == 90 || coi1.a == 270)
        {
            j = coi1.d;
            i = coi1.c;
        } else
        {
            j = coi1.c;
            i = coi1.d;
        }
        if (cnq1.d == cnt.c)
        {
            if (j < i)
            {
                i = 1080;
                j = c1;
            } else
            {
                i = 720;
                j = 1280;
            }
        }
        a = j;
        b = i;
    }
}
