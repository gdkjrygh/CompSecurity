// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aeg extends aep
{

    public static final aeg a = new aeg(false);
    private static aeg c = new aeg(true);

    private aeg(boolean flag)
    {
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        super(j);
    }

    public static aeg a(boolean flag)
    {
        if (flag)
        {
            return c;
        } else
        {
            return a;
        }
    }

    private boolean i()
    {
        return super.b != 0;
    }

    public final String ag_()
    {
        if (i())
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    public final aeD b()
    {
        return aeD.a;
    }

    public final String e()
    {
        return "boolean";
    }

    public final String toString()
    {
        if (i())
        {
            return "boolean{true}";
        } else
        {
            return "boolean{false}";
        }
    }

}
