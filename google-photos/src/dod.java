// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dod
    implements drx
{

    private final drz a;
    private final int b;

    dod(drz drz1, int i)
    {
        a = drz1;
        b = i;
    }

    public final erm a(erm erm1)
    {
label0:
        {
            gaw gaw1 = a.a(b);
            if (!gaw.c.equals(gaw1))
            {
                if (!gaw1.a(gav.b))
                {
                    break label0;
                }
                erm1.i = true;
            }
            return erm1;
        }
        erm1.h = true;
        return erm1;
    }
}
