// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixo extends Enum
{

    public static final ixo a;
    public static final ixo b;
    private static final ixo c[];

    private ixo(String s, int i)
    {
        super(s, i);
    }

    public static ixo valueOf(String s)
    {
        return (ixo)Enum.valueOf(ixo, s);
    }

    public static ixo[] values()
    {
        return (ixo[])c.clone();
    }

    static 
    {
        a = new ixo("TrashFull", 0);
        b = new ixo("FileTooBig", 1);
        c = (new ixo[] {
            a, b
        });
    }
}
