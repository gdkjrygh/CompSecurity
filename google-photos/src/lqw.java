// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lqw
    implements jqs
{

    lqw()
    {
    }

    public final int a()
    {
        switch (lqh.a())
        {
        case 6: // '\006'
        default:
            return 3;

        case 5: // '\005'
            return 2;

        case 3: // '\003'
        case 4: // '\004'
            return 1;

        case 2: // '\002'
            return 0;
        }
    }

    public final void a(int i)
    {
        lqh.b("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    public final void a(String s)
    {
        lqh.b(s);
    }

    public final void b(String s)
    {
        lqh.a(s);
    }
}
