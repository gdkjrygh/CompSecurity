// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gln
{

    azq a[];

    public gln()
    {
        a = new azq[3];
        b();
    }

    private void b()
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = null;
        }

    }

    final void a()
    {
        ayq ayq1 = new ayq();
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == null)
            {
                a[i] = ayq1;
            }
        }

    }
}
