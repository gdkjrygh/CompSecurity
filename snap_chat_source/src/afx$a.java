// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class ang.String extends Enum
    implements afq
{

    public static final a a;
    private static final a b[];

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(afx$a, s);
    }

    public static ang.String[] values()
    {
        return ([])b.clone();
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return;
        }
    }

    static 
    {
        a = new <init>("INSTANCE");
        b = (new b[] {
            a
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
