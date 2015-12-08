// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fld
{

    public final boolean a;
    private final fkz b;

    private fld(boolean flag, fkz fkz)
    {
        a = flag;
        b = fkz;
    }

    public static fld a()
    {
        return new fld(false, null);
    }

    public static fld a(fkz fkz)
    {
        return new fld(true, fkz);
    }

    public final fkz b()
    {
        p.b(a);
        return b;
    }
}
