// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;


// Referenced classes of package p.dd:
//            w

public static final class .String extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/dd/w$a, s);
    }

    public static .String[] values()
    {
        return (.String[])c.clone();
    }

    static 
    {
        a = new <init>("CONNECTION_SUCCESS", 0);
        b = new <init>("CONNECTION_FAILED", 1);
        c = (new c[] {
            a, b
        });
    }

    private .String(String s, int i)
    {
        super(s, i);
    }
}
