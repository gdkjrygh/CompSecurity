// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class bkn extends Enum
{

    public static final bkn a;
    public static final bkn b;
    private static final bkn c[];

    private bkn(String s, int i)
    {
        super(s, i);
    }

    bkn(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static bkn valueOf(String s)
    {
        return (bkn)Enum.valueOf(bkn, s);
    }

    public static bkn[] values()
    {
        return (bkn[])c.clone();
    }

    static 
    {
        a = new bkn("DEFAULT") {

        };
        b = new bkn("STRING") {

        };
        c = (new bkn[] {
            a, b
        });
    }
}
